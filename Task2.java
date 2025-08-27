import java.util.*;
class Task2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand =new Random();
        int numberToGuess = rand.nextInt(100)+1;
        int userGuess = 0;
        System.out.println("Welcome to number guessing number");
        System.out.println("I have taken the number from 1 to 100");
        System.out.println("Try to guess the number");
        while(userGuess!= numberToGuess){
            System.out.println("enter the number");
            userGuess= sc.nextInt();
            
        
        if(userGuess>numberToGuess ){
            System.out.println("the number is very high");
        }
        else if(userGuess<numberToGuess ){
            System.out.println("the number is very low");
        }
        else{
            System.out.println("correct!! The number was  "+ numberToGuess);
        }
        
            
        }
        
    }
}