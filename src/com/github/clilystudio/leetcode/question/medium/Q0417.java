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
/// [417] 太平洋大西洋水流问题
///
/// https://leetcode-cn.com/problems/pacific-atlantic-water-flow/description/
///
/// 给定一个 m x n 的非负整数矩阵来表示一片大陆上各个单元格的高度。“太平洋”处于大陆的左边界和上边界，而“大西洋”处于大陆的右边界和下边界。
///
/// 规定水流只能按照上、下、左、右四个方向流动，且只能从高到低或者在同等高度上流动。
///
/// 请找出那些水流既可以流动到“太平洋”，又能流动到“大西洋”的陆地单元的坐标。
///
/// 提示：
///
/// 输出坐标的顺序不重要
/// m 和 n 都小于150
///
/// 示例：
///
/// 给定下面的 5x5 矩阵:
///
/// ⁠ 太平洋 ~   ~   ~   ~   ~
/// ⁠      ~  1   2   2   3  (5) *
/// ⁠      ~  3   2   3  (4) (4) *
/// ⁠      ~  2   4  (5)  3   1  *
/// ⁠      ~ (6) (7)  1   4   5  *
/// ⁠      ~ (5)  1   1   2   4  *
/// ⁠         *   *   *   *   * 大西洋
///
/// 返回:
///
/// [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (上图中带括号的单元).
/// -----------------------------------------------------------------------------
public class Q0417 {
    public List<int[]> pacificAtlantic(int[][] matrix) {
        // TODO
        return null;
    }
}
