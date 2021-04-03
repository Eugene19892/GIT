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

        Random random;
        Scanner sc;


        int countX = 0;
        int countO = 0;
        int free = 0;

        public static void main(String[] args) {
            new lesson3.work().game();
        }

        work() {
            random = new Random();
            sc = new Scanner(System.in);
            //назначение полей
            fieldSizeX = 5;
            fieldSizeY = 5;
            field = new char[fieldSizeY][fieldSizeX];
            this.createField();
        }

        private void game() {

            createField();
            viewField();

            while (true) {

                turnHuman();


                if (winGame(human)) {
                    System.out.println("Вы победили!!!");
                    break;
                }

                if (draw()) {
                    System.out.println("Ничья!!!");
                    break;
                }

                this.programWalk();
                viewField();

                if (winGame(ai)) {
                    System.out.println("Победил компьютер!!!");
                    break;
                }

                if (draw()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("GAME OVER.");
            viewField();
        }

        public static void createField() {

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



        int getNumber() {
            int trying = 0;
            String buffer;

            while (true) {

                if (sc.hasNextInt()) {
                    trying = sc.nextInt();
                    break;
                } else {
                    buffer = sc.next();
                    System.out.println("Введены неверные символы: " + buffer);
                }
            }

            return trying;
        }

        //человек
        void turnHuman() {
            int cellX, cellY;

            do {
                System.out.println("Введите координаты: ");
                cellX = getNumber() - 1;
                cellY = getNumber() - 1;
            } while (!this.validCell(cellY, cellX));
            field[cellY][cellX] = human;
        }


        public static boolean validCell(int cellY, int cellX) {
            return cellX >= 0 && cellX < fieldSizeX && cellY >= 0 && cellY < fieldSizeY;
        }

        public static boolean emptyCell(int cellY, int cellX) {
            return field[cellY][cellX] == empty;

            }



        //машина
        boolean validCellProg(int cellY, int cellX) {

            if (cellX < 0 || cellX > 2 || cellY < 0 || cellY > 2) {
                return false;
            }

            return field[cellY][cellX] != empty;
        }
        public static boolean draw() {
            for (int y = 0; y < fieldSizeY; y++) {
                for (int x = 0; x < fieldSizeX; x++) {
                    if (field[y][x] == empty) return false;
                }
            }
            return true;
        }

        void programWalk() {

            if (this.check1Diagonal()) return;

            if (this.check2Diagonal()) return;

            if (this.checkRows()) return;

            if (this.checkColumns()) return;

            this.randomWalk();

        }

        void count(int cellY, int cellX) {
            if (field[cellY][cellX] == human) {
                this.countX++;
            }

            if (field[cellY][cellX] == ai) {
                this.countO++;
            }

            if (field[cellY][cellX] != empty) {
                this.free++;
            }
        }

        void initCount() {
            this.countX = 0;
            this.countO = 0;
            this.free = 0;
        }

        boolean isLosingNear() {
            return ((this.free == 1 && this.countX == 4) ? true : false);
        }

        // близко выигрыш
        boolean isWinNear() {
            return ((this.free == 1 && this.countO == 4) ? true : false);
        }

        //проверка выигрыша
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

        void randomWalk() {
            int cellY, cellX;
            do {
                cellY = random.nextInt(5);
                cellX = random.nextInt(5);
            } while (!validCellProg(cellY, cellX));

            field[cellY][cellX] = ai;
        }

        // постановка нолика
        boolean putO(int cellY, int cellX) {
            if (field[cellY][cellX] == empty) {
                field[cellY][cellX] = ai;
                return true;
            }
            return false;
        }

        // контроль первой диагонали
        boolean check1Diagonal() {
            this.initCount();
            for (int cellY = 0; cellY < fieldSizeY; cellY++) {
                this.count(cellY, cellY);
            }

            if (this.isWinNear() || this.isLosingNear()) {
                for (int cellY = 0; cellY < fieldSizeY; cellY++) {
                    if (this.putO(cellY, cellY)) return true;
                }
            }

            return false;
        }

        // контроль второй диагонали
        boolean check2Diagonal() {
            this.initCount();
            int cellX = 4;
            for (int cellY = 0; cellY < fieldSizeY; cellY++) {
                this.count(cellY, cellX);
                cellX--;
            }

            if (this.isWinNear() || this.isLosingNear()) {
                cellX = 4;
                for (int cellY = 0; cellY < fieldSizeY; cellY++) {
                    if (this.putO(cellY, cellX)) return true;
                    cellX--;
                }
            }

            return false;
        }

        // контроль строк
        boolean checkRows() {
            for (int cellY = 0; cellY < fieldSizeY; cellY++) {
                this.initCount();
                for (int cellX = 0; cellX < fieldSizeX; cellX++) {
                    this.count(cellY, cellX);
                }

                if (this.isWinNear() || this.isLosingNear()) {
                    for (int cellX = 0; cellX < fieldSizeX; cellX++) {
                        if (this.putO(cellY, cellX)) return true;
                    }
                }

            }

            return false;
        }

        // контроль столбцов
        boolean checkColumns() {
            for (int cellX = 0; cellX < fieldSizeX; cellX++) {
                this.initCount();
                for (int cellY = 0; cellY < fieldSizeY; cellY++) {
                    this.count(cellY, cellX);
                }

                if (this.isWinNear() || this.isLosingNear()) {
                    for (int cellY = 0; cellY < fieldSizeY; cellY++) {
                        if (this.putO(cellY, cellX)) return true;
                    }
                }

            }

            return false;
        }



    }





