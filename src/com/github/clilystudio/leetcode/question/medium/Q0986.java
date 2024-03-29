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
/// [986] 给定数字能组成的最大时间
///
/// https://leetcode-cn.com/problems/interval-list-intersections/description/
///
/// 给定两个由一些闭区间组成的列表，每个区间列表都是成对不相交的，并且已经排序。
///
/// 返回这两个区间列表的交集。
///
/// （形式上，闭区间 [a, b]（其中 a <= b）表示实数 x 的集合，而 a <= x <=
/// b。两个闭区间的交集是一组实数，要么为空集，要么为闭区间。例如，[1, 3] 和 [2, 4] 的交集为 [2, 3]。）
///
/// 示例：
///
/// 输入：A = [[0,2],[5,10],[13,23],[24,25]], B = [[1,5],[8,12],[15,24],[25,26]]
/// 输出：[[1,2],[5,5],[8,10],[15,23],[24,24],[25,25]]
/// 注意：输入和所需的输出都是区间对象组成的列表，而不是数组或列表。
///
/// 提示：
///
/// 0 <= A.length < 1000
/// 0 <= B.length < 1000
/// 0 <= A[i].start, A[i].end, B[i].start, B[i].end < 10^9
/// -----------------------------------------------------------------------------
public class Q0986 {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        // TODO
        return null;
    }
}
