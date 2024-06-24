# Java编程5 - Java数据类型-整型

lin-jinwei

注意，未授权不得擅自以盈利方式转载本博客任何文章。

---

## 四种基本数据类型

1. 整数型
2. 浮点型
3. 字符型
4. 逻辑型，也称布尔型

## 整数型分类

整数型也有四类：

1. 字节型 byte
2. 短整型 short
3. 整形 int
4. 长整型

## 整数型实例

```java
public class Main {
    public static void main(String[] args) {

        //  定义整数变量 a1
        int int_1 = 1;
        System.out.println("int_1 = " + int_1);

        //  定义整数变量 a2
        int int_2 = 2;
        System.out.println("int_2 = " + int_2);

        //  定义整数变量 byte_1
        byte byte_1 = 3;
        System.out.println("byte_1 = " + byte_1);

        //  定义整数变量 byte_2
        byte byte_2 = 4;
        System.out.println("byte_1 = " + byte_1);

        //  定义整数变量 long_1
        long long_1 = 5;
        System.out.println("long_1 = " + long_1);

        //  定义整数变量 long_2
        long long_2 = 6;
        System.out.println("long_2 = " + long_2);

        //  定义整数变量 short_1
        short short_1 = 7;
        System.out.println("short_1 = " + short_1);

        //  定义整数变量 short_2
        short short_2 = 8;
        System.out.println("short_2 = " + short_2);

    }
}
```

out:

```cmd
int_1 = 1
int_2 = 2
byte_1 = 3
byte_1 = 3
long_1 = 5
long_2 = 6
short_1 = 7
short_2 = 8
```
