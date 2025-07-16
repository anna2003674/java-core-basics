public class Lesson32 {
    public static void main(String[] args) {
        // Double, Short, Float, Long, Integer, Byte, Character, Boolean
        int x1 = 1;

        Integer x2 = new Integer(123);
        x2 = Integer.parseInt("123");
        System.out.println(x2);

        Integer x3 = 123;
        Integer x4 = new Integer(123);

        int y = x3;
        System.out.println(y);

        Boolean b = Boolean.TRUE;
    }
}
