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
/// [779] 最多能完成排序的块 II
///
/// https://leetcode-cn.com/problems/k-th-symbol-in-grammar/description/
///
/// 在第一行我们写上一个 0。接下来的每一行，将前一行中的0替换为01，1替换为10。
///
/// 给定行数 N 和序数 K，返回第 N 行中第 K个字符。（K从1开始）
///
/// 例子:
///
/// 输入: N = 1, K = 1
/// 输出: 0
///
/// 输入: N = 2, K = 1
/// 输出: 0
///
/// 输入: N = 2, K = 2
/// 输出: 1
///
/// 输入: N = 4, K = 5
/// 输出: 1
///
/// 解释:
/// 第一行: 0
/// 第二行: 01
/// 第三行: 0110
/// 第四行: 01101001
///
/// 注意：
///
/// N 的范围 [1, 30].
/// K 的范围 [1, 2^(N-1)].
/// -----------------------------------------------------------------------------
public class Q0779 {
    public int kthGrammar(int N, int K) {
        // TODO
        return 0;
    }
}
