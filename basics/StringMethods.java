package basics;
public class StringMethods{
    public static void main(String[] args){
        String a="Arun";
        String b= "AruN";
        String c = "Arun Kumar";
        String d = "Code your career here can create can be bmc career code Code";

        // ----- equals()   equalsIgnoreCase()
        // System.out.println(a.equals(b)); //false
        // System.out.println(a.equalsIgnoreCase(b));  //true

        // ----- ## length()
        // System.out.println(a.length(),c.length());  //Error
        // System.out.println(c.length()); // 10

        // ----- ## charAt
        // System.out.println(a.charAt(5));    //StringIndexOutOfBoundsException: String index out of range: 5
        // System.out.println(a.charAt(3));    //u
        // System.out.println(a.charAt(-1));    //StringIndexOutOfBoundsException: String index out of range: -1
        // System.out.println(a.charAt("d"));   //incompatible types: String cannot be converted to int (Compile Error)
        // System.out.println(a.charAt(a));   //incompatible types: String cannot be converted to int (Compile Error)


        // --------- ## substring(beginingIndex,endingIndex)
        // System.out.println(a.substring(0,3));   //Aru
        // System.out.println(a.substring(0,9));   // StringIndexOutOfBoundsException: begin 0, end 9, length 4
        // System.out.println(a.substring(4,9));   // StringIndexOutOfBoundsException: begin 4, end 9, length 4
        // System.out.println(a.substring(0,-1));   // StringIndexOutOfBoundsException: begin 4, end 9, length 4
        // System.out.println(a.substring(0,-1));   // StringIndexOutOfBoundsException: begin 4, end 9, length 4


        // -------- ## indexOf() , lastIndexOf()

        // System.out.println(a.indexOf("r")); // 1
        // System.out.println(a.indexOf("ru")); // 1
        // System.out.println(a.indexOf("abc")); // -1
        // System.out.println(a.indexOf("arun")); // -1
        // System.out.println(a.indexOf("Arun")); // 0

        // System.out.println(d.indexOf("career")); // 10

        // System.out.println(d.indexOf("can")); // 22
        // System.out.println(d.lastIndexOf("can")); // 33 

        // System.out.println(d.lastIndexOf("Career")); // -1
        // System.out.println(d.indexOf("Career")); // -1

        // System.out.println(d.indexOf("career")); // 10
        // System.out.println(d.lastIndexOf("career")); // 44


        // ------- ## toUpperCase(), toLowerCase()
    }
}