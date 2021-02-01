package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        numberToWords(-1234);
        System.out.println(reverse(1234));
    }
    public static void numberToWords(int number) {

        int lastDigit, reverse, num = 0;

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        reverse = reverse(number);
        int value = getDigitCount(reverse);
        num = getDigitCount(number);

        while (reverse != 0 || reverse > 0) {
            lastDigit = reverse % 10;
            reverse /= 10;
            switch (lastDigit) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                default:
                    System.out.println("OTHER");
                    break;
            }
        }

        if (value != num) {
            int total = num - value;
            for (int i =0; i < total; i++) {
                System.out.println("Zero");
            }
        } else if (number == 0) {
            System.out.println("Zero");
        }
    }

    public static int reverse(int number) {
        int lastDigit = 0;
        int reverse = 0;

        while (number != 0 || number > 0) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {

        int lastDigit = 0;
        int count = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0){
            return 1;
        }

        while (number > 0 || number != 0) {
            lastDigit = number % 10;
            count++;
            number /= 10;
        }
        return count;
    }
}
