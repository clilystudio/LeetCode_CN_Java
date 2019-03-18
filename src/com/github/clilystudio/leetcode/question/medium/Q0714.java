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
/// [714] 买卖股票的最佳时机含手续费
///
/// https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
///
/// 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
///
/// 你可以无限次地完成交易，但是你每次交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
///
/// 返回获得利润的最大值。
///
/// 示例 1:
///
/// 输入: prices = [1, 3, 2, 8, 4, 9], fee = 2
/// 输出: 8
/// 解释: 能够达到的最大利润:
/// 在此处买入 prices[0] = 1
/// 在此处卖出 prices[3] = 8
/// 在此处买入 prices[4] = 4
/// 在此处卖出 prices[5] = 9
/// 总利润: ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
///
/// 注意:
///
/// 0 < prices.length <= 50000.
/// 0 < prices[i] < 50000.
/// 0 <= fee < 50000.
/// -----------------------------------------------------------------------------
public class Q0714 {
    public int maxProfit(int[] prices, int fee) {
        // TODO
        return 0;
    }
}
