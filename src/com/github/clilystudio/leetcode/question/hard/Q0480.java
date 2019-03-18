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
/// [480] 滑动窗口中位数
///
/// https://leetcode-cn.com/problems/sliding-window-median/description/
///
/// 中位数是有序序列最中间的那个数。如果序列的大小是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。
///
/// 例如：
///
/// [2,3,4]，中位数是 3
///
/// [2,3]，中位数是 (2 + 3) / 2 = 2.5
///
/// 给出一个数组 nums，有一个大小为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口移动 1
/// 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。
///
/// 例如：
///
/// 给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。
///
/// 窗口位置                      中位数
/// ---------------               -----
/// [1  3  -1] -3  5  3  6  7       1
/// ⁠1 [3  -1  -3] 5  3  6  7       -1
/// ⁠1  3 [-1  -3  5] 3  6  7       -1
/// ⁠1  3  -1 [-3  5  3] 6  7       3
/// ⁠1  3  -1  -3 [5  3  6] 7       5
/// ⁠1  3  -1  -3  5 [3  6  7]      6
///
/// 因此，返回该滑动窗口的中位数数组 [1,-1,-1,3,5,6]。
///
/// 提示：
/// 假设k是合法的，即：k 始终小于输入的非空数组的元素个数.
/// -----------------------------------------------------------------------------
public class Q0480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        // TODO
        return null;
    }
}
