package lab7;

import java.util.Scanner;
import java.util.Stack;
import java.lang.String;

public class DrunkardOnStack {
    public static void main(String[] args) {
        Stack<Integer> deck1 = new Stack<>();
        Stack<Integer> deck2 = new Stack<>();
        String mas1, mas2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 5 карт первого игрока и 5 карт второго(от 0 до 9)");
        mas1 = sc.nextLine();
        mas2 = sc.nextLine();
        if (mas1.length() != 5 || !mas1.matches("[0-9]+")) {
            System.out.println("Некорректный ввод первой колоды");
            return;
        }
        if (mas2.length() != 5 || !mas2.matches("[0-9]+")) {
            System.out.println("Некорректный ввод второй колоды");
            return;
        }
        for (int i = 4; i >= 0; i--) {
            int card1 = Integer.parseInt(String.valueOf(mas1.charAt(i)));
            deck1.add(card1);
            int card2 = Integer.parseInt(String.valueOf(mas2.charAt(i)));
            deck2.add(card2);
        }
        int round = 0;
        while (!deck1.isEmpty() && !deck2.isEmpty()) {
            int player1 = deck1.pop();
            int player2 = deck2.pop();
            if (player1 == 0 && player2 == 9) {
                deck1.add(0, player1);
                deck1.add(0, player2);
            } else if (player2 == 0 && player1 == 9) {
                deck2.add(0, player1);
                deck2.add(0, player2);
            } else if (player1 > player2) {
                deck1.add(0, player1);
                deck1.add(0, player2);
            } else if (player2 > player1) {
                deck2.add(0, player1);
                deck2.add(0, player2);
            } else {
                deck1.add(0, player1);
                deck2.add(0, player2);
            }
            round++;
            if (round == 106) {
                System.out.println("botva");
                return;
            }
        }
        if (deck1.isEmpty()) {
            System.out.println("second" + " " + round);
        } else {
            System.out.println("first" + " " + round);
        }
    }
}
