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
/// [991] 二倍数对数组
///
/// https://leetcode-cn.com/problems/broken-calculator/description/
///
/// 在显示着数字的坏计算器上，我们可以执行以下两种操作：
///
/// 双倍（Double）：将显示屏上的数字乘 2；
/// 递减（Decrement）：将显示屏上的数字减 1 。
///
/// 最初，计算器显示数字 X。
///
/// 返回显示数字 Y 所需的最小操作数。
///
/// 示例 1：
///
/// 输入：X = 2, Y = 3
/// 输出：2
/// 解释：先进行双倍运算，然后再进行递减运算 {2 -> 4 -> 3}.
///
/// 示例 2：
///
/// 输入：X = 5, Y = 8
/// 输出：2
/// 解释：先递减，再双倍 {5 -> 4 -> 8}.
///
/// 示例 3：
///
/// 输入：X = 3, Y = 10
/// 输出：3
/// 解释：先双倍，然后递减，再双倍 {3 -> 6 -> 5 -> 10}.
///
/// 示例 4：
///
/// 输入：X = 1024, Y = 1
/// 输出：1023
/// 解释：执行递减运算 1023 次
///
/// 提示：
///
/// 1 <= X <= 10^9
/// 1 <= Y <= 10^9
/// -----------------------------------------------------------------------------
public class Q0991 {
    public int brokenCalc(int X, int Y) {
        // TODO
        return 0;
    }
}
