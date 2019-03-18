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
/// [396] 旋转函数
///
/// https://leetcode-cn.com/problems/rotate-function/description/
///
/// 给定一个长度为 n 的整数数组 A 。
///
/// 假设 Bk 是数组 A 顺时针旋转 k 个位置后的数组，我们定义 A 的“旋转函数” F 为：
///
/// F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]。
///
/// 计算F(0), F(1), ..., F(n-1)中的最大值。
///
/// 注意:
/// 可以认为 n 的值小于 10^5。
///
/// 示例:
///
/// A = [4, 3, 2, 6]
///
/// F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
/// F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
/// F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
/// F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
///
/// 所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
/// -----------------------------------------------------------------------------
public class Q0396 {
    public int maxRotateFunction(int[] A) {
        // TODO
        return 0;
    }
}
