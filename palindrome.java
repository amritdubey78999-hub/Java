import java.util.Scanner;
class Palindrome{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number: ");
  int num=sc.nextInt();
  int original=num;
  int rev=0;
  for(int I=num; I>0; I=I/10){
   int digit=I%10;
   rev=rev*10+digit;
  }
  if(original==rev){
   System.out.println("Palindrome Number");
  }else{
   System.out.println("Not a Palindrome Number");
  }
 }
}
