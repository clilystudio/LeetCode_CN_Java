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

/// -----------------------------------------------------------------------------
/// [576] 出界的路径数
///
/// https://leetcode-cn.com/problems/out-of-boundary-paths/description/
///
/// 给定一个 m × n 的网格和一个球。球的起始坐标为 (i,j)
/// ，你可以将球移到相邻的单元格内，或者往上、下、左、右四个方向上移动使球穿过网格边界。但是，你最多可以移动 N
/// 次。找出可以将球移出边界的路径数量。答案可能非常大，返回 结果 mod 10^9 + 7 的值。
///
/// 示例 1：
///
/// 输入: m = 2, n = 2, N = 2, i = 0, j = 0
/// 输出: 6
/// 解释:
///
/// 示例 2：
///
/// 输入: m = 1, n = 3, N = 3, i = 0, j = 1
/// 输出: 12
/// 解释:
///
/// 说明:
///
/// 球一旦出界，就不能再被移动回网格内。
/// 网格的长度和高度在 [1,50] 的范围内。
/// N 在 [0,50] 的范围内。
/// -----------------------------------------------------------------------------
public class Q0576 {
    public int findPaths(int m, int n, int N, int i, int j) {
        // TODO
        return 0;
    }
}
