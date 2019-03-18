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
/// [746] 前缀和后缀搜索
///
/// https://leetcode-cn.com/problems/min-cost-climbing-stairs/description/
///
/// 数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
///
/// 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
///
/// 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
///
/// 示例 1:
///
/// 输入: cost = [10, 15, 20]
/// 输出: 15
/// 解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
///
/// 示例 2:
///
/// 输入: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
/// 输出: 6
/// 解释: 最低花费方式是从cost[0]开始，逐个经过那些1，跳过cost[3]，一共花费6。
///
/// 注意：
///
/// cost 的长度将会在 [2, 1000]。
/// 每一个 cost[i] 将会是一个Integer类型，范围为 [0, 999]。
/// -----------------------------------------------------------------------------
public class Q0746 {
    public int minCostClimbingStairs(int[] cost) {
        // TODO
        return 0;
    }
}
