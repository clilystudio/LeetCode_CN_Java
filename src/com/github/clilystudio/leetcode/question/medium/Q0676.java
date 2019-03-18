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
/// [676] 实现一个魔法字典
///
/// https://leetcode-cn.com/problems/implement-magic-dictionary/description/
///
/// 实现一个带有buildDict, 以及 search方法的魔法字典。
///
/// 对于buildDict方法，你将被给定一串不重复的单词来构建一个字典。
///
/// 对于search方法，你将被给定一个单词，并且判定能否只将这个单词中一个字母换成另一个字母，使得所形成的新单词存在于你构建的字典中。
///
/// 示例 1:
///
/// Input: buildDict(["hello", "leetcode"]), Output: Null
/// Input: search("hello"), Output: False
/// Input: search("hhllo"), Output: True
/// Input: search("hell"), Output: False
/// Input: search("leetcoded"), Output: False
///
/// 注意:
///
/// 你可以假设所有输入都是小写字母 a-z。
/// 为了便于竞赛，测试所用的数据量很小。你可以在竞赛结束后，考虑更高效的算法。
/// 请记住重置MagicDictionary类中声明的类变量，因为静态/类变量会在多个测试用例中保留。 请参阅这里了解更多详情。
/// -----------------------------------------------------------------------------
/// MagicDictionary对象将被实例化，并按下面方式调用：
/// MagicDictionary obj = new MagicDictionary();
/// obj.buildDict(dict);
/// boolean param_2 = obj.search(word);
/// -----------------------------------------------------------------------------
public class Q0676 {
    public class MagicDictionary {

        /** Initialize your data structure here. */
        public MagicDictionary() {
            // TODO
        }

        /** Build a dictionary through a list of words */
        public void buildDict(String[] dict) {
            // TODO
        }

        /**
         * Returns if there is any word in the trie that equals to the given word after
         * modifying exactly one character
         */
        public boolean search(String word) {
            // TODO
            return false;
        }
    }
}
