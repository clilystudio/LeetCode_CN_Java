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
/// [692] 前K个高频单词
///
/// https://leetcode-cn.com/problems/top-k-frequent-words/description/
///
/// 给一非空的单词列表，返回前 k 个出现次数最多的单词。
///
/// 返回的答案应该按单词出现频率由高到低排序。如果不同的单词有相同出现频率，按字母顺序排序。
///
/// 示例 1：
///
/// 输入: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
/// 输出: ["i", "love"]
/// 解析: "i" 和 "love" 为出现次数最多的两个单词，均为2次。
/// ⁠   注意，按字母顺序 "i" 在 "love" 之前。
///
/// 示例 2：
///
/// 输入: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"],
/// k = 4
/// 输出: ["the", "is", "sunny", "day"]
/// 解析: "the", "is", "sunny" 和 "day" 是出现次数最多的四个单词，
/// ⁠   出现次数依次为 4, 3, 2 和 1 次。
///
/// 注意：
///
/// 假定 k 总为有效值， 1 ≤ k ≤ 集合元素数。
/// 输入的单词均由小写字母组成。
///
/// 扩展练习：
///
/// 尝试以 O(n log k) 时间复杂度和 O(n) 空间复杂度解决。
/// -----------------------------------------------------------------------------
public class Q0692 {
    public List<String> topKFrequent(String[] words, int k) {
        // TODO
        return null;
    }
}
