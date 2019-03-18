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
/// [923] 鸡蛋掉落
///
/// https://leetcode-cn.com/problems/3sum-with-multiplicity/description/
///
/// 给定一个整数数组 A，以及一个整数 target 作为目标值，返回满足 i < j < k 且 A[i] + A[j] + A[k] == target
/// 的元组 i, j, k 的数量。
///
/// 由于结果会非常大，请返回 结果除以 10^9 + 7 的余数。
///
/// 示例 1：
///
/// 输入：A = [1,1,2,2,3,3,4,4,5,5], target = 8
/// 输出：20
/// 解释：
/// 按值枚举（A[i]，A[j]，A[k]）：
/// (1, 2, 5) 出现 8 次；
/// (1, 3, 4) 出现 8 次；
/// (2, 2, 4) 出现 2 次；
/// (2, 3, 3) 出现 2 次。
///
/// 示例 2：
///
/// 输入：A = [1,1,2,2,2,2], target = 5
/// 输出：12
/// 解释：
/// A[i] = 1，A[j] = A[k] = 2 出现 12 次：
/// 我们从 [1,1] 中选择一个 1，有 2 种情况，
/// 从 [2,2,2,2] 中选出两个 2，有 6 种情况。
///
/// 提示：
///
/// 3 <= A.length <= 3000
/// 0 <= A[i] <= 100
/// 0 <= target <= 300
/// -----------------------------------------------------------------------------
public class Q0923 {
    public int threeSumMulti(int[] A, int target) {
        // TODO
        return 0;
    }
}