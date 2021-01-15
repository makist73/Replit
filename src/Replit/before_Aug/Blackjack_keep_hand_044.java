package Replit.before_Aug;

public class Blackjack_keep_hand_044 {

    public static void main(String[] args) {

        int player = 20;
        int house = 20;

        if (player > 21 ) {
            System.out.println("bust");}
         if (player <= 21 || player > house) {
            System.out.println("player wins");
             if (house == player) {
                 System.out.println("its a tie");
        }
        }  else if (house > player && player !=21) {
             System.out.println("player loss");
        }

    }
}



