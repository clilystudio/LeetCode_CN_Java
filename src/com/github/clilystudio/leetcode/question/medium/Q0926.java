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
/// [926] 查找和替换模式
///
/// https://leetcode-cn.com/problems/flip-string-to-monotone-increasing/description/
///
/// 如果一个由 '0' 和 '1' 组成的字符串，是以一些 '0'（可能没有 '0'）后面跟着一些 '1'（也可能没有
/// '1'）的形式组成的，那么该字符串是单调递增的。
///
/// 我们给出一个由字符 '0' 和 '1' 组成的字符串 S，我们可以将任何 '0' 翻转为 '1' 或者将 '1' 翻转为 '0'。
///
/// 返回使 S 单调递增的最小翻转次数。
///
/// 示例 1：
///
/// 输入："00110"
/// 输出：1
/// 解释：我们翻转最后一位得到 00111.
///
/// 示例 2：
///
/// 输入："010110"
/// 输出：2
/// 解释：我们翻转得到 011111，或者是 000111。
///
/// 示例 3：
///
/// 输入："00011000"
/// 输出：2
/// 解释：我们翻转得到 00000000。
///
/// 提示：
///
/// 1 <= S.length <= 20000
/// S 中只包含字符 '0' 和 '1'
/// -----------------------------------------------------------------------------
public class Q0926 {
    public int minFlipsMonoIncr(String S) {
        // TODO
        return 0;
    }
}
