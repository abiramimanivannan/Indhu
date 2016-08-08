import java.util.Scanner;

public class VowelOrConsonant{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
char[] ch=new char[]{'a','e','i','o','u'};
char c=s.next().charAt(0);
for(int i=0;i<ch.length;i++){
if(ch[i]==c){
System.out.println("Character is vowel");
}
else{
System.out.println("Character is consonant");
}
}
}}
