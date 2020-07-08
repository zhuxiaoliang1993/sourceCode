package com.ynet.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        // 创建真实对象
        Lenovo lenovo = new Lenovo();
        // 动态代理增强Lenovo对象
        /*
         *  三个参数
         * 1.类加载器：真实对象.getClass().getClassLoader() 与真实对象使用同一个类加载器。
         * 2.接口数组：真实对象.getClass().getInterfaces() 保证相同的接口实现。
         * 3.处理器：
         * */
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {

            /*
             *   代理逻辑编写的方法：代理对象调用的所有方法都会触发该方法的执行
             *   参数：
             *       1.proxy：代理对象
             *       2.method：代理对象调用方法时，被封装为的对象
             *       3.args：代理对象调用方法时，实际传递的参数
             * */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
              /*  System.out.println("该方法执行了......");
                System.out.println(method.getName());*/
                // sale 方法时输出8000 System.out.println(args[0]);
                // 使用真实对象调用该方法

                /*
                *  修改了sale方法的入参且不对show方法做处理
                * */
                if ("sale".equals(method.getName())) {
                    //1.方法参数的增强
                    Double money = (Double) args[0];
                    money = money * 0.85;

                    // 3.方法体增强
                    System.out.println("专车接你。。。。");
                    String obj = (String)method.invoke(lenovo, money);
                    // 3.方法体增强
                    System.out.println("专车送你。。。。。");


                    //2.增强返回值
                    return obj+"_鼠标垫";
                }else {
                    Object obj = method.invoke(lenovo, args);
                    return obj;
                }
            }
        });
        // 代理对象调用方法
        String sale = proxy_lenovo.sale(8000);
        System.out.println(sale);
        proxy_lenovo.show();
    }
}
