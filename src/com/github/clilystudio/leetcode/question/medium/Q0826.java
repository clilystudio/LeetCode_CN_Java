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
/// [826] 分汤
///
/// https://leetcode-cn.com/problems/most-profit-assigning-work/description/
///
/// 有一些工作：difficulty[i] 表示第i个工作的难度，profit[i]表示第i个工作的收益。
///
/// 现在我们有一些工人。worker[i]是第i个工人的能力，即该工人只能完成难度小于等于worker[i]的工作。
///
/// 每一个工人都最多只能安排一个工作，但是一个工作可以完成多次。
///
/// 举个例子，如果3个工人都尝试完成一份报酬为1的同样工作，那么总收益为 $3。如果一个工人不能完成任何工作，他的收益为 $0 。
///
/// 我们能得到的最大收益是多少？
///
/// 示例：
///
/// 输入: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
/// 输出: 100
/// 解释: 工人被分配的工作难度是 [4,4,6,6] ，分别获得 [20,20,30,30] 的收益。
///
/// 提示:
///
/// 1 <= difficulty.length = profit.length <= 10000
/// 1 <= worker.length <= 10000
/// difficulty[i], profit[i], worker[i]  的范围是 [1, 10^5]
/// -----------------------------------------------------------------------------
public class Q0826 {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        // TODO
        return 0;
    }
}
