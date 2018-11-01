package DAO;

public class AuthTokenDAO{
	/**
	*Creates an empty authtoken data acces object
	*/
	public AuthTokenDAO(){};
	/**
	*Checks the Authtoken table to see if the person is authorized to do stuff
	*@Param the username you want the authtoken for
	*/
	public Model.AuthToken getAuth(String username){};
	/**
	*Adds an authtoken to the table
	*/
	public void addToken(Model.AuthToken token){};
	/**
	*Removes all Auth Tokens from the table. 
	*/
	public void clearAuthTokens(){};
	/**
	*Takes a username and looks them up in the table and then deletes their authtokens. 	
	*/
	public void clearAuthToken(String Name){};
}