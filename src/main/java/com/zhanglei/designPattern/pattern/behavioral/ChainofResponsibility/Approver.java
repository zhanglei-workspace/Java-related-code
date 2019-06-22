package pattern.behavioral.ChainofResponsibility;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:18
 * @Description:
 */
public abstract class Approver {
    //关键
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
