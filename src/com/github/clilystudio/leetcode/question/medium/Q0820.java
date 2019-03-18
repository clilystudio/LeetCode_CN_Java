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
/// [820] 找到最终的安全状态
///
/// https://leetcode-cn.com/problems/short-encoding-of-words/description/
///
/// 给定一个单词列表，我们将这个列表编码成一个索引字符串 S 与一个索引列表 A。
///
/// 例如，如果这个列表是 ["time", "me", "bell"]，我们就可以将其表示为 S = "time#bell#" 和 indexes =
/// [0, 2, 5]。
///
/// 对于每一个索引，我们可以通过从字符串 S 中索引的位置开始读取字符串，直到 "#" 结束，来恢复我们之前的单词列表。
///
/// 那么成功对给定单词列表进行编码的最小字符串长度是多少呢？
///
/// 示例：
///
/// 输入: words = ["time", "me", "bell"]
/// 输出: 10
/// 说明: S = "time#bell#" ， indexes = [0, 2, 5] 。
///
/// 提示：
///
/// 1 <= words.length <= 2000
/// 1 <= words[i].length <= 7
/// 每个单词都是小写字母 。
/// -----------------------------------------------------------------------------
public class Q0820 {
    public int minimumLengthEncoding(String[] words) {
        // TODO
        return 0;
    }
}
