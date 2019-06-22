package pattern.behavioral.state;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:43
 * @Description: 状态模式
 * 允许对象在内部状态发生改变时改变它的行为，对象看起来好像修改了它的类。
 * 允许对象在其内部状态改变时，改变行为
 * 场景：
 * 一个对象有多个状态，且状态可以互相转换
 * 优点：
 * 状态隔离
 * 转换逻辑分到state子类中，减少依赖
 * 增加新状态简单
 * 缺点：
 * 复杂
 */
public interface MyState {
}
