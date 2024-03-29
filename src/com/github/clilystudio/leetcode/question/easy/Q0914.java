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

/// -----------------------------------------------------------------------------
/// [914] 非重叠矩形中的随机点
///
/// https://leetcode-cn.com/problems/x-of-a-kind-in-a-deck-of-cards/description/
///
/// 给定一副牌，每张牌上都写着一个整数。
///
/// 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
///
/// 每组都有 X 张牌。
/// 组内所有的牌上都写着相同的整数。
///
/// 仅当你可选的 X >= 2 时返回 true。
///
/// 示例 1：
///
/// 输入：[1,2,3,4,4,3,2,1]
/// 输出：true
/// 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
///
/// 示例 2：
///
/// 输入：[1,1,1,2,2,2,3,3]
/// 输出：false
/// 解释：没有满足要求的分组。
///
/// 示例 3：
///
/// 输入：[1]
/// 输出：false
/// 解释：没有满足要求的分组。
///
/// 示例 4：
///
/// 输入：[1,1]
/// 输出：true
/// 解释：可行的分组是 [1,1]
///
/// 示例 5：
///
/// 输入：[1,1,2,2,2,2]
/// 输出：true
/// 解释：可行的分组是 [1,1]，[2,2]，[2,2]
///
/// 提示：
///
/// 1 <= deck.length <= 10000
/// 0 <= deck[i] < 10000
/// -----------------------------------------------------------------------------
public class Q0914 {
    public boolean hasGroupsSizeX(int[] deck) {
        // TODO
        return false;
    }
}
