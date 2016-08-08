public class PositiveOrNegative{
public static void main(String[] args){
  Scanner s=new Scanner(System.in);
  int num=s.nextInt();
  if(num==0){
  System.out.println("the given number is zero");
  }
if(num<0){
System.out.println("the given number is negative");
}
else{
System.out.println("the given number is positive");
}
}
}
