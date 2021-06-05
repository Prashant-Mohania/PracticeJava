import java.lang.reflect.*;

class Simple1 {
    int var1, var2;
}

class Simple{
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("Simple1");
        System.out.println(c.getName());
        Field f[] = c.getDeclaredFields();

        for(int i =0; i<f.length;i++){
            System.out.println(f[i]);
        }
    }
}