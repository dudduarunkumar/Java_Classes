public class MultilineStrings{
    public static void main(String[] args){
        // String a="hello world.
        //         Welcome to my world";
        // System.out.println(a); // Error

        String b = "Hello World."+
        "Welcome to my World."+
        "hehehe";
        System.out.println(b); // Hello World.Welcome to my World.hehehe

        // String c = """Hello World.
        //             Welcome to my World.
        //             hehehe1111""";
        // System.out.println(c); //Error

        String d = """ 
                    Hello World.
                    Welcome to my World.
                    hehehe1111 
                    """;
        System.out.println(d); 

    }
}