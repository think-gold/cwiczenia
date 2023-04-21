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
        String serachedName = "Jan";
        Integer counter = 0;

        for (Integer i = 0; i < names.length; i++) {
            if (names[i] == serachedName) {
                counter++;
            }
        }

        System.out.println("Jan: " + counter);

        //Exercise 5

        String[] namesRandom = new String[]{"Adam", "Kuba", "Jan", "Zdzichu"};
        String searchedName2 = "Jan";

        for (int i = 0; i < namesRandom.length; i++) {
            if (namesRandom[i] == searchedName2) {
                System.out.println("Index Jan: " + i);
            }
        }

        //Exercise 6

        Integer[] someNumbers = new Integer[]{1, 14, -2, 0, 6};

        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;

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

