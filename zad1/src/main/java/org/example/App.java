package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        //Exercise 2
//        String[] cities = new String[4];
//        cities[0] = "Paris";
//        cities[1] = "Rome";
//        cities[2] = "Berlin";
//        cities[3] = "Prague";
//
//        for (String city : cities) {
//            System.out.println(city);
//        }
//
//        for (int i=3; i>=0 ; i--){
//            System.out.println(cities[i]);
//        }
//
//        for (int i =0 ; i<cities.length; i = i+2){
//            System.out.println(cities[i]);
//        }
//Exercise 3
        Float[] numbers = new Float[]{1.25F, 3.0F, 4.5F, 5.7F};
//        float sum1 = numbers[0] + numbers[1] + numbers[2] + numbers[3];
//        System.out.println("Suma1: "+sum1);

//        float sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println("suma " + sum);
//
//        float ave = sum/ numbers.length;
//        System.out.println(ave);
//    }

        //Exercise 4
//    String[] names = new String[]{"Adam", "Kuba", "Jan", "Kuba", "Jan", "Jan"};
//    Integer counterJan = 0;
//    Integer counterAdam = 0;
//    Integer counterKuba = 0;
//
//
//        for( Integer i = 0 ; i<names.length; i++){
//        if (names[i]=="Jan"){
//            counterJan ++;
//        }else if (names[i]=="Adam"){
//                counterAdam ++;
//            }
//        else {
//            counterKuba++;
//        }
//
//    }
//        System.out.println("Kuba: " +counterKuba);
//        System.out.println("Adam: " +counterAdam);
//        System.out.println("Jan: " +counterJan);

        //Exercise 5

        String[] names = new String[]{"Adam", "Kuba", "Jan", "Zdzichu"};
        for (int i = 0; i < names.length; i++) {
            if (names[i] == "Jan") {
                System.out.println("index Jan: " + i);
            }
        }

    }


}
