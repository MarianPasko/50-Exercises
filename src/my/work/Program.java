package my.work;

import my.work.APP.Menu;
import my.work.Exercises.*;
import java.util.Scanner;


public abstract class Program {
    public static void main(String[] args) {
        Menu.getMenu();
        System.out.print("Enter exercise number: ");
        String input = readInput();
        switch (input) {
            case "1" -> Exercise1.run();
            case "2" -> Exercise2.run();
            case "3" -> Exercise3.run();
            case "4" -> Exercise4.run();
            case "5" -> Exercise5.run();
            case "6" -> Exercise6.run();
            case "7" -> Exercise7.run();
            case "8" -> Exercise8.run();
            case "9" -> Exercise9.run();
            case "10" -> Exercise10.run();
            case "11" -> Exercise11.run();
            case "12" -> Exercise12.run();
            case "13" -> Exercise13.run();
            case "14" -> Exercise14.run();
            case "15" -> Exercise15.run();
            case "16" -> Exercise16.run();
            case "17" -> Exercise17.run();
            case "18" -> Exercise18.run();
            case "19" -> Exercise19.run();
            case "20" -> Exercise20.run();
            case "21" -> Exercise21.run();
            case "22" -> Exercise22.run();
            case "23" -> Exercise23.run();
            case "24" -> Exercise24.run();
            case "25" -> Exercise25.run();
//            case "26" -> Exercise26.run();
//            case "27" -> Exercise27.run();
            case "28" -> Exercise28.run();
//            case "29" -> Exercise29.run();
//            case "30" -> Exercise30.run();
//            case "31" -> Exercise31.run();
//            case "32" -> Exercise32.run();
//            case "33" -> Exercise33.run();
//            case "34" -> Exercise34.run();
//            case "35" -> Exercise35.run();
//            case "36" -> Exercise36.run();
            case "37" -> Exercise37.run();
            case "38" -> Exercise38.run();
//            case "39" -> Exercise39.run();
//            case "40" -> Exercise40.run();
//            case "41" -> Exercise41.run();
//            case "42" -> Exercise42.run();
//            case "43" -> Exercise43.run();
//            case "44" -> Exercise44.run();
//            case "45" -> Exercise45.run();
//            case "46" -> Exercise46.run();
//            case "47" -> Exercise47.run();
//            case "48" -> Exercise48.run();
//            case "49" -> Exercise49.run();
//            case "50" -> Exercise50.run();
            default -> System.out.println("unknown option");
        }
    }

    public static String readInput() {
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

//
//        // Exercises 50 - Vytvor tkinter GUI aplikáciu s jedným tlačidlom. Kliknutím na tlačidlo sa aplikácia ukončí.
//        // Exercises 49 - Pomocou knižnice numpy vypočítaj súčin dvoch ľubovolných 3x3 matíc.
//        // Exercises 48 - Vytvor koláčový graf pomocou knižnice matplotlib.
//        // Exercises 47 - Vytvor jednoduchú webovú aplikáciu pomocou knižnice Flask.
//        // Exercises 46 - Zašifruj povel 'Full attack at dawn' pomocou cézarovej šifry. Spätne ho potom dekóduj.
//        // Exercises 45 - Načítaj čísla z predchádzajúceho príkladu a zisti základné štatistiky: minimum, maximum, sumu, medián, počet prvkov a štandardnú odchýlku.
//        // Exercises 44 - Vygeneruj 30 náhodných čísiel od 1 do 100 (vrátane) a zapíš ich do súboru nums.csv. Na každom riadku nech je 10 čísiel, ktoré sú oddelené čiarkou.
//        // Exercises 43 - Načítaj súbor thermopylae.txt a zisti frekvenciu výskytu každého slova.
//        // Exercises 42 - Načítaj súbor thermopylae.txt a  zisti počet jeho slov.
//        // Exercises 41 - Vypíš hexadecimálny výstup z malého PNG obrázka. Výstup bude mať desať stĺpcov oddelených medzerou.
//        // Exercises 40 - Vypíš obsah titulku zo stránky learnpython.pro (zo značky title).
//        // Exercises 39 - Naištaluj si pomocou nástroja pip modul psutil a zisti pomocou neho veľkosť operačnej pamäte svojho počítača.
//        // Exercises 37 - Vygeneruj plochý zoznam zo zoznamu zoznamov (napr. [[1, 2], [3, 4], [5, 6], [7]] => [1, 2, 3, 4, 5, 6, 7]).
//        // Exercises 36 - Zisti koľko dní ubehlo od bitky pri Borodine.
//        // Exercises 35 - Zisti počet dní do Vianoc (25.12.).
//        // Exercises 34 - Vypýtaj si od užívateľa veľkosť polomeru a vypočítaj obvod a obsah kruhu.
//        // Exercises 33 - Vypíš obsah svojho domovského adresára.
//        // Exercises 32 - Vypíš názov svojho domovského adresára.
//        // Exercises 31 - Zisti veľkosť súboru thermopylae.txt v bajtoch a kilobajtoch.
//        // Exercises 30 - Skopíruj súbor thermopylae.txt do súboru thermopylae2.txt.
//        // Exercises 29 - Načítaj súbor thermopylae.txt a vypíš jeho obsah.
//        // Exercises 27 - Zaokrúhli výraz 334/5000 na dve a tri desatinné miesta.
//        // Exercises 26 - Majme n-ticu ('Martin', 'Lucy', 'Peter', 'Martin', 'Robert', 'Peter'). Vytvor z nej novú n-ticu bez duplikátov.
    }