import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author: elizabethyang
* Date: Jun 4, 2021
* Description: 
*/

public class Exemple5 {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		BufferedReader entree;
		String ligne;
		
			entree = new BufferedReader(new FileReader("monFichier.txt"));
			
			while(entree.ready())
			{
				ligne=entree.readLine();
				System.out.print(ligne);
			}
			
			entree.close();
	}
}
