import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Word");
        String string = scanner.nextLine();
        if(isPal(string))
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is not a palindrome");
    }
    public static boolean isPal(String s){
        if(s.length()== 0|| s.length() ==1)
            return true;
        if(s.charAt(0)==s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length()-1));
        return false;

    }
}