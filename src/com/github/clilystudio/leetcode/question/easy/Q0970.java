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

import java.util.List;

/// -----------------------------------------------------------------------------
/// [970] Powerful Integers
///
/// https://leetcode-cn.com/problems/powerful-integers/description/
///
/// 给定两个正整数 x 和 y，如果某一整数等于 x^i + y^j，其中整数 i >= 0 且 j >= 0，那么我们认为该整数是一个强整数。
///
/// 返回值小于或等于 bound 的所有强整数组成的列表。
///
/// 你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。
///
/// 示例 1：
///
/// 输入：x = 2, y = 3, bound = 10
/// 输出：[2,3,4,5,7,9,10]
/// 解释：
/// 2 = 2^0 + 3^0
/// 3 = 2^1 + 3^0
/// 4 = 2^0 + 3^1
/// 5 = 2^1 + 3^1
/// 7 = 2^2 + 3^1
/// 9 = 2^3 + 3^0
/// 10 = 2^0 + 3^2
///
/// 示例 2：
///
/// 输入：x = 3, y = 5, bound = 15
/// 输出：[2,4,6,8,10,14]
///
/// 提示：
///
/// 1 <= x <= 100
/// 1 <= y <= 100
/// 0 <= bound <= 10^6
/// -----------------------------------------------------------------------------
public class Q0970 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        // TODO
        return null;
    }
}
