//Write a Java program to check if character entered by user is a vowel, consonant or other character?

import java.util.Scanner;

public class Assign_Sec3_Que18 {

		public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a character : ");
		char character = sc.next().charAt(0);									
		if(character == 'a' || character =='e' || character == 'i'|| character =='o'|| character =='u' || character == 'A' || character == 'E' || character == 'I'|| character =='O'|| character =='U')
		System.out.println("Character entered is a Vowel");
		else if(character >='A' && character <='Z' || character >= 'a' && character <='z')
		System.out.println("Character is a Consonant");
		else 
		System.out.println("Character is a Special Character");
		sc.close();
	}		
}
