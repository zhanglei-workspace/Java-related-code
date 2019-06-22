/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a7旋转数组的最小数字_;


public class mine {

    public static  Integer minInReversingList(int[] array){

        if (array.length < 2) return array[0];

        int i = 0,j = array.length-1,middle = array.length/2;//两个指针

        while ((j-1)>1){
            if (array[middle] >= array[i]){
                i = middle;
            }else  if (array[middle] <= array[j]){
                j = middle;
            }else {
                i++;
                j--;
            }
            middle = i + (j - i) / 2;
        }

        return array[j];
    }

}
