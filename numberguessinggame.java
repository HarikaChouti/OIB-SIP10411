import java.util.Scanner;

public class numberguessinggame{
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random()*100);
        int i;
        int score=0;
        
        System.out.println("Welcome to the Number Guessing Game .....");
        System.out.println("Guess the correct number .....");
        System.out.println("You have 8 Chances ... Let's Go .....");

        for(i=0; i<8; i++){
            
            System.out.print("Enter the number between 1 to 100 : ");
            int n = sc.nextInt();
            
            if(n == randomNumber){
                
                System.out.println("YOU WON!...CONGRATULATIONS !");
                score+=10;
                break;

            }else if(n < randomNumber){

                System.out.println("The number is smaller than the target number.....");

            }else{

                System.out.println("The number is larger than the target number.....");

            }

            System.out.println((7-i) + " ....Chances remaining");
        }
        System.out.println("Your score is ... "+score);

        if(i==8){

            System.out.println("You have Exhausted your 8 trials...");
            System.out.println("--------------GAME OVER -----------");
            System.out.println("--------BETTER LUCK NEXT TIME------");

            System.out.println("The Number was : " + randomNumber);
        }
    }
} 