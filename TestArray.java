package cn.com.shield.staging.Java;

import java.util.Arrays;

/**
 * @Author：HanLu
 * @Description:这是练习Java的数组知识点
 *
 * 1、数组的定义及特点
 *    定义
 *      用于存储一组相同的类型的数据，可以是任意类型(基础类型、引用类型)
 *      数组的元素是通过整形的下标索引来访问，从0开始
 *    特点
 *      数组的长度是固定的且必须指定长度，元素不可修改
 *
 * 2、数组的声明、初始化
 *      声明两种方式：
 *          1、int[] array
 *          2、int array[]
 *      初始化三种方式：
 *          1、{1,2,3}     ==静态初始化
 *          2、new int[2]  ==默认初始化
 *          3、array[0]=1; ==动态初始化
 *
 * 3、数组的遍历
 *      1、for循环
 *      2、foreach遍历元素内容
 *
 *
 * 4、Arrays类对数组的操作
 *      1、数组的排序
 *      2、打印数组的元素
 *      3、数组元素的填充
 *
 * 5、二维数组
 *       int[][] array = new int[3][];
 *
 *         for (int[] ele:array){
 *             System.out.println(ele);
 *         }
 *
 * 6、数组的算法--冒泡排序
 * @Date:Created in 3:19 PM 2020/5/11
 */
public class TestArray {

    public static void main(String[] args) {
        TestArray array = new TestArray();
//        array.testArrayDefine();
//        array.testArrayFor();
//        array.testArrays();
//        array.testArrayEr();
    array.maoPao();
    }


    /**
     * 练习数组的定义和三种不同方式初始化
     *
     * 动态初始化 new int[3]
     * 静态初始化 {1,3,4}
     * 默认初始化 array[0]=1
     */
    public void testArrayDefine(){

        //1、定义一个基础类型的数组，默认初始化
        int[] arrayInt = new int[3];

        System.out.println(arrayInt[0]); //默认值为0

        //2、定义一个引用类型的数组
        String[] stringArray = new String[5];

        System.out.println(stringArray[1]); //引用类型默认值为null



        //3、动态初始化
        int[] arrayInt2 = new int[4];

        arrayInt2[0] = 1; //动态的初始化

        System.out.println(arrayInt2[0]);


        //4、静态初始化
        int[] arrayInt3 = {1,2,3,4,5,1};

        System.out.println(arrayInt3[3]);

    }


    /**
     * 练习数组的遍历
     * for循环
     * foreach遍历
     */
    public void testArrayFor(){

        //for循环遍历
        String[] a = {"A","B","C"};

        for (int i=0;i<a.length;i++){
            System.out.println("下标为："+i+",元素内容为："+a[i]);
        }


        //foreach遍历 类型 存储元素的变量:数组
        for (String ele:a){
            System.out.println(ele);
        }

    }


    /**
     * 练习until.Arrays包对数组的操作
     */
    public void testArrays(){

        int[] b = {12,34,23,567,346,58,23,6};

        //1、对数组进行排序、打印数组元素内容

        System.out.println("=======排序前数组顺序========");
        System.out.println(Arrays.toString(b));

        Arrays.sort(b);

        System.out.println("=======排序后数组顺序========");
        System.out.println(Arrays.toString(b));

        //2、填充数组的元素
        System.out.println("=======填充前数组内容========");
        System.out.println(Arrays.toString(b));

        Arrays.fill(b,0,4,100);
        System.out.println("=======填充后数组内容========");
        System.out.println(Arrays.toString(b));


    }


    /**
     * 练习二维数组的声明和定义
     *
     */
    public void testArrayEr(){

        //二维数组默认初始化
        int[][] array = new int[3][];

        for (int[] ele:array){
            System.out.println(ele);
        }

        //二维数组静态初始化
        int[][] array2 = {
                {1,2,4},
                {1},
                {33,4,56,23,756,2,4657}
        };

        //遍历二维数组
        for (int[] ele:array2){
            for (int temp:ele){
                System.out.print(temp+" ");
            }
        }

    }


    /**
     * 练习数组的冒泡排序
     * 原理：
     *  1、依次拿数据和相邻元素比较，大的数据交换
     *
     */
    public void maoPao(){

        int[] c = {3,2,1,45,12,43,112,12,3,543,456,5467,56};

        //控制整体循环的次数，循环数组的长度次数即可
       for (int j = 1;j<c.length;j++)
           //1、控制每一个变量循环比，即长度-元素所在位置-1即可
        for (int i=0;i<c.length-j;i++){
            int temp;

            if (c[i] > c[i+1]){
                temp = c[i];
                c[i] = c[i+1];
                c[i+1] = temp;
            }

        }
        System.out.println(Arrays.toString(c));

    }
}
