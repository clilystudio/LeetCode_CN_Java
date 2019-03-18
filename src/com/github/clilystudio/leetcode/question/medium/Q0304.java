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
/// [304] 二维区域和检索 - 矩阵不可变
///
/// https://leetcode-cn.com/problems/range-sum-query-2d-immutable/description/
///
/// 给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1, col1) ，右下角为 (row2, col2)。
///
/// 上图子矩阵左上角 (row1, col1) = (2, 1) ，右下角(row2, col2) = (4, 3)，该子矩形内元素的总和为 8。
///
/// 示例:
///
/// 给定 matrix = [
/// ⁠ [3, 0, 1, 4, 2],
/// ⁠ [5, 6, 3, 2, 1],
/// ⁠ [1, 2, 0, 1, 5],
/// ⁠ [4, 1, 0, 1, 7],
/// ⁠ [1, 0, 3, 0, 5]
/// ]
///
/// sumRegion(2, 1, 4, 3) -> 8
/// sumRegion(1, 1, 2, 2) -> 11
/// sumRegion(1, 2, 2, 4) -> 12
///
/// 说明:
///
/// 你可以假设矩阵不可变。
/// 会多次调用 sumRegion 方法。
/// 你可以假设 row1 ≤ row2 且 col1 ≤ col2。
/// -----------------------------------------------------------------------------
/// NumMatrix对象将被实例化，并按下面方式调用：
/// NumMatrix obj = new NumMatrix(matrix);
/// int param_1 = obj.sumRegion(row1,col1,row2,col2);
/// -----------------------------------------------------------------------------
public class Q0304 {
    public class NumMatrix {

        public NumMatrix(int[][] matrix) {
            // TODO
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            // TODO
            return 0;
        }
    }
}
