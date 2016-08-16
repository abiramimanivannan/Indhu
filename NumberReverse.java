import java.util.*;
public class NumberReverse{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int num=s.nextInt();
int rev=0;
while(num!=0){
int a=num%10;
num=num/10;
rev=(rev*10)+a;
}
System.out.println(rev);
}
}
