import java.util.Scanner;
class Armstrong{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter a number: ");
  int num=sc.nextInt();
  int original=num;
  int sum=0;
  for(int I=num; I>0; I=I/10){
   int digit=I%10;
   sum=sum + digit*digit*digit;
  }
  if(original==sum){
   System.out.println("Armstrong Number");
  }else{
   System.out.println("Not an Armstrong Number");
  }
 }
}
