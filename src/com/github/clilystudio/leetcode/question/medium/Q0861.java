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
/// [861] 翻转图像
///
/// https://leetcode-cn.com/problems/score-after-flipping-matrix/description/
///
/// 有一个二维矩阵 A 其中每个元素的值为 0 或 1 。
///
/// 移动是指选择任一行或列，并转换该行或列中的每一个值：将所有 0 都更改为 1，将所有 1 都更改为 0。
///
/// 在做出任意次数的移动后，将该矩阵的每一行都按照二进制数来解释，矩阵的得分就是这些数字的总和。
///
/// 返回尽可能高的分数。
///
/// 示例：
///
/// 输入：[[0,0,1,1],[1,0,1,0],[1,1,0,0]]
/// 输出：39
/// 解释：
/// 转换为 [[1,1,1,1],[1,0,0,1],[1,1,1,1]]
/// 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
///
/// 提示：
///
/// 1 <= A.length <= 20
/// 1 <= A[0].length <= 20
/// A[i][j] 是 0 或 1
/// -----------------------------------------------------------------------------
public class Q0861 {
    public int matrixScore(int[][] A) {
        // TODO
        return 0;
    }
}
