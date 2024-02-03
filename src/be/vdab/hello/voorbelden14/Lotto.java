package be.vdab.hello.voorbelden14;

import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        var getallen = new int[7];

        // Populate the array with unique random numbers between 1 and 42
        for (int i = 0; i < getallen.length; i++) {
            int randomNumber;
            boolean isUnique;

            while (true) {
                isUnique = true;
                randomNumber = (int) (Math.random() * 42 + 1);

                // Check for uniqueness within the array
                for (int j = 0; j < i; j++) {
                    if (randomNumber == getallen[j]) {
                        isUnique = false;
                        break;
                    }
                }

                if (isUnique) {
                    break;
                }
            }

            getallen[i] = randomNumber;
        }

        Arrays.sort(getallen, 0, 6);
        int reserveGetal = getallen[getallen.length - 1];

        System.out.println("De lotto-getallen zijn: ");

        for (var i = 0; i < 6; i++) {
            System.out.print(getallen[i] + " ");
        }
        System.out.println("\nEen reservegetal is " + reserveGetal);
    }
}


//        int[] getallen = new int[7];
//
//        for (int i = 0; i < getallen.length - 1; i++) {
//            int randomGetal;
//            do {
//                randomGetal = (int) (Math.random() * 42 + 1);
//            } while (contains(getallen, randomGetal));
//
//            getallen[i] = randomGetal;
//        }
//        Arrays.sort(getallen);
//        System.out.println("Lotto Getalen " + Arrays.toString(getallen));
//    }
//
//    private static boolean contains(int[] array, int value) {
//        for (int num : array) {
//            if (num == value) {
//                return true;
//            }
//        }
//        return false;


