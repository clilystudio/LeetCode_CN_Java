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
/// [931] 最大频率栈
///
/// https://leetcode-cn.com/problems/minimum-falling-path-sum/description/
///
/// 给定一个方形整数数组 A，我们想要得到通过 A 的下降路径的最小和。
///
/// 下降路径可以从第一行中的任何元素开始，并从每一行中选择一个元素。在下一行选择的元素和当前行所选元素最多相隔一列。
///
/// 示例：
///
/// 输入：[[1,2,3],[4,5,6],[7,8,9]]
/// 输出：12
/// 解释：
/// 可能的下降路径有：
///
/// [1,4,7], [1,4,8], [1,5,7], [1,5,8], [1,5,9]
/// [2,4,7], [2,4,8], [2,5,7], [2,5,8], [2,5,9], [2,6,8], [2,6,9]
/// [3,5,7], [3,5,8], [3,5,9], [3,6,8], [3,6,9]
///
/// 和最小的下降路径是 [1,4,7]，所以答案是 12。
///
/// 提示：
///
/// 1 <= A.length == A[0].length <= 100
/// -100 <= A[i][j] <= 100
/// -----------------------------------------------------------------------------
public class Q0931 {
    public int minFallingPathSum(int[][] A) {
        // TODO
        return 0;
    }
}
