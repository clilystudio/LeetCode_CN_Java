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
/// [845] Longest Mountain in Array
///
/// https://leetcode-cn.com/problems/longest-mountain-in-array/description/
///
/// 我们把数组 A 中符合下列属性的任意连续子数组 B 称为 “山脉”：
///
/// B.length >= 3
/// 存在 0 < i < B.length - 1 使得 B[0] < B[1] < ... B[i-1] < B[i] > B[i+1] > ... >
/// B[B.length - 1]
///
/// （注意：B 可以是 A 的任意子数组，包括整个数组 A。）
///
/// 给出一个整数数组 A，返回最长 “山脉” 的长度。
///
/// 如果不含有 “山脉” 则返回 0。
///
/// 示例 1：
///
/// 输入：[2,1,4,7,3,2,5]
/// 输出：5
/// 解释：最长的 “山脉” 是 [1,4,7,3,2]，长度为 5。
///
/// 示例 2：
///
/// 输入：[2,2,2]
/// 输出：0
/// 解释：不含 “山脉”。
///
/// 提示：
///
/// 0 <= A.length <= 10000
/// 0 <= A[i] <= 10000
/// -----------------------------------------------------------------------------
public class Q0845 {
    public int longestMountain(int[] A) {
        // TODO
        return 0;
    }
}
