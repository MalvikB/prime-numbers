import java.util.ArrayList;
import java.util.Scanner;

public class prime-numbers 
{	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in); 						
		System.out.print("wprowadz liczbe:");
		int liczba = scan.nextInt(); 								
		scan.close(); 												
		ArrayList<Integer> dzielniki = new ArrayList<Integer>(); 	
		for (int i=1; i <= liczba; i++) 
		{
			if (liczba%i == 0)  									// sprawdzenie czy liczba i jest dzielnikiem
			{	
				dzielniki.add(i); 									// dodanie dzielnika i do listy dzielniki
			}
		}
		if (liczba>0) 												// sprawdzenie warunku,czy liczba jest liczba dodatnia
		{
			if (dzielniki.size() == 2) 															// sprawdzenie czy rozmiar listy dzielnikow wynosi 2
				System.out.println("Wprowadzona liczba jest liczba pierwsza");
			else if (liczba ==1 ) 	System.out.println("Wprowadzona liczba nie jest pierwsza");	// dodanie wyjatku dla liczby 1
			else
			{
				System.out.println("Wprowadzona liczba nie jest pierwsza");	
				System.out.println("Jej dzielniki to: " +dzielniki.toString()); 				// wypisanie zawartosci listy dzielniki
			}
		}
		else System.out.println("Liczba pierwsza to liczba naturalna wieksza od 0 !");
	}
}
