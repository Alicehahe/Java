package Java;

/**
 * @Author：HanLu
 * @Description:用于练习类、对象的初始化练习
 * 1、静态初始化块--用于类的初始化
 * 2、构造方法-用于对象初始化
 * @Date:Created in 2:44 PM 2020/4/9
 */
public class TestObjChuShiHua {

    //静态初始化块--用于类的初始化
    static {
        System.out.println("现在在初始化类");
    }

    //构造方法-用于对象初始化
    TestObjChuShiHua(){
        System.out.println("现在在初始化对象");
    }

    public static void main(String[] args) {
        TestObjChuShiHua test001 = new TestObjChuShiHua();
    }
}
