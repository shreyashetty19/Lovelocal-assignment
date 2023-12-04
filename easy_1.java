
//Given a string s consisting of words and spaces, return the length of the last word in the string.

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        // Remove leading and trailing whitespaces from the input string
        String mystr = s.trim();
        String[] str = mystr.split(" ");
        
         // Get the last substring from the array
        String laststring = str[str.length - 1];
        System.out.println(laststring.length());
    }
}