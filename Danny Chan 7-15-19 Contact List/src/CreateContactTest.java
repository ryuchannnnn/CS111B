import java.util.Scanner;
import java.util.ArrayList;
//Name:Danny Chan
//Assignment: Exercise 6.1
//Created: 7-15-19
//This assignment takes in peoples contact info. 
public class CreateContactTest
{
	public static void main(String[] args) 
	{
		ArrayList<Contact> contacts = new ArrayList<Contact>();
		Scanner input = new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Add a new contact");
			System.out.println("2.Display all contacts");
			System.out.println("3.Display specific contact");
			System.out.println("4.Delete a contact");
			System.out.println("5.Quit");
			System.out.print("Enter Your choice: ");
			int choice = input.nextInt();
			input.nextLine();
			switch(choice)
			{
			case 1:
				System.out.print("Enter first name: ");
				String fName = input.nextLine();
				System.out.println();
				System.out.print("Enter last name: ");
				String lName = input.nextLine();
				System.out.print("Enter phone number: ");
				String phoneNum = input.nextLine();
				System.out.print("Enter Email address: ");
				String emailAdd = input.nextLine();
				contacts.add(new Contact(fName, lName, phoneNum, emailAdd));
				break;
			case 2:
				for(int i = 0; i < contacts.size(); i++)
				{
					Contact c = contacts.get(i);
					System.out.print(c.getlastname() + "  " + c.getfirstname() + "; ");
					System.out.print("Phone number: " + c.getphoneNumber());
					System.out.print("; Email: " + 	c.getemailAddress());
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Enter an information piece about a contact:");
				String info = input.nextLine();
				Contact c = findContact(contacts, info);	
				if(c != null)
				{
					System.out.print(c.getlastname() + ", " + c.getfirstname() + "; ");
					System.out.print("Phone number: " + c.getphoneNumber());
					System.out.print("; Email: " + c.getemailAddress());
					System.out.println();
				}
				else
					System.out.println("Contact not found.");
				break;
			case 4:
				System.out.println("Enter an information piece about the contact:");
				String someInfo = input.nextLine();
				Contact contact = 	findContact(contacts, someInfo);
				if(contact != null)
				{
					System.out.print(contact.getlastname() + ", " + contact.getfirstname() + "; 				");
					System.out.print("Phone number: " + 	contact.getphoneNumber());
					System.out.print("; Email: " + 		contact.getemailAddress());
					System.out.println();
					System.out.println("Are you sure to delete this contact? (Y/N)");
					String delete = input.nextLine();
					if(delete.equalsIgnoreCase("y"))
					{
						contacts.remove(contact);
						System.out.println("Contact deleted successfully.");
					}
				}
				else
					System.out.println("Contact not found.");
				break;
			}
			if(choice == 5)
				break;
			System.out.println("______");
		}
	}
	private static Contact findContact(ArrayList<Contact> findContacts, String contactInfo)
	{
		Contact c = null;
		for(int i = 0; i < findContacts.size(); i++)
		{
			if(findContacts.get(i).getfirstname().
					indexOf(contactInfo) != -1)
				c = findContacts.get(i);
			if(findContacts.get(i).getlastname().
					indexOf(contactInfo) != -1)
				c = findContacts.get(i);
			if(findContacts.get(i).getphoneNumber().
					indexOf(contactInfo) != -1)
				c = findContacts.get(i);
			if(findContacts.get(i).getemailAddress().
					indexOf(contactInfo) != -1)
				c = findContacts.get(i);
		}
		return c;
	}
}
