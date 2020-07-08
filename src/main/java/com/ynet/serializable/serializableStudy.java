package com.ynet.serializable;

import org.junit.Test;

import java.io.*;

/*
 *java 序列化是指把java对象转换为字节序列的过程
 *java 反序列化是指把字节序列转换为对象的过程
 * java 支持序列化的两种方式
 * 1.实现Serializable接口  作用 标识一个类的对象是否可以序列化 实现了该接口就可以序列化
 *   SerialVersionUID作用：java序列化的机制是通过运行是判断类的SerialVersionUID来判断版本的一致性。
 *   在进行反序列化时，jvm会把传过来的字节流中的SerialVersionUID与本地相应实体类中的SerialVersionUID进行比较
 *   如果相同认为是一致的，可以进行反序列化，不同则报InvalidCastException异常。
 * SerialVersionUID的产生
 *    a.添加默认值，即1L；
 *    b.添加自动产生的值；
 *    c.通过@SuppressWarings 批注取消特定代码段中的警告。
 *  不希望某个字段被序列化，只需在定义字段时使用关键字transient
 * 2.实现Externalizable接口
 * */
public class serializableStudy {
    /*
     * 实现Serializable接口的序列化
     * */
    @Test
    public void serializableType() throws IOException {
        UserInfo info = new UserInfo("小明1","55555");
        String fileName = "info_serializable.txt";
        System.out.println("Serialize object");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(info);
        oos.close();
    }

    /*
     * 实现Serializable接口的返序列化
     * */
    @Test
    public  void disSerializableType() throws IOException, ClassNotFoundException {
        String fileName = "info_serializable.txt";
        System.out.println("disSerialize object");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        UserInfo info = (UserInfo)ois.readObject();
        System.out.println("username:" + info.getUsername());
        System.out.println("password:" + info.getPassword());
    }

    /*
     * 实现Externalizable接口的序列化
     * */
    @Test
    public void externalizableType() throws IOException {
        UserInfoExter info = new UserInfoExter("小明6","55555");
        String fileName = "info_Externalizable.txt";
        System.out.println("Serialize object");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(info);
        oos.close();
    }
    /*
    * 实现Externalizable接口的反序列化
    * */
    @Test
    public void disExternalizableType() throws IOException, ClassNotFoundException {
        String fileName = "info_Externalizable.txt";
        System.out.println("Disserialize object");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        UserInfoExter info = (UserInfoExter) ois.readObject();
        System.out.print(info.getUsername());
        System.out.print(info.getPassword());
    }
}
