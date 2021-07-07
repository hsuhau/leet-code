package com.hsuhau.easy.service;

import org.springframework.stereotype.Service;

/**
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 */
@Service
public class LongestCommonPrefix {
    public String longestCommonPrefix0(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String min = strs[0];
        int len = strs.length;
        for (int i = 0; i < len; i++) {
            if (strs[i].length() < min.length()) {
                min = strs[i];
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < min.length(); j++) {
                String str = strs[i];
                char c = str.length() > j ? str.charAt(j) : 'A';
                char a = min.toCharArray()[j];
                if (a != c) {
                    min = min.substring(0, j);
                }
            }
        }
        return min;
    }

    /**
     * 算法三：分治
     * <p>
     * LCP(S1...Sn) = LCP(LCP(S1..Sk), LCP(Sk+1...Sn))
     * LCP(S1..Sn)是字符串[S1...Sn]的最长公共前缀，1<k<n。
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix1(String[] strs) {
        return strs == null || strs.length == 0 ? "" : longestCommonPrefix1(strs, 0, strs.length - 1);
    }

    private String longestCommonPrefix1(String[] strs, int l, int r) {
        if (l == r) {
            return strs[l];
        } else {
            int mid = (l + r) / 2;
            String left = longestCommonPrefix1(strs, 0, mid);
            String right = longestCommonPrefix1(strs, mid + 1, r);
            return commonPrefix(left, right);
        }
    }

    private String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());
        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }

    /**
     * 方法四：二分查找法
     * 这个想法是应用二分查找法找到所有字符串的公共前缀的最大长度 L。
     * 算法的查找区间是 (0...minLen)，
     * 其中 minLen 是输入数据中最短的字符串的长度，同时也是答案的最长可能长度。
     * 每一次将查找区间一分为二，然后丢弃一定不包含最终答案的那一个。
     * 算法进行的过程中一共会出现两种可能情况：
     * <p>
     * S[1...mid] 不是所有串的公共前缀。
     * 这表明对于所有的 j > i S[1..j] 也不是公共前缀，于是我们就可以丢弃后半个查找区间。
     * <p>
     * S[1...mid] 是所有串的公共前缀。
     * 这表示对于所有的 i < j S[1..i] 都是可行的公共前缀，因为我们要找最长的公共前缀，所以我们可以把前半个查找区间丢弃。
     */

    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, strs.length);
        }

        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle)) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        String str = strs[0].substring(0, len);
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].startsWith(str)) {
                return false;
            }
        }
        return true;
    }


    /**
     * 更进一步
     * 让我们看一个有些不同的问题：
     * <p>
     * 给定一些键值字符串 S = [S1,S2…Sn]，
     * 我们要找到字符串 q 与 S 的最长公共前缀。 这样的查询操作可能会非常频繁。
     * <p>
     * 我们可以通过将所有的键值 S 存储到一颗字典树中来优化最长公共前缀查询操作。
     * 如果你想学习更多关于字典树的内容，可以从 208. 实现 Trie (前缀树) 开始。
     * 在字典树中，从根向下的每一个节点都代表一些键值的公共前缀。
     * 但是我们需要找到字符串q 和所有键值字符串的最长公共前缀。
     * 这意味着我们需要从根找到一条最深的路径，满足以下条件：
     * <p>
     * 这是所查询的字符串 q 的一个前缀
     * <p>
     * 路径上的每一个节点都有且仅有一个孩子。 否则，找到的路径就不是所有字符串的公共前缀
     * <p>
     * 路径不包含被标记成某一个键值字符串结尾的节点。 因为最长公共前缀不可能比某个字符串本身长
     * <p>
     * 算法
     * <p>
     * 最后的问题就是如何找到字典树中满足上述所有要求的最深节点。
     * 最有效的方法就是建立一颗包含字符串 [S1…Sn] 的字典树。 然后在这颗树中匹配 q 的前缀。
     * 我们从根节点遍历这颗字典树，直到因为不能满足某个条件而不能再遍历为止。
     */

    public String longestCommonPrefix4(String q, String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        Trie trie = new Trie();
        for (int i = 1; i < strs.length; i++) {
            trie.insert(strs[i]);
        }
        return trie.searchLongestPrefix(q);
    }

    class TrieNode {
        private final int R = 26;
        // 子节点的连接数组
        private TrieNode[] links;
        private boolean isEnd;

        // 非空子节点的数量
        private int size;

        public TrieNode() {
            links = new TrieNode[R];
        }

        public boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        public TrieNode get(char ch) {
            return links[ch - 'a'];
        }

        public void put(char ch, TrieNode node) {
            links[ch - 'a'] = node;
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean isEnd() {
            return isEnd;
        }

        public int getLinks() {
            return size;
        }
    }

    class Trie {
        private TrieNode root;

        public Trie() {
            this.root = new TrieNode();
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            TrieNode node = root;
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (!node.containsKey(currentChar)) {
                    node.put(currentChar, new TrieNode());
                }
                node = node.get(currentChar);
            }
            node.setEnd();
        }

        private String searchLongestPrefix(String word) {
            TrieNode node = root;
            StringBuilder prefix = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char curLetter = word.charAt(i);
                if (node.containsKey(curLetter) && (node.getLinks() == 1) && (!node.isEnd)) {
                    prefix.append(curLetter);
                    node = node.get(curLetter);
                } else {
                    return prefix.toString();
                }
            }
            return prefix.toString();
        }
    }
}
