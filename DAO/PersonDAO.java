package DAO;

public class PersonDAO{
	/**
	*uses the person ID to return the person object from the table
	*/
	public Model.Person getPerson(String PersonID){};
	/**
	*Creates an empty event Data access object
	*/
	public PersonDAO(){};
	/**
	*This adds a Person Object to the table
	*/
	public void addPerson(Model.Person person){};
	/**
	*Removes all people from the table. 
	*/
	public void clearPeople(){};
	/**
	*Takes a person's name and looks them up in the table and then deletes them. 	
	*/
	public void clearPerson(String Name){};
}