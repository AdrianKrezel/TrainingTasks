package com.adriankrezel.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;

public class Application {

    public static void main(String[] args) {
        int[] array = new int[] {- 5, 1, 5};        //input array
        int res = calculations(array);
        
        System.out.println(res);

    }
/** 
 * Method that returns max squared value from input array
 * @param tab - input array
 * @return result - maximum squared value from array
 */
    static int calculations(int[] tab) {
        int result; //result of calculations
        
        //converts array to List interface element
        List list = Arrays.asList(ArrayUtils.toObject(tab));

        //calculates min and max value for array
        int val1 = (int) Collections.min(list);     //min value in array
        int val2 = (int) Collections.max(list);     //max value in array
        
        int min_pow2 = (int) Math.pow(val1, 2);     //squared power of minimum
        int max_pow2 = (int) Math.pow(val2, 2);     //squared power of maximum
        
        result = Math.max(min_pow2, max_pow2);      //max of squared values
        
        return result;
    }
}
