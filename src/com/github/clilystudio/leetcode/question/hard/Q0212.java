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

import java.util.List;

/// -----------------------------------------------------------------------------
/// [212] 单词搜索 II
///
/// https://leetcode-cn.com/problems/word-search-ii/description/
///
/// 给定一个二维网格 board 和一个字典中的单词列表 words，找出所有同时在二维网格和字典中出现的单词。
///
/// 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母在一个单词中不允许被重复使用。
///
/// 示例:
///
/// 输入:
/// words = ["oath","pea","eat","rain"] and board =
/// [
/// ⁠ ['o','a','a','n'],
/// ⁠ ['e','t','a','e'],
/// ⁠ ['i','h','k','r'],
/// ⁠ ['i','f','l','v']
/// ]
///
/// 输出: ["eat","oath"]
///
/// 说明:
/// 你可以假设所有输入都由小写字母 a-z 组成。
///
/// 提示:
///
/// 你需要优化回溯算法以通过更大数据量的测试。你能否早点停止回溯？
/// 如果当前单词不存在于所有单词的前缀中，则可以立即停止回溯。什么样的数据结构可以有效地执行这样的操作？散列表是否可行？为什么？
/// 前缀树如何？如果你想学习如何实现一个基本的前缀树，请先查看这个问题： 实现Trie（前缀树）。
/// -----------------------------------------------------------------------------
public class Q0212 {
    public List<String> findWords(char[][] board, String[] words) {
        // TODO
        return null;
    }
}
