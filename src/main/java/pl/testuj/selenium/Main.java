package pl.testuj.selenium;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int value = numbers[i];
            System.out.println(value);
        }

        for (int value : numbers) {
            if (value % 2 == 0)
                System.out.println(value);
        }


        int[] otherNumbers = new int[5];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;
        otherNumbers[3] = 4;
        //przypisywanie do elementu tablicy
        otherNumbers[4] = 5;

        //pobieranie elementu z tablicy
        System.out.println(numbers[1]);

        //co druga liczba
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }

        //tylko parzyste
        for (int i = 0; i < numbers.length; i++) {
            int index = i;
            int value = numbers[i];
            int modulo = value % 2;
            if (modulo == 0)
                System.out.println(numbers[i]);
        }


        //Generyk
        ArrayList<String> names = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            names.get(i);
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
