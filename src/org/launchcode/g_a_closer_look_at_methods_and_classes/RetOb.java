package org.launchcode.g_a_closer_look_at_methods_and_classes;

class Test3 {
    int i;

    Test3(int i) {
        this.i = i;
    }

    Test3 incByTen() {
        Test3 temp= new Test3(i);
        temp.i += 10;
        return  temp;
    }
}
public class RetOb {
    public static void main(String[] args) {
        Test3 ob = new Test3(10);

        System.out.println(ob.i);
        Test3 ob2 = ob.incByTen();

        System.out.println(ob2);
        System.out.println(ob2.i);

    }
}
