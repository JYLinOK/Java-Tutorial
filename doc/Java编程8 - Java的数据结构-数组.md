# Java编程8 - Java的数据结构-数组

lin-jinwei

注意，未授权不得擅自以盈利方式转载本博客任何文章。

---

Code: code/J8-data-structure

## 数据结构有什么用？

1. 一般的编程语言都有数据结构；
2. 数据结构主要用于规则化存储与处理批量数据。

## 数组

1. 数组是绝大部分的编程语言都有的数据结构。
2. 数组的基本功能是将多个数值数据组合成一个操作整体或者单元。

### 数组的特点

1. 大小固定=>容积能力固定；
2. 对于随机数据访问而言，效率比较高；

### 实例

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("数据结构数组");

        // 数据结构1：数组
        // 在定义数组的时候，必须给出数组的大小
        int[] array_int = new int[5];
        long[] array_long = new long[5];
        float[] array_float = new float[5];
        double[] array_double = new double[5];

        array_int[1] = 1;
//        array_int[1] = 1.2;  数据类型不对，无法存入数组
        array_long[0] = 2;
//        array_long[0] = 2.3;  数据类型不对，无法存入数组
        array_float[0] = 3.4f;
        array_float[0] = 3;  // float数组可以存储整型数据
        array_float[0] = 2;  // float数组可以存储整型数据
        array_double[2] = 5.6;  // double数组存储数据不需要
        array_double[2] = 5.6f;  // double数组可以存储float数据
        array_double[2] = 5.6d;  // double数组可以通过加d标准化存入双精度型数据
        array_double[2] = 5;  // double数组可以存入整型数据
        array_double[2] = 6;  // double数组可以存入整型数据

        System.out.println("array_int = " + array_int);
        System.out.println("array_long = " + array_long);
        System.out.println("array_float = " + array_float);
        System.out.println("array_double = " + array_double);

        System.out.println();
        System.out.println("操作处理数组--for each");

        float array[] = {1, 2, 3, 4, 5};
        System.out.println("array = " + array);
        for(float a:array){
            System.out.println("a = " + a);
        }


        System.out.println();
        System.out.println("操作处理数组--数组作为函数参数");
        float array2[] = {6, 7, 8, 9, 0};
        // 调用静态函数实现打印
        printFloatArray(array2);

        System.out.println();
        System.out.println("操作处理数组--数组作为函数return返回值");
        float array3[] = getFloatArray(array2);
        // 调用静态函数实现打印
        System.out.println("array3 = " + array3);
        for(float a:array3){
            System.out.println("a = " + a);
        }

        System.out.println();
        System.out.println("操作处理数组--二维或多维数组处理");

        //定义二维或者多维数组需要用到两个或者多个中括号[]
        int[][] a2D_int = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("二维数组 a2D_int = " + a2D_int);
        // 遍历数组
        for(int[] a1:a2D_int){
            for(int a:a1){
                System.out.println("a = " + a);
            }
        }
        System.out.println("a2D_int[0][1] = " + a2D_int[0][1]);
        System.out.println("a2D_int[1][2] = " + a2D_int[1][2]);

        System.out.println();
        System.out.println("操作处理数组--Arrays模块的数组方法");
        int a1_int[] = {1, 2, 3};
        int a2_int[] = {1, 2, 3};
        int a3_int[] = {1, 2, 6};
        int a4_int[] = {1, 2, 6, 3, 9, 8, 7, 6, 5, 4, 3};
        System.out.println("Arrays.binarySearch(a1_int, 1) = " + Arrays.binarySearch(a1_int, 1));
        System.out.println("Arrays.binarySearch(a1_int, 2) = " + Arrays.binarySearch(a1_int, 2));
        System.out.println("Arrays.equals(a1_int, a2_int) = " + Arrays.equals(a1_int, a2_int));
        System.out.println("Arrays.equals(a1_int, a3_int) = " + Arrays.equals(a1_int, a3_int));
        Arrays.fill(a1_int, 100);
        printIntArray(a1_int);
        System.out.println("a1_int = " + a1_int);
        Arrays.fill(a1_int, 111);
        printIntArray(a1_int);
        System.out.println("a1_int = " + a1_int);
        Arrays.sort(a4_int);
        System.out.println("a4_int = " + a4_int);
        printIntArray(a4_int);

    }

    public static void printIntArray(int[] array){
        System.out.println("printFloatArray =>");
        int i = 0;
        for(int a:array){
            System.out.println("a" + i + " = " + a);
            i += 1;
        }
    }

    public static void printFloatArray(float[] array){
        System.out.println("printFloatArray =>");
        for(float a:array){
            System.out.println("a = " + a);
        }
    }

    public static float[] getFloatArray(float[] array){
        System.out.println("getFloatArray =>");
        int i = 0;
        for(float a:array){
            array[i] += 1;
            i++;
        }
        return array;
    }
}
```

输出

```java
数据结构数组
array_int = [I@41629346
array_long = [J@6d311334
array_float = [F@3d075dc0
array_double = [D@448139f0

操作处理数组--for each
array = [F@7cca494b
a = 1.0
a = 2.0
a = 3.0
a = 4.0
a = 5.0

操作处理数组--数组作为函数参数
printFloatArray =>
a = 6.0
a = 7.0
a = 8.0
a = 9.0
a = 0.0

操作处理数组--数组作为函数return返回值
getFloatArray =>
array3 = [F@6acbcfc0
a = 7.0
a = 8.0
a = 9.0
a = 10.0
a = 1.0

操作处理数组--二维或多维数组处理
二维数组 a2D_int = [[I@3feba861
a = 1
a = 2
a = 3
a = 4
a = 5
a = 6
a = 7
a = 8
a = 9
a2D_int[0][1] = 2
a2D_int[1][2] = 6

操作处理数组--Arrays模块的数组方法
Arrays.binarySearch(a1_int, 1) = 0
Arrays.binarySearch(a1_int, 2) = 1
Arrays.equals(a1_int, a2_int) = true
Arrays.equals(a1_int, a3_int) = false
printFloatArray =>
a0 = 100
a1 = 100
a2 = 100
a1_int = [I@34c45dca
printFloatArray =>
a0 = 111
a1 = 111
a2 = 111
a1_int = [I@34c45dca
a4_int = [I@5b6f7412
printFloatArray =>
a0 = 1
a1 = 2
a2 = 3
a3 = 3
a4 = 4
a5 = 5
a6 = 6
a7 = 6
a8 = 7
a9 = 8
a10 = 9
```
