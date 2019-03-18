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
/// [667] 优美的排列 II
///
/// https://leetcode-cn.com/problems/beautiful-arrangement-ii/description/
///
/// 给定两个整数 n 和 k，你需要实现一个数组，这个数组包含从 1 到 n 的 n 个不同整数，同时满足以下条件：
///
/// ① 如果这个数组是 [a1, a2, a3, ... , an] ，那么数组 [|a1 - a2|, |a2 - a3|, |a3 - a4|, ...
/// , |an-1 - an|] 中应该有且仅有 k 个不同整数；.
///
/// ② 如果存在多种答案，你只需实现并返回其中任意一种.
///
/// 示例 1:
///
/// 输入: n = 3, k = 1
/// 输出: [1, 2, 3]
/// 解释: [1, 2, 3] 包含 3 个范围在 1-3 的不同整数， 并且 [1, 1] 中有且仅有 1 个不同整数 : 1
///
/// 示例 2:
///
/// 输入: n = 3, k = 2
/// 输出: [1, 3, 2]
/// 解释: [1, 3, 2] 包含 3 个范围在 1-3 的不同整数， 并且 [2, 1] 中有且仅有 2 个不同整数: 1 和 2
///
/// 提示:
///
/// n 和 k 满足条件 1 <= k < n <= 10^4.
/// -----------------------------------------------------------------------------
public class Q0667 {
    public int[] constructArray(int n, int k) {
        // TODO
        return null;
    }
}
