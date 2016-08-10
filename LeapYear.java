import java.util.*;
public class LeapYear{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int year=s.nextInt();
if(year%400==0 || (year%100 !=0 && year%4==0))
{
System.out.print("Leap year");
}
else
{
System.out.print("Not a Leap year");
}
}
}
