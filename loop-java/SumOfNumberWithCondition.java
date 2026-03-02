
import java.util.Scanner;

//Write a Java program that:

//Takes a positive integer n.

//Prints the sum of all numbers between 1 and n BUT Skip numbers divisible by 3.

public class SumOfNumberWithCondition {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter n");
    int n = s.nextInt();
    int sum = 0;
    if(n<=0)
    {
      System.out.println("Invalid Input");
      return;
    }
    else{
    for(int i =1;i<=n;i++)
    {
      if(i%3!=0)
      {
        sum = sum + i;
      }
      
    }
    }
   
     System.out.println("the value of sum is " +  sum);
  }
  
  

  
  
}
