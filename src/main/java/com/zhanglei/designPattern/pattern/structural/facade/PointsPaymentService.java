package pattern.structural.facade;

/**
 * Created by geely
 * 角色：子系统（Subsystem）
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+" 积分成功");
        return true;
    }

}
