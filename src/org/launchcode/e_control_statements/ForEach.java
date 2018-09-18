package org.launchcode.e_control_statements;

//Demonstrate Enhanced For Loop
public class ForEach {
    public static void main(String[] args) {
        int x[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(int y : x){
            sum += y;
            if(y==5)
                break;
        }
        System.out.println(sum);
    }

}
