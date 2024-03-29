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
/// [391] 完美矩形
///
/// https://leetcode-cn.com/problems/perfect-rectangle/description/
///
/// 我们有 N 个与坐标轴对齐的矩形, 其中 N > 0, 判断它们是否能精确地覆盖一个矩形区域。
///
/// 每个矩形用左下角的点和右上角的点的坐标来表示。例如， 一个单位正方形可以表示为 [1,1,2,2]。 ( 左下角的点的坐标为 (1, 1)
/// 以及右上角的点的坐标为 (2, 2) )。
///
/// 示例 1:
///
/// rectangles = [
/// ⁠ [1,1,3,3],
/// ⁠ [3,1,4,2],
/// ⁠ [3,2,4,4],
/// ⁠ [1,3,2,4],
/// ⁠ [2,3,3,4]
/// ]
///
/// 返回 true。5个矩形一起可以精确地覆盖一个矩形区域。
///
/// 示例 2:
///
/// rectangles = [
/// ⁠ [1,1,2,3],
/// ⁠ [1,3,2,4],
/// ⁠ [3,1,4,2],
/// ⁠ [3,2,4,4]
/// ]
///
/// 返回 false。两个矩形之间有间隔，无法覆盖成一个矩形。
///
/// 示例 3:
///
/// rectangles = [
/// ⁠ [1,1,3,3],
/// ⁠ [3,1,4,2],
/// ⁠ [1,3,2,4],
/// ⁠ [3,2,4,4]
/// ]
///
/// 返回 false。图形顶端留有间隔，无法覆盖成一个矩形。
///
/// 示例 4:
///
/// rectangles = [
/// ⁠ [1,1,3,3],
/// ⁠ [3,1,4,2],
/// ⁠ [1,3,2,4],
/// ⁠ [2,2,4,4]
/// ]
///
/// 返回 false。因为中间有相交区域，虽然形成了矩形，但不是精确覆盖。
/// -----------------------------------------------------------------------------
public class Q0391 {
    public boolean isRectangleCover(int[][] rectangles) {
        // TODO
        return false;
    }
}
