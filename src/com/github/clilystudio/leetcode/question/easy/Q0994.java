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
/// [994] N 天后的牢房
///
/// https://leetcode-cn.com/problems/rotting-oranges/description/
///
/// 在给定的网格中，每个单元格可以有以下三个值之一：
///
/// 值 0 代表空单元格；
/// 值 1 代表新鲜橘子；
/// 值 2 代表腐烂的橘子。
///
/// 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
///
/// 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
///
/// 示例 1：
///
/// 输入：[[2,1,1],[1,1,0],[0,1,1]]
/// 输出：4
///
/// 示例 2：
///
/// 输入：[[2,1,1],[0,1,1],[1,0,1]]
/// 输出：-1
/// 解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
///
/// 示例 3：
///
/// 输入：[[0,2]]
/// 输出：0
/// 解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
///
/// 提示：
///
/// 1 <= grid.length <= 10
/// 1 <= grid[0].length <= 10
/// grid[i][j] 仅为 0、1 或 2
/// -----------------------------------------------------------------------------
public class Q0994 {
    public int orangesRotting(int[][] grid) {
        // TODO
        return 0;
    }
}
