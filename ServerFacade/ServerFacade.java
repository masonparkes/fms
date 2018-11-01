package ServerFacade;

public class ServerFacade{
	/**
	*Takes a request object with all the info needed to make a user
	*and returns a Response object if it works
	*or it returns an error response if there is a problem
	*/
	public Response Register(Request user){};
	/**
	*Logs in the user and returns an auth token
	*/
	public Response login(Request login_info){};
	/**
	*cleares all the data from the database	
	*/
	public Response clear(){};
	/**
	*fills the server's database with generated data for the 
	*specified user name. 
	*user name must already be registered with the server
	*If there is any data in the database is deleted
	*/
	public Response fill(String username){};
	/**
	*alternate fill function that specifies the number
	*of generations that should be generated
	*/
	public Response fill(String username, int gen){};
	/**
	*clears data from the database and then loads the posted user, person, and event data into the database
	*/
	public Response load(Request toLoad){};
	/**
	*Returns an object from the person model class that had the specified ID
	*/	
	public Model.Person getPerson(String personID){};
	/**
	*Returns an event model object that has the specified ID
	*/
	public Model.Event getEvent(String EventID){};
	/**
	*takes the provided authtoken and gets a user
	*then it gets all the events that the person
	*has.
	*/
	public Model.Event[] getEvents(){};
	
	
}