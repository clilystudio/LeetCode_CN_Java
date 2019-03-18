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
/// [762] Prime Number of Set Bits in Binary Representation
///
/// https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/description/
///
/// 给定两个整数 L 和 R ，找到闭区间 [L, R] 范围内，计算置位位数为质数的整数个数。
///
/// （注意，计算置位代表二进制表示中1的个数。例如 21 的二进制表示 10101 有 3 个计算置位。还有，1 不是质数。）
///
/// 示例 1:
///
/// 输入: L = 6, R = 10
/// 输出: 4
/// 解释:
/// 6 -> 110 (2 个计算置位，2 是质数)
/// 7 -> 111 (3 个计算置位，3 是质数)
/// 9 -> 1001 (2 个计算置位，2 是质数)
/// 10-> 1010 (2 个计算置位，2 是质数)
///
/// 示例 2:
///
/// 输入: L = 10, R = 15
/// 输出: 5
/// 解释:
/// 10 -> 1010 (2 个计算置位, 2 是质数)
/// 11 -> 1011 (3 个计算置位, 3 是质数)
/// 12 -> 1100 (2 个计算置位, 2 是质数)
/// 13 -> 1101 (3 个计算置位, 3 是质数)
/// 14 -> 1110 (3 个计算置位, 3 是质数)
/// 15 -> 1111 (4 个计算置位, 4 不是质数)
///
/// 注意:
///
/// L, R 是 L <= R 且在 [1, 10^6] 中的整数。
/// R - L 的最大值为 10000。
/// -----------------------------------------------------------------------------
public class Q0762 {
    public int countPrimeSetBits(int L, int R) {
        // TODO
        return 0;
    }
}
