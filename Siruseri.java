package com.abu.NPTEL;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Siruseri {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        int n=in.nextInt();
//        int[] lower=new int[n];
//        int[] upper=new int[n];
        ArrayList<Integer> lower=new ArrayList<>();
        ArrayList<Integer> upper=new ArrayList<>();
        for (int i=0;i<n;i++){
            int j= in.nextInt();
            lower.add(j);
            int k=in.nextInt();
            upper.add(k);
        }
        ArrayList<Integer> copy_lower=new ArrayList<>();
        for (int i = 0; i < lower.size(); i++) {
            copy_lower.add(lower.get(i));
        }
        ArrayList<Integer> copy_upper=new ArrayList<>();
        for (int i = 0; i < upper.size(); i++) {
            copy_upper.add(upper.get(i));
        }
        Collections.sort(copy_lower);
        Collections.sort(copy_upper);
        //ArrayList<Integer> result=new ArrayList<>();
        int[] result=new int[n];
        for (int i = 0; i < result.length; i++) {
            int res_ans=0;
            for (int j = i+1; j < n; j++) {
                if (copy_lower.get(i)<copy_lower.get(j)){
                    res_ans+=2;
                }

            }
            int ind=lower.indexOf(copy_lower.get(i));
            result[ind]=res_ans;
        }

        //System.out.println(Arrays.toString(result));
        //System.out.println(lower);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
