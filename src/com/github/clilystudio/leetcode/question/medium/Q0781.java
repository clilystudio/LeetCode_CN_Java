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
/// [781] 基本计算器 IV
///
/// https://leetcode-cn.com/problems/rabbits-in-forest/description/
///
/// 森林中，每个兔子都有颜色。其中一些兔子（可能是全部）告诉你还有多少其他的兔子和自己有相同的颜色。我们将这些回答放在 answers 数组里。
///
/// 返回森林中兔子的最少数量。
///
/// 示例:
/// 输入: answers = [1, 1, 2]
/// 输出: 5
/// 解释:
/// 两只回答了 "1" 的兔子可能有相同的颜色，设为红色。
/// 之后回答了 "2" 的兔子不会是红色，否则他们的回答会相互矛盾。
/// 设回答了 "2" 的兔子为蓝色。
/// 此外，森林中还应有另外 2 只蓝色兔子的回答没有包含在数组中。
/// 因此森林中兔子的最少数量是 5: 3 只回答的和 2 只没有回答的。
///
/// 输入: answers = [10, 10, 10]
/// 输出: 11
///
/// 输入: answers = []
/// 输出: 0
///
/// 说明:
///
/// answers 的长度最大为1000。
/// answers[i] 是在 [0, 999] 范围内的整数。
/// -----------------------------------------------------------------------------
public class Q0781 {
    public int numRabbits(int[] answers) {
        // TODO
        return 0;
    }
}
