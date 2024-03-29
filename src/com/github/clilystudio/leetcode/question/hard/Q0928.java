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
/// [928] 三维形体的表面积
///
/// https://leetcode-cn.com/problems/minimize-malware-spread-ii/description/
///
/// (这个问题与 尽量减少恶意软件的传播 是一样的，不同之处用粗体表示。)
///
/// 在节点网络中，只有当 graph[i][j] = 1 时，每个节点 i 能够直接连接到另一个节点 j。
///
/// 一些节点 initial
/// 最初被恶意软件感染。只要两个节点直接连接，且其中至少一个节点受到恶意软件的感染，那么两个节点都将被恶意软件感染。这种恶意软件的传播将继续，直到没有更多的节点可以被这种方式感染。
///
/// 假设 M(initial) 是在恶意软件停止传播之后，整个网络中感染恶意软件的最终节点数。
///
/// 我们可以从初始列表中删除一个节点，并完全移除该节点以及从该节点到任何其他节点的任何连接。如果移除这一节点将最小化 M(initial)，
/// 则返回该节点。如果有多个节点满足条件，就返回索引最小的节点。
///
/// 示例 1：
///
/// 输出：graph = [[1,1,0],[1,1,0],[0,0,1]], initial = [0,1]
/// 输入：0
///
/// 示例 2：
///
/// 输入：graph = [[1,1,0],[1,1,1],[0,1,1]], initial = [0,1]
/// 输出：1
///
/// 示例 3：
///
/// 输入：graph = [[1,1,0,0],[1,1,1,0],[0,1,1,1],[0,0,1,1]], initial = [0,1]
/// 输出：1
///
/// 提示：
///
/// 1 < graph.length = graph[0].length <= 300
/// 0 <= graph[i][j] == graph[j][i] <= 1
/// graph[i][i] = 1
/// 1 <= initial.length < graph.length
/// 0 <= initial[i] < graph.length
/// -----------------------------------------------------------------------------
public class Q0928 {
    public int minMalwareSpread(int[][] graph, int[] initial) {
        // TODO
        return 0;
    }
}
