package basics;
public class Expressions{
    public static void main(String[] args){
        // System.out.println("Expressions----");

        int a=100;
        int b=200;
        char c='a';
        String d = "ab";
        String e="20";
        // System.out.println(a+b);    //300
        // System.out.println(a+c);    // 197
        // System.out.println(a+d);    // 100ab
        // System.out.println(a+e);    // 10020

        int e1=Integer.parseInt(e);
        // System.out.println(e1); // 20
        // System.out.println(a+e1);   // 120

        boolean f = true;
        // System.out.println(a+f); // bad operand types for binary operator '+'

        // System.out.println(a-d);    //error: bad operand types for binary operator '-'
        // System.out.println(a-c);    // 3
        // System.out.println(a-e);    // error: bad operand types for binary operator '-'

        /*
        System.out.println(10/2);   // 5
        System.out.println(10/4);   //2
        System.out.println(10.0/4.0);   // 2.5
        System.out.println(10.0/4);     // 2.5
        System.out.println(10/4.0);         // 2.5
        System.out.println(10f/4);  // 2.5
        System.out.println(10f/4f);     // 2.5 
        System.out.println(10/4f);      // 2.5 
        */



        /*
        int x = 10;
        int y = 4;
        // System.out.println(x/y);    // 2
        // System.out.println((double)x/y);    //2.5
        // System.out.println(double(x)/y); // Error
        char s='a';
        String ss="ac";
        // System.out.println(x/s);  //0
        System.out.println((double)x/s); //0.10309278350515463
        // System.out.println(x/ss);    //error: bad operand types for binary operator '/'
        */


        /*  "%" operator using
        int xx=11;
        int yy= 4;
        System.out.println(xx%yy);  // 3
        System.out.println(yy%xx);  // 4
        */




        /* ------- Increment and Decrement 
        int p = 32;
        int q = 35;

        System.out.println(p++); //32  post increment 
        System.out.println(++q);    //36    pre increment


        int m= 32;
        int m1;
        m1=m++ + m++ + m++;
        System.out.println(m1); // 99(32+33+34)

        int m3=32;
        int m2;
        m2 = ++m3 + ++m3 + ++m3;
        System.out.println(m2); // 102(33+34+35)


        int x2=32;
        int p1=x2++;  // first assign then increment
        System.out.println(x2);     //33
        System.out.println(p1);     // 32 

        int x3=32;
        int p3=++x3;    // will complete the increment then assign the value
        System.out.println(x3); //33
        System.out.println(p3); //33
        ---------- */


        /* ------
        int a1=23;
        int a2=54;
        int a3= 98;
        int a4;
        a4=(a1>a2)?(a1>a3?a1:a3):(a2>a3?a2:a3);
        System.out.println(a4);
        --------- */
    }
}