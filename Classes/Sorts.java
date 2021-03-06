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

    public int eratos(int n) {
        int count = 0;
        boolean[] arr = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if (arr[i]) {
               count++;
                for (int j = 2 * i; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        return count;
    }


    public int[] countSort(int[] arr, int[] rangeArr) {
        for (int e : arr) {
            rangeArr[e]++;
        }
        int k = 0;
        for (int i = 0; i < rangeArr.length; i++) {
            for (int j = k; j < rangeArr[i]; j++) {
                arr[j] = i;
                k++;
            }
        }
        return arr;
    }

    public int[] selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }
        return arr;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > -1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
        return arr;
    }

    public int[] qSort(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        if (left < j) qSort(arr, left, j);
        if (i < right) qSort(arr, i, right);
        return arr;
    }

    public int[] mergeSort(int[] arr1, int[] arr2){
        int l = arr1.length + arr2.length;
        int m = 0;
        int n = 0;
        int[] res = new int[l];
        for (int i = 0; i < l; i++) {
            if (arr1[m] > arr2[n]) {
                res[i] = arr2[n];
                n++;
            } else {
                res[i] = arr1[m];
                m++;
            }
        }
        return res;
    }


    

}
