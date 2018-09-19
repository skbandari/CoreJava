package org.launchcode.g_a_closer_look_at_methods_and_classes;

public class PassArray {
    static void vaTest(int v[]) {
        System.out.println("Number of the arguments passed is : " +
                                                v.length + " and the contents are :");
        for(int i=0; i< v.length; i++) {
            System.out.print(v[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int t[] = {2,3,5,6,7};
        vaTest(t);
    }
}
