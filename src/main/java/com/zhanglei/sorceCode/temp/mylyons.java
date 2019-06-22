/*Copyright ©  2018 Lyons. All rights reserved. */
package temp;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @Description: TODO
 * @ClassName: mylyons
 * @author: lyons<zhanglei>
 * @date: 2018年2月27日 上午11:21:16
 * @version: [1.0]
 */
@Target(value=ElementType.LOCAL_VARIABLE)
public @interface mylyons
{
    String[] values();
}
