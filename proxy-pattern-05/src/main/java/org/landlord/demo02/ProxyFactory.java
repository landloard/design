package org.landlord.demo02;

import org.landlord.demo01.IuserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: JDK动态代理
 * @author: landlord
 * @date: 2024/12/5 19:45
 */
public class ProxyFactory {

    Object target;

    public ProxyFactory(Object obj) {
        this.target = obj;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), //目标类使用的类加载器
                target.getClass().getInterfaces(), //目标对象实现的接口类型
                new InvocationHandler() { //事件处理器

                    /**
                     * invoke方法参数说明
                     * @param proxy 代理对象
                     * @param method 对应于在代理对象上调用的接口方法Method实例
                     * @param args 代理对象调用接口方法时传递的实际参数
                     * @return: java.lang.Object 返回目标对象方法的返回值,没有返回值就返回null
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开启事务");

                        //执行目标对象方法
                        method.invoke(target, args);
                        System.out.println("提交事务");
                        return null;
                    }
                }
        );

    }
}
