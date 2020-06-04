import java.util.Scanner;

public class player {

    boolean winningCondition;
    boolean loseCondition;

    public void playerturn(int playercount){

        Scanner keyboard = new Scanner(System.in);


        int playerOnePosition = 0;
        int playerTwoPosition = 0;
        rolldice d6 = new rolldice();

        String letterg;
        do {
             System.out.println("");
            System.out.println("SPELER 1");
            System.out.println("Gooi je dobbelsteen (g):");
            letterg = keyboard.next();
            while (!letterg.equals("g")){
                System.out.println("Gebruik g om je dobbelsteen te gooien:");
                letterg = keyboard.next();
            }

            //roll 1d6 playerOne
            int playerOneDie = d6.onedicesix();
            System.out.println("Je hebt " + playerOneDie + " gegooid,");

            //playerOne position
            playerOnePosition = playerOnePosition + playerOneDie;
            System.out.println("Je staat op plaats " + playerOnePosition + ".");

            switch (playerOnePosition) {
                case 23:
                    System.out.println("gevangenis. Het spel is over.");
                    loseCondition = true;
                case 25:                case 45:
                    System.out.println("Terug naar start.");
                    playerOnePosition = 0;
                    break;

                case 10:  case 20:      case 30:     case 40: case 50:     case 60:
                    playerOnePosition = playerOnePosition + playerOneDie;
                    System.out.println("Bonus stapjes! Je staat nu op plaats " + playerOnePosition + ".");
                    if (playerOnePosition == 23){loseCondition = true;}
                    else if (playerOnePosition > 63){winningCondition = true;}
                    break;
                case 63:
                    winningCondition = true;
                default:
                    if (playerOnePosition > 63) {
                        System.out.println("Je bent te ver gegaan! Ga stappen terug.");
                        playerOnePosition = playerOnePosition + playerOneDie;
                        playerOnePosition = playerOnePosition - (playerOnePosition-63);
                        System.out.println("Je staat nu op plaats " + playerOnePosition + ".");
                        winningCondition = true;
                    } else if (playerOnePosition == 23){}

                     else {
                        System.out.println("Niks aan de hand!");
                    }
            }

            //Player 2
            if (playercount == 2 && winningCondition == false && loseCondition == false) {
                System.out.println("");
                System.out.println("SPELER 2");
                System.out.println("Gooi je dobbelsteen (g):");
                letterg = keyboard.next();
                while (!letterg.equals("g")) {
                    System.out.println("Gebruik g om je dobbelsteen te gooien:");
                    letterg = keyboard.next();
                }

                //roll 1d6 playerTwo
                int playerTwoDie = d6.onedicesix();
                System.out.println("Je hebt " + playerTwoDie + " gegooid,");

                //playerTwo position
                playerTwoPosition = playerTwoPosition + playerTwoDie;
                System.out.println("Je staat op plaats " + playerTwoPosition + ".");

                switch (playerTwoPosition) {
                    case 23:
                        System.out.println("gevangenis. Het spel is over.");
                        loseCondition = true;
                        break;

                    case 25:                case 45:
                        System.out.println("Terug naar start.");
                        playerTwoPosition = 0;
                        break;

                    case 10:  case 20:      case 30:     case 40: case 50:     case 60:
                        playerTwoPosition = playerTwoPosition + playerTwoDie;
                        System.out.println("Bonus stapjes! Je staat nu op plaats " + playerTwoPosition + ".");
                        if (playerOnePosition == 23){loseCondition = true;}
                        else if (playerOnePosition > 63){winningCondition = true;}
                        break;
                    case 63:
                        winningCondition = true;
                    default:
                        if (playerTwoPosition > 63) {
                            System.out.println("Je bent te ver gegaan! Ga stappen terug.");
                            playerTwoPosition = playerTwoPosition + playerTwoDie;
                            playerTwoPosition = playerTwoPosition - (playerTwoPosition-63);
                            winningCondition = true;}
                        else if (playerOnePosition == 23){}
                        else {
                            System.out.println("Niks aan de hand!");
                        }
                }
            }
        }

        while (winningCondition != true && loseCondition !=true );
        if (loseCondition == true){System.out.println("Je hebt verloren.");}
        else {System.out.println("Finish! Je hebt gewonnen!");}

        }
}
