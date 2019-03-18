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
/// [815] 香槟塔
///
/// https://leetcode-cn.com/problems/bus-routes/description/
///
/// 我们有一系列公交路线。每一条路线 routes[i] 上都有一辆公交车在上面循环行驶。例如，有一条路线 routes[0] = [1, 5,
/// 7]，表示第一辆 (下标为0) 公交车会一直按照 1->5->7->1->5->7->1->... 的车站路线行驶。
///
/// 假设我们从 S 车站开始（初始时不在公交车上），要去往 T 站。 期间仅可乘坐公交车，求出最少乘坐的公交车数量。返回 -1 表示不可能到达终点车站。
///
/// 示例:
/// 输入:
/// routes = [[1, 2, 7], [3, 6, 7]]
/// S = 1
/// T = 6
/// 输出: 2
/// 解释:
/// 最优策略是先乘坐第一辆公交车到达车站 7, 然后换乘第二辆公交车到车站 6。
///
/// 说明:
///
/// 1 <= routes.length <= 500.
/// 1 <= routes[i].length <= 500.
/// 0 <= routes[i][j] < 10 ^ 6.
/// -----------------------------------------------------------------------------
public class Q0815 {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        // TODO
        return 0;
    }
}
