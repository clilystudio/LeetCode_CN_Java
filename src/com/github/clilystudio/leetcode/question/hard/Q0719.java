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
/// [719] 找出第 k 小的距离对
///
/// https://leetcode-cn.com/problems/find-k-th-smallest-pair-distance/description/
///
/// 给定一个整数数组，返回所有数对之间的第 k 个最小距离。一对 (A, B) 的距离被定义为 A 和 B 之间的绝对差值。
///
/// 示例 1:
///
/// 输入：
/// nums = [1,3,1]
/// k = 1
/// 输出：0
/// 解释：
/// 所有数对如下：
/// (1,3) -> 2
/// (1,1) -> 0
/// (3,1) -> 2
/// 因此第 1 个最小距离的数对是 (1,1)，它们之间的距离为 0。
///
/// 提示:
///
/// 2 <= len(nums) <= 10000.
/// 0 <= nums[i] < 1000000.
/// 1 <= k <= len(nums) * (len(nums) - 1) / 2.
/// -----------------------------------------------------------------------------
public class Q0719 {
    public int smallestDistancePair(int[] nums, int k) {
        // TODO
        return 0;
    }
}
