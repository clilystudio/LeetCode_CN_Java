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
/// [954] 环形子数组的最大和
///
/// https://leetcode-cn.com/problems/array-of-doubled-pairs/description/
///
/// 给定一个长度为偶数的整数数组 A，只有对 A 进行重组后可以满足 “对于每个 0 <= i < len(A) / 2，都有 A[2 * i + 1] =
/// 2 * A[2 * i]” 时，返回 true；否则，返回 false。
///
/// 示例 1：
///
/// 输入：[3,1,3,6]
/// 输出：false
///
/// 示例 2：
///
/// 输入：[2,1,2,6]
/// 输出：false
///
/// 示例 3：
///
/// 输入：[4,-2,2,-4]
/// 输出：true
/// 解释：我们可以用 [-2,-4] 和 [2,4] 这两组组成 [-2,-4,2,4] 或是 [2,4,-2,-4]
///
/// 示例 4：
///
/// 输入：[1,2,4,16,8,4]
/// 输出：false
///
/// 提示：
///
/// 0 <= A.length <= 30000
/// A.length 为偶数
/// -100000 <= A[i] <= 100000
/// -----------------------------------------------------------------------------
public class Q0954 {
    public boolean canReorderDoubled(int[] A) {
        // TODO
        return false;
    }
}
