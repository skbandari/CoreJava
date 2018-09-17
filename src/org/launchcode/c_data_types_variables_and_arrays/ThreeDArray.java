package org.launchcode.c_data_types_variables_and_arrays;

/**
 * This class is for test purpose which does following:
 * i) initialise a three dimensional array
 * ii) populate the array
 * iii) Print out the array
 *
 */
public class ThreeDArray {
    public static void main(String[] args) {
        //initialisation
        int threeDArray[][][] = new int[3][4][5];

        //populate array
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                for(int k=0; k<5; k++) {
                    threeDArray[i][j][k]=i*j*k;

                }
            }
        }

        //Print out array
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                for(int k=0; k<5; k++) {
                    System.out.println(threeDArray[i][j][k]);

                }
            }
        }
    }
}
