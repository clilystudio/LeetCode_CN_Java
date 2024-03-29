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
/// [927] 子序列宽度之和
///
/// https://leetcode-cn.com/problems/three-equal-parts/description/
///
/// 给定一个由 0 和 1 组成的数组 A，将数组分成 3 个非空的部分，使得所有这些部分表示相同的二进制值。
///
/// 如果可以做到，请返回任何 [i, j]，其中 i+1 < j，这样一来：
///
/// A[0], A[1], ..., A[i] 组成第一部分；
/// A[i+1], A[i+2], ..., A[j-1] 作为第二部分；
/// A[j], A[j+1], ..., A[A.length - 1] 是第三部分。
/// 这三个部分所表示的二进制值相等。
///
/// 如果无法做到，就返回 [-1, -1]。
///
/// 注意，在考虑每个部分所表示的二进制时，应当将其看作一个整体。例如，[1,1,0] 表示十进制中的 6，而不会是 3。此外，前导零也是被允许的，所以
/// [0,1,1] 和 [1,1] 表示相同的值。
///
/// 示例 1：
///
/// 输入：[1,0,1,0,1]
/// 输出：[0,3]
///
/// 示例 2：
///
/// 输出：[1,1,0,1,1]
/// 输出：[-1,-1]
///
/// 提示：
///
/// 3 <= A.length <= 30000
/// A[i] == 0 或 A[i] == 1
/// -----------------------------------------------------------------------------
public class Q0927 {
    public int[] threeEqualParts(int[] A) {
        // TODO
        return null;
    }
}
