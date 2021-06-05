class A{
    static A obj = null;
    private A(){
        System.out.println("Outside");
    }
    static A getA(){
        if(obj==null){
            obj = new A();
        }
        return obj;
    }
}

class NetTester {
    public static void main(String[] args) {
        A a = A.getA();
    }
}
