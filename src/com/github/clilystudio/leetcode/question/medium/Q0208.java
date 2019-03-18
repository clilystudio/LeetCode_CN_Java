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
/// [208] 实现 Trie (前缀树)
///
/// https://leetcode-cn.com/problems/implement-trie-prefix-tree/description/
///
/// 实现一个 Trie (前缀树)，包含 insert, search, 和 startsWith 这三个操作。
///
/// 示例:
///
/// Trie trie = new Trie();
///
/// trie.insert("apple");
/// trie.search("apple");   // 返回 true
/// trie.search("app");     // 返回 false
/// trie.startsWith("app"); // 返回 true
/// trie.insert("app");
/// trie.search("app");     // 返回 true
///
/// 说明:
///
/// 你可以假设所有的输入都是由小写字母 a-z 构成的。
/// 保证所有输入均为非空字符串。
/// -----------------------------------------------------------------------------
/// Trie对象将被实例化，并按下面方式调用：
/// Trie obj = new Trie();
/// obj.insert(word);
/// boolean param_2 = obj.search(word);
/// boolean param_3 = obj.startsWith(prefix);
/// -----------------------------------------------------------------------------
public class Q0208 {
    public class Trie {

        /** Initialize your data structure here. */
        public Trie() {
            // TODO
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            // TODO
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            // TODO
            return false;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith(String prefix) {
            // TODO
            return false;
        }
    }
}
