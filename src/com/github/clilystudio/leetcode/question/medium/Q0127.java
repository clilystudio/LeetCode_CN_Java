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

import java.util.List;

/// -----------------------------------------------------------------------------
/// [127] 单词接龙
///
/// https://leetcode-cn.com/problems/word-ladder/description/
///
/// 给定两个单词（beginWord 和 endWord）和一个字典，找到从 beginWord 到 endWord
/// 的最短转换序列的长度。转换需遵循如下规则：
///
/// 每次转换只能改变一个字母。
/// 转换过程中的中间单词必须是字典中的单词。
///
/// 说明:
///
/// 如果不存在这样的转换序列，返回 0。
/// 所有单词具有相同的长度。
/// 所有单词只由小写字母组成。
/// 字典中不存在重复的单词。
/// 你可以假设 beginWord 和 endWord 是非空的，且二者不相同。
///
/// 示例 1:
///
/// 输入:
/// beginWord = "hit",
/// endWord = "cog",
/// wordList = ["hot","dot","dog","lot","log","cog"]
///
/// 输出: 5
///
/// 解释: 一个最短转换序列是 "hit" -> "hot" -> "dot" -> "dog" -> "cog",
/// ⁠    返回它的长度 5。
///
/// 示例 2:
///
/// 输入:
/// beginWord = "hit"
/// endWord = "cog"
/// wordList = ["hot","dot","dog","lot","log"]
///
/// 输出: 0
///
/// 解释: endWord "cog" 不在字典中，所以无法进行转换。
/// -----------------------------------------------------------------------------
public class Q0127 {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // TODO
        return 0;
    }
}
