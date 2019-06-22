package pattern.behavioral.ChainofResponsibility;

/**
 * @Author: suxun
 * @Date: 2018/12/9 18:20
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        int a = 3,b = 51;

        //交换两个数
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a="+a);
        System.out.println("b="+b);

        //判断奇偶
        if((a & 1) == 1){
            System.out.println("a是一个奇数");
        }
        

        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 4};
        System.out.println(find(arr));


    }
    //找出唯一不重复的数
    static int find(int[] arr){
        int tmp = arr[0];
        for(int i = 1;i < arr.length; i++){
            tmp = tmp ^ arr[i]; //做异或操作
        }
        return tmp;
    }
}
