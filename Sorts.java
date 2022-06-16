package com.company.BIAskarov;

public class Sorts {

    public Sorts(){

    }

    public void simpleNumber(int n){
        boolean b = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0){
                b = false;
                break;
            }
        }
        System.out.println(b);
    }
}
