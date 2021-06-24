package CoreJavaOne;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        if((year%400==0) || ((year%4==0) && (year%100!=0))){
            System.out.println(year+" is a Leap Year.");
        }
        else {
            System.out.println(year+" is not a Leap Year.");
        }
    }
}