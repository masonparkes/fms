package ServerFacade;
/**
*A Class to contain JSON objects that will be passed to the server facade object. 
*/
public class Request{
	/**
	*Includes all the text of a JSON object
	*/
	private String info;
	/**
	*returns the information from this request body
	*/
	public String getInfo();
	/**
	*makes a new Request out of it
	*/
	Request(String info){};


}