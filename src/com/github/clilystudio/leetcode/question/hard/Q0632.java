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
/// [632] 最小区间
///
/// https://leetcode-cn.com/problems/smallest-range/description/
///
/// 你有 k 个升序排列的整数数组。找到一个最小区间，使得 k 个列表中的每个列表至少有一个数包含在其中。
///
/// 我们定义如果 b-a < d-c 或者在 b-a == d-c 时 a < c，则区间 [a,b] 比 [c,d] 小。
///
/// 示例 1:
///
/// 输入:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
/// 输出: [20,24]
/// 解释:
/// 列表 1：[4, 10, 15, 24, 26]，24 在区间 [20,24] 中。
/// 列表 2：[0, 9, 12, 20]，20 在区间 [20,24] 中。
/// 列表 3：[5, 18, 22, 30]，22 在区间 [20,24] 中。
///
/// 注意:
///
/// 给定的列表可能包含重复元素，所以在这里升序表示 >= 。
/// 1 <= k <= 3500
/// -10^5 <= 元素的值 <= 10^5
/// 对于使用Java的用户，请注意传入类型已修改为List<List<Integer>>。重置代码模板后可以看到这项改动。
/// -----------------------------------------------------------------------------
public class Q0632 {
    public int[] smallestRange(List<List<Integer>> nums) {
        // TODO
        return null;
    }
}
