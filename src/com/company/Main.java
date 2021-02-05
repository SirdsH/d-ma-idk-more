package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean turn1 = false;
        String white = "⬜";
        String black = "⬛";
        String whiteF = "⚫";
        String blackF = "⚪";
        int whilea = 0;

        char[][] field = {
                {1, 0, 1, 0, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {2, 0, 2, 0, 2, 0, 2, 0},
                {0, 2, 0, 2, 0, 2, 0, 2},
        };

        System.out.println("Checkers");
        System.out.println("--------");
        while (whilea < 5) {

            if(turn1 == false) {
                System.out.println("Whites turn: ");
                System.out.println();
            } else if(turn1 == true) {
                System.out.println("Blacks turn: ");
                System.out.println();
            }

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field.length; j++) {
                    if (field[i][j] == 1)
                        System.out.print(blackF);
                    else if (field[i][j] == 2)
                        System.out.print(whiteF);
                    else {
                        if ((i + j) % 2 == 0)
                            System.out.print(black);
                        else
                            System.out.print(white);
                    }
                }
                System.out.println();
            }

            System.out.println("Zadej vstup: ");
            int i1 = sc.nextInt();
            int j1 = sc.nextInt();
            if(turn1 == false) {
                if (field[i1][j1] == 2) {
                    System.out.println("Zadej vstup 2: ");
                    int i2 = sc.nextInt();
                    int j2 = sc.nextInt();

                    field[i1][j1] = 0;
                    field[i2][j2] = 2;

                    System.out.println();

                } else {
                    System.out.println("invalid vstup: ");
                }
            } else if(turn1 == true) {
                if (field[i1][j1] == 1) {
                    System.out.println("Zadej vstup 2: ");
                    int i2 = sc.nextInt();
                    int j2 = sc.nextInt();

                    field[i1][j1] = 0;
                    field[i2][j2] = 1;

                    System.out.println();

                } else {
                    System.out.println("invalid input!");
                }
            }

            if (turn1 == false) {
                turn1 = true;
            } else if (turn1 == true) {
                turn1 = false;
            }
        }
    }
}
