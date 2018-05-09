package pl.testuj.selenium.lists;

import java.util.ArrayList;
import java.util.List;

public class ListsExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);

        //DODAWANIE
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        //co drugi
        for (int i = 0; i < numbers.size(); i = i + 2) {
            System.out.println(numbers.get(i));
        }

         //nieparzyste
        for (Integer number : numbers) {
            if (number % 2 == 1)
                System.out.println(number);
        }

    }
}
