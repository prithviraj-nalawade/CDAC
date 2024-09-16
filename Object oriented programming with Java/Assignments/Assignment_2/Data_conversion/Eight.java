import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Byte:");
        byte b = s.nextByte();
        System.out.println("Enter Short:");
        short sh = s.nextShort();
        System.out.println("Enter Integer:");
        int i = s.nextInt();
        System.out.println("Enter Float:");
        float f = s.nextFloat();
        System.out.println("Enter Double:");
        double d = s.nextDouble();
        System.out.println("Enter Long:");
        long l = s.nextLong();
        
        System.out.println(Byte.toString(b));
        System.out.println(Short.toString(sh));
        System.out.println(Integer.toString(i));
        System.out.println(Float.toString(f));
        System.out.println(Double.toString(d));
        System.out.println(Long.toString(l));
        
        System.out.println("--------------------valueof------------------------");

        System.out.println(Byte.valueOf(b));
        System.out.println(Short.valueOf(sh));
        System.out.println(Integer.valueOf(i));
        System.out.println(Float.valueOf(f));
        System.out.println(Double.valueOf(d));
        System.out.println(Long.valueOf(l));

        s.close();

    }
}
