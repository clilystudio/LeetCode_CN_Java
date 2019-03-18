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
/// [827] 情感丰富的文字
///
/// https://leetcode-cn.com/problems/making-a-large-island/description/
///
/// 在二维地图上， 0代表海洋， 1代表陆地，我们最多只能将一格 0 海洋变成 1变成陆地。
///
/// 进行填海之后，地图上最大的岛屿面积是多少？（上、下、左、右四个方向相连的 1 可形成岛屿）
///
/// 示例 1:
///
/// 输入: [[1, 0], [0, 1]]
/// 输出: 3
/// 解释: 将一格0变成1，最终连通两个小岛得到面积为 3 的岛屿。
///
/// 示例 2:
///
/// 输入: [[1, 1], [1, 0]]
/// 输出: 4
/// 解释: 将一格0变成1，岛屿的面积扩大为 4。
///
/// 示例 3:
///
/// 输入: [[1, 1], [1, 1]]
/// 输出: 4
/// 解释: 没有0可以让我们变成1，面积依然为 4。
///
/// 说明:
///
/// 1 <= grid.length = grid[0].length <= 50
/// 0 <= grid[i][j] <= 1
/// -----------------------------------------------------------------------------
public class Q0827 {
    public int largestIsland(int[][] grid) {
        // TODO
        return 0;
    }
}
