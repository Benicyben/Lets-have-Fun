import java.util.Scanner;
public class Taskone{
 public static void main(String[]args){
  Scanner input= new Scanner(System.in);
  
  int sum = 0;
  
  for(int counter=1; counter <=10; counter++){
  System.out.print("Enter a Score: ");
  int score = input.nextInt();
  
  if(score%2==0){
  sum+=score;
  }
  }
  
  int average= sum / 10;
  
  
  System.out.println("The average numbers is: "+ average);
  
   }
    }
     
  
  
  
  
  
  
  

