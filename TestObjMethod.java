package Java;

/**
 * @Author：HanLu
 * @Description:这个文件用于练习类的方法一些知识点(构造方法、方法传值机制-基本数据类型、引用数据类型)
 * @Date:Created in 2:08 PM 2020/4/9
 */
public class TestObjMethod {

    String name;
    String passWord;
    String mobile;

    Study studyTool;

    static int a = 5;
    static int b = 6;


    //自定义了有参数的构造方法，默认的无参构造方法如果想要调用，必须写出来
    TestObjMethod(){

    }

    //带参数的构造方法，初始化对象时，已执行
    TestObjMethod(String name,String passWord){
        this.name = name;
        this.passWord = passWord;
    }


    //构造方法重载
    TestObjMethod(String mobile,String name,String passWord){
        this(name,passWord);
        this.mobile = mobile;
    }



    void login(){
        System.out.println(this.mobile);
        System.out.println(this.name);
        System.out.println(this.passWord);
    }


    //自定义成员方法
    /**
     * 方法参数传值：
     * 1、传递的是引用类型时
     * 是将实例后对象的地址传递过去，如果通过对象地址改变了内部的值，那么原来的值也别更着改变了
     * @param studyTool
     */
    void study(Study studyTool){
        System.out.println("我学习通过工具：" + studyTool.toolName);
    }


    public static void main(String[] args) {



        //1、默认构造方法调用，初始化对象method001
        TestObjMethod method001 = new TestObjMethod();
        method001.login();
        System.out.println("=======================");

        //2、重载构造方法调用，初始化对象method002
        TestObjMethod method002 = new TestObjMethod("HanLu","021305Han");
        method002.login();
        System.out.println("=======================");

        //2、重载构造方法调用，初始化对象method003
        TestObjMethod method003 = new TestObjMethod("HanLu","18951510356","021305Han");
        method003.login();

        //创建第二个类的对象，并给属性赋值
        Study studyTool001 = new Study();
        studyTool001.toolName = "Bilibili";


        //将创建对象的内存地址值作为形参
        method003.study(studyTool001);


        TestObj testObj = new TestObj();
        testObj.add(a,b); //1、这里是a变量里面的值5传递，并没有改变a变量的值内容
        System.out.println(a); //方法中对局部变量a进行操作，但是成员变量值未变，更加证明这一点
        System.out.println(b);



    }

}

class Study{

    String toolName;

}

class TestObj {


    /**
     * 方法传值机制：
     * 2、基本数据类型传递
     * 传递是变量指向的值，而不是变量，所以原来a、b变量的值不会改变，改变的是局部变量的值
     * @param a
     * @param b
     */
    public void add(int a, int b) {
        int sum = 0;
        a += 1;
        b += 1;
        sum += a + b;
        System.out.println("a + b = " + sum);
    }

}
