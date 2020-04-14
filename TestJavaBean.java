package cn.com.shield.staging.java.Java;

/**
 * @Author：HanLu
 * @Description:练习java封装的Bena规则
 * @Date:Created in 12:18 PM 2020/4/14
 */
public class TestJavaBean {

    //1、属性私有
    private int age;
    private String name;
    private boolean result;


    /**
     * 通过set、get方法来修改和或者属性的值
     * @param age
     */
    public void setAge(int age){
        if (age > 18){
            System.out.println("成年人可进去");
            this.age = age;
        }else {
            System.out.println("不可进去，未成年");
        }
    }

    public int getAge(){
        return age;
    }

    public void setResult(boolean result){
        if (result == true){
            System.out.println("你赢了");
            this.result = result;
        }else {
            System.out.println("对不起，你输了");
            this.result = result;
        }

    }

    /**
     * boolean获取方法使用is，不要使用get
     * @return
     */
    public boolean isResult(){
        return  result;
    }



    //2、方法公开

    public void test(int age,boolean result){
        setAge(age);
        System.out.println(getAge());

        setResult(result);
        System.out.println(isResult());
    }

    public static void main(String[] args) {
        TestJavaBean test = new TestJavaBean();
        test.test(23,false);
    }
}
