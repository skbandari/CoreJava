package org.launchcode.c_data_types_variables_and_arrays;

/**
 * Calculate distance covered by light in 1000 days
 */

public class Light {
    public static void main(String[] args) {
        int speed = 186000;
        long days = 1000;
        long time = days*24;

        System.out.println("Distance covered by light in 1000 days is " + speed*time);
        

    }
}
