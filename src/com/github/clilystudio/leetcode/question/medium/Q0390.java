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
/// [390] 消除游戏
///
/// https://leetcode-cn.com/problems/elimination-game/description/
///
/// 给定一个从1 到 n 排序的整数列表。
/// 首先，从左到右，从第一个数字开始，每隔一个数字进行删除，直到列表的末尾。
/// 第二步，在剩下的数字中，从右到左，从倒数第一个数字开始，每隔一个数字进行删除，直到列表开头。
/// 我们不断重复这两步，从左到右和从右到左交替进行，直到只剩下一个数字。
/// 返回长度为 n 的列表中，最后剩下的数字。
///
/// 示例：
///
/// 输入:
/// n = 9,
/// 1 2 3 4 5 6 7 8 9
/// 2 4 6 8
/// 2 6
/// 6
///
/// 输出:
/// 6
/// -----------------------------------------------------------------------------
public class Q0390 {
    public int lastRemaining(int n) {
        // TODO
        return 0;
    }
}
