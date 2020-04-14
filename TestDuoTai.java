package cn.com.shield.staging.java.Java;

/**
 * @Author：HanLu
 * @Description:练习类的多态
 * 1、多态的使用条件
 * 存在继承
 * 存在方法的重写
 * 存在父类的引用指向子类对象的地址
 *
 * 2、类型的转换
 * 自动向上类型转换
 * 强制向下类型转换
 *
 * @Date:Created in 12:37 PM 2020/4/14
 */
public class TestDuoTai {

    public static void test(Mobile mobile){ //方法中定义是父类的类型
        mobile.mobileVoice();
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        TestDuoTai.test(mobile); //1、父类的引用指向子类对象地址，产生多态，可以减少方法定义时代码量

        Inphone inphone = new Inphone();
        TestDuoTai.test(inphone);

        HuaWei huaWei = new HuaWei();
        TestDuoTai.test(huaWei);

        /**
         * 1、类型转换
         */
        Mobile mobile_inphone = new Inphone();
        TestDuoTai.test(mobile_inphone); //自动类型转换，将mobile类型转成Inphone

        ((Inphone) mobile_inphone).MobileOs(); //强制类型转换，当调用没有重写的方法，必须转成对应类的类型

        Mobile mobile_huawei = new HuaWei();
        TestDuoTai.test(mobile_huawei);

        ((HuaWei) mobile_huawei).HuaWeiCamera();//强制类型转换，当调用没有重写的方法，必须转成对应类的类型

    }

}


class Mobile{
    private String  mobileModel;
    private int memorySize;

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void mobileVoice(){
        System.out.println("手机的铃声...");
    }
}

class Inphone extends Mobile{

    @Override
    public void mobileVoice(){
        System.out.println("苹果专属手机铃声");
    }

    public void MobileOs(){
        System.out.println("Inphone.MobileOs");
    }
}

class HuaWei extends Mobile{

    @Override
    public void mobileVoice(){
        System.out.println("华为专属国产铃声");
    }

    public void HuaWeiCamera(){
        System.out.println("HuaWei.HuaWeiCamera");
    }
}
