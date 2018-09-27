/*Copyright ©  2018 Lyons. All rights reserved. */
package a002.Factory;

/**
 * @Description: 奥迪汽车工厂类
 * @ClassName: AudiFactory
 * @author: lyons<zhanglei>
 * @date: 2018年3月1日 上午10:29:09
 * @version: [1.0]
 */
public class AudiFactory implements CarFactory
{
    @Override
    public Car createCar()
    {
       return new Audi();
        
    }
    
}
