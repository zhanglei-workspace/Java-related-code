package pattern.behavioral.ChainofResponsibility;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:11
 * @Description: 责任链模式
 * 为请求创建一个接收此次请求对象的链
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 * 行为型模式。
 * 场景：
 * 一个请求的处理需要多个对象当中的一个或几个协作处理
 * 优点：
 * 请求发送者和接受者解耦
 * 责任链可以动态组合
 * 缺点：
 * 链太长可能耗时
 * 可能过多
 */
public interface MyChainOfResponsibility {
}
