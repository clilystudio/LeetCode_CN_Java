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
/// [650] 只有两个键的键盘
///
/// https://leetcode-cn.com/problems/2-keys-keyboard/description/
///
/// 最初在一个记事本上只有一个字符 'A'。你每次可以对这个记事本进行两种操作：
///
/// Copy All (复制全部) : 你可以复制这个记事本中的所有字符(部分的复制是不允许的)。
/// Paste (粘贴) : 你可以粘贴你上一次复制的字符。
///
/// 给定一个数字 n 。你需要使用最少的操作次数，在记事本中打印出恰好 n 个 'A'。输出能够打印出 n 个 'A' 的最少操作次数。
///
/// 示例 1:
///
/// 输入: 3
/// 输出: 3
/// 解释:
/// 最初, 我们只有一个字符 'A'。
/// 第 1 步, 我们使用 Copy All 操作。
/// 第 2 步, 我们使用 Paste 操作来获得 'AA'。
/// 第 3 步, 我们使用 Paste 操作来获得 'AAA'。
///
/// 说明:
///
/// n 的取值范围是 [1, 1000] 。
/// -----------------------------------------------------------------------------
public class Q0650 {
    public int minSteps(int n) {
        // TODO
        return 0;
    }
}
