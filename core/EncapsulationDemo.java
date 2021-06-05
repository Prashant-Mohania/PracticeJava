import java.util.Scanner;

class Student {
    private int roll;
    private String name;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}

class EncapsulationDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter:- ");
            int r = sc.nextInt();
            sc.nextLine();
            String n = sc.nextLine();
            if (r < 0) {
                System.out.println("Roll number can't be negative");
            } else {
                s.setRoll(r);
                s.setName(n);
            }
            System.out.println();
            System.out.println("Name:- " + s.getName());
            System.out.println("Roll Number:- " + s.getRoll());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
