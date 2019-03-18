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
/// [786] K-th Smallest Prime Fraction
///
/// https://leetcode-cn.com/problems/k-th-smallest-prime-fraction/description/
///
/// 一个已排序好的表 A，其包含 1 和其他一些素数.  当列表中的每一个 p<q 时，我们可以构造一个分数 p/q 。
///
/// 那么第 k 个最小的分数是多少呢?  以整数数组的形式返回你的答案, 这里 answer[0] = p 且 answer[1] = q.
///
/// 示例:
/// 输入: A = [1, 2, 3, 5], K = 3
/// 输出: [2, 5]
/// 解释:
/// 已构造好的分数,排序后如下所示:
/// 1/5, 1/3, 2/5, 1/2, 3/5, 2/3.
/// 很明显第三个最小的分数是 2/5.
///
/// 输入: A = [1, 7], K = 1
/// 输出: [1, 7]
///
/// 注意:
///
/// A 的取值范围在 2 — 2000.
/// 每个 A[i] 的值在 1 —30000.
/// K 取值范围为 1 —A.length * (A.length - 1) / 2
/// -----------------------------------------------------------------------------
public class Q0786 {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        // TODO
        return null;
    }
}
