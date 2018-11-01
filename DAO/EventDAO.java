package DAO;

public class EventDAO{
	/**
	*uses the eventID to check the event table to return an event object
	*/
	public Model.Event getEvent(String eventID){};
	/**
	*Creates an empty event Data access object
	*/
	public EventDAO(){};
	/**
	*This add an event object to the table
	*/
	public void addEvent(Model.Event event){};
	/**
	*Removes all events from the table. 
	*/
	public void clearEvents(){};
	/**
	*Takes a event ID and looks them up in the table and then deletes them. 	
	*/
	public void clearEvent(String eventID){};
}