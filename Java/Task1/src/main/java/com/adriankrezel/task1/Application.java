package com.adriankrezel.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    /** Method that calculate sequence as sum of two last values in sequence
     *
     * @param tab - input values as array
     * @param length - sequence length (for method scalability)
     * @return - sequence array (result extended to floating point values)
     */
    private static ArrayList<Float> sequence(Float[] tab, int length) {

        //append input elements to the end of list
        ArrayList<Float> array = new ArrayList<>(Arrays.asList(tab));

        //calculations
        for (int i = array.size(); i < length; i++) { //append result to array
            array.add(array.get(i - 2) + array.get(i - 1)); //y(i)=x(i-1)+x(i-2)
        }

        return array;
    }

    public static void main(String[] args) {

        Float[] f = {0.0f, 1.0f};   //default value
        int len = 10;               //default value

        System.out.println(sequence(f, len));

    }
}
