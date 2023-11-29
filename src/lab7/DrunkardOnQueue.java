package lab7;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
import java.lang.String;

public class DrunkardOnQueue {
    public static void main(String[] args) {
        Queue<Integer> deck1 = new LinkedList<>();
        Queue<Integer> deck2 = new LinkedList<>();
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
        for (int i = 0; i < 5; i++) {
            int card1 = Integer.parseInt(String.valueOf(mas1.charAt(i)));
            deck1.add(card1);
            int card2 = Integer.parseInt(String.valueOf(mas2.charAt(i)));
            deck2.add(card2);
        }
        int round = 0;
        while (!deck1.isEmpty() && !deck2.isEmpty()) {
            int player1 = deck1.poll();
            int player2 = deck2.poll();
            if (player1 == 0 && player2 == 9) {
                deck1.add(player1);
                deck1.add(player2);
            } else if (player2 == 0 && player1 == 9) {
                deck2.add(player1);
                deck2.add(player2);
            } else if (player1 > player2) {
                deck1.add(player1);
                deck1.add(player2);
            } else if (player2 > player1) {
                deck2.add(player1);
                deck2.add(player2);
            } else {
                deck1.add(player1);
                deck2.add(player2);
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
