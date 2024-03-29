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
/// [775] N叉树的前序遍历
///
/// https://leetcode-cn.com/problems/global-and-local-inversions/description/
///
/// 数组 A 是 [0, 1, ..., N - 1] 的一种排列，N 是数组 A 的长度。全局倒置指的是 i,j 满足 0 <= i < j < N 并且
/// A[i] > A[j] ，局部倒置指的是 i 满足 0 <= i < N 并且 A[i] > A[i+1] 。
///
/// 当数组 A 中全局倒置的数量等于局部倒置的数量时，返回 true 。
///
/// 示例 1:
///
/// 输入: A = [1,0,2]
/// 输出: true
/// 解释: 有 1 个全局倒置，和 1 个局部倒置。
///
/// 示例 2:
///
/// 输入: A = [1,2,0]
/// 输出: false
/// 解释: 有 2 个全局倒置，和 1 个局部倒置。
///
/// 注意:
///
/// A 是 [0, 1, ..., A.length - 1] 的一种排列
/// A 的长度在 [1, 5000]之间
/// 这个问题的时间限制已经减少了。
/// -----------------------------------------------------------------------------
public class Q0775 {
    public boolean isIdealPermutation(int[] A) {
        // TODO
        return false;
    }
}
