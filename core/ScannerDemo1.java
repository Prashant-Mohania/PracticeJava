import java.util.Scanner;

class ScannerDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Hello I 20 am Pagal");
        // Object obj = sc.next();
        Object obj = sc.next().charAt(0);
        Object obj1 = sc.next();
        Object obj3 = sc.nextInt();
        Object obj2 = sc.nextLine();
        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        sc.close();
    }
}
