import java.util.ArrayList;


public class Key
	{
	
	public static void makeKey()
		{
		char []alphabetArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		ArrayList myList = new ArrayList();
		for(int q = 0; q<alphabetArray.length; q++)
			{
			myList.add(alphabetArray[q]);
			}
		
		char[][] cipherSquare = new char[26][26];
		for(int i = 0; i<alphabetArray.length; i++)
			{
			for(int x = 0; x<alphabetArray.length; x++)
				{
				
				}
			}
		for(int z = 0; z<cipherSquare.length; z++)
			{
			for(int a = 0; a<cipherSquare[0].length; a++)
				{
				System.out.print(cipherSquare[z][a]);
				}
			System.out.println();
			}
		}
	
	}
