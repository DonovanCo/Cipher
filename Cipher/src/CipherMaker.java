import java.util.ArrayList;
import java.util.Scanner;

public class CipherMaker extends Key
	{
	static String[][] cipherSquare = new String[26][26];
	static String message;
	static String myKey;

	static Scanner file = new Scanner(System.in);
	
	public static void main(String[] args)
		{
		makeKey();

		}
	
	public static void makeKey()
	{
	String []alphabetArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x", "y","z"};
	ArrayList<String> myList = new ArrayList<String>();
	for(int q = 0; q<alphabetArray.length; q++)
		{
		myList.add(alphabetArray[q]);
		}
	
	for(int i = 0; i<myList.size(); i++)
		{
		for(int x = 0; x<myList.size(); x++)
			{
			cipherSquare[i][x]=myList.get(x).toString();
			}
		String temp = myList.get(0).toString();
		myList.remove(myList.get(0));
		myList.add(temp);
		myList.set(myList.size()-1, temp);
		}
	}
	
	public static void ask()
		{
		System.out.println("Would you like to 1.) Encrypt or 2.) Decrypt a message.");
		int choice = file.nextInt();
		if(choice == 1)
			{
			 encrypt();
			}
		else if(choice == 2)
			{
			 decrypt();
			}
		else
			{
			System.out.println("That is not an option.");
			}
		}
	
	public static void encrypt()
	{
		myKey = getKey().toLowerCase();
		message = getMessage().toLowerCase();
	}
		
	
	public static String getKey()
		{
		System.out.println("Enter in your key.");
		String str = file.next();
		return str;
		}
	
	public static String getMessage()
		{
		System.out.println("Enter in your message without spaces.");
		String str = file.next();
		return str;
		}
	
	public static String makeEncryption()
		{
		int keyInd = 0;
		for(int i = 0; i<message.length(); i++)
			{
			for(int x  = 0; x<)
			}
		}

	}
