import java.util.Scanner;
class LeapYear
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        String op = 
        ((year%100!=0 || year%400==0) && year%4==0)?
        (year+" is a Leap year"):
        (year+" is not a Leap year");

        System.out.println(op);
        
    }
}