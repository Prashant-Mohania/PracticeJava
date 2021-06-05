// Anonymous Inner class demo

class Parent1{
    public void disp(){
        System.out.println("Hello I'm bass class func");
    }
}

class Tester1{
    Parent1 p = new Parent1() //    create one class which extent Parent1
    {
      public void disp(){
          super.disp();
          System.out.println("Hello I'm Child class func");
      }  
    };
    public static void main(String[] args) {
        Tester1 t = new Tester1();
        t.p.disp();
    }
}