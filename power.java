import java.util.Scanner;


public class power {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Number :");
	int num=s.nextInt();
	System.out.println("Power :");
	int pow=s.nextInt();
	int result=(int) Math.pow(num, pow);
	System.out.println(result);
	
}
}
