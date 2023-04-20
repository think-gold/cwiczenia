package org.example;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main( String[] args ) {


        //Exercise 2
        String[] cities = new String[4];
        cities[0] = "Paris";
        cities[1] = "Rome";
        cities[2] = "Berlin";
        cities[3] = "Prague";

        for (String city : cities) {
            System.out.println(city);
        }

        for (int i=3; i>=0 ; i--){
            System.out.println(cities[i]);
        }

        for (int i =0 ; i<cities.length; i = i+2){
            System.out.println(cities[i]);
        }
    }

}
