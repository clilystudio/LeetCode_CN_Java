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
/// [899] 二进制间距
///
/// https://leetcode-cn.com/problems/orderly-queue/description/
///
/// 给出了一个由小写字母组成的字符串 S。然后，我们可以进行任意次数的移动。
///
/// 在每次移动中，我们选择前 K 个字母中的一个（从左侧开始），将其从原位置移除，并放置在字符串的末尾。
///
/// 返回我们在任意次数的移动之后可以拥有的按字典顺序排列的最小字符串。
///
/// 示例 1：
///
/// 输入：S = "cba", K = 1
/// 输出："acb"
/// 解释：
/// 在第一步中，我们将第一个字符（“c”）移动到最后，获得字符串 “bac”。
/// 在第二步中，我们将第一个字符（“b”）移动到最后，获得最终结果 “acb”。
///
/// 示例 2：
///
/// 输入：S = "baaca", K = 3
/// 输出："aaabc"
/// 解释：
/// 在第一步中，我们将第一个字符（“b”）移动到最后，获得字符串 “aacab”。
/// 在第二步中，我们将第三个字符（“c”）移动到最后，获得最终结果 “aaabc”。
///
/// 提示：
///
/// 1 <= K <= S.length <= 1000
/// S 只由小写字母组成。
/// -----------------------------------------------------------------------------
public class Q0899 {
    public String orderlyQueue(String S, int K) {
        // TODO
        return null;
    }
}
