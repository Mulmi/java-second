import java.time.LocalDate;
import java.util.Scanner;

public class DateWork1 {
    //ask user to enter his/her birth year.
    //subtract that year with ld.getyear.
    //print the age.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your birth year");
        int birthyear= sc.nextInt();
        LocalDate ld=LocalDate.now();

        int currentyear=ld.getYear();
        int age=currentyear-birthyear;
        System.out.println("your age is " + age);
    }
}
