package com.RashidGafurov_INC_LOL;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    //Assignment 1
    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is a not leap year!");
        }
    }

    //Assignment 2
    public static void versionSelect(int year, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1) {
            if (year >= currentYear) {
                System.out.println("Please install Android App, link here");
            } else {
                System.out.println("Please install Lite Android App, link here");
            }
        } else if (clientOS == 0) {
            if (year >= currentYear) {
                System.out.println("Please install iOS App, link here");
            } else {
                System.out.println("Please install Lite iOS App, link here");
            }
        } else {
            System.out.println("Unknown Device");
        }
    }

    //Assignment 3
    public static int distanceEstimator(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance > 20) deliveryDays++;
        if (deliveryDistance > 60) deliveryDays++;
        if (deliveryDistance > 100) deliveryDays++;
        if (deliveryDays > 4) deliveryDays = Integer.MAX_VALUE;
        return deliveryDays;
    }

    //Assignment 4
    public static void uniqueCharValidator(String toValidate) {
        //StringBuilder sb = new StringBuilder();
        boolean haveDoubles = false;
        char[] arr = toValidate.toCharArray();
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                //sb.append(arr[i]);
                haveDoubles = true;
                break;
            }
        }
        if (haveDoubles) {
            System.out.printf("String does have a double character \"%c\" at pos %d!", arr[i], i + 1);
        } else {
            System.out.print("String doesn't have double!");
        }
        System.out.println();
    }

    //Assignment 5
    public static void invertArray(int[] arrayToInvert) {
        int tempV;
        for (int i = 0; i < arrayToInvert.length / 2; i++) {
            tempV = arrayToInvert[i];
            arrayToInvert[i] = arrayToInvert[arrayToInvert.length - i - 1];
            arrayToInvert[arrayToInvert.length - i - 1] = tempV;
        }
    }

    //Assignment 6
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static int sumOfAllElements(int[] arr) {
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    public static float averageFromArray(int[] arr) {
        float average;
        average = sumOfAllElements(arr) * 1f / (arr.length * 1f);
        return average;
    }

    public static void main(String[] args) {
        //Assignment 1
        isLeapYear(2022);

        //Assignment 2
        versionSelect(2022, 1);

        //Assignment 3
        System.out.println(distanceEstimator(55));

        //Assignment 4
        uniqueCharValidator("aabccddefgghiijjkk");

        //Assignment 5
        int[] array1 = {5, 4, 3, 2, 1};
        invertArray(array1);
        System.out.println(Arrays.toString(array1));

        //Assignment 6
        int[] arraySalaries = generateRandomArray();
        System.out.println("Sum of all salaries is " + sumOfAllElements(arraySalaries));
        System.out.println("Average of all salaries is " + averageFromArray(arraySalaries));
    }
}
