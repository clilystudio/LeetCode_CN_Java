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

import com.github.clilystudio.leetcode.define.Interval;

/// -----------------------------------------------------------------------------
/// [435] 无重叠区间
///
/// https://leetcode-cn.com/problems/non-overlapping-intervals/description/
///
/// 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
///
/// 注意:
///
/// 可以认为区间的终点总是大于它的起点。
/// 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
///
/// 示例 1:
///
/// 输入: [ [1,2], [2,3], [3,4], [1,3] ]
///
/// 输出: 1
///
/// 解释: 移除 [1,3] 后，剩下的区间没有重叠。
///
/// 示例 2:
///
/// 输入: [ [1,2], [1,2], [1,2] ]
///
/// 输出: 2
///
/// 解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
///
/// 示例 3:
///
/// 输入: [ [1,2], [2,3] ]
///
/// 输出: 0
///
/// 解释: 你不需要移除任何区间，因为它们已经是无重叠的了。
/// -----------------------------------------------------------------------------
public class Q0435 {
    public int eraseOverlapIntervals(Interval[] intervals) {
        // TODO
        return 0;
    }
}
