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
2. 实例变量属于类的实例。
3. 每一个实例变量都有自己的副本。
4. 在定义的时候如果没有初始化，实例变量将被赋值默认值。

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

---

## 静态变量（也称类变量）

Code: code/J6-static-variable

总结：

1. 静态变量是指使用 static 关键字，在类的内部定义的变量。
2. 静态变量属于类而不属于实例。
3. 一个类可以有多个实例，在初始化类的时候，同一个类的同一静态变量都是相同的。
4. 类的静态变量可以看作是类的成员变量。

实例：

这里，我们用到了类与对象，定义了两个类：

主类：

```java
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
```

子类：

```java
public class StaticC {
    // 定义第三方类的静态变量
    // 在类的内部定义静态变量
    int s_int = 1;
    float s_float = 2.3f;
    long s_long = 123456789;

}

```

输出：

```java
初始化第三方类
输出第三方类的静态变量
s_int = 1
s_float = 2.3
s_long = 123456789

Process finished with exit code 0
```

---

## 参数变量（也称方法变量）

Code: code/J7-parameter-variable

总结：

1. 参数变量在定义方法的时候在方法名称后面括号中定义。
2. 参数变量的作用域只是在所定义的方法的内部。

实例：

```java
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
```

输出：

```java
参数变量
main方法中， b = 5
a = 123
a + b = 128

Process finished with exit code 0
```
