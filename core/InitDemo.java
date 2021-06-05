class Hello{
    static int n = 5; 
    static{
        System.out.println("Hello");
    }
}

class InitDemo {
    static{
        System.out.println("Prashant");
    }
    InitDemo() {
        System.out.println("Non-Param");
    }

    InitDemo(int n) {
        System.out.println("Param " + n);
    }

    int n = 1;

    {
        System.out.println("IIB" + n);
    }
    // int n = 1;

    public static void main(String[] args) {
        // InitDemo initDemo = new InitDemo();
        // InitDemo initDemo1 = new InitDemo(5);
        System.out.println(Hello.n);
    }
} 