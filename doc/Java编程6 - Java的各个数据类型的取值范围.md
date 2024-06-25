# Java编程5 - Java的各个数据类型的取值范围

lin-jinwei

注意，未授权不得擅自以盈利方式转载本博客任何文章。

---

Code: code/J3-variables_range

## 主要数据类型的基本属性

```java
public class Main {
    public static void main(String[] args) {
        // Byte 类型
        System.out.println("byte 类型的位数 = " + Byte.SIZE);
        System.out.println("byte 类型的最大值 = " + Byte.MAX_VALUE);
        System.out.println("byte 类型的最小值 = " + Byte.MIN_VALUE);
        System.out.println("byte 类型的 BYTES = " + Byte.BYTES);
        System.out.println("byte 类型的数据类型 = " + Byte.TYPE);
        System.out.println();

        // Integer 类型
        System.out.println("Short 类型的位数 = " + Short.SIZE);
        System.out.println("Short 类型的最大值 = " + Short.MAX_VALUE);
        System.out.println("Short 类型的最小值 = " + Short.MIN_VALUE);
        System.out.println("Short 类型的字节数 = " + Short.BYTES);
        System.out.println("Short 类型的数据类型 = " + Short.TYPE);
        System.out.println();

        // Integer  类型
        System.out.println("Integer 类型的位数 = " + Integer.SIZE);
        System.out.println("Integer 类型的最大值 = " + Integer.MAX_VALUE);
        System.out.println("Integer 类型的最小值 = " + Integer.MIN_VALUE);
        System.out.println("Integer 类型的字节数  = " + Integer.BYTES);
        System.out.println("Integer 类型的数据类型 = " + Integer.TYPE);
        System.out.println();

        // Long  类型
        System.out.println("Long 类型的位数 = " + Long.SIZE);
        System.out.println("Long 类型的最大值 = " + Long.MAX_VALUE);
        System.out.println("Long 类型的最小值 = " + Long.MIN_VALUE);
        System.out.println("Long 类型的字节数 = " + Long.BYTES);
        System.out.println("Long 类型的数据类型 = " + Long.TYPE);
        System.out.println();

        // Float 类型
        System.out.println("Float 类型的位数 = " + Float.SIZE);
        System.out.println("Float 类型的最大值 = " + Float.MAX_VALUE);
        System.out.println("Float 类型的最小值 = " + Float.MIN_VALUE);
        System.out.println("Float 类型的字节数 = " + Float.BYTES);
        System.out.println("Float 类型的数据类型 = " + Float.TYPE);
        System.out.println();

        // Double 类型
        System.out.println("Double 类型的位数 = " + Double.SIZE);
        System.out.println("Double 类型的最大值 = " + Double.MAX_VALUE);
        System.out.println("Double 类型的最小值 = " + Double.MIN_VALUE);
        System.out.println("Double 类型的字节数 = " + Double.BYTES);
        System.out.println("Double 类型的数据类型 = " + Double.TYPE);
        System.out.println("Double 类型的有限浮点变量可能具有的最大指数 = " + Double.MAX_EXPONENT);
        System.out.println("Double 类型的有限浮点变量可能具有的最小指数 = " + Double.MIN_EXPONENT);
        System.out.println("Double 类型的最小正常值 = " + Double.MIN_NORMAL);
        System.out.println("Double 类型的负无穷大 = " + Double.NEGATIVE_INFINITY);
        System.out.println("Double 类型的正无穷大 = " + Double.POSITIVE_INFINITY);
        System.out.println("Double 类型的非数字（Not a Number）的表示 = " + Double.NaN);
        System.out.println();

        // Character 类型
        System.out.println("Character 类型的位数 = " + Character.SIZE);
        System.out.println("Character 类型的最大值 = " + Character.MAX_VALUE);
        System.out.println("Character 类型的最小值 = " + Character.MIN_VALUE);
        System.out.println("Character 类型的字节数 = " + Character.BYTES);
        System.out.println("Character 类型的数据类型 = " + Character.TYPE);
        System.out.println();
    }
}
```

**输出：**

```java
byte 类型的位数 = 8
byte 类型的最大值 = 127
byte 类型的最小值 = -128
byte 类型的 BYTES = 1
byte 类型的数据类型 = byte

Short 类型的位数 = 16
Short 类型的最大值 = 32767
Short 类型的最小值 = -32768
Short 类型的字节数 = 2
Short 类型的数据类型 = short

Integer 类型的位数 = 32
Integer 类型的最大值 = 2147483647
Integer 类型的最小值 = -2147483648
Integer 类型的字节数  = 4
Integer 类型的数据类型 = int

Long 类型的位数 = 64
Long 类型的最大值 = 9223372036854775807
Long 类型的最小值 = -9223372036854775808
Long 类型的字节数 = 8
Long 类型的数据类型 = long

Float 类型的位数 = 32
Float 类型的最大值 = 3.4028235E38
Float 类型的最小值 = 1.4E-45
Float 类型的字节数 = 4
Float 类型的数据类型 = float

Double 类型的位数 = 64
Double 类型的最大值 = 1.7976931348623157E308
Double 类型的最小值 = 4.9E-324
Double 类型的字节数 = 8
Double 类型的数据类型 = double
Double 类型的有限浮点变量可能具有的最大指数 = 1023
Double 类型的有限浮点变量可能具有的最小指数 = -1022
Double 类型的最小正常值 = 2.2250738585072014E-308
Double 类型的负无穷大 = -Infinity
Double 类型的正无穷大 = Infinity
Double 类型的非数字（Not a Number）的表示 = NaN

Character 类型的位数 = 16
Character 类型的最大值 = ￿
Character 类型的最小值 =  
Character 类型的字节数 = 2
Character 类型的数据类型 = char


Process finished with exit code 0
```
