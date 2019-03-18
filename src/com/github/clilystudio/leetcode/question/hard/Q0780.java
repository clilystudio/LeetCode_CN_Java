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
/// [780] 最多能完成排序的块
///
/// https://leetcode-cn.com/problems/reaching-points/description/
///
/// 从点 (x, y) 可以转换到 (x, x+y)  或者 (x+y, y)。
///
/// 给定一个起点 (sx, sy) 和一个终点 (tx, ty)，如果通过一系列的转换可以从起点到达终点，则返回 True ，否则返回 False。
///
/// 示例:
/// 输入: sx = 1, sy = 1, tx = 3, ty = 5
/// 输出: True
/// 解释:
/// 可以通过以下一系列转换从起点转换到终点：
/// (1, 1) -> (1, 2)
/// (1, 2) -> (3, 2)
/// (3, 2) -> (3, 5)
///
/// 输入: sx = 1, sy = 1, tx = 2, ty = 2
/// 输出: False
///
/// 输入: sx = 1, sy = 1, tx = 1, ty = 1
/// 输出: True
///
/// 注意:
///
/// sx, sy, tx, ty 是范围在 [1, 10^9] 的整数。
/// -----------------------------------------------------------------------------
public class Q0780 {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        // TODO
        return false;
    }
}
