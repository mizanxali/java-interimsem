import java.util.Scanner;

class Question3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do
        {
            System.out.println("Enter player 1 move");
            String player1Move = sc.nextLine();
            System.out.println("Enter player 2 move");
            String player2Move = sc.nextLine();
            rockPaperScissors(player1Move, player2Move);
            System.out.println("Would you like to play again? Enter Y to play or any other key to quit: ");
            choice = sc.nextLine();
        } while(choice.equalsIgnoreCase("Y"));
        System.out.println("Thanks for playing!");
    }

    public static void rockPaperScissors(String player1Move, String player2Move) {

        if((player1Move.equalsIgnoreCase("rock") || player1Move.equalsIgnoreCase("paper") || player1Move.equalsIgnoreCase("scissors")) && (player2Move.equalsIgnoreCase("rock") || player2Move.equalsIgnoreCase("paper") || player2Move.equalsIgnoreCase("scissors"))) {
            if(player1Move.equalsIgnoreCase("rock") && player2Move.equalsIgnoreCase("scissors"))
                System.out.println("Player 1 wins!");

            else if(player2Move.equalsIgnoreCase("rock") && player1Move.equalsIgnoreCase("scissors"))
                System.out.println("Player 2 wins!");

            else if(player1Move.equalsIgnoreCase("scissors") && player2Move.equalsIgnoreCase("paper"))
                System.out.println("Player 1 wins!");

            else if(player2Move.equalsIgnoreCase("scissors") && player1Move.equalsIgnoreCase("paper"))
                System.out.println("Player 2 wins!");

            else if(player1Move.equalsIgnoreCase("paper") && player2Move.equalsIgnoreCase("rock"))
                System.out.println("Player 1 wins!");

            else if(player2Move.equalsIgnoreCase("paper") && player1Move.equalsIgnoreCase("rock"))
                System.out.println("Player 2 wins!");

            else if(player1Move.equalsIgnoreCase("rock") && player2Move.equalsIgnoreCase("rock"))
                System.out.println("TIE!");

            else if(player1Move.equalsIgnoreCase("paper") && player2Move.equalsIgnoreCase("paper"))
                System.out.println("TIE!");

            else if(player1Move.equalsIgnoreCase("scissors") && player2Move.equalsIgnoreCase("scissors"))
                System.out.println("TIE!");
        }

        else {
            if(player1Move.equalsIgnoreCase("rock") || player1Move.equalsIgnoreCase("paper") || player1Move.equalsIgnoreCase("scissors")){
                System.out.println("Invalid move of " + player2Move);
            }
            else if(player2Move.equalsIgnoreCase("rock") || player2Move.equalsIgnoreCase("paper") || player2Move.equalsIgnoreCase("scissors")) {
                System.out.println("Invalid move of " + player1Move);
            }
            else {
                System.out.println("Invalid moves of " + player1Move + " and " + player2Move);
            }
        }
    }
}