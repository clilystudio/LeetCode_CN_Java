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
/// [757] 金字塔转换矩阵
///
/// https://leetcode-cn.com/problems/set-intersection-size-at-least-two/description/
///
/// 一个整数区间 [a, b]  ( a < b ) 代表着从 a 到 b 的所有连续整数，包括 a 和 b。
///
/// 给你一组整数区间intervals，请找到一个最小的集合 S，使得 S 里的元素与区间intervals中的每一个整数区间都至少有2个元素相交。
///
/// 输出这个最小集合S的大小。
///
/// 示例 1:
///
/// 输入: intervals = [[1, 3], [1, 4], [2, 5], [3, 5]]
/// 输出: 3
/// 解释:
/// 考虑集合 S = {2, 3, 4}. S与intervals中的四个区间都有至少2个相交的元素。
/// 且这是S最小的情况，故我们输出3。
///
/// 示例 2:
///
/// 输入: intervals = [[1, 2], [2, 3], [2, 4], [4, 5]]
/// 输出: 5
/// 解释:
/// 最小的集合S = {1, 2, 3, 4, 5}.
///
/// 注意:
///
/// intervals 的长度范围为[1, 3000]。
/// intervals[i] 长度为 2，分别代表左、右边界。
/// intervals[i][j] 的值是 [0, 10^8]范围内的整数。
/// -----------------------------------------------------------------------------
public class Q0757 {
    public int intersectionSizeTwo(int[][] intervals) {
        // TODO
        return 0;
    }
}
