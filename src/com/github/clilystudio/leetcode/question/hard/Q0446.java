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
/// [446] 等差数列划分 II - 子序列
///
/// https://leetcode-cn.com/problems/arithmetic-slices-ii-subsequence/description/
///
/// 如果一个数列至少有三个元素，并且任意两个相邻元素之差相同，则称该数列为等差数列。
///
/// 例如，以下数列为等差数列:
///
/// 1, 3, 5, 7, 9
/// 7, 7, 7, 7
/// 3, -1, -5, -9
///
/// 以下数列不是等差数列。
///
/// 1, 1, 2, 5, 7
///
/// 数组 A 包含 N 个数，且索引从 0 开始。该数组子序列将划分为整数序列 (P0, P1, ..., Pk)，P 与 Q 是整数且满足 0 ≤ P0
/// < P1 < ... < Pk < N。
///
/// 如果序列 A[P0]，A[P1]，...，A[Pk-1]，A[Pk] 是等差的，那么数组 A 的子序列 (P0，P1，…，PK)
/// 称为等差序列。值得注意的是，这意味着 k ≥ 2。
///
/// 函数要返回数组 A 中所有等差子序列的个数。
///
/// 输入包含 N 个整数。每个整数都在 -2^31 和 2^31-1 之间，另外 0 ≤ N ≤ 1000。保证输出小于 2^31-1。
///
/// 示例：
///
/// 输入：[2, 4, 6, 8, 10]
///
/// 输出：7
///
/// 解释：
/// 所有的等差子序列为：
/// [2,4,6]
/// [4,6,8]
/// [6,8,10]
/// [2,4,6,8]
/// [4,6,8,10]
/// [2,4,6,8,10]
/// [2,6,10]
/// -----------------------------------------------------------------------------
public class Q0446 {
    public int numberOfArithmeticSlices(int[] A) {
        // TODO
        return 0;
    }
}
