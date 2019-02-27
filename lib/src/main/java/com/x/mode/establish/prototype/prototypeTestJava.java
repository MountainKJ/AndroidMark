package com.x.mode.establish.prototype;

import com.x.mode.establish.prototype.manager.OfficialDocument;
import com.x.mode.establish.prototype.manager.PrototypeManager;

/**
 * 1.浅克隆
 *          在浅克隆中，如果原型对象的成员变量是值类型，将复制一份给克隆对象；如果原型对象的成员变量是引用类型，则将引用对象的地址复制一份给克隆对象，
 *          也就是说原型对象和克隆对象的成员变量指向相同的内存地址。简单来说，在浅克隆中，当对象被复制时只复制它本身和其中包含的值类型的成员变量，
 *          而引用类型的成员对象并没有复制【覆盖Object类的clone()方法可以实现浅克隆】
 *
 * 2.深克隆
 *          在深克隆中，无论原型对象的成员变量是值类型还是引用类型，都将复制一份给克隆对象，深克隆将原型对象的所有引用对象也复制一份给克隆对象。
 *          简单来说，在深克隆中，除了对象本身被复制外，对象所包含的所有成员变量也将复制
 *
 *          实现深克隆，可以通过序列化(Serialization)等方式来实现。
 *                      序列化就是将对象写到流的过程，写到流中的对象是原有对象的一个拷贝，而原对象仍然存在于内存中。
 *                      通过序列化实现的拷贝不仅可以复制对象本身，而且可以复制其引用的成员对象，因此通过序列化将对象写到一个流中，再从流里将其读出来，可以实现深克隆。
 *
 *
 * 原型模式的主要优点如下：
 * (1) 当创建新的对象实例较为复杂时，使用原型模式可以简化对象的创建过程，通过复制一个已有实例可以提高新实例的创建效率。
 * (2) 扩展性较好，由于在原型模式中提供了抽象原型类，在客户端可以针对抽象原型类进行编程，而将具体原型类写在配置文件中，增加或减少产品类对原有系统都没有任何影响。
 * (3) 原型模式提供了简化的创建结构，工厂方法模式常常需要有一个与产品类等级结构相同的工厂等级结构，而原型模式就不需要这样，原型模式中产品的复制是通过封装在原型类中的克隆方法实现的，无须专门的工厂类来创建产品。
 * (4) 可以使用深克隆的方式保存对象的状态，使用原型模式将对象复制一份并将其状态保存起来，以便在需要的时候使用（如恢复到某一历史状态），可辅助实现撤销操作。
 * 2.主要缺点
 * 原型模式的主要缺点如下：
 * (1) 需要为每一个类配备一个克隆方法，而且该克隆方法位于一个类的内部，当对已有的类进行改造时，需要修改源代码，违背了“开闭原则”。
 * (2) 在实现深克隆时需要编写较为复杂的代码，而且当对象之间存在多重的嵌套引用时，为了实现深克隆，每一层对象对应的类都必须支持深克隆，实现起来可能会比较麻烦。
 * 3.适用场景 在以下情况下可以考虑使用原型模式：
 * (1) 创建新对象成本较大（如初始化需要占用较长的时间，占用太多的CPU资源或网络资源），新的对象可以通过原型模式对已有对象进行复制来获得，如果是相似对象，则可以对其成员变量稍作修改。
 * (2) 如果系统要保存对象的状态，而对象的状态变化很小，或者对象本身占用内存较少时，可以使用原型模式配合备忘录模式来实现。
 * (3) 需要避免使用分层次的工厂类来创建分层次的对象，并且类的实例对象只有一个或很少的几个组合状态，通过复制原型对象得到新实例可能比使用构造函数创建一个新实例更加方便。
 *
 */
public class prototypeTestJava {
    public static void main(String[] args) {
//        WeeklyLog log_previous = new WeeklyLog();
//        log_previous.setName("张无忌");
//        log_previous.setDate("第12周");
//        log_previous.setContent("这周工作比较忙，每天嗨森！");
//        Attachment attachment = new Attachment();
//        log_previous.setAttachment(attachment);
//
//        System.out.println("****周报****");
//        System.out.println("周次："+log_previous.getDate());
//        System.out.println("姓名："+log_previous.getName());
//        System.out.println("内容："+log_previous.getContent());
//        System.out.println("-------------------------------");
//
//        WeeklyLog log_new = null;
////        log_new = log_previous.clone(); // 浅克隆
//        try {
//            log_new = log_previous.deepClone();
//        }catch (Exception e) {
//            System.out.println("克隆失败");
//        }
//        if(log_new == null)
//            return;
//        log_new.setDate("第13周");
//        System.out.println("****周报****");
//        System.out.println("周次："+log_new.getDate());
//        System.out.println("姓名："+log_new.getName());
//        System.out.println("内容："+log_new.getContent());
//        System.out.println("-------------------------------");
//
//        System.out.println(log_previous == log_new);
//        System.out.println(log_previous.getAttachment() == log_new.getAttachment());

        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        OfficialDocument doc1,doc2,doc3,doc4;

        doc1 = pm.getOfficialDocument("far");
        doc1.disPlay();

        doc2 = pm.getOfficialDocument("far");
        doc2.disPlay();

        System.out.println(doc1 == doc2);

        doc3 = pm.getOfficialDocument("srs");
        doc3.disPlay();

        doc4 = pm.getOfficialDocument("srs");
        doc4.disPlay();

        System.out.println(doc3 == doc4);
    }
}
