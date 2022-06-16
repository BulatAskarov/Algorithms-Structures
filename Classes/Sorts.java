package com.company.BIAskarov.Classes;

public class Sorts {

    public Sorts() {

    }

    public boolean simpleNumber(int n) {
        boolean b = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }

    public int simpleNumberCount(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (simpleNumber(i)) count++;
        }
        return count;
    }

}
