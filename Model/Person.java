package Model;

public class Person{
	/**
	*Unique identifier for this person(non-empty string)
	*/
	private String PersonID;
	/**
	*The username that this person belongs to.
	*/
	private String User;
	/**
	*Person's first name
	*/
	private String firstname;
	/**
	*Person's last name
	*/
	private String lastname;
	/**
	*The person's gender, String "f" or "m"
	*/
	private String gender;
	/**
	*The ID of the person's father, possibly null
	*/
	private String father;
	/**
	*the Id of the person's mother
	*/
	private String mother;
	/**
	*The ID of the spouse of the person
	*/
	private String spouse;
	/**
	*Takes the necessary information and then creates a new person object our of it.
	*/
	public Person(String id, String des, String first, String last, String gen, String dad, String mom, String spows){}
}