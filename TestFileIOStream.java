package cn.com.shield.staging.Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author：HanLu
 * @Description:这是练习javaIO中字节流中FileInputStream/FileOutputStream的使用，对二进制文件进行读入、写出操作
 * @Date:Created in 3:09 PM 2020/6/3
 */
public class TestFileIOStream {

    public static void main(String[] args) throws IOException {
        TestFileIOStream.testFileIO();
    }

    /**
     * 使用字节流中FileInputStream/FileOutputStream类对文件进行读入、写出操作
     *
     * 读入完成标志：
     * read()返回值为-1时，表示文件读取完成
     *
     * 写出标志：
     * write(),将数组内容写入一个新的文件对象
     * @throws IOException
     */
    public static void testFileIO() throws IOException {
        //new一个文件读取对象
        FileInputStream fis = new FileInputStream("/Users/qingjiao/Desktop/test.txt");

        //new一个文件写入对象
        FileOutputStream fio = new FileOutputStream("/Users/qingjiao/Desktop/test_new.txt");

        //将文件内容读入java中一个byte[]数组中
        byte[] content = new byte[1024];

        //判断文件指针读取内容是否到达结尾，结尾标志为-1，将byte数组转为字符串
        while ((fis.read(content)>-1)){
            System.out.println(new String(content));

            //将读取到的内容写入一个新的文件对象,即复制一个新文件
            fio.write(content,0,content.length);
        }

    }
}
