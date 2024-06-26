# Java编程9 - Java的数据结构-列表

lin-jinwei

注意，未授权不得擅自以盈利方式转载本博客任何文章。

---

Code: code/J9-data-structure-list

## 列表

1. 列表在Java中一般通过ArrayList类表示；
2. 列表与数组的主要区别是：列表是没有固定大小限制的；
3. 也就是说列表可以随意添加或者删除元素；
4. ArrayList继承了AbstractList类，并实现了List接口；
5. ArrayList在使用的时候也需要引入 java.util 包。

### 数组的特点

1. 大小不固定=>容积能力不固定=>容量可变；
2. ArrayList列表可以实现遍历。

## 实列

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java数据结构-列表");

        System.out.println();
        System.out.println("定义ArrayList-add方法添加元素");
        // 下面定义中的箭头括号<>内标明列表元素类型，注意需要使用大写完整类型，
        // 否则报错：Type argument cannot be of primitive type
        // 比如int不能使用int，而是Integer
        ArrayList<Integer> al_int = new ArrayList<Integer>();
        // 通过add方法添加数据
        al_int.add(1);
        al_int.add(2);
        al_int.add(3);
        al_int.add(4);
        al_int.add(5);
        al_int.add(6);
        System.out.println("al_int = " + al_int);

        System.out.println();
        System.out.println("修改元素-ArrayList-set方法修改对应位置元素");
        al_int.set(0, 0);
        System.out.println("al_int = " + al_int);
        al_int.set(1, 1);
        System.out.println("al_int = " + al_int);

        System.out.println();
        System.out.println("删除元素-ArrayList-remove方法删除对应位置元素");
        al_int.remove(0);
        System.out.println("al_int = " + al_int);
        al_int.remove(0);
        System.out.println("al_int = " + al_int);
        al_int.remove(1);
        System.out.println("al_int = " + al_int);

        System.out.println();
        System.out.println("计算大小-ArrayList-通过调用size()方法获取列表大小");
        System.out.println("al_int.size() = " + al_int.size());

        System.out.println();
        System.out.println("列表克隆-ArrayList-通过调用clone()方法克隆已知列表");
        ArrayList<Integer> al_int2 = (ArrayList<Integer>)al_int.clone();
        System.out.println("al_int2 = " + al_int);
        System.out.println("al_int2.size() = " + al_int2);

        System.out.println();
        System.out.println("列表排序-ArrayList-通过调用sort()方法排序已知列表");
        ArrayList<Float> al_float = new ArrayList<Float>();
        // 排序列表需要引入Collection类
        // 通过add方法添加数据
        al_float.add(6.2f);
        al_float.add(3.5f);
        al_float.add(2.1f);
        al_float.add(1.2f);
        al_float.add(0.1f);
        al_float.add(5.5f);
        System.out.println("al_float = " + al_float);
        Collections.sort(al_float);
        System.out.println("al_float = " + al_float);

        System.out.println();
        System.out.println("直接定义列表内容-ArrayList-通过Arrays.asList()直接定义列表内容");
        ArrayList<Float> al_float2 = new ArrayList<Float>(Arrays.asList(100.0f, 200.0f, 300.0f));
        System.out.println("al_float2 = " + al_float2);
        al_float2.add(400.0f);
        al_float2.add(500.0f);
        System.out.println("al_float2 = " + al_float2);

        System.out.println();
        System.out.println("列表拼接集合-ArrayList-通过调用addAll()方法拼接拓展已知列表");
        al_float.addAll(al_float2);
        System.out.println("al_float = " + al_float);
        System.out.println("al_float2 = " + al_float2);  // 拼接后被，拼接加入组块数组不变

//        al_int.addAll(al_float2);  // 不同类型的ArrayList不能直接addAll()拼接

        System.out.println();
        System.out.println("请客列表所有内容-ArrayList-通过clear()方法实现");
        System.out.println("al_float = " + al_float);
        al_float.clear();
        System.out.println("al_float = " + al_float);

        System.out.println();
        System.out.println("判断列表是否包含某元素-ArrayList-通过 contains()方法实现");
        System.out.println("al_float2 = " + al_float2);
        System.out.println("al_float2.contains(1)) = " + al_float2.contains(1));
        System.out.println("al_float2.contains(100)) = " + al_float2.contains(100));
        System.out.println("al_float2.contains(100.0)) = " + al_float2.contains(100.0));
        System.out.println("al_float2.contains(100.0f) = " + al_float2.contains(100.0f));  // 浮点数的标准描述是后面加上f

        System.out.println();
        System.out.println("获取列表对应索引的位置的元素-ArrayList-通过 get()方法实现");
        System.out.println("al_float2 = " + al_float2);
        System.out.println("al_float2.get(0) = " + al_float2.get(0));
        System.out.println("al_float2.get(1) = " + al_float2.get(1));
        System.out.println("al_float2.get(2) = " + al_float2.get(2));
        System.out.println("al_float2.get(3) = " + al_float2.get(3));

        System.out.println();
        System.out.println("获取列表某元素对应的索引值-ArrayList-通过 indexOf()方法实现");
        System.out.println("al_float2 = " + al_float2);
        System.out.println("al_float2.indexOf(000.0f) = " + al_float2.indexOf(000.0f));  // 对于列表不存在的元素则是返回-1
        System.out.println("al_float2.indexOf(100.0f) = " + al_float2.indexOf(100.0f));
        System.out.println("al_float2.indexOf(200.0f) = " + al_float2.indexOf(200.0f));
        System.out.println("al_float2.indexOf(300.0f) = " + al_float2.indexOf(300.0f));


        System.out.println();
        System.out.println("移除列表中系列元素-ArrayList-通过 removeAll()方法实现");
        al_float = (ArrayList<Float>)al_float2.clone();
        System.out.println("al_float = " + al_float);
        ArrayList<Float> al_a = new ArrayList<Float>(Arrays.asList(100.0f, 300.0f));  // 系列元素的排序可以不按照顺序
        System.out.println("al_a = " + al_a);
        al_float.removeAll(al_a);
        System.out.println("al_float = " + al_float);

        System.out.println();
        System.out.println("移除列表中单个元素-ArrayList-通过 remove()方法实现");
        al_float = (ArrayList<Float>)al_float2.clone();
        System.out.println("al_float = " + al_float);
        al_float.remove(200.0f);
        System.out.println("al_float = " + al_float);

        System.out.println();
        System.out.println("获取列表中元素数量-ArrayList-通过 size()方法实现");
        al_float = (ArrayList<Float>)al_float2.clone();
        System.out.println("al_float.size() = " + al_float.size());

        System.out.println();
        System.out.println("判断列表是否为空-ArrayList-通过 isEmpty()方法实现");
        al_float.clear();
        System.out.println("al_float = " + al_float);
        System.out.println("al_float.isEmpty() = " + al_float.isEmpty());
        al_float = (ArrayList<Float>)al_float2.clone();
        System.out.println("al_float = " + al_float);
        System.out.println("al_float.isEmpty() = " + al_float.isEmpty());

        System.out.println();
        System.out.println("截取列表部分元素做子列表-ArrayList-通过 subList()方法实现");
        System.out.println("al_float = " + al_float);
        System.out.println("al_float.subList(0, 2) = " + al_float.subList(0, 2));

        System.out.println();
        System.out.println("设置列表指定索引的元素-ArrayList-通过 subList()方法实现");
        System.out.println("al_float = " + al_float);
        al_float.set(0, 1000f);
        System.out.println("al_float = " + al_float);

        System.out.println();
        System.out.println("将列表转为数组-ArrayList-通过 toArray()方法实现");
        al_float.clear();
        al_float = (ArrayList<Float>)al_float2.clone();
        // 新定义一个与远列表相同大小的数组
        Float[] l_arr = new Float[al_float.size()];
        // 再将列表转为数组
        al_float.toArray(l_arr);
        // 转化后的结果就是数组 l_arr
        for(float a:l_arr){
            System.out.println("a = " + a);
        }
        System.out.println("al_float = " + al_float);
        System.out.println("al_float.getClass().toString() = " + al_float.getClass().toString());
        System.out.println("l_arr.getClass().toString() = " + l_arr.getClass().toString());

        System.out.println();
        System.out.println("将列表转为字符串-ArrayList-通过 toString()方法实现");
        al_float.clear();
        al_float = (ArrayList<Float>)al_float2.clone();
        // 定义一个新的 String对象,用于存储列表转化数据
        String al_list = al_float.toString();
        System.out.println("al_float = " + al_float);
        System.out.println("al_list = " + al_list);
        System.out.println("al_float.getClass().toString() = " + al_float.getClass().toString());
        System.out.println("al_list.getClass().toString() = " + al_list.getClass().toString());

        System.out.println();
        System.out.println("创建指定容量的列表-ArrayList-通过 ensureCapacity()方法实现");
        // 首先创建一个动态列表
        ArrayList<Float> al_dyn = new ArrayList<>();
        System.out.println("al_dyn = " + al_dyn);
        System.out.println("al_dyn.size() = " + al_dyn.size());
        System.out.println("al_dyn.getClass().toString() = " + al_dyn.getClass().toString());
        al_dyn.ensureCapacity(3);
        al_dyn.add(1.0f);
        al_dyn.add(2.0f);
        al_dyn.add(3.0f);
        al_dyn.add(4.0f);  // 载添加一个元素也是可以的，说明通过ensureCapacity()定义的是最小容量
        System.out.println("al_dyn = " + al_dyn);

        System.out.println();
        System.out.println("获取列表元素最后一次出现的位置-ArrayList-通过 lastIndexOf()方法实现");
        System.out.println("al_dyn = " + al_dyn);
        al_dyn.add(1.0f);
        al_dyn.add(2.0f);
        al_dyn.add(1.0f);
        al_dyn.add(3.0f);
        System.out.println("al_dyn = " + al_dyn);
        System.out.println("al_dyn.lastIndexOf(1.0f) = " + al_dyn.lastIndexOf(1.0f));
        System.out.println("al_dyn.lastIndexOf(2.0f) = " + al_dyn.lastIndexOf(2.0f));

        System.out.println();
        System.out.println("保留列表中的与指定列表元素相同的元素-ArrayList-通过 retainAll()方法实现");
        System.out.println("al_dyn = " + al_dyn);
        // 新建指定元素列表 al_dyn_1
        ArrayList<Float> al_dyn_1 = new ArrayList<Float>(Arrays.asList(1.0f, 2.0f));
        System.out.println("al_dyn_1 = " + al_dyn_1);
        // 过滤保留元素
        al_dyn.retainAll(al_dyn_1);
        System.out.println("al_dyn = " + al_dyn);  // 重复元素也保留，同时保持相对位置不变

        System.out.println();
        System.out.println("判断列表是否包含另一个列表的所有元素-ArrayList-通过 containsAll()方法实现");
        System.out.println("al_dyn = " + al_dyn);
        ArrayList<Float> al_d = new ArrayList<Float>(Arrays.asList(1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f));
        ArrayList<Float> al_d1 = new ArrayList<Float>(Arrays.asList(1.0f));
        System.out.println("al_d = " + al_d);
        System.out.println("al_d1 = " + al_d);
        System.out.println("al_d.containsAll(al_dyn) = " + al_d.containsAll(al_dyn));
        System.out.println("al_d1.containsAll(al_dyn) = " + al_d1.containsAll(al_dyn));

        System.out.println();
        System.out.println("明确设置列表的容量-ArrayList-通过 trimToSize()方法实现");
        System.out.println("al_d = " + al_d);
        System.out.println("al_d.size() = " + al_d.size());
        al_d.trimToSize();
        System.out.println("al_d.size() = " + al_d.size());  // 实际上该函数作用不大

        System.out.println();
        System.out.println("删除符合指定条件的元素-ArrayList-通过 removeIf()方法实现");
        ArrayList<Float> al_dd = (ArrayList<Float>)al_d.clone();
        System.out.println("al_d = " + al_d);
        System.out.println("al_dd = " + al_dd);
        // 删除 al_dd中大于3.0f的元素
        al_dd.removeIf(e-> e > 3.0f);
        System.out.println("al_dd = " + al_dd);

        System.out.println();
        System.out.println("遍历列表的所有元素并执行对应操作-ArrayList-通过 forEach()方法实现");
        System.out.println("al_d = " + al_d);
        al_d.forEach((e)->{
            System.out.println("e = " + e);
            int ind_e = al_d.indexOf(e);
            e *= 2;
            al_d.set(ind_e, e);
        });
        System.out.println("al_d = " + al_d);
        // 使用 sort方法进行排序，可选择使用的排序方法
        al_d.sort(Comparator.naturalOrder());
        System.out.println("al_d = " + al_d);

    }
}
```

输出：

```java
Java数据结构-列表

定义ArrayList-add方法添加元素
al_int = [1, 2, 3, 4, 5, 6]

修改元素-ArrayList-set方法修改对应位置元素
al_int = [0, 2, 3, 4, 5, 6]
al_int = [0, 1, 3, 4, 5, 6]

删除元素-ArrayList-remove方法删除对应位置元素
al_int = [1, 3, 4, 5, 6]
al_int = [3, 4, 5, 6]
al_int = [3, 5, 6]

计算大小-ArrayList-通过调用size()方法获取列表大小
al_int.size() = 3

列表克隆-ArrayList-通过调用clone()方法克隆已知列表
al_int2 = [3, 5, 6]
al_int2.size() = [3, 5, 6]

列表排序-ArrayList-通过调用sort()方法排序已知列表
al_float = [6.2, 3.5, 2.1, 1.2, 0.1, 5.5]
al_float = [0.1, 1.2, 2.1, 3.5, 5.5, 6.2]

直接定义列表内容-ArrayList-通过Arrays.asList()直接定义列表内容
al_float2 = [100.0, 200.0, 300.0]
al_float2 = [100.0, 200.0, 300.0, 400.0, 500.0]

列表拼接集合-ArrayList-通过调用addAll()方法拼接拓展已知列表
al_float = [0.1, 1.2, 2.1, 3.5, 5.5, 6.2, 100.0, 200.0, 300.0, 400.0, 500.0]
al_float2 = [100.0, 200.0, 300.0, 400.0, 500.0]

请客列表所有内容-ArrayList-通过clear()方法实现
al_float = [0.1, 1.2, 2.1, 3.5, 5.5, 6.2, 100.0, 200.0, 300.0, 400.0, 500.0]
al_float = []

判断列表是否包含某元素-ArrayList-通过 contains()方法实现
al_float2 = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float2.contains(1)) = false
al_float2.contains(100)) = false
al_float2.contains(100.0)) = false
al_float2.contains(100.0f) = true

获取列表对应索引的位置的元素-ArrayList-通过 get()方法实现
al_float2 = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float2.get(0) = 100.0
al_float2.get(1) = 200.0
al_float2.get(2) = 300.0
al_float2.get(3) = 400.0

获取列表某元素对应的索引值-ArrayList-通过 indexOf()方法实现
al_float2 = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float2.indexOf(000.0f) = -1
al_float2.indexOf(100.0f) = 0
al_float2.indexOf(200.0f) = 1
al_float2.indexOf(300.0f) = 2

移除列表中系列元素-ArrayList-通过 removeAll()方法实现
al_float = [100.0, 200.0, 300.0, 400.0, 500.0]
al_a = [100.0, 300.0]
al_float = [200.0, 400.0, 500.0]

移除列表中单个元素-ArrayList-通过 remove()方法实现
al_float = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float = [100.0, 300.0, 400.0, 500.0]

获取列表中元素数量-ArrayList-通过 size()方法实现
al_float.size() = 5

判断列表是否为空-ArrayList-通过 isEmpty()方法实现
al_float = []
al_float.isEmpty() = true
al_float = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float.isEmpty() = false

截取列表部分元素做子列表-ArrayList-通过 subList()方法实现
al_float = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float.subList(0, 2) = [100.0, 200.0]

设置列表指定索引的元素-ArrayList-通过 subList()方法实现
al_float = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float = [1000.0, 200.0, 300.0, 400.0, 500.0]

将列表转为数组-ArrayList-通过 toArray()方法实现
a = 100.0
a = 200.0
a = 300.0
a = 400.0
a = 500.0
al_float = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float.getClass().toString() = class java.util.ArrayList
l_arr.getClass().toString() = class [Ljava.lang.Float;

将列表转为字符串-ArrayList-通过 toString()方法实现
al_float = [100.0, 200.0, 300.0, 400.0, 500.0]
al_list = [100.0, 200.0, 300.0, 400.0, 500.0]
al_float.getClass().toString() = class java.util.ArrayList
al_list.getClass().toString() = class java.lang.String

创建指定容量的列表-ArrayList-通过 ensureCapacity()方法实现
al_dyn = []
al_dyn.size() = 0
al_dyn.getClass().toString() = class java.util.ArrayList
al_dyn = [1.0, 2.0, 3.0, 4.0]

获取列表元素最后一次出现的位置-ArrayList-通过 lastIndexOf()方法实现
al_dyn = [1.0, 2.0, 3.0, 4.0]
al_dyn = [1.0, 2.0, 3.0, 4.0, 1.0, 2.0, 1.0, 3.0]
al_dyn.lastIndexOf(1.0f) = 6
al_dyn.lastIndexOf(2.0f) = 5

保留列表中的与指定列表元素相同的元素-ArrayList-通过 retainAll()方法实现
al_dyn = [1.0, 2.0, 3.0, 4.0, 1.0, 2.0, 1.0, 3.0]
al_dyn_1 = [1.0, 2.0]
al_dyn = [1.0, 2.0, 1.0, 2.0, 1.0]

判断列表是否包含另一个列表的所有元素-ArrayList-通过 containsAll()方法实现
al_dyn = [1.0, 2.0, 1.0, 2.0, 1.0]
al_d = [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]
al_d1 = [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]
al_d.containsAll(al_dyn) = true
al_d1.containsAll(al_dyn) = false

明确设置列表的容量-ArrayList-通过 trimToSize()方法实现
al_d = [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]
al_d.size() = 6
al_d.size() = 6

删除符合指定条件的元素-ArrayList-通过 removeIf()方法实现
al_d = [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]
al_dd = [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]
al_dd = [1.0, 2.0, 3.0]

遍历列表的所有元素并执行对应操作-ArrayList-通过 forEach()方法实现
al_d = [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]
e = 1.0
e = 2.0
e = 3.0
e = 4.0
e = 5.0
e = 6.0
al_d = [8.0, 2.0, 12.0, 4.0, 10.0, 6.0]
al_d = [2.0, 4.0, 6.0, 8.0, 10.0, 12.0]

Process finished with exit code 0
```
