package no.ntnu.idi.tdt4250.scheduling;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import no.ntnu.idi.tdt4250.tt.TimeSlot;
import no.ntnu.idi.tdt4250.tt.TtFactory;

class Room {
	int HOUR_START = 8;
	int HOUR_END = 16;
	int NUM_HOURS = HOUR_END - HOUR_START;
	int NUM_DAYS = 5;
	
	int capacity;
	int id;
	String name;
	ArrayList<Tuple<Calendar, Calendar>>[][] availibity;
	no.ntnu.idi.tdt4250.tt.Room roomTt; 
	
	public Room(int capacity, int id, String name, String mazeMapLink, TtFactory factory) {
		this.capacity = capacity;
		this.name = name;
		this.availibity = new ArrayList[NUM_DAYS][NUM_HOURS];
		this.id = id;
		roomTt = factory.createRoom();
		roomTt.setName(name);
		roomTt.setID(id);
		roomTt.setCapacity(capacity);
		roomTt.setMazeMapsLink(mazeMapLink);
	}
	
	public void addEntry(int day, int hourStart, int duration, Calendar startPeriod, Calendar endPeriod) {
		for(int i=hourStart;i<hourStart+duration;i++) {
			if(this.availibity[day][i] == null) {
				this.availibity[day][i] = new ArrayList<>();
			}
			this.availibity[day][i].add(new Tuple<Calendar, Calendar>(startPeriod, endPeriod));
		}
	}
	
	public boolean isFree(int day, int hourId, int duration, int capacity, Calendar startPeriod, Calendar endPeriod) {
		if(capacity > this.capacity) {
			// System.out.println("the room has not enough requested space, requested:"+capacity+" available: "+this.capacity);
			// the room has not enough requested space
			return false;
		}
		for(int i=hourId;i<hourId+duration;i++) {
			if(periodCollide(day, hourId, startPeriod, endPeriod)){
				return false;
			}	
		}
		return true;
	}
	
	private boolean periodCollide(int day, int hour, Calendar start1, Calendar end1) {
		boolean collides = false;
		ArrayList<Tuple<Calendar, Calendar>> timeslot = this.availibity[day][hour];
		if(timeslot == null) {
			return false;
		}
		for(Tuple<Calendar, Calendar> entries: timeslot) {
			Calendar start2 = entries.getFirst();
			Calendar end2 = entries.getSecond();
			//System.out.println(String.format("comparing %s-%s with %s-%s", convertCalendarToString(start1), convertCalendarToString(end1), convertCalendarToString(start2), convertCalendarToString(end2)));
			if((start1.before(end2)) && (end1.after(start2))) {
				collides = true;
				break;
			}
			//System.out.println(String.format("period %s-%s doesn't collide with period %s-%s", convertCalendarToString(start1), convertCalendarToString(end1), convertCalendarToString(start2), convertCalendarToString(end2)));
		}
		return collides;
	}
	
	
	public void printAvailibility() {
		System.out.println("room: "+name);
		for (int day = 0; day < availibity.length; day++) {
			for (int hour = 0; hour < availibity.length; hour++) {
				ArrayList<Tuple<Calendar, Calendar>> entry = this.availibity[day][hour];
				if(entry != null) {
					for(Tuple<Calendar,Calendar> period: entry) {
						System.out.println(String.format("period %s-%s at day: %d, hour: %d", convertCalendarToString(period.getFirst()), convertCalendarToString(period.getSecond()), day, hour+8));
					}
				}
			}
		}
	}
	
	private String convertCalendarToString(Calendar calendar) {
		try {
			SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			return dateTimeFormat.format(calendar.getTime());
		} catch (Exception e) {
			return "";
		}

	}
	
}
