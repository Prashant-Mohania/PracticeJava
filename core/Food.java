// Anonymous Inner class implements interface

interface Cookable{
    public abstract void cook();
}

class Food {
    Cookable c = new Cookable(){
        public void cook() {
            System.out.println("anonymous cookable implementer");
        }
    };

    public static void main(String[] args) {
        Food f = new Food();
        f.c.cook();
    }
}
