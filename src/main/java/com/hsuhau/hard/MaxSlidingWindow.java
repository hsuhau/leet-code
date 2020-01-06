package com.hsuhau.hard;

import java.util.ArrayDeque;

/**
 * 239. 滑动窗口最大值
 * <p>
 * 相关标签：堆，滑动窗口
 * <p>
 * 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * 返回滑动窗口中的最大值。
 * <p>
 * 示例:
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 * <p>
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 * <p>
 * 提示：
 * 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
 * <p>
 * 进阶：
 * 你能在线性时间复杂度内解决此题吗？
 */
public class MaxSlidingWindow {
    /**
     * 暴力解法
     * <p>
     * 直觉
     * <p>
     * 最简单直接的方法是遍历每个滑动窗口，找到每个窗口的最大值。一共有 N - k + 1 个滑动窗口，
     * 每个有 k 个元素，于是算法的时间复杂度为 {O}(N k)O(Nk)，表现较差。
     *
     * @param nums 给定数组
     * @param k    滑动窗口大小
     * @return 滑动窗口中的最大值
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len * k == 0) {
            return new int[0];
        }
        int[] output = new int[len - k + 1];
        for (int i = 0; i < output.length; i++) {
            int max = Integer.MIN_VALUE;
            max = Math.max(max, nums[i]);
            output[i] = max;
        }
        return output;
    }

    ArrayDeque<Integer> deque = new ArrayDeque<>();
    int[] nums;

    /**
     * 方法二：双向队列
     * 直觉
     * <p>
     * 如何优化时间复杂度呢？首先想到的是使用堆，因为在最大堆中 heap[0] 永远是最大的元素。在大小为 k 的堆中插入一个元素消耗 \log(k)log(k) 时间，因此算法的时间复杂度为 {O}(N \log(k))O(Nlog(k))。
     * <p>
     * 能否得到只要 {O}(N)O(N) 的算法？
     * <p>
     * 我们可以使用双向队列，该数据结构可以从两端以常数时间压入/弹出元素。
     * <p>
     * 存储双向队列的索引比存储元素更方便，因为两者都能在数组解析中使用。
     * <p>
     * 算法
     * <p>
     * 算法非常直截了当：
     * <p>
     * 处理前 k 个元素，初始化双向队列。
     * <p>
     * 遍历整个数组。在每一步 :
     * <p>
     * 清理双向队列 :
     * <p>
     * - 只保留当前滑动窗口中有的元素的索引。
     * <p>
     * - 移除比当前元素小的所有元素，它们不可能是最大的。
     * 将当前元素添加到双向队列中。
     * 将 deque[0] 添加到输出中。
     * 返回输出数组。
     *
     * @param nums 给定数组
     * @param k    滑动窗口大小
     * @return 滑动窗口中的最大值
     */
    public int[] maxSlidingWindow0(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }

        // init deque and output
        this.nums = nums;
        int maxIdx = 0;
        for (int i = 0; i < k; i++) {
            cleanDeque(i, k);
            deque.addLast(i);
            // compute max in nums[k]
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }
        int[] output = new int[n - k + 1];
        output[0] = nums[maxIdx];

        // build output
        for (int i = k; i < n; i++) {
            cleanDeque(i, k);
            deque.addLast(i);
            output[i - k + 1] = nums[deque.getFirst()];
        }
        return output;
    }

    public void cleanDeque(int i, int k) {
        // remove indexes of elements not from sliding window
        if (!deque.isEmpty() && deque.getFirst() == i - k) {
            deque.removeFirst();
        }

        // remove from deque indexes of all elements
        // which are smaller than current element nums[i]
        while (!deque.isEmpty() && nums[i] > nums[deque.getLast()]) {
            deque.removeLast();
        }
    }

    /**
     * 方法三: 动态规划
     * 直觉
     * <p>
     * 这是另一个 {O}(N)O(N) 的算法。本算法的优点是不需要使用 数组 / 列表 之外的任何数据结构。
     * <p>
     * 算法的思想是将输入数组分割成有 k 个元素的块。
     * 若 n % k != 0，则最后一块的元素个数可能更少。
     * <p>
     * <p>
     * <p>
     * 开头元素为 i ，结尾元素为 j 的当前滑动窗口可能在一个块内，也可能在两个块中。
     * <p>
     * <p>
     * <p>
     * 情况 1 比较简单。 建立数组 left， 其中 left[j] 是从块的开始到下标 j 最大的元素，方向 左->右。
     * <p>
     * <p>
     * <p>
     * 为了处理更复杂的情况 2，我们需要数组 right，其中 right[j] 是从块的结尾到下标 j 最大的元素，方向 右->左。right 数组和 left 除了方向不同以外基本一致。
     * <p>
     * <p>
     * <p>
     * 两数组一起可以提供两个块内元素的全部信息。考虑从下标 i 到下标 j的滑动窗口。 根据定义，right[i] 是左侧块内的最大元素， left[j] 是右侧块内的最大元素。因此滑动窗口中的最大元素为 max(right[i], left[j])。
     * <p>
     * <p>
     * <p>
     * 算法
     * <p>
     * 算法十分直截了当：
     * <p>
     * 从左到右遍历数组，建立数组 left。
     * <p>
     * 从右到左遍历数组，建立数组 right。
     * <p>
     * 建立输出数组 max(right[i], left[i + k - 1])，其中 i 取值范围为 (0, n - k + 1)
     *
     * @param nums 给定数组
     * @param k    滑动窗口大小
     * @return 滑动窗口最大值
     */
    public int[] maxSlidingWindow1(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) {
            return new int[0];
        }
        if (k == 1) {
            return nums;
        }

        int[] left = new int[n];
        left[0] = nums[0];
        int[] right = new int[n];
        right[n - 1] = nums[n - 1];
        for (int i = 1; i < n; i++) {
            // from left to right
            if (i % k == 0) {
                left[i] = nums[i];
            } else {
                left[i] = Math.max(left[i - 1], nums[i]);
            }

            // from right to left
            int j = n - i - 1;
            if ((j + 1) % k == 0) {
                right[j] = nums[j];
            } else {
                right[j] = Math.max(right[j + 1], nums[j]);
            }
        }

        int[] output = new int[n - k + 1];
        for (int i = 0; i < n - k + 1; i++) {
            output[i] = Math.max(left[i + k - 1], right[i]);
        }
        return output;
    }

}
