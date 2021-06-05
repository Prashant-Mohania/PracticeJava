class Outer3 {
    int x = 10;

    class Inner3 {
        void msg() {
            System.out.println("Inner Class :- " + x);
        }
    }

    public static void main(String[] args) {
        Outer3.Inner3 i = new Outer3().new Inner3();
        i.msg();
    }
}