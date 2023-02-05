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
        int[] result1=new int[n];
        int[] result2=new int[n];
        for (int i = 0; i < result1.length; i++) {
            int res_ans=0;
            for (int j = i+1; j < n; j++) {
                if (copy_lower.get(i)<copy_lower.get(j)){
                    res_ans+=2;
                }

            }
            int ind=lower.indexOf(copy_lower.get(i));
            result1[ind]=res_ans;
        }
        for (int i = result2.length-1; i >-1; i--) {
            int res_ans=0;
            for(int j=0;j<n;j++){
                if(copy_upper.get(i)>copy_upper.get(j)){
                    res_ans+=2;
                }
            }
            int ind=upper.indexOf(copy_upper.get(i));
            result2[ind]=res_ans;
        }

        //System.out.println(Arrays.toString(result));
        //System.out.println(lower);
        boolean isequal=true;
        if(result1.length==result2.length){
            for (int i=0;i<result1.length;i++){
                if(result1[i]!=result2[i]){
                    isequal=false;
                    break;
                }
            }
        }
        else {
            isequal=false;
        }
        if(isequal){
            for (int i = 0; i < result1.length; i++) {
                System.out.print(result2[i]+" ");
            }
        }
    }
}

//This Code Was Contributed by Mohamed Abdullah
