package java_string.Level3;

import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initDeck();
        int n = deck.length;

        deck = shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int x = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int c = sc.nextInt();

        if (x * c > n) {
            System.out.println("Not enough cards to distribute.");
            return;
        }

        String[][] players = distribute(deck, x, c);
        printPlayers(players);
    }

    static String[] initDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int idx = 0;
        for (String suit : suits)
            for (String rank : ranks)
                deck[idx++] = rank + " of " + suit;
        return deck;
    }

    static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        return deck;
    }

    static String[][] distribute(String[] deck, int x, int c) {
        String[][] players = new String[x][c];
        int idx = 0;
        for (int i = 0; i < x; i++)
            for (int j = 0; j < c; j++)
                players[i][j] = deck[idx++];
        return players;
    }

    static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++)
                System.out.println("  " + players[i][j]);
        }
    }
}

