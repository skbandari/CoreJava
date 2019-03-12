package org.launchcode.l_enumerations_autoboxing_and_annotations;

enum Apple{
    Jonathon, GoldenDel, REdDel, Winesap, Cortland
}


public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;

        Apple[] t = Apple.values();
        for(Apple a : t) {
            System.out.print(a);
        }
        ap = Apple.Cortland;

        System.out.println(ap);
        if(ap == Apple.Cortland)
            System.out.println("ap contains Cortland");

        switch (ap) {
            case GoldenDel:
                System.out.println("ap again contains Cortland");
                break;
            case Jonathon:
                System.out.println("ap contains jonathon");
                break;

            case REdDel:
                System.out.println("ap contains REd Delicions");
                break;
             default:
                 System.out.println("ap doesnt contain anything");

        }
    }
}
