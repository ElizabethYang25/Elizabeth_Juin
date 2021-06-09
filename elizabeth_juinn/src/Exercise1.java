import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
* Author: elizabethyang
* Date: Jun 9, 2021
* Description: 
*/

public class Exercise1 {
	public static void main(String[] args) throws IOException,FileNotFoundException{
	FileReader ficALire;
	BufferedReader entree;
	
	char c;
	int count = 0;
	try {
		ficALire = new FileReader("monFichier2.txt");
		entree = new BufferedReader(ficALire);
		
		while(entree.ready())
		{
			c= (char) entree.read();
			
			if (c=='a')
			{
				count++;
			}
		}
		
		System.out.println("Il y a " + count + " caractères 'a' dans le texte");
	}catch (FileNotFoundException fnf){
		System.out.println("Le fichier ne peut pas être lu");
		
	}catch (IOException ioe)
	{
		System.out.println("Erreur d'entrée");
	}

}
}
