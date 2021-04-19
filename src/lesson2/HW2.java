package lesson2;

public class HW2 {

    //метод1
//    public static void main(String[] args) {
//
//        int[] array =  new int [] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//
//        for (int i = 1; i < array.length; i--){
//            System.out.println(array[i] + " ");
//
//            System.out.print(array[i] + " ");
//            if (array[i] == 0) array[i] = 1;
//            else array[i] = 0;
//        }
//        System.out.print("\nAFTER:  ");
//        for (int i : array) {
//            System.out.print(i + " ");
//
//        }
//    }}
//   /*
//   ..метод 2
    public static void main(String[] args) {

            int[] array = new int[8];
            int value = 1;
            for (int i = 0; i < array.length; i++) {
                array[i] = value;
                value += 3;
                System.out.println(array[i]);
            }
        }}

//метод3
//   public static void main(String[] args) {
//    {
//        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//
//        System.out.print("Do: ");
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
//
//        System.out.print("\nPosle:  ");
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] <= 6) arr[i] *= 2;
//            System.out.print(arr[i] + " ");
//        }
//    }
//}}

//метод4
//   public static void main(String[] args) {
//
//
//    int array[] = new int[]{4, 10, 8, 20, -2, 1000};
//
//    int max = Max(array);
//    System.out.println("Maximum Value: "+max);
//
//
//    int min = Min(array);
//    System.out.println("Minimum Value: "+min);
//   }
//
//
//public static int Max(int[] inputArray){
//        int maxValue = inputArray[0];
//        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
//        maxValue = inputArray[i];
//        }
//        }
//        return maxValue;
//        }
//
//public static int Min(int[] inputArray){
//        int minValue = inputArray[0];
//        for(int i=1;i<inputArray.length;i++){
//        if(inputArray[i] < minValue){
//        minValue = inputArray[i];
//        }
//        }
//        return minValue;
//        }
//