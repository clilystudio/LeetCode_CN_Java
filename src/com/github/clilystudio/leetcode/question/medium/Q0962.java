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
/// [962] 将字符串翻转到单调递增
///
/// https://leetcode-cn.com/problems/maximum-width-ramp/description/
///
/// 给定一个整数数组 A，坡是元组 (i, j)，其中  i < j 且 A[i] <= A[j]。这样的坡的宽度为 j - i。
///
/// 找出 A 中的坡的最大宽度，如果不存在，返回 0 。
///
/// 示例 1：
///
/// 输入：[6,0,8,2,1,5]
/// 输出：4
/// 解释：
/// 最大宽度的坡为 (i, j) = (1, 5): A[1] = 0 且 A[5] = 5.
///
/// 示例 2：
///
/// 输入：[9,8,1,0,1,9,4,0,4,1]
/// 输出：7
/// 解释：
/// 最大宽度的坡为 (i, j) = (2, 9): A[2] = 1 且 A[9] = 1.
///
/// 提示：
///
/// 2 <= A.length <= 50000
/// 0 <= A[i] <= 50000
/// -----------------------------------------------------------------------------
public class Q0962 {
    public int maxWidthRamp(int[] A) {
        // TODO
        return 0;
    }
}
