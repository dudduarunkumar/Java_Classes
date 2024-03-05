package basics;
public class TwoDimArray {
    public static void main(String[] args) {
        int [] arr1={1,3,5,6};
        // System.out.println(arr1);
        // System.out.println(arr1.length);


        int[][] arr2={{1,243,34,64},{23,56,654,643,6534,433}};
        // System.out.println(arr2);   //  [[I@7ad041f3
        // System.out.println(arr2.length);    // 2
        // System.out.println(arr2[1]);    //[I@7ad041f3
        System.out.println(arr2[1].length);// 6
        System.out.println(arr2[1][(arr2[1].length)-2]); // 6534
        System.out.println(arr2[1][5]);    //433

    }
}
