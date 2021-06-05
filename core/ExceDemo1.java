class ExceDemo1 {
    public static void main(String[] args) {
        try {
            System.out.println("This is line 1");
            int a = 10 / 0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("Please do not divide by zero");
        }
        System.out.println("Plz print me...");
    }
}
