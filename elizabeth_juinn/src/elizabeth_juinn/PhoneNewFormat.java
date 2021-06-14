/*
* Author: elizabethyang
* Date: Jun 14, 2021
* Description: Ce programme permet de recevoir les numéros de télephone de formats différentes 
* valides (pou l'amérique du nord) et on utilise ici des expressions régulières tant pour la vérification 
* du format que pour le reformattage.
*/

package elizabeth_juinn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNewFormat {
	
	public static void main(String[] args)
	{
		//Expression régulière à respecter
		
		String regex="^\\(?([0-9] {3})\\)?[-.\\s]?([0-9] {3})?[-\\s]([0-9] {4})$";
		
		//LIste de numéros de tel
		List<String> tel=new ArrayList<String>();
			Scanner crayon=new Scanner(System.in);
		int k=0;
		String input ="";
		for(int i=0;i<5;i++)
		{
			k=i+1;
			System.out.println("Inscrire le numéro de télephone "+k);
			input=crayon.nextLine();
			tel.add(input);
		}
		crayon.close();
		
		Pattern pattern=Pattern.compile(regex);
		for(String phone:tel)
		{
			Matcher matcher=pattern.matcher(phone);
			if (matcher.matches())
				System.out.println(matcher.replaceFirst("($1) $2-$2"));
		}
		
	}

}



