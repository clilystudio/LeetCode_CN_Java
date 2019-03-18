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
/// [494] 目标和
///
/// https://leetcode-cn.com/problems/target-sum/description/
///
/// 给定一个非负整数数组，a1, a2, ..., an, 和一个目标数，S。现在你有两个符号 + 和 -。对于数组中的任意一个整数，你都可以从 + 或
/// -中选择一个符号添加在前面。
///
/// 返回可以使最终数组和为目标数 S 的所有添加符号的方法数。
///
/// 示例 1:
///
/// 输入: nums: [1, 1, 1, 1, 1], S: 3
/// 输出: 5
/// 解释:
/// -----------------------------------------------------------------------------1+1+1+1+1 = 3
/// +1-1+1+1+1 = 3
/// +1+1-1+1+1 = 3
/// +1+1+1-1+1 = 3
/// +1+1+1+1-1 = 3
///
/// 一共有5种方法让最终目标和为3。
///
/// 注意:
///
/// 数组的长度不会超过20，并且数组中的值全为正数。
/// 初始的数组的和不会超过1000。
/// 保证返回的最终结果为32位整数。
/// -----------------------------------------------------------------------------
public class Q0494 {
    public int findTargetSumWays(int[] nums, int S) {
        // TODO
        return 0;
    }
}
