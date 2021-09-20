package com.company;

class decode {
    public static String decode(String r) {
        String[] num = r.split("([a-z])");
        String[] let = r.split("([0-9])");// your code
        String s=new String(); // String für Zahlen
        String p=new String(); // String für Buchstaben

        for (int i=0;i<num.length;i++){
            s+= num[i];

        }
        for (int i=0;i<let.length;i++){
            p+= let[i];

        }
        char []c= p.toCharArray();
        int[] x=new int[c.length];
        int lang=Integer.parseInt(s);
        System.out.println(lang);

        for (int i=0;i<c.length;i++){
                x[i]=(int)c[i]-97;

            }
        int fact=(int)(lang % 26d);
        int[] y=new int[c.length];
        int[] z= new int[26];

        for (int i=0;i<z.length-1;i++){
            z[i]=(i+1)*fact%26;

        }
        int[] flip= new int[26];
        for (int i=0;i<z.length-1;i++){
           flip[z[i]]=i+1;

        }

        for (int i=0;i<c.length;i++){
            y[i]=flip[x[i]];

        }
    char[] out=new char[c.length];

        for (int i=0;i<c.length;i++){
            out[i]=(char)(y[i]+97);

        }
        String end =new String();
        for (int i=0;i<out.length;i++){
            end+=out[i];

        }
        if(z[12]==0 |z[12]==13){
            return "Impossible to decode";
        }
        else return end ;
    }
}