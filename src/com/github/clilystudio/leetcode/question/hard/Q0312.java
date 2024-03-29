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
/// [312] 戳气球
///
/// https://leetcode-cn.com/problems/burst-balloons/description/
///
/// 有 n 个气球，编号为0 到 n-1，每个气球上都标有一个数字，这些数字存在数组 nums 中。
///
/// 现在要求你戳破所有的气球。每当你戳破一个气球 i 时，你可以获得 nums[left] * nums[i] * nums[right] 个硬币。 这里的
/// left 和 right 代表和 i 相邻的两个气球的序号。注意当你戳破了气球 i 后，气球 left 和气球 right 就变成了相邻的气球。
///
/// 求所能获得硬币的最大数量。
///
/// 说明:
///
/// 你可以假设 nums[-1] = nums[n] = 1，但注意它们不是真实存在的所以并不能被戳破。
/// 0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
///
/// 示例:
///
/// 输入: [3,1,5,8]
/// 输出: 167
/// 解释: nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
/// coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
/// -----------------------------------------------------------------------------
public class Q0312 {
    public int maxCoins(int[] nums) {
        // TODO
        return 0;
    }
}
