/**
 * @Description: TODO
 * @Auther: zhanglei
 * @Date: 2019/6/12 18:59
 */
package a7旋转数组的最小数字_;


public class A71MinInReversingList<T> {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾， 我们称之数组的旋转。
     * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
     * 例如数组{3, 4, 5, 1, 2｝为｛l ,2, 3, 4, 5}的一个旋转，该数组的最小值为
     *
     * @param numbers 旋转数组
     * @return 数组的最小值
     */
    public static int min(int[] numbers) {
        // 判断输入是否合法
        if (numbers == null || numbers.length == 0) {
            throw new RuntimeException("Invalid input.");
        }

        // 开始处理的第一个位置
        int i = 0;
        // 开始处理的最后一个位置
        int j = numbers.length - 1;
        // 设置初始值
        int init = i;

        // 确保i在前一个排好序的部分，j在排好序的后一个部分
        while (numbers[i] >= numbers[j]) {
            // 当处理范围只有两个数据时，返回后一个结果
            // 因为numbers[i] >= numbers[j]总是成立，后一个结果对应的是最小的值
            if (j - i == 1) {
                return numbers[j];
            }

            // 取中间的位置
            init = i + (j - i) / 2;

            // 如果三个数都相等，则需要进行顺序处理，从头到尾找最小的值
            if (numbers[init] == numbers[i] && numbers[j] == numbers[init]) {
                return minInorder(numbers, i, j);
            }

            // 如果中间位置对应的值在前一个排好序的部分，将i设置为新的处理位置
            if (numbers[init] >= numbers[i]) {
                i = init;
            }
            // 如果中间位置对应的值在后一个排好序的部分，将j设置为新的处理位置
            else if (numbers[init] <= numbers[j]) {
                j = init;
            }
        }

        // 返回最终的处理结果
        return numbers[init];
    }

    /**
     * 找数组中的最小值
     *
     * @param numbers 数组
     * @param start   数组的起始位置
     * @param end     数组的结束位置
     * @return 找到的最小的数
     */
    public static int minInorder(int[] numbers, int start, int end) {
        int result = numbers[start];
        for (int i = start + 1; i <= end; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }



}
