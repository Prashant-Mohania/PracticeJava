class Parent{
    int var = 10;
}

class Child5 extends Parent {
    int var = 150;
    public static void main(String[] args) {
        Parent obj = new Child5();
        System.out.println(obj.var);
    }    
}
