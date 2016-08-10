import java.util.*;
public class SumOfNatural{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int limit=s.nextInt();
int sum=0;
for(int i=1;i<=limit;i++)
{
sum+=i;
}
System.out.print(sum);
}
}
