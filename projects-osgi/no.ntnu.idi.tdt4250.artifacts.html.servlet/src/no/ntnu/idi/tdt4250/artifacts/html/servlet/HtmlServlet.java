package no.ntnu.idi.tdt4250.artifacts.html.servlet;

import org.osgi.service.component.annotations.*;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletName;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@Component
@HttpWhiteboardServletName("html")
@HttpWhiteboardServletPattern("/timetable/*")
public class HtmlServlet extends HttpServlet implements Servlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fileName = request.getPathInfo().substring(1);

        // Check if the requested path ends with a trailing slash
        if (!fileName.contains(".")) {
            fileName = fileName + ".html";
        }

        String relativePath = "../../projects-ecore/no.ntnu.idi.tdt4250.html/output/" + fileName; 
        
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
            response.setContentType("text/html");
            response.setStatus(HttpServletResponse.SC_OK);

            response.getWriter().println(content.toString());
        } catch (IOException e) {
            // If file not found or any other IO exception occurs, return a 404 error
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "File not found");
        }
    }
	
}