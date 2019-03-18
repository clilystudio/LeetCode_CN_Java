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
/// [72] 编辑距离
///
/// https://leetcode-cn.com/problems/edit-distance/description/
///
/// 给定两个单词 word1 和 word2，计算出将 word1 转换成 word2 所使用的最少操作数 。
///
/// 你可以对一个单词进行如下三种操作：
///
/// 插入一个字符
/// 删除一个字符
/// 替换一个字符
///
/// 示例 1:
///
/// 输入: word1 = "horse", word2 = "ros"
/// 输出: 3
/// 解释:
/// horse -> rorse (将 'h' 替换为 'r')
/// rorse -> rose (删除 'r')
/// rose -> ros (删除 'e')
///
/// 示例 2:
///
/// 输入: word1 = "intention", word2 = "execution"
/// 输出: 5
/// 解释:
/// intention -> inention (删除 't')
/// inention -> enention (将 'i' 替换为 'e')
/// enention -> exention (将 'n' 替换为 'x')
/// exention -> exection (将 'n' 替换为 'c')
/// exection -> execution (插入 'u')
/// -----------------------------------------------------------------------------
public class Q0072 {
    public int minDistance(String word1, String word2) {
        // TODO
        return 0;
    }
}
