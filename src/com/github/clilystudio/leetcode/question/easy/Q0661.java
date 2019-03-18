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
/// [661] 图片平滑器
///
/// https://leetcode-cn.com/problems/image-smoother/description/
///
/// 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入)
/// ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
///
/// 示例 1:
///
/// 输入:
/// [[1,1,1],
/// ⁠[1,0,1],
/// ⁠[1,1,1]]
/// 输出:
/// [[0, 0, 0],
/// ⁠[0, 0, 0],
/// ⁠[0, 0, 0]]
/// 解释:
/// 对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
/// 对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
/// 对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
///
/// 注意:
///
/// 给定矩阵中的整数范围为 [0, 255]。
/// 矩阵的长和宽的范围均为 [1, 150]。
/// -----------------------------------------------------------------------------
public class Q0661 {
    public int[][] imageSmoother(int[][] M) {
        // TODO
        return null;
    }
}
