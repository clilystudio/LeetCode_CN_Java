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
/// [115] 不同的子序列
///
/// https://leetcode-cn.com/problems/distinct-subsequences/description/
///
/// 给定一个字符串 S 和一个字符串 T，计算在 S 的子序列中 T 出现的个数。
///
/// 一个字符串的一个子序列是指，通过删除一些（也可以不删除）字符且不干扰剩余字符相对位置所组成的新字符串。（例如，"ACE" 是 "ABCDE"
/// 的一个子序列，而 "AEC" 不是）
///
/// 示例 1:
///
/// 输入: S = "rabbbit", T = "rabbit"
/// 输出: 3
/// 解释:
///
/// 如下图所示, 有 3 种可以从 S 中得到 "rabbit" 的方案。
/// (上箭头符号 ^ 表示选取的字母)
///
/// rabbbit
/// ^^^^ ^^
/// rabbbit
/// ^^ ^^^^
/// rabbbit
/// ^^^ ^^^
///
/// 示例 2:
///
/// 输入: S = "babgbag", T = "bag"
/// 输出: 5
/// 解释:
///
/// 如下图所示, 有 5 种可以从 S 中得到 "bag" 的方案。
/// (上箭头符号 ^ 表示选取的字母)
///
/// babgbag
/// ^^ ^
/// babgbag
/// ^^    ^
/// babgbag
/// ^    ^^
/// babgbag
/// ⁠ ^  ^^
/// babgbag
/// ⁠   ^^^
/// -----------------------------------------------------------------------------
public class Q0115 {
    public int numDistinct(String s, String t) {
        // TODO
        return 0;
    }
}
