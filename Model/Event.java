package Model;

public class Event {
	/**
	*A unique Identifier of the event
	*/
	public String EventID;
	/**
	*The username of the user this event belongs to.
	*/
	public String Descendant;
	/**
	*The Id of the person to which this event belongs
	*/
	public String Person;
	/**
	*Latitude of where the event happened
	*/
	public int Latitude;
	/**
	*Longitude of where the event happened
	*/
	public int Longitude;
	/**
	*Country where the event occured
	*/
	public String country;
	/**
	*City where the event occured
	*/
	public String city;
	/**
	*EventType, this could probably be an enumerated type or something of the
	*sort. Maybe a whole class of it's own.
	*/
	public String EventType;
	/**
	*The year in which the event occured
	*/
	public int Year;
	/**
	*Takes all the info that you'll need to make the required person object
	*/
	Event(String id, String des, String pers, int Lat, int Long, String Cont, String Cit, String EventType, int yr){};
}