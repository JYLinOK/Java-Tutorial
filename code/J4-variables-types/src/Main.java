public class Main {

    // 局部变量与全局变量
    // 定义全局变量
    static int a = 1;

    public static void aLocal(){
        System.out.println("全局变量a = " + a);
        System.out.println("全局变量只需要在外部设置一次");
    }

    public static void main(String[] args) {
        System.out.println("变量类型");

        // 定义局部变量
        int a = 2;

        System.out.println("局部变量a = " + a);
        System.out.println("局部变量与全局变量不相通");

        aLocal();
    }



}