/*
* Author: elizabethyang
* Date: Jun 9, 2021
* Description: Expressions régulières be base - Texte simple
*/

package elizabeth_juinn;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionsReg {
	
	public static void main(String[] args)
	{
		Scanner crayon=new Scanner(System.in);
		
		//input est le texte dans lequel l'expression srea recherchée
		System.out.println("Inscrire le texte pour la recherche");
		String input = crayon.nextLine();
		//Expression à rechercher
		System.out.println("Inscrire le texte recherché");
		String regEx = crayon.nextLine();
		
		//Étape 1: Utiliser Pattern
		Pattern pattern = Pattern.compile(regEx);
		//Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE); //pou ne pas tenir compte
		
		//Étape 2: Allouer un objet Matcher pour ;'entrée spécifié;
		Matcher matcher = pattern.matcher(input);
		
		//éEtape 3: Vérifier la concordance et afficher le résultat
		//on peut utiliser find()
		/*while (matcher.find())
		{
			System.out.println("Le(s) mot(s) \"" + matcher.group()
				+ "\" débute a l'indice " + matcher.start()
				+ " et finit à l'indice " + matcher.end());
		}*/
		
		//utilier matcher() Doit correspondre entièrement à tout le texte
		/*
		if (matcher.matches())
		{
			System.out.println("Les deux textes sont les mêmes");
		}*/
		
		//Utiliser lookingAt()
		if(matcher.lookingAt()) {
			System.out.println("ON a trouvé \"" + matcher.group()
				+ "\" commençant à l'indice " + matcher.start()
				+ " et finit à l'indice " + matcher.end());
		}else {
			System.out.println("Le texte ne se trouve pas au début");
		}
	}

}
