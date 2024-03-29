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
/// [963] 三等分
///
/// https://leetcode-cn.com/problems/minimum-area-rectangle-ii/description/
///
/// 给定在 xy 平面上的一组点，确定由这些点组成的任何矩形的最小面积，其中矩形的边不一定平行于 x 轴和 y 轴。
///
/// 如果没有任何矩形，就返回 0。
///
/// 示例 1：
///
/// 输入：[[1,2],[2,1],[1,0],[0,1]]
/// 输出：2.00000
/// 解释：最小面积的矩形出现在 [1,2],[2,1],[1,0],[0,1] 处，面积为 2。
///
/// 示例 2：
///
/// 输入：[[0,1],[2,1],[1,1],[1,0],[2,0]]
/// 输出：1.00000
/// 解释：最小面积的矩形出现在 [1,0],[1,1],[2,1],[2,0] 处，面积为 1。
///
/// 示例 3：
///
/// 输入：[[0,3],[1,2],[3,1],[1,3],[2,1]]
/// 输出：0
/// 解释：没法从这些点中组成任何矩形。
///
/// 示例 4：
///
/// 输入：[[3,1],[1,1],[0,1],[2,1],[3,3],[3,2],[0,2],[2,3]]
/// 输出：2.00000
/// 解释：最小面积的矩形出现在 [2,1],[2,3],[3,3],[3,1] 处，面积为 2。
///
/// 提示：
///
/// 1 <= points.length <= 50
/// 0 <= points[i][0] <= 40000
/// 0 <= points[i][1] <= 40000
/// 所有的点都是不同的。
/// 与真实值误差不超过 10^-5 的答案将视为正确结果。
/// -----------------------------------------------------------------------------
public class Q0963 {
    public double minAreaFreeRect(int[][] points) {
        // TODO
        return 0.0;
    }
}
