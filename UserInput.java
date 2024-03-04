// import textio.TextIO;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        System.out.println("UserInput-----");
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=input.nextInt();
        System.out.print("enter a another number: ");
        int b=input.nextInt();
        System.out.println("output:"+(a+b));
    }
}