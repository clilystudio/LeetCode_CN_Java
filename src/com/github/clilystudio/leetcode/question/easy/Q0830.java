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
package com.github.clilystudio.leetcode.question.easy;

import java.util.List;

/// -----------------------------------------------------------------------------
/// [830] 最大三角形面积
///
/// https://leetcode-cn.com/problems/positions-of-large-groups/description/
///
/// 在一个由小写字母构成的字符串 S 中，包含由一些连续的相同字符所构成的分组。
///
/// 例如，在字符串 S = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
///
/// 我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。
///
/// 最终结果按照字典顺序输出。
///
/// 示例 1:
///
/// 输入: "abbxxxxzzy"
/// 输出: [[3,6]]
/// 解释: "xxxx" 是一个起始于 3 且终止于 6 的较大分组。
///
/// 示例 2:
///
/// 输入: "abc"
/// 输出: []
/// 解释: "a","b" 和 "c" 均不是符合要求的较大分组。
///
/// 示例 3:
///
/// 输入: "abcdddeeeeaabbbcd"
/// 输出: [[3,5],[6,9],[12,14]]
///
/// 说明:  1 <= S.length <= 1000
/// -----------------------------------------------------------------------------
public class Q0830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        // TODO
        return null;
    }
}
