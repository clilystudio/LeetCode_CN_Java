/*******************************************************************************
 * Copyright 2019 ClilyStudio.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.github.clilystudio.leetcode.question.hard;

/// -----------------------------------------------------------------------------
/// [730] 统计不同回文子字符串
///
/// https://leetcode-cn.com/problems/count-different-palindromic-subsequences/description/
///
/// 给定一个字符串 S，找出 S 中不同的非空回文子序列个数，并返回该数字与 10^9 + 7 的模。
///
/// 通过从 S 中删除 0 个或多个字符来获得子字符序列。
///
/// 如果一个字符序列与它反转后的字符序列一致，那么它是回文字符序列。
///
/// 如果对于某个  i，A_i != B_i，那么 A_1, A_2, ... 和 B_1, B_2, ... 这两个字符序列是不同的。
///
/// 示例 1：
///
/// 输入：
/// S = 'bccb'
/// 输出：6
/// 解释：
/// 6 个不同的非空回文子字符序列分别为：'b', 'c', 'bb', 'cc', 'bcb', 'bccb'。
/// 注意：'bcb' 虽然出现两次但仅计数一次。
///
/// 示例 2：
///
/// 输入：
/// S = 'abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba'
/// 输出：104860361
/// 解释：
/// 共有 3104860382 个不同的非空回文子字符序列，对 10^9 + 7 取模为 104860361。
///
/// 提示：
///
/// 字符串 S 的长度将在[1, 1000]范围内。
/// 每个字符 S[i] 将会是集合 {'a', 'b', 'c', 'd'} 中的某一个。
/// -----------------------------------------------------------------------------
public class Q0730 {
    public int countPalindromicSubsequences(String S) {
        // TODO
        return 0;
    }
}
