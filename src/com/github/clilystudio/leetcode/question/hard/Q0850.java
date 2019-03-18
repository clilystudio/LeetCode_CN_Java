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
/// [850] Rectangle Area II
///
/// https://leetcode-cn.com/problems/rectangle-area-ii/description/
///
/// 我们给出了一个（轴对齐的）矩形列表 rectangles 。 对于 rectangle[i] = [x1, y1, x2,
/// y2]，其中（x1，y1）是矩形 i 左下角的坐标，（x2，y2）是该矩形右上角的坐标。
///
/// 找出平面中所有矩形叠加覆盖后的总面积。 由于答案可能太大，请返回它对 10 ^ 9 + 7 取模的结果。
///
/// 示例 1：
///
/// 输入：[[0,0,2,2],[1,0,2,3],[1,0,3,1]]
/// 输出：6
/// 解释：如图所示。
///
/// 示例 2：
///
/// 输入：[[0,0,1000000000,1000000000]]
/// 输出：49
/// 解释：答案是 10^18 对 (10^9 + 7) 取模的结果， 即 (10^9)^2 → (-7)^2 = 49 。
///
/// 提示：
///
/// 1 <= rectangles.length <= 200
/// rectanges[i].length = 4
/// 0 <= rectangles[i][j] <= 10^9
/// 矩形叠加覆盖后的总面积不会超越 2^63 - 1 ，这意味着可以用一个 64 位有符号整数来保存面积结果。
/// -----------------------------------------------------------------------------
public class Q0850 {
    public int rectangleArea(int[][] rectangles) {
        // TODO
        return 0;
    }
}
