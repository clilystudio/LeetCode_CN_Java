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
/// [793] 在LR字符串中交换相邻字符
///
/// https://leetcode-cn.com/problems/preimage-size-of-factorial-zeroes-function/description/
///
///  f(x) 是 x! 末尾是0的数量。（回想一下 x! = 1 * 2 * 3 * ... * x，且0! = 1）
///
/// 例如， f(3) = 0 ，因为3! = 6的末尾没有0；而 f(11) = 2 ，因为11!= 39916800末端有2个0。给定
/// K，找出多少个非负整数x ，有 f(x) = K 的性质。
///
/// 示例 1:
/// 输入:K = 0
/// 输出:5
/// 解释: 0!, 1!, 2!, 3!, and 4! 均符合 K = 0 的条件。
///
/// 示例 2:
/// 输入:K = 5
/// 输出:0
/// 解释:没有匹配到这样的 x!，符合K = 5 的条件。
///
/// 注意：
///
/// K是范围在 [0, 10^9] 的整数。
/// -----------------------------------------------------------------------------
public class Q0793 {
    public int preimageSizeFZF(int K) {
        // TODO
        return 0;
    }
}
