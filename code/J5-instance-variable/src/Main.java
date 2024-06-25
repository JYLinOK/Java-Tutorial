public class Main {
    // 类的内部，方法的外部定义的变量成为实例变量
    // 实例变量如果不加 static, 即不转静态则无法被静态函数调用
    static int a = 1;
    static float b = 1;
    static double c = 2.3d;
    static long d = 123456789;

    public static void main(String[] args) {
        System.out.println("实例变量");

        // 主函数直接调用实例变量
        System.out.println("实例变量 a = " +  a);
        System.out.println("实例变量 a = " +  b);
        System.out.println("实例变量 a = " +  a);
        System.out.println("实例变量 a = " +  a);
        System.out.println("实例变量 a = " +  a);
    }
}