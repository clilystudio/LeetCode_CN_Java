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
/// [852] 适龄的朋友
///
/// https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/description/
///
/// 我们把符合下列属性的数组 A 称作山脉：
///
/// A.length >= 3
/// 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... >
/// A[A.length - 1]
///
/// 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... >
/// A[A.length - 1] 的 i 的值。
///
/// 示例 1：
///
/// 输入：[0,1,0]
/// 输出：1
///
/// 示例 2：
///
/// 输入：[0,2,1,0]
/// 输出：1
///
/// 提示：
///
/// 3 <= A.length <= 10000
/// 0 <= A[i] <= 10^6
/// A 是如上定义的山脉
/// -----------------------------------------------------------------------------
public class Q0852 {
    public int peakIndexInMountainArray(int[] A) {
        // TODO
        return 0;
    }
}
