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
/// [743] Network Delay Time
///
/// https://leetcode-cn.com/problems/network-delay-time/description/
///
/// 有 N 个网络节点，标记为 1 到 N。
///
/// 给定一个列表 times，表示信号经过有向边的传递时间。 times[i] = (u, v, w)，其中 u 是源节点，v 是目标节点， w
/// 是一个信号从源节点传递到目标节点的时间。
///
/// 现在，我们向当前的节点 K 发送了一个信号。需要多久才能使所有节点都收到信号？如果不能使所有节点收到信号，返回 -1。
///
/// 注意:
///
/// N 的范围在 [1, 100] 之间。
/// K 的范围在 [1, N] 之间。
/// times 的长度在 [1, 6000] 之间。
/// 所有的边 times[i] = (u, v, w) 都有 1 <= u, v <= N 且 0 <= w <= 100。
/// -----------------------------------------------------------------------------
public class Q0743 {
    public int networkDelayTime(int[][] times, int N, int K) {
        // TODO
        return 0;
    }
}
