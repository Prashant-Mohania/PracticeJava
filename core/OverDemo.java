class OverDemo {
    void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }

    void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void main(String[] args) {
        OverDemo d = new OverDemo();
        d.sum(5, 9);
        d.sum(1, 2, 3);
    }
}