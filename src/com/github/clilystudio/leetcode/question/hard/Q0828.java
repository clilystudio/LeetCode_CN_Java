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
/// [828] 黑板异或游戏
///
/// https://leetcode-cn.com/problems/unique-letter-string/description/
///
/// 如果一个字符在字符串 S 中有且仅有出现一次，那么我们称其为独特字符。
///
/// 例如，在字符串 S = "LETTER" 中，"L" 和 "R" 可以被称为独特字符。
///
/// 我们再定义 UNIQ(S) 作为字符串 S 中独特字符的个数。
///
/// 那么，在 S = "LETTER" 中， UNIQ("LETTER") =  2。
///
/// 对于给定字符串 S，计算其所有非空子串的独特字符的个数，即 UNIQ(substring)。
///
/// 如果出现两个或者多个相同的子串，将其认为是不同的两个子串。
///
/// 考虑到答案可能会非常大，规定返回格式为：结果 mod 10 ^ 9 + 7。
///
/// 示例 1:
///
/// 输入: "ABC"
/// 输出: 10
/// 解释: 所有可能的子串为："A","B","C","AB","BC" 和 "ABC"。
/// ⁠    其中，每一个子串都由独特字符构成。
/// ⁠    所以其长度总和为：1 + 1 + 1 + 2 + 2 + 3 = 10
///
/// 示例 2:
///
/// 输入: "ABA"
/// 输出: 8
/// 解释: 除了子串 UNIQ('ABA') = 1，其余与示例1相同。
///
/// 说明: 0 <= S.length <= 10000。
/// -----------------------------------------------------------------------------
public class Q0828 {
    public int uniqueLetterString(String S) {
        // TODO
        return 0;
    }
}
