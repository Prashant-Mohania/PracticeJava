class ThrowDemo {
    static void myThrow(){
    try {
        throw new NullPointerException("My Exception");
    } catch (NullPointerException e) {
        System.out.println("Exception caught in myThrow() method");
        throw e;
    }
    }
    public static void main(String[] args) {
        try {
            myThrow();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
