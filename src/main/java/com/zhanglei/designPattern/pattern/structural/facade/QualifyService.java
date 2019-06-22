package pattern.structural.facade;

/**
 * Created by geely
 * 角色：子系统（Subsystem）
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+" 积分资格通过,库存通过");
        return true;
    }
}
