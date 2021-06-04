import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author: elizabethyang
* Date: Jun 4, 2021
* Description: 
*/

public class Exemple2 {
	
	public static void main(String[] args) throws IOException,FileNotFoundException
{
		FileReader ficALire;
		BufferedReader entree;
		char c;
			
			ficALire=new FileReader("monFichier.txt");
			entree = new BufferedReader(ficALire);
			c=(char) entree.read();
			System.out.print(c);;
			c=(char) entree.read();
			System.out.print(c);;
			c=(char) entree.read();
			System.out.print(c);
			entree.close();
			ficALire.close();
			
}

}
