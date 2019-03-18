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
/// [874] 比较含退格的字符串
///
/// https://leetcode-cn.com/problems/walking-robot-simulation/description/
///
/// 机器人在一个无限大小的网格上行走，从点 (0, 0) 处开始出发，面向北方。该机器人可以接收以下三种类型的命令：
/// -----------------------------------------------------------------------------2：向左转 90 度
/// -1：向右转 90 度
/// 1 <= x <= 9：向前移动 x 个单位长度
///
/// 在网格上有一些格子被视为障碍物。
///
/// 第 i 个障碍物位于网格点  (obstacles[i][0], obstacles[i][1])
///
/// 如果机器人试图走到障碍物上方，那么它将停留在障碍物的前一个网格方块上，但仍然可以继续该路线的其余部分。
///
/// 返回从原点到机器人的最大欧式距离的平方。
///
/// 示例 1：
///
/// 输入: commands = [4,-1,3], obstacles = []
/// 输出: 25
/// 解释: 机器人将会到达 (3, 4)
///
/// 示例 2：
///
/// 输入: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
/// 输出: 65
/// 解释: 机器人在左转走到 (1, 8) 之前将被困在 (1, 4) 处
///
/// 提示：
///
/// 0 <= commands.length <= 10000
/// 0 <= obstacles.length <= 10000
/// -30000 <= obstacle[i][0] <= 30000
/// -30000 <= obstacle[i][1] <= 30000
/// 答案保证小于 2 ^ 31
/// -----------------------------------------------------------------------------
public class Q0874 {
    public int robotSim(int[] commands, int[][] obstacles) {
        // TODO
        return 0;
    }
}
