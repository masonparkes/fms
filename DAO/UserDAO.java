package DAO;

public class UserDAO{
	/**
	*Creates an empty user data acces object
	*/
	public UserDAO(){};
	/**
	*returns the model user class object that yo were searching for
	*/
	public Model.User getUser(String username){};
	/**
	*add a user object to the table
	*/
	public void addUSer(Model.User user){};
	/**
	*Removes all users from the table. 
	*/
	public void clearUsers(){};
	/**
	*Takes a username and looks them up in the table and then deletes them. 	
	*/
	public void clearUser(String username){};	
}