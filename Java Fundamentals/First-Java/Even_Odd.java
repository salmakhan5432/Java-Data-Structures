import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
    // Write a program to print whether a number is even or odd, also take input from the user.
        System.out.println("Enter number : ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
        scanner.close();
    }
}