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
/// [810] 有效的井字游戏
///
/// https://leetcode-cn.com/problems/chalkboard-xor-game/description/
///
/// 一个黑板上写着一个非负整数数组 nums[i]
/// 。小红和小明轮流从黑板上擦掉一个数字，小红先手。如果擦除一个数字后，剩余的所有数字按位异或运算得出的结果等于 0 的话，当前玩家游戏失败。
/// (另外，如果只剩一个数字，按位异或运算得到它本身；如果无数字剩余，按位异或运算结果为 0。）
///
/// 换种说法就是，轮到某个玩家时，如果当前黑板上所有数字按位异或运算结果等于 0，这个玩家获胜。
///
/// 假设两个玩家每步都使用最优解，当且仅当小红获胜时返回 true。
///
/// 示例:
/// 输入: nums = [1, 1, 2]
/// 输出: false
/// 解释:
/// 小红有两个选择: 擦掉数字 1 或 2。
/// 如果擦掉 1, 数组变成 [1, 2]。剩余数字按位异或得到 1 XOR 2 =
/// 3。那么小明可以擦掉任意数字，因为小红会成为擦掉最后一个数字的人，她总是会输。
/// 如果小红擦掉 2，那么数组变成[1, 1]。剩余数字按位异或得到 1 XOR 1 = 0。小红仍然会输掉游戏。
///
/// 说明:
///
/// 0 <= N <= 1000
/// 0 <= nums[i] <= 2^16
/// -----------------------------------------------------------------------------
public class Q0810 {
    public boolean xorGame(int[] nums) {
        // TODO
        return false;
    }
}
