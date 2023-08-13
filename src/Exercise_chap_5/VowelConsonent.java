package Exercise_chap_5;

import java.util.Scanner;

public class VowelConsonent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = in.next();

        in.close();

        if(letter.length() > 1)
        {
            System.out.println("Not a letter");
        }
        else if(!Character.isLetter(letter.charAt(0)))
        {
            System.out.println("Not a letter");
        }
        else if(letter.charAt(0) == 'A' || letter.charAt(0) == 'a' || letter.charAt(0) == 'E' || letter.charAt(0) == 'e' ||
                letter.charAt(0) == 'I' || letter.charAt(0) == 'i' || letter.charAt(0) == 'O' || letter.charAt(0) == 'o' ||
                letter.charAt(0) == 'U' || letter.charAt(0) == 'u')
        {
            System.out.println("Vowel");
        }
        else
        {
            System.out.println("Consonant");
        }
    }
}
