package org.launchcode.l_enumerations_autoboxing_and_annotations;

enum Apple2 {
    Jonathon(10),GoldenDel(5), RedDel(8),Winesap(4), test;

    int price;

    Apple2(int p) {
    price = p;
    }

    Apple2(){
        price = -1;
    }

    int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple2 ap;
        System.out.println("Winesap costs " + Apple2.Winesap.ordinal());
        System.out.println(Apple2.Winesap.compareTo(Apple2.test));
    }
}
