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
package com.github.clilystudio.leetcode.question.easy;

/// -----------------------------------------------------------------------------
/// [941] 按奇偶排序数组
///
/// https://leetcode-cn.com/problems/valid-mountain-array/description/
///
/// 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
///
/// 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
///
/// A.length >= 3
/// 在 0 < i < A.length - 1 条件下，存在 i 使得：
///
/// A[0] < A[1] < ... A[i-1] < A[i]
/// A[i] > A[i+1] > ... > A[B.length - 1]
///
/// 示例 1：
///
/// 输入：[2,1]
/// 输出：false
///
/// 示例 2：
///
/// 输入：[3,5,5]
/// 输出：false
///
/// 示例 3：
///
/// 输入：[0,3,2,1]
/// 输出：true
///
/// 提示：
///
/// 0 <= A.length <= 10000
/// 0 <= A[i] <= 10000 
/// -----------------------------------------------------------------------------
public class Q0941 {
    public boolean validMountainArray(int[] A) {
        // TODO
        return false;
    }
}
