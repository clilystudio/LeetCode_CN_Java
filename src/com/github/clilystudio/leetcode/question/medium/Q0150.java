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
/// [150] 逆波兰表达式求值
///
/// https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/description/
///
/// 根据逆波兰表示法，求表达式的值。
///
/// 有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
///
/// 说明：
///
/// 整数除法只保留整数部分。
/// 给定逆波兰表达式总是有效的。换句话说，表达式总会得出有效数值且不存在除数为 0 的情况。
///
/// 示例 1：
///
/// 输入: ["2", "1", "+", "3", "*"]
/// 输出: 9
/// 解释: ((2 + 1) * 3) = 9
///
/// 示例 2：
///
/// 输入: ["4", "13", "5", "/", "+"]
/// 输出: 6
/// 解释: (4 + (13 / 5)) = 6
///
/// 示例 3：
///
/// 输入: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
/// 输出: 22
/// 解释:
/// ⁠ ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
/// = ((10 * (6 / (12 * -11))) + 17) + 5
/// = ((10 * (6 / -132)) + 17) + 5
/// = ((10 * 0) + 17) + 5
/// = (0 + 17) + 5
/// = 17 + 5
/// = 22
/// -----------------------------------------------------------------------------
public class Q0150 {
    public int evalRPN(String[] tokens) {
        // TODO
        return 0;
    }
}
