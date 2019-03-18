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
/// [832] 二叉树剪枝
///
/// https://leetcode-cn.com/problems/flipping-an-image/description/
///
/// 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
///
/// 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
///
/// 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
///
/// 示例 1:
///
/// 输入: [[1,1,0],[1,0,1],[0,0,0]]
/// 输出: [[1,0,0],[0,1,0],[1,1,1]]
/// 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
/// ⁠    然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
///
/// 示例 2:
///
/// 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
/// 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
/// 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
/// ⁠    然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
///
/// 说明:
///
/// 1 <= A.length = A[0].length <= 20
/// 0 <= A[i][j] <= 1
/// -----------------------------------------------------------------------------
public class Q0832 {
    public int[][] flipAndInvertImage(int[][] A) {
        // TODO
        return null;
    }
}
