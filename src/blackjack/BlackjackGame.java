package blackjack;

import java.util.Random;

public class BlackjackGame {



    private int playerHand, dealerHand;

    public BlackjackGame() {
        playerHand = 10 + getRandom().nextInt(12);

        if (playerHand == 21) {
            wonLostGame("Won Game with a hand of 21");
        }

        dealerHand = 10 + getRandom().nextInt(11);
        System.out.println("Dealer: " + dealerHand);
        System.out.println("Player:" + playerHand);
    }

    public void progressGame() {

        while (dealerHand <= 21) {
            if (dealerHand > playerHand) {
                wonLostGame("Lost: Dealer Hand reached " + dealerHand);
                return;
            }
            dealerHand += getRandom().nextInt(12);

            if (dealerHand == 21) {
                wonLostGame("Lost: Dealer Hand reached 21");
                return;
            }
        }
        wonLostGame("Win: Dealer Hand Bust");
    }

    public void hit() {
        playerHand += getRandom().nextInt(12);

        if (playerHand > 21) {
            wonLostGame("Bust: Your hand was " + playerHand);
            return;
        } else if (playerHand == 21) {
            wonLostGame("Won Game with a hand of 21");
            return;
        }

        System.out.println("Player Hand:" + playerHand);
    }

    public void stand() {
        progressGame();
    }

    public void wonLostGame(String message) {
        System.out.println(message);
        endGame();
    }

    public void endGame() {
        try {
            Thread.sleep(3000);
        } catch (Exception ignored) {
        }
        playerHand = 10 + getRandom().nextInt(12);
        dealerHand = 10 + getRandom().nextInt(11);

        if (playerHand == 21) {
            wonLostGame("Won Game with a hand of 21");
            return;
        }

        System.out.println("Dealer: " + dealerHand);
        System.out.println("Player:" + playerHand);

    }

    public Random getRandom() {
        return new Random();
    }
}
