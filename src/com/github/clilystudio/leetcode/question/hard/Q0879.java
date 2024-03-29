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
/// [879] 到最近的人的最大距离
///
/// https://leetcode-cn.com/problems/profitable-schemes/description/
///
/// 帮派里有 G 名成员，他们可能犯下各种各样的罪行。
///
/// 第 i 种犯罪会产生 profit[i] 的利润，它要求 group[i] 名成员共同参与。
///
/// 让我们把这些犯罪的任何子集称为盈利计划，该计划至少产生 P 的利润。
///
/// 有多少种方案可以选择？因为答案很大，所以返回它模 10^9 + 7 的值。
///
/// 示例 1：
///
/// 输入：G = 5, P = 3, group = [2,2], profit = [2,3]
/// 输出：2
/// 解释：
/// 至少产生 3 的利润，该帮派可以犯下罪 0 和罪 1 ，或仅犯下罪 1 。
/// 总的来说，有两种方案。
///
/// 示例 2:
///
/// 输入：G = 10, P = 5, group = [2,3,5], profit = [6,7,8]
/// 输出：7
/// 解释：
/// 至少产生 5 的利润，只要他们犯其中一种罪就行，所以该帮派可以犯下任何罪行 。
/// 有 7 种可能的计划：(0)，(1)，(2)，(0,1)，(0,2)，(1,2)，以及 (0,1,2) 。
///
/// 提示：
///
/// 1 <= G <= 100
/// 0 <= P <= 100
/// 1 <= group[i] <= 100
/// 0 <= profit[i] <= 100
/// 1 <= group.length = profit.length <= 100
/// -----------------------------------------------------------------------------
public class Q0879 {
    public int profitableSchemes(int G, int P, int[] group, int[] profit) {
        // TODO
        return 0;
    }
}
