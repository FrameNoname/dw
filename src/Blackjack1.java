import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Blackjack1 {
     public static void main(String[] args) {

          //1D array to keep cards
          int[] cardYou = new int[5];
          int[] cardComputer = new int[2];

          //Initialize game data
          Random rand = new Random();

          //Player
          cardYou[0] = rand.nextInt(11)+1;
          cardYou[1] = rand.nextInt(11)+1;

          //Dealer
          cardComputer[0] = 11;
          cardComputer[1] = 3;

          //Check both 11
          if(cardYou[0]==11 && cardYou[1]==11){
               cardYou[1] = 1;
          }
          if(cardComputer[0]==11 && cardComputer[1]==11){
               cardComputer[1] = 1;
          }

          //Show card
          Scanner input = new Scanner(System.in);

          String winner = "";

          //Check if player want to open the next card
          for(int i=2; i<cardYou.length; i++){
               System.out.println("Your cards: " + Arrays.toString(cardYou));
               System.out.println("Computer's cards: ? ?");
               System.out.println();
               //Logic check
               if (sumCard(cardYou) > 21) {
                    winner = "Computer";
                    break;
               }
               if (sumCard(cardComputer)==21 && sumCard(cardYou)==21){
                    winner = "Computer";
                    break;
               }
               if(sumCard(cardYou)==21){
                    winner = "You";
                    break;
               }
               if (sumCard(cardComputer)==21) {
                    winner = "Computer";
                    break;
               }
               
               System.out.print("Want another card? <y/n>...");
               if (input.nextLine().toLowerCase().equals("y")) {
                    cardYou[i] = rand.nextInt(11)+1;
                    if (sumCard(cardYou) > 21) {
                         winner = "Computer";
                         break;
                    }
                    if (i==4) {
                         break;
                    }
               } else {
                    if(sumCard(cardYou)>sumCard(cardComputer)){
                         winner = "You";
                    } else winner = "Computer";
                    break;
               }
          }
          //Show card
          System.out.println("Your cards: " + Arrays.toString(cardYou));
          System.out.println("Computer's cards: " + Arrays.toString(cardComputer));

          //Show result
          System.out.println ("Sum of your card "+ sumCard(cardYou));
          System.out.println ("Sum of Computer card "+sumCard(cardComputer) );
          System.out.println("The winner is: "+winner);
     }

     //Sum card method
     public static int sumCard(int allCard[]){
          int sum = 0;
          for(int i=0; i<allCard.length; i++){
               sum += allCard[i];
          }
          return sum;
     }
}