import java.util.*;

public class Blackjack21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean playing = true;

        System.out.println("=== Welcome to 21 Blackjack! ===");

        while (playing) {
            List<Integer> playerHand = new ArrayList<>();
            List<Integer> dealerHand = new ArrayList<>();

            // Initial 2 cards for player and dealer
            playerHand.add(dealCard(rand));
            playerHand.add(dealCard(rand));
            dealerHand.add(dealCard(rand));
            dealerHand.add(dealCard(rand));

            boolean playerBusted = false;

            // Player Turn
            while (true) {
                System.out.println("\nYour hand: " + playerHand + " | Total: " + handTotal(playerHand));
                System.out.println("Dealer shows: " + dealerHand.get(0));
                System.out.print("Do you want to [H]it or [S]tay? ");
                String choice = input.next().toLowerCase();

                if (choice.equals("h")) {
                    playerHand.add(dealCard(rand));
                    int total = handTotal(playerHand);
                    if (total > 21) {
                        System.out.println("You BUSTED with " + total + "!");
                        playerBusted = true;
                        break;
                    }
                } else if (choice.equals("s")) {
                    break;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            }

            // Dealer Turn
            if (!playerBusted) {
                System.out.println("\nDealer's hand: " + dealerHand + " | Total: " + handTotal(dealerHand));
                while (handTotal(dealerHand) < 16) {
                    int newCard = dealCard(rand);
                    dealerHand.add(newCard);
                    System.out.println("Dealer hits and gets: " + newCard);
                }

                int dealerTotal = handTotal(dealerHand);
                System.out.println("Dealer's final total: " + dealerTotal);

                // Results
                int playerTotal = handTotal(playerHand);
                if (dealerTotal > 21 || playerTotal > dealerTotal) {
                    System.out.println("You win!");
                } else if (playerTotal < dealerTotal) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("It's a tie!");
                }
            }

            // Play again?
            System.out.print("\nPlay again? (y/n): ");
            playing = input.next().equalsIgnoreCase("y");
        }

        System.out.println("Thanks for playing!");
    }

    // Deal a card (2-11 for simplicity)
    public static int dealCard(Random rand) {
        int card = rand.nextInt(13) + 1;
        if (card >= 11) return 10; // J, Q, K
        if (card == 1) return 11;  // Ace as 11 by default
        return card;
    }

    // Calculate hand total (handling Ace as 1 or 11)
    public static int handTotal(List<Integer> hand) {
        int total = 0;
        int aces = 0;
        for (int card : hand) {
            total += card;
            if (card == 11) aces++;
        }
        while (total > 21 && aces > 0) {
            total -= 10; // change Ace from 11 to 1
            aces--;
        }
        return total;
    }
}