public class Main {
    public static void main(String[] args) {
        System.out.println("静态变量");

        // 初始化第三方类
        System.out.println("初始化第三方类");
        StaticC staticC = new StaticC();

        System.out.println("输出第三方类的静态变量");
        System.out.println("s_int = " + staticC.s_int);
        System.out.println("s_float = " + staticC.s_float);
        System.out.println("s_long = " + staticC.s_long);
    }
}