package cn.com.shield.staging.Java;

/**
 * @Author：HanLu
 * @Description:用于练习Java的包装类--主要是基本类型int、boolean等类型
 * 1、包装类的定义和作用
 *
 *      位于java.lang包中
 *   因为Java不是纯面向对象的语言，所以Java建立的基本类型对应的包装类
 *      int===Interger
 *      boolean === Boolean
 *
 *
 * 2、自动装箱、拆箱
 *      自动装箱
 *          自动将基本数据类型转换成包装类类型
 *
 *      拆箱
 *           将包装类转换称基本数据类型
 *
 * 3、整形/字符型的缓存处理
 *
 *
 * @Date:Created in 4:52 PM 2020/5/11
 */
public class TestWrapperClass {


    public static void main(String[] args) {
        TestWrapperClass test = new TestWrapperClass();
        test.testInterOrCharCache();
    }


    /**
     *练习基本类习和包装类之间的转换
     */
    public void testWrapperClass(){

        /**
         * 自动将基本类型装箱成包装类
         * 底层是：
         *  调用了vauleof方法
         */

        Integer a = 1;

        Integer b = Integer.valueOf(2); //和上面的操作结果一致

        Character c = 'A';


        /**
         * 拆箱
         *  不同类型的基本数据，调用不同的拆箱方法
         *
         */

        int aa = a.intValue();

        char bb = c.charValue();

    }


    /**
     * 练习包装类-Interger和Character
     * Interger类中vauleof方法，做范围在-128～127之间的数做了缓存处理，其他范围的的数才回去new一个新的对象
     * public static Integer valueOf(int i) {
     *         if (i >= IntegerCache.low && i <= IntegerCache.high)
     *             return IntegerCache.cache[i + (-IntegerCache.low)];
     *         return new Integer(i);  //不在-128--127之间才会new一个新地址的对象
     *     }
     */
    public  void testInterOrCharCache(){

        Integer a = 13;
        Integer b = 13;

        Integer c = 128;
        Integer d = 128;

        System.out.println(a==b); //true  因为Interger类中vauleof方法，做范围在-128～127之间的数做了缓存处理，其他范围的的数才回去new一个新的对象
        System.out.println(c==d); //false


        System.out.println(a.equals(b));  //true 因为是拿地址内的元素值去比较，所以在对两个对象比较时，需要使用equals进行比值

    }
}
