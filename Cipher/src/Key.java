import java.util.ArrayList;


public class Key
	{
	
	public static void makeKey()
		{
		String []alphabetArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x", "y","z"};
		ArrayList myList = new ArrayList();
		for(int q = 0; q<alphabetArray.length; q++)
			{
			myList.add(alphabetArray[q]);
			}
		
		String[][] cipherSquare = new String[26][26];
		for(int i = 0; i<alphabetArray.length; i++)
			{
			for(int x = 0; x<alphabetArray.length; x++)
				{
				cipherSquare[i][x]=myList.get(x).toString();
				}
			String temp = myList.get(i).toString();
			myList.remove(myList.get(0));
			myList.add(temp);
			myList.set(myList.size()-1, temp);
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
