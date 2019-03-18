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
/// [211] 添加与搜索单词 - 数据结构设计
///
/// https://leetcode-cn.com/problems/add-and-search-word-data-structure-design/description/
///
/// 设计一个支持以下两种操作的数据结构：
///
/// void addWord(word)
/// bool search(word)
///
/// search(word) 可以搜索文字或正则表达式字符串，字符串只包含字母 . 或 a-z 。 . 可以表示任何一个字母。
///
/// 示例:
///
/// addWord("bad")
/// addWord("dad")
/// addWord("mad")
/// search("pad") -> false
/// search("bad") -> true
/// search(".ad") -> true
/// search("b..") -> true
///
/// 说明:
///
/// 你可以假设所有单词都是由小写字母 a-z 组成的。
/// -----------------------------------------------------------------------------
/// WordDictionary对象将被实例化，并按下面方式调用：
/// WordDictionary obj = new WordDictionary();
/// obj.addWord(word);
/// boolean param_2 = obj.search(word);
/// -----------------------------------------------------------------------------
public class Q0211 {
    public class WordDictionary {

        /** Initialize your data structure here. */
        public WordDictionary() {
            // TODO
        }

        /** Adds a word into the data structure. */
        public void addWord(String word) {
            // TODO
        }

        /**
         * Returns if the word is in the data structure. A word could contain the dot
         * character '.' to represent any one letter.
         */
        public boolean search(String word) {
            // TODO
            return false;
        }
    }
}
