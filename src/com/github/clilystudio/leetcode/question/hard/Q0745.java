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
/// [745] 寻找比目标字母大的最小字母
///
/// https://leetcode-cn.com/problems/prefix-and-suffix-search/description/
///
/// 给定多个 words，words[i] 的权重为 i 。
///
/// 设计一个类 WordFilter 实现函数WordFilter.f(String prefix, String suffix)。这个函数将返回具有前缀
/// prefix 和后缀suffix 的词的最大权重。如果没有这样的词，返回 -1。
///
/// 例子:
///
/// 输入:
/// WordFilter(["apple"])
/// WordFilter.f("a", "e") // 返回 0
/// WordFilter.f("b", "") // 返回 -1
///
/// 注意:
///
/// words的长度在[1, 15000]之间。
/// 对于每个测试用例，最多会有words.length次对WordFilter.f的调用。
/// words[i]的长度在[1, 10]之间。
/// prefix, suffix的长度在[0, 10]之前。
/// words[i]和prefix, suffix只包含小写字母。
/// -----------------------------------------------------------------------------
/// WordFilter对象将被实例化，并按下面方式调用：
/// WordFilter obj = new WordFilter(words);
/// int param_1 = obj.f(prefix,suffix);
/// -----------------------------------------------------------------------------
public class Q0745 {
    public class WordFilter {

        public WordFilter(String[] words) {
            // TODO
        }

        public int f(String prefix, String suffix) {
            // TODO
            return 0;
        }
    }
}
