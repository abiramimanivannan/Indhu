import java.util.Scanner;


public class NoOfDigits {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int count=String.valueOf(num).length();
	System.out.println(count);
	
}
}
