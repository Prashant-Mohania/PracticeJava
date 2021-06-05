class Demo1{
    private Demo1(){
        System.out.println("Hi");
    }
    public static Demo1 createInstance(){
        System.out.println("Object is to be created");
        return new Demo1();
    }
    public void myMethod(){
        System.out.println("Hello I am Method");
    }
}

class Tester3 {
    public static void main(String[] args) {
        Demo1 d = Demo1.createInstance();
        d.myMethod();
    }
}
