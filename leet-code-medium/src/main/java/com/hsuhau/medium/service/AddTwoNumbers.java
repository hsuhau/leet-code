package com.hsuhau.medium.service;

import com.hsuhau.common.model.ListNode;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. 两数相加
 * <p>
 * 相关标签：链表，数学
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author hsuhau
 */
@Service
public class AddTwoNumbers {
    /**
     * 方法：初等数学
     * 思路
     * <p>
     * 我们使用变量来跟踪进位，并从包含最低有效位的表头开始模拟逐位相加的过程。
     * <p>
     * <p>
     * <p>
     * 图1，对两数相加方法的可视化: 342 + 465 = 807 342+465=807，每个结点都包含一个数字，并且数字按位逆序存储。
     * <p>
     * 算法
     * <p>
     * 就像你在纸上计算两个数字的和那样，我们首先从最低有效位也就是列表 l1l1 和 l2l2 的表头开始相加。由于每位数字都应当处于 0 \ldots 90…9 的范围内，我们计算两个数字的和时可能会出现 “溢出”。例如，5 + 7 = 125+7=12。在这种情况下，我们会将当前位的数值设置为 22，并将进位 carry = 1carry=1 带入下一次迭代。进位 carrycarry 必定是 00 或 11，这是因为两个数字相加（考虑到进位）可能出现的最大和为 9 + 9 + 1 = 199+9+1=19。
     * <p>
     * 伪代码如下：
     * <p>
     * 将当前结点初始化为返回列表的哑结点。
     * 将进位 carrycarry 初始化为 00。
     * 将 pp 和 qq 分别初始化为列表 l1l1 和 l2l2 的头部。
     * 遍历列表 l1l1 和 l2l2 直至到达它们的尾端。
     * 将 xx 设为结点 pp 的值。如果 pp 已经到达 l1l1 的末尾，则将其值设置为 00。
     * 将 yy 设为结点 qq 的值。如果 qq 已经到达 l2l2 的末尾，则将其值设置为 00。
     * 设定 sum = x + y + carrysum=x+y+carry。
     * 更新进位的值，carry = sum / 10carry=sum/10。
     * 创建一个数值为 (sum \bmod 10)(summod10) 的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点。
     * 同时，将 pp 和 qq 前进到下一个结点。
     * 检查 carry = 1carry=1 是否成立，如果成立，则向返回列表追加一个含有数字 11 的新结点。
     * 返回哑结点的下一个结点。
     * 请注意，我们使用哑结点来简化代码。如果没有哑结点，则必须编写额外的条件语句来初始化表头的值。
     * <p>
     * 请特别注意以下情况：
     * <p>
     * 测试用例	说明
     * l1=[0,1]l1=[0,1]，l2=[0,1,2]l2=[0,1,2]	当一个列表比另一个列表长时
     * l1=[]l1=[]，l2=[0,1]l2=[0,1]	当一个列表为空时，即出现空列表
     * l1=[9,9]l1=[9,9]，l2=[1]l2=[1]	求和运算最后可能出现额外的进位，这一点很容易被遗忘
     * <p>
     * 复杂度分析
     * <p>
     * 时间复杂度：O(\max(m, n))O(max(m,n))，假设 mm 和 nn 分别表示 l1l1 和 l2l2 的长度，上面的算法最多重复 \max(m, n)max(m,n) 次。
     * <p>
     * 空间复杂度：O(\max(m, n))O(max(m,n))， 新列表的长度最多为 \max(m,n) + 1max(m,n)+1。
     * <p>
     * 拓展
     * <p>
     * 如果链表中的数字不是按逆序存储的呢？例如：
     * <p>
     * (3 \to 4 \to 2) + (4 \to 6 \to 5) = 8 \to 0 \to 7
     * (3→4→2)+(4→6→5)=8→0→7
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/add-two-numbers/solution/liang-shu-xiang-jia-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param l1
     * @param l2
     * @return
     */

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
//            curr.val = 100; // 为什么dunmmyHead随着curr变化呢
            curr.next = new ListNode(sum % 10); //为什么dunmmyHead随着curr.next的初始化变化呢
            curr = curr.next; // 为什么dunmmyHead不随着curr变化呢
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public ListNode addTwoNumbers0(ListNode l1, ListNode l2) {
        List<Integer> v1 = new ArrayList<>();
        extracted(l1, v1);
        int v1_length = v1.size();
        List<Integer> v2 = new ArrayList<>();
        extracted(l2, v2);
        int v2_length = v2.size();

        List<Integer> v = new ArrayList<>();
        int gap = v1_length - v2_length;
        if (gap > 0) {
            for (int i = 0; i < gap; i++) {
                v2.add(0);
            }
        } else if (gap < 0) {
            for (int i = 0; i < -gap; i++) {
                v1.add(0);
            }
        }
        v = add(v1, v2);
        List<ListNode> nodes = new ArrayList<>();
        for (int i = 0; i < v.size(); i++) {
            ListNode node = new ListNode(v.get(v.size() - i - 1));
            nodes.add(node);
        }
        ListNode node = null;
        for (int i = 0; i < nodes.size(); i++) {
            if (node == null) {
                node = nodes.get(i);
            } else {
                nodes.get(i).next = node;
                node = nodes.get(i);
            }
        }
        return node;
    }

    private List<Integer> add(List<Integer> v1, List<Integer> v2) {
        int v = 0;
        int length = v1.size();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            v += v1.get(i) * Math.pow(10, i);
            v += v2.get(i) * Math.pow(10, i);
        }

        for (int i = 0, n = 1; i < String.valueOf(v).length(); i++, n *= 10) {
            int m = v / n % 10;
            list.add(m);
        }
        return list;
    }


    private void extracted(ListNode l, List<Integer> v) {
        while (l != null) {
            v.add(l.val);
            if (l.next != null) {
                l = l.next;
            } else {
                break;
            }
        }
    }
}
