package pattern.behavioral.ChainofResponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:21
 * @Description:
 */
public class ArticleApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotBlank(course.getArticle())) {
            System.out.println("has article");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println("do not has article");
            return;
        }
    }
}
