package pattern.behavioral.ChainofResponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:21
 * @Description:
 */
public class VideoApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotBlank(course.getVideo())) {
            System.out.println("has video");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println("do not has video");
            return;
        }
    }
}
