import java.util.Scanner;
public class Taskone{
 public static void main(String[]args){
  Scanner imput= new Scanner(System.in);
  
  int sum = 0;
  for(int counter=1; counter <=10; counter++){
  System.out.print("Enter a Score: ");
  int score = input.nextInt();
  
  if(counter%2==0){
  sum+=score;
  }
  }
  
  
  System.out.println("The sum is: " + sum);
  
   }
    }
     
  
  
  
  
  
  
  

