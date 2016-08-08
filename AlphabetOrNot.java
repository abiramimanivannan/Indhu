import java.util.*;
public class AlphabetOrNot{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if(Character.isAlphabetic(c))
{
System.out.println("The given data is Alphabet");
}
else
{
System.out.println("The given data is not Alphabet");
}
}
}
