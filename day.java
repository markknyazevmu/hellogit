import java.util.Scanner;
public class day {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        String[] monthStrings = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("You selected ");
        if (day==1) System.out.print("1st ");
        else if (day==2) System.out.print("2nd ");
        else if (day==3) System.out.print("3rd ");
        else if (day>3 && day<=daysInMonth[month-1]) System.out.print(day+"th ");
        else System.out.print("an incorrect day ");
        if (month>1 && month<13) System.out.print("of "+monthStrings[month-1]);
        else System.out.print("an incorrect month");
    }
}
