package lesson3;

import java.util.Random;
import java.util.Scanner;


public class work {

    public static char[][] field;
    public static int fieldSizeX;
    public static int fieldSizeY;

    public static char human = 'X';
    public static char ai = 'O';
    public static char empty = '_';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random(); //[0;1)


    public static void createField() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = empty;
            }
        }
    }

    public static void viewField() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void turnHuman() {
        int cellX;
        int cellY;

        do {
            System.out.println("Enter coordinates cell: ");
            cellX = scanner.nextInt() - 1;
            cellY = scanner.nextInt() - 1;
        } while (!validCell(cellY, cellX) || !emptyCell(cellY, cellX));
        field[cellY][cellX] = human;
    }

    public static void turnAI() {
        int cellX;
        int cellY;

        do {
            cellX = random.nextInt(fieldSizeX); //[0;3)
            cellY = random.nextInt(fieldSizeY);
        } while (!emptyCell(cellY, cellX));
        field[cellY][cellX] = ai;
    }

    public static boolean winGame(char player) {
        for (int i = 0; i < 5; i++)
            if ((field[i][0] == player && field[i][1] == player &&
                    field[i][2] == player &&
                    field[i][3] == player &&
                    field[i][4] == player) ||
                    (field[0][i] == player && field[1][i] == player &&
                            field[2][i] == player &&
                            field[3][i] == player &&
                            field[4][i] == player))
                return true;
        return (field[0][0] == player && field[1][1] == player &&
                field[2][2] == player) ||
                (field[2][0] == player && field[1][1] == player &&
                        field[0][2] == player &&
                        field[0][3] == player &&
                        field[0][4] == player);
    }
    public static boolean draw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == empty) return false;
            }
        }
        return true;
    }

    public static boolean validCell(int cellY, int cellX) {
        return cellX >= 0 && cellX < fieldSizeX && cellY >= 0 && cellY < fieldSizeY;
    }

    public static boolean emptyCell(int cellY, int cellX) {
        return field[cellY][cellX] == empty;
    }

    public static void main(String[] args) {

//        System.out.println("Я распечатал то, чтот ты ввел в консоль = " + scanner.nextLine());

        createField();
        viewField();

        while(true) {

            turnHuman();
            viewField();

            if (winGame(human)) {
                System.out.println("Human win!!!");
                break;
            }

            if (draw()) {
                System.out.println("DRAW!!!");
                break;
            }

            turnAI();
            viewField();

            if (winGame(ai)) {
                System.out.println("AI win!!!");
                break;
            }

            if (draw()) {
                System.out.println("DRAW!!!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        viewField();
    }
    }
