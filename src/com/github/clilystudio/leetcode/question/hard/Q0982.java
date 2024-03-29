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
/// [982] 使数组唯一的最小增量
///
/// https://leetcode-cn.com/problems/triples-with-bitwise-and-equal-to-zero/description/
///
/// 给定一个整数数组 A，找出索引为 (i, j, k) 的三元组，使得：
///
/// 0 <= i < A.length
/// 0 <= j < A.length
/// 0 <= k < A.length
/// A[i] & A[j] & A[k] == 0，其中 & 表示按位与（AND）操作符。
///
/// 示例：
///
/// 输入：[2,1,3]
/// 输出：12
/// 解释：我们可以选出如下 i, j, k 三元组：
/// (i=0, j=0, k=1) : 2 & 2 & 1
/// (i=0, j=1, k=0) : 2 & 1 & 2
/// (i=0, j=1, k=1) : 2 & 1 & 1
/// (i=0, j=1, k=2) : 2 & 1 & 3
/// (i=0, j=2, k=1) : 2 & 3 & 1
/// (i=1, j=0, k=0) : 1 & 2 & 2
/// (i=1, j=0, k=1) : 1 & 2 & 1
/// (i=1, j=0, k=2) : 1 & 2 & 3
/// (i=1, j=1, k=0) : 1 & 1 & 2
/// (i=1, j=2, k=0) : 1 & 3 & 2
/// (i=2, j=0, k=1) : 3 & 2 & 1
/// (i=2, j=1, k=0) : 3 & 1 & 2
///
/// 提示：
///
/// 1 <= A.length <= 1000
/// 0 <= A[i] < 2048
/// -----------------------------------------------------------------------------
public class Q0982 {
    public int countTriplets(int[] A) {
        // TODO
        return 0;
    }
}
