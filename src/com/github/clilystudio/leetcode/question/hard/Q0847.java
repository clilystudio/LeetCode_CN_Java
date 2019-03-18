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
/// [847] Shortest Path Visiting All Nodes
///
/// https://leetcode-cn.com/problems/shortest-path-visiting-all-nodes/description/
///
/// 给出 graph 为有 N 个节点（编号为 0, 1, 2, ..., N-1）的无向连通图。 
///
/// graph.length = N，且只有节点 i 和 j 连通时，j != i 在列表 graph[i] 中恰好出现一次。
///
/// 返回能够访问所有节点的最短路径的长度。你可以在任一节点开始和停止，也可以多次重访节点，并且可以重用边。
///
/// 示例 1：
///
/// 输入：[[1,2,3],[0],[0],[0]]
/// 输出：4
/// 解释：一个可能的路径为 [1,0,2,0,3]
///
/// 示例 2：
///
/// 输入：[[1],[0,2,4],[1,3,4],[2],[1,2]]
/// 输出：4
/// 解释：一个可能的路径为 [0,1,4,2,3]
///
/// 提示：
///
/// 1 <= graph.length <= 12
/// 0 <= graph[i].length < graph.length
/// -----------------------------------------------------------------------------
public class Q0847 {
    public int shortestPathLength(int[][] graph) {
        // TODO
        return 0;
    }
}
