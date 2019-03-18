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
/// [995] Minimum Number of K Consecutive Bit Flips
///
/// https://leetcode-cn.com/problems/minimum-number-of-k-consecutive-bit-flips/description/
///
/// 在仅包含 0 和 1 的数组 A 中，一次 K 位翻转包括选择一个长度为 K 的（连续）子数组，同时将子数组中的每个 0 更改为 1，而每个 1 更改为
/// 0。
///
/// 返回所需的 K 位翻转的次数，以便数组没有值为 0 的元素。如果不可能，返回 -1。
///
/// 示例 1：
///
/// 输入：A = [0,1,0], K = 1
/// 输出：2
/// 解释：先翻转 A[0]，然后翻转 A[2]。
///
/// 示例 2：
///
/// 输入：A = [1,1,0], K = 2
/// 输出：-1
/// 解释：无论我们怎样翻转大小为 2 的子数组，我们都不能使数组变为 [1,1,1]。
///
/// 示例 3：
///
/// 输入：A = [0,0,0,1,0,1,1,0], K = 3
/// 输出：3
/// 解释：
/// 翻转 A[0],A[1],A[2]: A变成 [1,1,1,1,0,1,1,0]
/// 翻转 A[4],A[5],A[6]: A变成 [1,1,1,1,1,0,0,0]
/// 翻转 A[5],A[6],A[7]: A变成 [1,1,1,1,1,1,1,1]
///
/// 提示：
///
/// 1 <= A.length <= 30000
/// 1 <= K <= A.length
/// -----------------------------------------------------------------------------
public class Q0995 {
    public int minKBitFlips(int[] A, int K) {
        // TODO
        return 0;
    }
}
