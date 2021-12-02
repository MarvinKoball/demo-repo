package com.company;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\Marvin-Desktop\\Desktop\\input2.txt");
            int num;
            String str="";


            while ((num = reader.read()) != -1) {
                char ch= (char)num;
                str+=ch;

            }
            reader.close();
            String[] strarr= str.split("\\s");
            int counterf =0;
            int counterud=0;


            for (int i =0;i<=strarr.length-1;i=i+2)
            {
                if (strarr[i].charAt(0)=='f'){
                    counterf+=Integer.parseInt(strarr[i+1]);

                }
                if (strarr[i].charAt(0)=='d'){
                    counterud+=Integer.parseInt(strarr[i+1]);

                }
               if (strarr[i].charAt(0)=='u'){
                    counterud-=Integer.parseInt(strarr[i+1]);

                    }
            }
            System.out.println(counterf*counterud);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

