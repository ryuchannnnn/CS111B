public class Contact 
{
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String emailAdd;
	public Contact(String firstname, String lastname, String phoneNumber, String emailAddress)
	{
		firstName = firstname;
		lastName = lastname;
		phoneNum = phoneNumber;
		emailAdd = emailAddress;
	}
	public void setfirstname(String newfirstname)
	{
		firstName = newfirstname;
	}
	public void setlastname(String newlastname)
	{
		lastName = newlastname;
	}
	public void setphoneNumber(String newphoneNumber)
	{
		phoneNum = newphoneNumber;
	}
	public void setemailAdd(String newemailAddress)
	{
		emailAdd = newemailAddress;
	}
	public String getfirstname()
	{
		return firstName;
	}
	public String getlastname()
	{
		return lastName;
	}
	public String getphoneNumber()
	{
		return phoneNum;
	}
	public String getemailAddress()
	{
		return emailAdd;
	}
}
