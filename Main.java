package Lecture1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter your next value: ");
    int inValue = scanner.nextInt();
    System.out.println("Why did you enter " + inValue + "?");

    char letter = 'A';
    String words = "The Words";

    System.out.println("\u03B1" + "   " + 0b1111);
    
    scanner.close();

    }
}
