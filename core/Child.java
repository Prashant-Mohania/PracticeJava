package agra;

import village.*;

class Child extends Parent2 {
    public void testIt() {
        System.out.println("Shoes is " + shoes);
        Parent2 p = new Parent2();
        // System.out.println("Shoes are used by Parent in Agra " + p.shoes);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.testIt();
    }
}
