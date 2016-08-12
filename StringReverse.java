import java.util.*;
class StringReverse{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str=s.next();
char[] ch=str.toCharArray();
String rev="";
for(int i=str.length()-1;i>=0;i--)
{
rev+=ch[i];
}
System.out.println(rev);
}
}
