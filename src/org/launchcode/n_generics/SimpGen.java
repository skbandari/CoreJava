package org.launchcode.n_generics;

class TwoGen<T,V>{
    T t;
    V v;
    TwoGen(T t, V v){
        this.t = t;
        this.v = v;
    }

    public T getT(){
        return t;
    }

    public V getV(){
        return v;
    }

    public void showType() {
        System.out.println(t.getClass().getName());
        System.out.println(v.getClass().getName());
    }
}
public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer,String > twoGen = new TwoGen<>(20, "Test");
        System.out.println(twoGen.getT());
        System.out.println(twoGen.getV());
        int i = twoGen.getT();
        String s = twoGen.getV();
        System.out.println(i);
        System.out.println(s);
        twoGen.showType();


    }

}
