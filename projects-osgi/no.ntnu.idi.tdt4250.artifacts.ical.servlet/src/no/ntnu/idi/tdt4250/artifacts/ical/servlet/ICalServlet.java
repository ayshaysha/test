package no.ntnu.idi.tdt4250.artifacts.ical.servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletName;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;


@SuppressWarnings("serial")
@Component
@HttpWhiteboardServletName("ical")
@HttpWhiteboardServletPattern("/ical/*")
public class ICalServlet extends HttpServlet implements Servlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getPathInfo().substring(1);
        
     // Check if the requested path ends with a trailing slash
        if (!fileName.contains(".")) {
            fileName = fileName + ".ics";
        }

        String relativePath = "../../projects-ecore/Model2iCalendar/output/" + fileName; 
        
        try {
            // Read the HTML file
            BufferedReader br = new BufferedReader(new FileReader(relativePath));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                content.append(line);
            }
            br.close();

            // Set content type and status
            response.setContentType("text/calendar");
            response.setStatus(HttpServletResponse.SC_OK);

            response.getWriter().println(content.toString());
        } catch (IOException e) {
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "File not found");
        }
    }
}
