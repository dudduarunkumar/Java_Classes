package basics;
public class Enums{
    public static void main(String[] args){
        int a=100;
        System.out.println(a);
        String des;
        des="Professor";
        System.out.println(des);
        des = "Paper";
        System.out.println(des);

        enum Designation  {ASSTPROP,DEAN,HOD,PROFESSOR,LEATURER}
        Designation des1;
        des1 = Designation.HOD;
        System.out.println(des1);

        enum Colors {RED, BLUE, GREEN, ORANGE, PURPLE}
        Colors clr;
        clr= Colors.RED;
        System.out.println(clr);



    }
} 