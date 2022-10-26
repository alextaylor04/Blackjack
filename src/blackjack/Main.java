package blackjack;

import java.util.Scanner;

public class Main {

    private static boolean game = true;

    public static void main(String[] args) {
        BlackjackGame game = new BlackjackGame();


        Scanner scanner = new Scanner(System.in);

        while (Main.game) {
            String nextLine = scanner.nextLine();
            if (nextLine.equalsIgnoreCase("end")) {
                Main.game = false;
            } else if (nextLine.equalsIgnoreCase("h") || nextLine.equalsIgnoreCase("hit")) {
                game.hit();
            }
            else if (nextLine.equalsIgnoreCase("s") || nextLine.equalsIgnoreCase("stand")) {
                game.stand();
            }

        }
    }
}
