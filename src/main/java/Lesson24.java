public class Lesson24 {
    public static void main(String[] args) {
        System.out.printf("This is a string, %s", "NICE");
        System.out.printf("This is a string, %d", 100);
        System.out.printf("%fThis is %s a string, %d", 10.4, "BAD", 1400);
        System.out.printf("String %10d", 532);
        System.out.println();
        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 10000);
        System.out.printf("String %10d \n", 100000000);
        System.out.println();
        System.out.printf("String %-10d \n", 532);
        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %-10d \n", 10000);
        System.out.printf("String %-10d \n", 100000000);

        System.out.printf("String %.2f \n", 34.228454645);
        System.out.printf("String %.2f \n", 34.222222);
        System.out.printf("String %.2f \n", 34.45);
        System.out.printf("String %.2f \n", 34.355356375634654);
        System.out.printf("String %.2f \n", 34.354356375634654);
    }
}
