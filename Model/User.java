package Model;

class User{
	/**Unique non-empty string
	*/
	private String Username;
	/**A non empty string
	*/
	private String Password;
	/**A non-empty string
	*/
	private String email;
	/**The user's first name
	*/
	private String firstName;
	/**The user's last name
	*/
	private String lastName;
	/**
	*Gender is a string "f" or "m"
	*/
	private String gender;
	/**
	*Constructer to build the user objects with data recieved form the table
	*/
	User(String username,String password, String email, String firstname,String lastname,String gender){};

}