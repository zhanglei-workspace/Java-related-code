/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a2二维数组中查找;

public class a21Find {

    // 二维数组matrix中，每一行都从左到右递增排序，
    // 每一列都从上到下递增排序
    public boolean find(int[][] array,int number)
    {
        if (array==null)
        {
            return false;
        }

        int 行=0,列 = array[0].length-1;//第一行 第leng列[0,length] 右上角开始

        while (行 < array.length && 列>=0)
        {
            if(array[行][列]==number)
            {
                return true;
            }
            if(array[行][列] > number)
            {
                列--;
            }else{
                行++;
            }

        }
        return false;
    }
}
