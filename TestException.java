package cn.com.shield.staging.Java;

/**
 * @Author：HanLu
 * @Description:这段代码用于练习java中异常的知识点
 * 1、异常的定义以及异常处理机制的好处、java如何处理异常
 * 定义：
 *  当程序运行时，遇到了我们不可控的问题比如说：用户输入不符合我们规定的要求、代码运行时内存满了、
 * 或者说读取的文件不存在等等这些情况，就是所说的异常，java中叫Exception
 *
 * 异常处理机制好处：
 *  当程序出现错误时，可以安全的退出，程序不会崩溃
 *
 *
 *java采用面向对象的方式来处理异常
 *1、抛出异常：
 *  当程序遇到异常时，会在发生异常代码处生成一个异常的对象，停止当前执行路径，提交给JRE
 *2、捕获异常
 *  当JRE得到该异常后，寻找相应的代码来处理异常
 *
 *
 * 2、Java中异常的分类
 *java中所有的异常都是派生于Throwable类，有两个子类
 *
 * Error(unchecked Exception)  Expection(checked Exception RuntimeException)
 *
 * 3、不同分类如何进行处理
 * Error类型错误，表示JVM虚拟机发生故障，这类重启即可，我们无法控制
 * Expection-RuntimeException
     * 表示运行时错误，这类异常只能人为的加上逻辑校验
     * NullPointerException
     * ArithmeticException
     * ClassCastException
     * ArrayIndexOutOfBoundsException
     * NumberFormatException等等，需要我们人为加入逻辑校验
 *Expection-CheckedException
 *表示编译时错误，必须在编译时进行处理，否则无法编译通过
 *
 * 4、对编译时异常两种处理方式(try...catch..finally、throws)
 *
 *
 * @Date:Created in 4:52 PM 2020/4/22
 */
public class TestException {
    int a=0;
    int b =2;
    int c;
    String[] name = {"123","456"};


    //1、在方法定义处使用throws关键字表示该方法可能会出现的异常情况
    public String test() throws ArrayIndexOutOfBoundsException{
            return name[2];
    }

    public static void main(String[] args) {
        TestException test = new TestException();
        try {
            test.c = test.b/test.a;
        }catch (ArithmeticException e){
            System.out.println("TestException.main");
        }

    //2、在调用时进行捕获处理
    try {
        String result = test.test();
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("e = " + e);
    }finally {
        System.out.println("运行结束");
    }


    }
}
