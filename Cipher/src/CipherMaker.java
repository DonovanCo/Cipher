import java.util.ArrayList;
import java.util.Scanner;

public class CipherMaker
	{
	static String[][] cipherSquare = new String[26][26];
	static String message;
	static String myKey;
	static ArrayList<String> finalProduct = new ArrayList<String>();

	static Scanner file = new Scanner(System.in);
	
	public static void main(String[] args)
		{
		makeKey();
		ask();

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
		message = getMessage().toLowerCase().replaceAll("[^\\p{L}\\p{Nd}]+", ""); 
		makeEncryption();
	}
	
	public static void decrypt()
		{
		myKey = getKey().toLowerCase();
		message = getMessage().toLowerCase().replaceAll("[^\\p{L}\\p{Nd}]+", ""); 
		makeDecryption();
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
		String str = file.nextLine().toLowerCase();
		return str;
		}
	
	public static void makeEncryption()
		{
		int keyInd = 0;
		for(int i = 0; i<message.length(); i++)
			{
			String singChar = message.substring(i, i+1);
			String singKey = myKey.substring(keyInd, keyInd+1);
			for(int x  = 0; x<cipherSquare.length; x++)
				{
				for(int j = 0; j<cipherSquare[0].length; j++)
					{
					if(cipherSquare[x][0].equals(singKey))
						{
						if(cipherSquare[x][j].equals(singChar))
							{
							finalProduct.add(cipherSquare[0][j]);
							}
						}
					}
				}
			if(keyInd==(myKey.length()-1))
				{
				keyInd=keyInd-(myKey.length()-1);
				}
			else
				{
				keyInd++;
				}
			}
		for(String st : finalProduct)
			{
			System.out.print(st.toUpperCase());
			}
		}
	
	public static void makeDecryption()
		{
		int keyInd = 0;
		for(int i = 0; i<message.length(); i++)
			{
			String singChar = message.substring(i, i+1);
			String singKey = myKey.substring(keyInd, keyInd+1);
			for(int x  = 0; x<cipherSquare.length; x++)
				{
				for(int j = 0; j<cipherSquare[0].length; j++)
					{
					if(cipherSquare[x][0].equals(singKey))
						{
						if(cipherSquare[0][j].equals(singChar))
							{
							finalProduct.add(cipherSquare[x][j]);
							}
						}
					}
				}
			if(keyInd==(myKey.length()-1))
				{
				keyInd=keyInd-(myKey.length()-1);
				}
			else
				{
				keyInd++;
				}
			}
		for(String st : finalProduct)
			{
			System.out.print(st.toUpperCase());
			}
		}

	}
