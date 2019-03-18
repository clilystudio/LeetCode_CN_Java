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
package com.github.clilystudio.leetcode.question.medium;

/// -----------------------------------------------------------------------------
/// [712] 两个字符串的最小ASCII删除和
///
/// https://leetcode-cn.com/problems/minimum-ascii-delete-sum-for-two-strings/description/
///
/// 给定两个字符串s1, s2，找到使两个字符串相等所需删除字符的ASCII值的最小和。
///
/// 示例 1:
///
/// 输入: s1 = "sea", s2 = "eat"
/// 输出: 231
/// 解释: 在 "sea" 中删除 "s" 并将 "s" 的值(115)加入总和。
/// 在 "eat" 中删除 "t" 并将 116 加入总和。
/// 结束时，两个字符串相等，115 + 116 = 231 就是符合条件的最小和。
///
/// 示例 2:
///
/// 输入: s1 = "delete", s2 = "leet"
/// 输出: 403
/// 解释: 在 "delete" 中删除 "dee" 字符串变成 "let"，
/// 将 100[d]+101[e]+101[e] 加入总和。在 "leet" 中删除 "e" 将 101[e] 加入总和。
/// 结束时，两个字符串都等于 "let"，结果即为 100+101+101+101 = 403 。
/// 如果改为将两个字符串转换为 "lee" 或 "eet"，我们会得到 433 或 417 的结果，比答案更大。
///
/// 注意:
///
/// 0 < s1.length, s2.length <= 1000。
/// 所有字符串中的字符ASCII值在[97, 122]之间。
/// -----------------------------------------------------------------------------
public class Q0712 {
    public int minimumDeleteSum(String s1, String s2) {
        // TODO
        return 0;
    }
}
