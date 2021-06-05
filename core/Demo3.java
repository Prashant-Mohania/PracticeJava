class Demo3{
    public static void main(String[] args) {
        char ch[] = {'P', 'R', 'A', 'M', 'O'};
        String s = new String(ch, 2 , 3);
        System.out.println(s);

        byte b[] ={68, 69, 82, 77, 79, 70};
        String s1 = new String(b, 0, 2);
        System.out.println(s1);
    }
}