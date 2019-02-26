package com.x.mode.establish.single;

/**
 * 单例模式：
 *          确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例，这个类称为单例类，它提供全局访问的方法。单例模式是一种对象创建型模式。
 *
 * 单例模式有三个要点：
 *                  一是某个类只能有一个实例；二是它必须自行创建这个实例；三是它必须自行向整个系统提供这个实例
 *
 *  饿汉式单例类在类被加载时就将自己实例化，它的优点在于无须考虑多线程访问问题，可以确保实例的唯一性；
 *  从调用速度和反应时间角度来讲，由于单例对象一开始就得以创建，因此要优于懒汉式单例。
 *  但是无论系统在运行时是否需要使用该单例对象，由于在类加载时该对象就需要创建，因此从资源利用效率角度来讲，
 *  饿汉式单例不及懒汉式单例，而且在系统加载时由于需要创建饿汉式单例对象，加载时间可能会比较长。
 *
 *
 * 懒汉式单例类在第一次使用时创建，无须一直占用系统资源，实现了延迟加载，但是必须处理好多个线程同时访问的问题，
 * 特别是当单例类作为资源控制器，在实例化时必然涉及资源初始化，而资源初始化很有可能耗费大量时间，这意味着出现多线程
 * 同时首次引用此类的机率变得较大，需要通过双重检查锁定等机制进行控制，这将导致系统性能受到一定影响。
 */
public class SingletonTestJava {
    public static void main(String[] args) {
        LoadBalancer balancer1,balancer2,balancer3,balancer4;
        balancer1 = LoadBalancer.getInstance();
        balancer2 = LoadBalancer.getInstance();
        balancer3 = LoadBalancer.getInstance();
        balancer4 = LoadBalancer.getInstance();

        if(balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.printf("负载均衡器具有唯一性！\n");
        }

        balancer1.addServer("Server 1");
        balancer1.addServer("Server 2");
        balancer1.addServer("Server 3");
        balancer1.addServer("Server 4");

        //模拟客户端请求的分发
        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分发请求至服务器： " + server);
        }

    }
}
