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

import java.util.List;

/// -----------------------------------------------------------------------------
/// [332] 重新安排行程
///
/// https://leetcode-cn.com/problems/reconstruct-itinerary/description/
///
/// 给定一个机票的字符串二维数组 [from,
/// to]，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从JFK（肯尼迪国际机场）出发的先生，所以该行程必须从
/// JFK 出发。
///
/// 说明:
///
/// 如果存在多种有效的行程，你可以按字符自然排序返回最小的行程组合。例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"]
/// 相比就更小，排序更靠前
/// 所有的机场都用三个大写字母表示（机场代码）。
/// 假定所有机票至少存在一种合理的行程。
///
/// 示例 1:
///
/// 输入: [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
/// 输出: ["JFK", "MUC", "LHR", "SFO", "SJC"]
///
/// 示例 2:
///
/// 输入: [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
/// 输出: ["JFK","ATL","JFK","SFO","ATL","SFO"]
/// 解释: 另一种有效的行程是 ["JFK","SFO","ATL","JFK","ATL","SFO"]。但是它自然排序更大更靠后。
/// -----------------------------------------------------------------------------
public class Q0332 {
    public List<String> findItinerary(String[][] tickets) {
        // TODO
        return null;
    }
}
