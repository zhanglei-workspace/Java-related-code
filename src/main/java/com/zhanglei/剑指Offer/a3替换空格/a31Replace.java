/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a3替换空格;

public class a31Replace {

    // 二维数组matrix中，每一行都从左到右递增排序，
    // 每一列都从上到下递增排序
    public static String replace(String str)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                sb.append("%20");
            }else {
                sb.append(str.charAt(i));
            }
        }

        return  new String(sb);
    }
}
