package ServerFacade;
/**
*A Class to contain JSON objects that will be passed from the server facade object.
*/ 
public class Response{
	/**
	*Includes all the text of a JSON object
	*/
	private String info;
	/**
	*returns the information from this request body
	*/
	public String getInfo();
	/**
	*makes a new Response out of it
	*/
	Response(String info){};
}