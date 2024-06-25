# Java编程7 - Java的变量类型

lin-jinwei

注意，未授权不得擅自以盈利方式转载本博客任何文章。

---

Code: code/J4-variables-types

## 变量类型

本部分主要学习Java的各种不同作用域类型的变量类型的作用范围及其特点。

# 局部变量与全局变量

## public static void main(String[] args)

public static void main(String[] args) 主函数外的全局变量在定义的时候需要加 **static**.

## static

public static void main(String[] args) 主函数外的函数想要直接调用全局变量，在定义的时候也需要加上static.

## 实例代码：

```java
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
```

out:

```java
变量类型
局部变量a = 2
局部变量与全局变量不相通
全局变量a = 1
全局变量只需要在外部设置一次

Process finished with exit code 0
```

---

# 实例变量

Code: code/J5-instance-variable


1. Java中的实例变量就是在类中但不在函数方法内中定义的变量。
3. 实例变量属于类的实例。
4. 每一个实例变量都有自己的副本。
5. 在定义的时候如果没有初始化，实例变量将被赋值默认值。

```java
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
```

out:

```java
实例变量
实例变量 a = 1
实例变量 a = 1.0
实例变量 a = 1
实例变量 a = 1
实例变量 a = 1

Process finished with exit code 0
```
