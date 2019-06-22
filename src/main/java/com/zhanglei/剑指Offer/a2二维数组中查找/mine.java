/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 19:16
 */
package a2二维数组中查找;

public class mine {


    public static boolean find(int[][] array,int number){

        int 列 = array[0].length -1,行 = 0;

        while (行 < array.length && 列 >=0){
            if (array[行][列] == number){
                return true;
            }
            if (number < array[行][列]){
                列--;
            }else {
                行++;
            }
        }

return false;
    }
}
