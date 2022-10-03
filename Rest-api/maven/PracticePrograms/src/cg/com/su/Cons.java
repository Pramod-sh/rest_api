package cg.com.su;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Consecutive{

public static void main(String[] args){
    int[] a={1,2,3,7,9,24,25,26,78};

    for(int i=0;i<a.length;i++){
        int count=0;
        int first=0;

    /*  System.out.println(i);*/
        first=a[i];

        if(a[i+1]-a[i]==1){

            count++;

            int last=a[i]+count;
            i++;
            System.out.println(first + " " + last);

                }else{


                System.out.println(a[i]);

                }

    }
}
}