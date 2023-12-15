package com.hsuhau.medium.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 31. 下一个排列
 * 实现获取 下一个排列 的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列（即，组合出下一个更大的整数）。
 * <p>
 * 如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
 * <p>
 * 必须 原地 修改，只允许使用额外常数空间。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[1,3,2]
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,1]
 * 输出：[1,2,3]
 * 示例 3：
 * <p>
 * 输入：nums = [1,1,5]
 * 输出：[1,5,1]
 * 示例 4：
 * <p>
 * 输入：nums = [1]
 * 输出：[1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 100
 */
public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        boolean biggest = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                biggest = false;
                break;
            }
        }
        if (biggest) {
            for (int i = 0; i < nums.length / 2; i++) {
                int temp = nums[nums.length - i - 1];
                nums[nums.length - i - 1] = nums[i];
                nums[i] = temp;
            }
        } else {
            // 低位的位次会递增，个、十、百、千、万，直至循环结束
            flag:
            for (int i = 0; i < nums.length; i++) {

                int less = 0;
                int equal = 0;
                int more = 0;

                // 如果高一位比低位小，则调换位置
                int i_val = nums[nums.length - i - 1];

                for (int j = i + 1; j < nums.length; j++) {
                    int j_val = nums[nums.length - j - 1];

                    if (j_val < i_val) {
                        less++;
                        if (less > 0 && more == 0) {
                            int j_right_val = nums[nums.length - j];
                            if (nums.length - j - 2 < 0) {
                                // todo j在最左侧
                                if (i > 0) {
                                    int i_right_val = nums[nums.length - i];
                                    //
                                    if (i_val > i_right_val) {
                                        int temp = nums[nums.length - j - 1];
                                        int num = nums[nums.length - i - 1];
                                        nums[nums.length - j - 1] = nums[nums.length - i - 1];
                                        nums[nums.length - i - 1] = temp;

                                        // todo i右侧数据进行递增排序
//                                小右侧的数组
                                        List<Integer> list = new ArrayList<>();
                                        for (int k = i; k >= 0; k--) {
                                            list.add(nums[nums.length - k - 1]);
                                        }
                                        Object[] objects = list.stream().sorted().toArray();

                                        System.out.println("Arrays.toString(objects) = " + Arrays.toString(objects));

                                        // 小右侧的数组替换为排序后的数组

                                        for (int k = j, index = 0; k > 0; k--, index++) {
                                            nums[nums.length - k] = (int) objects[index];
                                        }

                                    }
                                    // i j 交换位置
                                    else if (i_val == i_right_val) {
                                        int temp = nums[nums.length - j - 1];
                                        nums[nums.length - j - 1] = nums[nums.length - i - 1];
                                        nums[nums.length - i - 1] = temp;
                                    }
                                } // i j 交换位置
                                else {
                                    int temp = nums[nums.length - j - 1];
                                    nums[nums.length - j - 1] = nums[nums.length - i - 1];
                                    nums[nums.length - i - 1] = temp;
                                }
                                break flag;
                            }
                            int j_left_val = nums[nums.length - j - 2];

                            // todo 小中大，中 与 大 交换位置
                            // 1,2,3,3;     1,3,2,3
                            if (j_right_val > j_val && j_val > j_left_val) {
                                int temp = nums[nums.length - j - 1];
                                nums[nums.length - j - 1] = nums[nums.length - j];
                                nums[nums.length - j] = temp;
                                System.out.println("小中大大 ，中 与 较高位的大 交换位置");
                            }

                            // todo 中小大 中 与 大 交换位置
                            else if (j_val < j_left_val && j_left_val < j_right_val) {
                                int temp = nums[nums.length - j - 1];
                                nums[nums.length - j - 1] = nums[nums.length - j];
                                nums[nums.length - j] = temp;
                                System.out.println("中小大大 中 与 较高位的大 交换位置");
                            }
                            // todo 大小中中 j 与 j_right 交换位置
                            else if (j_left_val > j_right_val && j_right_val > j_val) {
                                int temp = nums[nums.length - j];
                                nums[nums.length - j] = nums[nums.length - j - 1];
                                nums[nums.length - j - 1] = temp;
                                System.out.println("大小中中 j 与 j_right 交换位置");
                            }
                            // todo 中中大大 较低位的中和较高位的大 交换位置
                            else if (j_left_val == j_val && j_val < j_right_val) {
                                int temp = nums[nums.length - j];
                                nums[nums.length - j] = nums[nums.length - j - 1];
                                nums[nums.length - j - 1] = temp;
                                System.out.println("中中大大 较低位的中和较高位的大 交换位置");
                            } else {
                                System.out.println("interesting_condition");
                            }

                            // todo 右侧最小 j_right_val 最右侧数据 交换位置
                            if (nums[nums.length - j] > nums[nums.length - 1]) {
                                int temp = nums[nums.length - j];
                                nums[nums.length - j] = nums[nums.length - 1];
                                nums[nums.length - 1] = temp;
                                System.out.println("右侧最小 j_right_val 最右侧数据 交换位置");
                            }

                            break flag;
                        }
                        // todo 小大中 ，中 与 小 交换位置，大和 个位交换位置
                        // 1，3,2,2;    2,1,2,3
                        // 2,1,3,2
                        else if (less > 0 && more > 0) {

                            if (more == 1) {
                                // 小
                                int temp = nums[nums.length - j - 1];
                                nums[nums.length - j - 1] = nums[nums.length - i - 1];
                                nums[nums.length - i - 1] = temp;

                                // j右侧数字按照从小到大的顺序排序

                                System.out.println("小大中 ，中 与 小 交换位置 ,小 右侧递增排序");

//                                小右侧的数组
                                List<Integer> list = new ArrayList<>();
                                for (int k = j; k > 0; k--) {
                                    list.add(nums[nums.length - k]);
                                }
                                Object[] objects = list.stream().sorted().toArray();

                                System.out.println("Arrays.toString(objects) = " + Arrays.toString(objects));

                                // 小右侧的数组替换为排序后的数组

                                for (int k = j, index = 0; k > 0; k--, index++) {
                                    nums[nums.length - k] = (int) objects[index];
                                }
                                break flag;
                            } else {
                                // 如果i左侧存在多个大于
                            }


                        }
                        // todo 中大小小
                        else if (less == 0) {
                            System.out.println("中大小小");
                        }
                    } else if (j_val > i_val) {
                        more++;
                    } else {
                        equal++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        nextPermutation(new int[]{2, 2, 7, 5, 4, 3, 2, 2, 1});
    }
}