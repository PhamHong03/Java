package vidu;

import java.util.Arrays;

public class Test {
    public static int[] reverse(int[] x){
         int[] rs = new int[x.length];
         int index =0;
         for(int i=x.length-1;i>=0;i--){
             rs[index] = x[i];
             index++;
         }
         return rs;
    }
    public static void main(String[] args) {
        int[] a = new int[]{4,8,2,6,9,3,5,7};
        int[] b = new int[15];

        //Ham tim kiem
        //BinarySearch : chi ap dung doi voi mang da duoc sap xep tang dan;
        System.out.println("a: "+Arrays.toString(a));
        //Ham sapXep;
        Arrays.sort(a);
        System.out.println("a: "+Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,8));
        System.out.println(Arrays.binarySearch(a,-1));
        //Ham dien gia tri
        Arrays.fill(b,5);
        System.out.println("b: "+Arrays.toString(b));
        //Ham giam dan;
        Arrays.sort(a);
        a = Test.reverse(a);
        System.out.println("a: "+Arrays.toString(a));
    }
}
