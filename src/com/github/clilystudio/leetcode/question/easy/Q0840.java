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

/// -----------------------------------------------------------------------------
/// [840] Magic Squares In Grid
///
/// https://leetcode-cn.com/problems/magic-squares-in-grid/description/
///
/// 3 x 3 的幻方是一个填充有从 1 到 9 的不同数字的 3 x 3 矩阵，其中每行，每列以及两条对角线上的各数之和都相等。
///
/// 给定一个由整数组成的 grid，其中有多少个 3 × 3 的 “幻方” 子矩阵？（每个子矩阵都是连续的）。
///
/// 示例：
///
/// 输入: [[4,3,8,4],
/// ⁠     [9,5,1,9],
/// ⁠     [2,7,6,2]]
/// 输出: 1
/// 解释:
/// 下面的子矩阵是一个 3 x 3 的幻方：
/// 438
/// 951
/// 276
///
/// 而这一个不是：
/// 384
/// 519
/// 762
///
/// 总的来说，在本示例所给定的矩阵中只有一个 3 x 3 的幻方子矩阵。
///
/// 提示:
///
/// 1 <= grid.length <= 10
/// 1 <= grid[0].length <= 10
/// 0 <= grid[i][j] <= 15
/// -----------------------------------------------------------------------------
public class Q0840 {
    public int numMagicSquaresInside(int[][] grid) {
        // TODO
        return 0;
    }
}
