package pattern.behavioral.visitor;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:32
 * @Description: 访问者模式
 * 封装用于某种数据结构（list/set/map等）中各元素的操作
 * 主要将数据结构与数据操作分离。
 * 场景：
 * 集合包含很多类型对象
 * 数据结构和操作分离
 * 优点：
 * 增加新操作很容易
 * 缺点：
 * 增加新数据结构困难
 * 具体元素变更困难
 */
public interface MyVisitor {
}
