import java.util.Scanner;

public class ganzenbord {


    //main method
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);


        //aantal spelers
        int playercount;
        System.out.println("Welkom bij ganzenbord! Voer aantal spelers in (max 2):");
        playercount = keyboard.nextInt();
        while (playercount < 1 || playercount > 2){
            System.out.println("onjuiste hoeveelheid spelers, voer opnieuw in!");
            playercount = keyboard.nextInt();
        }
        System.out.println("Aantal spelers: " + playercount);

        player spelers = new player();
        spelers.playerturn(playercount);

/*
            int playerOnePosition = 0;
            String letterg;
            do {
                System.out.println("Gooi je dobbelsteen (g):");
                letterg = keyboard.next();
                while (!letterg.equals("g")){
                    System.out.println("Gebruik g om je dobbelsteen te gooien:");
                    letterg = keyboard.next();
                }

                //roll 1d6
                rolldice d6 = new rolldice();
                int currentthrow = d6.onedicesix();
                System.out.println("Je hebt " + currentthrow + " gegooid,");

                //player position
                playerOnePosition = playerOnePosition + currentthrow;
                System.out.println("Je staat op plaats " + playerOnePosition + ".");
                switch (playerOnePosition) {
                    case 23:
                        System.out.println("gevangenis. Het spel is over.");
                        break;
                    case 25:                case 45:
                        System.out.println("Terug naar start.");
                        playerOnePosition = 0;
                        break;

                    case 10:  case 20:      case 30:     case 40: case 50:     case 60:
                        playerOnePosition = playerOnePosition + currentthrow;
                        System.out.println("Bonus stapjes! Je staat nu op plaats " + playerOnePosition + ".");

                    default:
                        if (playerOnePosition > 63) {
                            System.out.println("Je bent te ver gegaan! Ga stappen terug.");
                            playerOnePosition = playerOnePosition + currentthrow;
                            playerOnePosition = playerOnePosition - (playerOnePosition-63);
                            System.out.println("Je staat nu op plaats " + playerOnePosition + ".");

                        } else {
                            System.out.println("Niks aan de hand!");
                        }
                }

            }

            while (playerOnePosition != 63 && playerOnePosition != 23 );
            if (playerOnePosition == 23){System.out.println("Je hebt verloren.");}
            else {System.out.println("Finish! Je hebt gewonnen!");}
*/

    }

}





