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
/// [526] 优美的排列
///
/// https://leetcode-cn.com/problems/beautiful-arrangement/description/
///
/// 假设有从 1 到 N 的 N 个整数，如果从这 N 个数字中成功构造出一个数组，使得数组的第 i 位 (1 <= i <= N)
/// 满足如下两个条件中的一个，我们就称这个数组为一个优美的排列。条件：
///
/// 第 i 位的数字能被 i 整除
/// i 能被第 i 位上的数字整除
///
/// 现在给定一个整数 N，请问可以构造多少个优美的排列？
///
/// 示例1:
///
/// 输入: 2
/// 输出: 2
/// 解释:
///
/// 第 1 个优美的排列是 [1, 2]:
/// ⁠ 第 1 个位置（i=1）上的数字是1，1能被 i（i=1）整除
/// ⁠ 第 2 个位置（i=2）上的数字是2，2能被 i（i=2）整除
///
/// 第 2 个优美的排列是 [2, 1]:
/// ⁠ 第 1 个位置（i=1）上的数字是2，2能被 i（i=1）整除
/// ⁠ 第 2 个位置（i=2）上的数字是1，i（i=2）能被 1 整除
///
/// 说明:
///
/// N 是一个正整数，并且不会超过15。
/// -----------------------------------------------------------------------------
public class Q0526 {
    public int countArrangement(int N) {
        // TODO
        return 0;
    }
}
