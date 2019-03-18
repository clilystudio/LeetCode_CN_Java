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
/// [834] 模糊坐标
///
/// https://leetcode-cn.com/problems/sum-of-distances-in-tree/description/
///
/// 给定一个无向、连通的树。树中有 N 个标记为 0...N-1 的节点以及 N-1 条边 。
///
/// 第 i 条边连接节点 edges[i][0] 和 edges[i][1] 。
///
/// 返回一个表示节点 i 与其他所有节点距离之和的列表 ans。
///
/// 示例 1:
///
/// 输入: N = 6, edges = [[0,1],[0,2],[2,3],[2,4],[2,5]]
/// 输出: [8,12,6,10,10,10]
/// 解释:
/// 如下为给定的树的示意图：
/// ⁠ 0
/// ⁠/ \
/// 1   2
/// ⁠  /|\
/// ⁠ 3 4 5
///
/// 我们可以计算出 dist(0,1) + dist(0,2) + dist(0,3) + dist(0,4) + dist(0,5)
/// 也就是 1 + 1 + 2 + 2 + 2 = 8。 因此，answer[0] = 8，以此类推。
///
/// 说明: 1 <= N <= 10000
/// -----------------------------------------------------------------------------
public class Q0834 {
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        // TODO
        return null;
    }
}
