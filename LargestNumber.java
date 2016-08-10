import java.util.*;
public class LargestNumber{
public static void main(String[] args){
int[] a=new int[3];
Scanner s=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
int max=a[0];
for(int j=1;j<a.length;j++)
{
if(max<a[j]){
max=a[j];
}
}
}
}
