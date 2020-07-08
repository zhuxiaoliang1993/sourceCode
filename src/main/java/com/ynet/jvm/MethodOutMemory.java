package com.ynet.jvm;

import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Opcodes;

/*
 * 元空间内存溢出演示
 * -XX:MaxMetaspaceSize=8m
 * */
public class MethodOutMemory extends ClassLoader { //ClassLoader 用于加载类的二进制字节码文件
    public static void main(String[] args) {
        int j = 0;
        try {
            MethodOutMemory methodOutMemory = new MethodOutMemory();
            for (int i = 0;
                 i < 10000;
                 i++, j++) {
                // 生成类的二进制字节码问价
                ClassWriter cw = new ClassWriter(0);
                // 版本号，public，类名，包名，父类，接口
                cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, "Class" + i, null, "java/lang/Object", null);
                byte[] code = cw.toByteArray();
                // 执行类的加载
                methodOutMemory.defineClass("Class" + i, code, 0, code.length);
            }
        } finally {
            System.out.println(j);
        }
    }
}
