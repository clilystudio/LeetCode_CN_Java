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
/// [454] 四数相加 II
///
/// https://leetcode-cn.com/problems/4sum-ii/description/
///
/// 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] +
/// D[l] = 0。
///
/// 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -2^28 到 2^28 - 1
/// 之间，最终结果不会超过 2^31 - 1 。
///
/// 例如:
///
/// 输入:
/// A = [ 1, 2]
/// B = [-2,-1]
/// C = [-1, 2]
/// D = [ 0, 2]
///
/// 输出:
/// 2
///
/// 解释:
/// 两个元组如下:
/// 1. (0, 0, 0, 1) -> A[0] + B[0] + C[0] + D[1] = 1 + (-2) + (-1) + 2 = 0
/// 2. (1, 1, 0, 0) -> A[1] + B[1] + C[0] + D[0] = 2 + (-1) + (-1) + 0 = 0
/// -----------------------------------------------------------------------------
public class Q0454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        // TODO
        return 0;
    }
}
