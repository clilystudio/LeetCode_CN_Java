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
/// [241] 为运算表达式设计优先级
///
/// https://leetcode-cn.com/problems/different-ways-to-add-parentheses/description/
///
/// 给定一个含有数字和运算符的字符串，为表达式添加括号，改变其运算优先级以求出不同的结果。你需要给出所有可能的组合的结果。有效的运算符号包含 +, - 以及
/// * 。
///
/// 示例 1:
///
/// 输入: "2-1-1"
/// 输出: [0, 2]
/// 解释:
/// ((2-1)-1) = 0
/// (2-(1-1)) = 2
///
/// 示例 2:
///
/// 输入: "2*3-4*5"
/// 输出: [-34, -14, -10, -10, 10]
/// 解释:
/// (2*(3-(4*5))) = -34
/// ((2*3)-(4*5)) = -14
/// ((2*(3-4))*5) = -10
/// (2*((3-4)*5)) = -10
/// (((2*3)-4)*5) = 10
/// -----------------------------------------------------------------------------
public class Q0241 {
    public List<Integer> diffWaysToCompute(String input) {
        // TODO
        return null;
    }
}
