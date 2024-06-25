public class Main {
    // 定义类变量
    static int a = 123;

    // 在主类中定义其他方法
    // 下面的变量b就是参数变量
    // 由于主类的主方法main()是静态的，因此想要在主方法main()中调用同一类中的子方法，类的子方法需要定义为static静态。
    public static void aMethod(int b){
        System.out.println("a = " + a);
        System.out.println("a + b = " + (a + b));
    }

    public static void main(String[] args) {
        System.out.println("参数变量");

        int b = 5;
        System.out.println("main方法中， b = " + b);
        aMethod(b);
    }
}