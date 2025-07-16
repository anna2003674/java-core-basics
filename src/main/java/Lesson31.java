public class Lesson31 {
    public static void main(String[] args) {
        float f1 = 123.2F;
        float f2 = (float) 123.2;

        long l1 = 12121L;

        int a1 = 123;
        long a2 = a1; // неявное
        System.out.println(a2);

        int x = (int) l1; // явное
        System.out.println(x);

        int a = 123;
        double p = a;
        System.out.println(p);

        double k1 = 123.5;
        int y = (int) k1;
        System.out.println(y);

        long m = Math.round(k1);
        System.out.println(m);

        byte xxx = (byte) 129;
        System.out.println(xxx);
    }
}
