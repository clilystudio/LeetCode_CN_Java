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
/// [797] 森林中的兔子
///
/// https://leetcode-cn.com/problems/all-paths-from-source-to-target/description/
///
/// 给一个有 n 个结点的有向无环图，找到所有从 0 到 n-1 的路径并输出（不要求按顺序）
///
/// 二维数组的第 i 个数组中的单元都表示有向图中 i
/// 号结点所能到达的下一些结点（译者注：有向图是有方向的，即规定了a→b你就不能从b→a）空就是没有下一个结点了。
///
/// 示例:
/// 输入: [[1,2], [3], [3], []]
/// 输出: [[0,1,3],[0,2,3]]
/// 解释: 图是这样的:
/// 0--->1
/// |    |
/// v    v
/// 2--->3
/// 这有两条路: 0 -> 1 -> 3 和 0 -> 2 -> 3.
///
/// 提示:
///
/// 结点的数量会在范围 [2, 15] 内。
/// 你可以把路径以任意顺序输出，但在路径内的结点的顺序必须保证。
/// -----------------------------------------------------------------------------
public class Q0797 {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // TODO
        return null;
    }
}
