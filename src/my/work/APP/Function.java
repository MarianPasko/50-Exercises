package my.work.APP;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Scanner;



//----------------------------------------------------------------------------------------------------------------------
public class Function {

    public static String readInput() {
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

//----------------------------------------------------------------------------------------------------------------------

    public static int sum(int[] numbs) {
        int sum = 0;
        for (int y : numbs) {
            sum += y;
        }
        System.out.printf("Sucet cisiel je : %s", sum);
        return sum;
    }

//----------------------------------------------------------------------------------------------------------------------

    public static int min(int[] numbs) {
        int min = numbs[0];
        for (int y = 1; y < numbs.length; y++) {
            if (numbs[y] < min) {
                min = numbs[y];
            }
        }
        return min;
    }

//----------------------------------------------------------------------------------------------------------------------

    public static int max(int[] numbs) {
        int max = numbs[0];
        for (int y = 1; y < numbs.length; y++) {
            if (numbs[y] > max) {
                max = numbs[y];
            }
        }
        return max;
    }

//----------------------------------------------------------------------------------------------------------------------

    public static int descending(int[] numbs) {
        int descending = numbs[0];
        int tp1 = 0;
        for (int t = 0; t < numbs.length; t++) {
            for (int k = t + 1; k < numbs.length; k++) {
                if (numbs[t] < numbs[k]) {
                    tp1 = numbs[t];
                    numbs[t] = numbs[k];
                    numbs[k] = tp1;
                }
            }
        }
        System.out.println();

//        System.out.println("Elements sorted in descending order: ");    // Elementy usporiadane zostupne
        System.out.println("Elementy usporiadane zostupne: ");    // Elementy usporiadane zostupne
        for (int t = 0; t < numbs.length; t++) {
            System.out.print(numbs[t] + " ");
        }
        return descending;
    }

//----------------------------------------------------------------------------------------------------------------------

    public static int ascending(int[] numbs) {
        int ascending = numbs[0];
        int tp = 0;
        for (int i = 0; i < numbs.length; i++) {
            for (int j = i + 1; j < numbs.length; j++) {
                if (numbs[i] > numbs[j]) {
                    tp = numbs[i];
                    numbs[i] = numbs[j];
                    numbs[j] = tp;
                }
            }
        }
        System.out.println();
//        System.out.println("Elements sorted in ascending order: ");     //Elementy usporiadane vzostupne
        System.out.println("Elementy usporiadane vzostupne: ");     //Elementy usporiadane vzostupne
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + " ");
        }
        return ascending;
    }

//----------------------------------------------------------------------------------------------------------------------

    public static String placeDateTime(String x) {
        ZoneId zoneId = ZoneId.of(x);
        ZonedDateTime zdt = ZonedDateTime.now(zoneId);
        System.out.printf("Aktualny cas v %d%s%d%n", x, " : ", zdt);
        return x;
    }

//----------------------------------------------------------------------------------------------------------------------

    public static int[] factorials(int[] numbs){
        for (int x : numbs) {
            long z = 1;
            for (int y = 1; y <= x; ++y) {
                z *= y;
            }
            System.out.printf("Faktorial cils %d je %d%n",x, z);
        }
        return numbs;
    }

//----------------------------------------------------------------------------------------------------------------------

    public static boolean checkAnagram(String word1, String word2) {
        word1 = word1.replaceAll("s", "");
        word2 = word2.replaceAll("s", "");

        if (word1.length() != word2.length())
            return false;

        else {
            char[] arr1 = word1.toLowerCase().toCharArray();
            char[] arr2 = word2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return (Arrays.equals(arr1, arr2));
        }
    }

//----------------------------------------------------------------------------------------------------------------------



//----------------------------------------------------------------------------------------------------------------------



//----------------------------------------------------------------------------------------------------------------------



//----------------------------------------------------------------------------------------------------------------------





//----------------------------------------------------------------------------------------------------------------------




}