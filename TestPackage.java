package cn.com.shield.staging.java; //包名一定是位于文件的顶部

//import static cn.com.shield.staging.Java002.TestPackage.TestDiffPackage.*; //导入所有静态属性和方法，直接使用

/**
 * @Author：HanLu
 * @Description:这段代码用于练习Java中包的知识点
 * 1、包的作用
 * 包可用于管理多个类文件
 *
 * 2、包的命名规则
 * 项目域名倒着写+项目名，中间用.隔开，每一个字段在PC上都是以一个文件夹存在
 *
 * 3、同一个包下类文件属性和方法、不同包下属性和方法引用
 *
 * 4、静态属性和静态方法的引用
 *
 * 5、java中自带的包
 * java.lang java.util java.net java.io java.awt
 *
 * @Date:Created in 7:37 AM 2020/4/14
 */
public class TestPackage {
    public static void main(String[] args) {

        //1、调用同一个包下其他类文件中属性和方法
        TestObjThis testObjThis = new TestObjThis();
        /**
         *  1、同一个包下类文件之间的公开的属性和方法直接可以调用不需要导入
         *  2、TestObjThis类下test001方法是default封装，同一个包下其他类可以直接使用
         */
        testObjThis.test001(45,"hanlu");


        //2、调用不同包下其他类文件公开的属性和方法
        /**
         * 1、不同包下类文件之间互相引用公开的属性和方法，需要使用import导入包.具体类名
         * import cn.com.shield.staging.Java002.TestPackage.TestDiffPackage;
         */
        TestDiffPackage testDiffPackage = new TestDiffPackage("Lwt",45);
        testDiffPackage.test002();

        //3、导入不同包下其他类的静态属性和方法
        /**
         * 1、不同包类文件使用静态属性和方法，需要将所有的静态内容全部导入后，可直接使用不需要new对象
         * import static cn.com.shield.staging.Java002.TestPackage.TestDiffPackage.*;
         * Java002.TestDiffPackage类中方法实现如下
         * public static void test003(){
         *         System.out.println("height is "+height);
         *     }
         */
       // test003();


    }

    /**
     * @Author：HanLu
     * @Description:这是另外一个包，我需要测试不同包下类文件之间的调用
     * @Date:Created in 7:52 AM 2020/4/14
     */
    public static class TestDiffPackage {
        String name;
        int age;
        static int height = 160;

        public TestDiffPackage(String name,int age){
            this.name = name;
            this.age = age;
        }

        public void test002(){
            System.out.println("name is "+ name);
            System.out.println("age is "+ age);
        }

        public static void test003(){
            System.out.println("height is "+height);
        }

    }
}
