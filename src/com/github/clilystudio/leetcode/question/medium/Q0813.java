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
/// [813] 所有可能的路径
///
/// https://leetcode-cn.com/problems/largest-sum-of-averages/description/
///
/// 我们将给定的数组 A 分成 K 个相邻的非空子数组 ，我们的分数由每个子数组内的平均值的总和构成。计算我们所能得到的最大分数是多少。
///
/// 注意我们必须使用 A 数组中的每一个数进行分组，并且分数不一定需要是整数。
///
/// 示例:
/// 输入:
/// A = [9,1,2,3,9]
/// K = 3
/// 输出: 20
/// 解释:
/// A 的最优分组是[9], [1, 2, 3], [9]. 得到的分数是 9 + (1 + 2 + 3) / 3 + 9 = 20.
/// 我们也可以把 A 分成[9, 1], [2], [3, 9].
/// 这样的分组得到的分数为 5 + 2 + 6 = 13, 但不是最大值.
///
/// 说明:
///
/// 1 <= A.length <= 100.
/// 1 <= A[i] <= 10000.
/// 1 <= K <= A.length.
/// 答案误差在 10^-6 内被视为是正确的。
/// -----------------------------------------------------------------------------
public class Q0813 {
    public double largestSumOfAverages(int[] A, int K) {
        // TODO
        return 0.0;
    }
}
