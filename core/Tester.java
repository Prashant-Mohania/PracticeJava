abstract class Animal{
    Animal(){
        System.out.println("Prashant Mohania");
    }
    public void disp(){
        System.out.println("I provide color");
    }
    public abstract void foodHabbit();
}

class Tester extends Animal {
    public void foodHabbit(){
        System.out.println("Animal can eat meat and plant");
        System.out.println();
    }

    public static void main(String[] args) {
        // Tester t = new Tester();
        // t.disp();
        // t.foodHabbit();
        // Animal a = new Tester();
        // a.disp(); 
        // a.foodHabbit();
        Object obj = new Object();
        System.out.println(obj.toString());
    }
}
