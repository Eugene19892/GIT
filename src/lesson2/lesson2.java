package lesson2;

public class lesson2 {
//    public static void main(String[] args) {
////    //    public static int fieldInClass = 10;
////
//
////        int a = 20;
////        int b = 10;
////        int result;
//
////        if (a > b) {
////            result = a;
////        } else {
////            result = b;
////        }
//
////        result = (a > b) ? a : b;
////        // result = (a > b) ? doSomething1() : doSomething2();
////
////        System.out.println("Result " + result);
////    }
////    public static  int doSomething1() {
////        return 45;
////    }
////    public static int doSomething2() {
////        return 100;
//        //  }
////}
//
////        String name = "Boris";
////
////        if (name == "Boris") {
////            System.out.println("Send letter to Boris");
////        } else if (name == "Alex") {
////            System.out.println("Send letter to Alex");
////        } else if (name == "Olga") {
////            System.out.println("Send letter to Olga");
////        } else {
////            System.out.println("Go out office");
////        }
////        System.out.println("----------");
////
////        switch (name) {
////            case "Olga":
////                System.out.println("Send letter to Olga");
////                break;
////            case "Boris":
////                System.out.println("Send letter to Boris");
////                break;
////            case "Alex":
////                System.out.println("Send letter to Alex");
////                break;
////            default:
////                System.out.println("Go out office");
////        }
////    }
////}
////        int fieldInMethodMain = 45;
////
////        System.out.println("1 call from class " + fieldInClass);
////        System.out.println("1 call from main " + fieldInMethodMain);
////
////        {
////            int a = 10;
////            int b = 45;
////            int c = a + b;
////            System.out.println(c);
////            System.out.println("2 call from class " + fieldInClass);
////            System.out.println("2 call from main " + fieldInMethodMain);
////        }
//
////        doSomething1();
////
//
////        for (int i = 0; i < 10; i++) {
////            System.out.print(i + " | ");
////        }
////        System.out.println();
////
////        System.out.println(myMath(2,10));
////
//////        printPifagor(10,10);
////        int b = 0;
////
////        while (b < 10) {
////            b++;
////            if (b == 3 || b == 8) {
////                continue;
////            }
////            System.out.print(b + " | ");
////        }
////
////        System.out.println("\nend while");}}
////
////        int c = 0;
////        do {
////            c++;
////            System.out.print(c + " | ");
////            if (c == 10) {
////                break;
////            }
////        } while (c < 15);
////
////        System.out.println("\nend do-while");}}
//
////        while (true) {
////
////        }}}
//
//        int[] array = new int[10];
//
//        array[0] = 55;
//        array[1] = 698;
//        array[2] = 300;
//
//        System.out.println(array[1] + " " + array[2]);
//

//        String[] strArray = new String[25];
//
////        for (int i = 0; i < strArray.length; i++) {
////            strArray[i] = "Value " + i;
////        }
//        writeArray("Value", strArray);
//        readArray(strArray);
//
//        float[] myFloatArray = {10.5f, 15.9f, 200.987f};
//        System.out.print(myFloatArray.length + " {");
//    }
////
////        for (int i = 0; i < myFloatArray.length; i++) {
////            System.out.print(myFloatArray[i] + " ,");
//        }
//        System.out.print("}");

//        for (int i = 0; i < strArray.length; i++) {
//            System.out.print(strArray[i] + " | ");
//        }

//        int[][] doubleArrayInt = new int[3][4];
//        doubleArrayInt[0][1] = 15;
////
//        System.out.println(doubleArrayInt[0][1]);
////
//        int value = 0;
////
//        for (int y = 0; y < doubleArrayInt.length; y++) {
//            for (int x = 0; x < doubleArrayInt[y].length; x++) {
//                doubleArrayInt[y][x] = value;
//                value++;
//            }
//        }
////
//        for (int y = 0; y < doubleArrayInt.length; y++) {
//            for (int x = 0; x < doubleArrayInt[y].length; x++) {
//                System.out.print(doubleArrayInt[y][x] + " | ");
//            }
//            System.out.println();
//        }}
////
//        String[][] arr = {{"1", "2", "3"}, {"4", "5", "6"}};
//
//        int value2 = 0;
//        int[][][] arr3 = new int[3][4][5];
//
//        for (int i = 0; i < arr3.length; i++) {
//            for (int j = 0; j < arr3[i].length; j++) {
//                for (int k = 0; k < arr3[j].length; k++) {
//                    arr3[i][j][k] = value2;
//                    value2++;
//                }
//            }
//        }
////
//        int[][] testArray = new int[3][2];
//    }
////
//    public static int doSomething1() {
//        System.out.println("3 call from class " + fieldInClass);
//        return 45;
//    }
//
//    public static int doSomething2() {
//        return 54;
//    }

//    public static int myMath(int base, int signature) {
//        int result = 1;
//        for (int i = 0; i < signature; i++) {
//            result *= base; //result = result * base;
//        }
//        return result;
//    }

//    public static void printPifagor(int width, int height) {
//        for (int y = 1; y < height; y++) {
//            for (int x = 1; x < width; x++) {
//                System.out.print(x * y + "\t");
//            }
//            System.out.println();
//        }
//    }

//    public static void writeArray(String value, String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            inputArray[i] = value + " " + i;
//        }
//    }
//
//    public static void readArray(String[] inputArray) {
//        for (int i = 0; i < inputArray.length; i++) {
//            System.out.print(inputArray[i] + " | ");
//        }
//        System.out.println();
//    }

//}

/*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. Написать метод, заменяющий в
    принятом массиве 0 на 1, 1 на 0;

	2 Задать пустой целочисленный массив размером 8. Написать метод,
	который c помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;

	3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод,
	принимающий на вход массив и умножающий числа меньше 6 на 2;

	4 Задать одномерный массив. Написать методы поиска в нём
	минимального и максимального элемента;

	5* Создать квадратный целочисленный массив
	(количество строк и столбцов одинаковое), заполнить его диагональные
	элементы единицами, используя цикл(ы);

	6** Написать метод, которому на вход подаётся одномерный массив и
	число n (может быть положительным, или отрицательным), при этом метод
	должен циклически сместить все элементы массива на n позиций.
	[1,2,3,4,5], -2 => [3,4,5,1,2]
	[1,2,3,4,5], 2 => [4,5,1,2,3]

	7 *** Не пользоваться вспомогательным массивом при решении задачи 6.

**/


