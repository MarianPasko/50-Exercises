package my.work.menu;

public class Menu {

    public static String getMenu() {
        String options = """
                 1 - Find out the Java version.
                 2 - Find out your operating system version.
                 3 - Find out today's date.
                 4 - Find out the current time.
                 5 - Find out the universal time.
                 6 - Find out the current time in Moscow, Paris and Oslo.
                 7 - Write a program that starts Notepad (or another).
                 8 - Create a classic program 99 bottles of beer.
                 9 - Write numbers from 0 to 100 (inclusive).
                10 - Write ten numbers from 0 to 100 (inclusive), at random way.
                11 - Write numbers from the tuple (3, 5, 7, 8, 19) on one line in the form '3-5-7-8-19'.
                12 - Calculate the sum of numbers from chain "3-5-7-8-19".
                13 - Sort the following numbers in ascending and descending order (2, 5, 1, 9, 11, 12, 8, 7).
                14 - Multiply the numbers from the tuple (2, 5, 1, 9, 11, 12, 8, 7).
                15 - From a tuple (2, 5, 1, 9, 11, 12, 8, 7) create a new one, each element of which is multiplied by 3.
                16 - Write out all even numbers from 1 to 100 (inclusive).
                17 - Calculate factorial of numbers from tuples (3, 5, 10 and 20).
                18 - Randomly generate 20 numbers from 1 to 10 (inclusive) and write out how many times the number 7 occurs.
                19 - Write a function that reverses (rotates) the specified string (eg 'hello' => 'olleh').
                20 - Write a function that reverses (rotates) the entered number (eg 521 => 125).
                21 - Write a function that write out all words from the tuple ('forest', 'wood', 'sky') in uppercase.
                22 - Write function "isAnagram" to see if the word is anagram of another.
                23 - Write function "isPalindrome" to see if the word is palindrome.
                24 - Find you, how many vowels is in the sentence "Today is a beautiful day".
                25 - We have a tuple (3, 5, 2, 1, 8, 9, 12, 11, 7, 6).
                        Indicate the minimum, maximum, sum and number of elements in the tuple.
                26 - We have a tuple ('Martin', 'Lucy', 'Peter', 'Martin', 'Robert', 'Peter').
                        Create a new tuple without duplicates.
                27 - Rounded the expression 334/5000 to two and three decimal places.
                28 - Convert numbers from tuple (23, 168, 997, 1455, 3999) to the Roman system.
                29 - Load the thermopylae.txt file and show its contents.
                30 - Copy the thermopylae.txt file to the thermopylae2.txt file.
                31 - Find out the size of the thermopylae.txt file in bytes and kilobytes.
                32 - Show the name of your home directory.
                33 - Show the contents of your home directory.
                34 - Ask the user the size of the radius and calculate the circumference and circle content.
                35 - Find out the number of days by Christmas (25.12.).
                36 - Find out how many days have passed since the Battle of Borodino.
                37 - Generate a flat list from the array list:
                        (e.g. [[1, 2], [3, 4], [5, 6], [7]] => [1, 2, 3, 4, 5, 6, 7]).
                38 - Beer costs 1.46 € and sold 100 000 pieces. Write a program that calculates the exact turnover.
                39 - Install the "PSUTIL module" using "PIP tool" to determine the amount of memory on your computer.
                40 - Vypíš obsah titulku zo stránky learnpython.pro (zo značky title).
                41 - Vypíš hexadecimálny výstup z malého PNG obrázka.
                        Výstup bude mať desať stĺpcov oddelených medzerou.
                42 - Načítaj súbor thermopylae.txt a zisti počet jeho slov.
                43 - Načítaj súbor thermopylae.txt a zisti frekvenciu výskytu každého slova.
                44 - Vygeneruj 30 náhodných čísiel od 1 do 100 (vrátane) a zapíš ich do súboru nums.csv.
                        Na každom riadku nech je 10 čísiel, ktoré sú oddelené čiarkou.
                45 - Načítaj čísla z predchádzajúceho príkladu a zisti základné štatistiky:
                        minimum, maximum, sumu, medián, počet prvkov a štandardnú odchýlku.
                46 - Zašifruj povel 'Full attack at dawn' pomocou cézarovej šifry. Spätne ho potom dekóduj.
                47 - Vytvor jednoduchú webovú aplikáciu pomocou knižnice Flask.
                48 - Vytvor koláčový graf pomocou knižnice matplotlib.
                49 - Pomocou knižnice numpy vypočítaj súčin dvoch ľubovolných 3x3 matíc.
                50 - Vytvor tkinter GUI aplikáciu s jedným tlačidlom. Kliknutím na tlačidlo sa aplikácia ukončí.
                      """;
        System.out.println(options);
        return options;
    }
}
