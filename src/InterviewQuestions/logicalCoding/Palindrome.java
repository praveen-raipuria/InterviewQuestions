package InterviewQuestions.logicalCoding;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // input 111 ,mama
        // output 111, mama
        String input;
        String Revers = "";

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number here ...!!  ");
        input = in.nextLine();

        //	int n=input.length();
        for (int i = input.length() - 1; i >= 0; i--) {
            Revers = Revers + input.charAt(i);
        }
        System.out.println("Enter value is :: " + input);
        if (input.equals(Revers)) {
            System.out.println(input + " is Palindrome");
        } else {
            System.out.println(input + " Not an Palindrome");
        }
    }
}

