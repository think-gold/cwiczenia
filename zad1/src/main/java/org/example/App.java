package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //Exercise 2

        String[] cities = new String[4];
        cities[0] = "Paris";
        cities[1] = "Rome";
        cities[2] = "Berlin";
        cities[3] = "Prague";

        for (String city : cities) {
            System.out.println(city);
        }

        for (int i = 3; i >= 0; i--) {
            System.out.println(cities[i]);
        }

        for (int i = 0; i < cities.length; i = i + 2) {
            System.out.println(cities[i]);
        }

        //Exercise 3

        Float[] numbers = new Float[]{1.25F, 3.0F, 4.5F, 5.7F};

        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Sum: " + sum);

        float ave = sum / numbers.length;
        System.out.println("Average: " + ave);


        //Exercise 4
        String[] names = new String[]{"Adam", "Kuba", "Jan", "Kuba", "Jan", "Jan"};
        Integer counterJan = 0;
        Integer counterAdam = 0;
        Integer counterKuba = 0;


        for (Integer i = 0; i < names.length; i++) {
            if (names[i] == "Jan") {
                counterJan++;
            } else if (names[i] == "Adam") {
                counterAdam++;
            } else {
                counterKuba++;
            }

        }
        System.out.println("Kuba: " + counterKuba);
        System.out.println("Adam: " + counterAdam);
        System.out.println("Jan: " + counterJan);

        //Exercise 5

        String[] namesRandom = new String[]{"Adam", "Kuba", "Jan", "Zdzichu"};

        for (int i = 0; i < namesRandom.length; i++) {
            if (namesRandom[i] == "Jan") {
                System.out.println("index Jan: " + i);
            }
        }

        //Exercise 6

        Integer[] someNumbers = new Integer[]{1, 14, -2, 0, 6};

        Integer max = someNumbers[0];
        Integer min = someNumbers[0];

        for (Integer i = 0; i < someNumbers.length; i++) {
            if (someNumbers[i] > max) {
                max = someNumbers[i];
            } else if (someNumbers[i] < min) {
                min = someNumbers[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
