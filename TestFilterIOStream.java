package cn.com.shield.staging.Java;

import java.io.*;

/**
 * @Author：HanLu
 * @Description:这是练习javaIO中FilterInputStream/FilterOutputStream中使用缓存进行IO读写
 * 缓存读写是在文件读写的基础上建立的，所以要使用文件对象
 *
 * InputStream是抽象类--FilterInputStream是子类，实际使用子类BufferedInputStream/BufferedOnputStream
 *
 * @Date:Created in 3:33 PM 2020/6/3
 */
public class TestFilterIOStream {

    public static void main(String[] args) throws IOException {
        TestFilterIOStream.testBufferIOStream("/Users/qingjiao/Desktop/test.mp4","/Users/qingjiao/Desktop/test_new.mp4");
    }


    public static void testBufferIOStream(String readPath,String writePath) throws IOException {

        //声明一个文件读入对象
        FileInputStream fis = null;

        //声明一个缓存文件读入对象
        BufferedInputStream bis = null;

        //声明一个文件写入对象
        FileOutputStream fos = null;


        //声明一个缓存文件写入对象
        BufferedOutputStream bos = null;

        //声明一个byte数组存储数据
        byte[] content = new byte[1024];

        try {

            fis = new FileInputStream(readPath);
            //传入一个文件对象作为参数
            bis = new BufferedInputStream(fis);

            fos = new FileOutputStream(writePath);
            //传入一个文件对象作为参数
            bos = new BufferedOutputStream(fos);

            //使用带有缓存的文件对象去读文件
            while ((bis.read(content)>-1)){

                //使用带有缓存的文件对象去写文件
                bos.write(content,0,content.length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
