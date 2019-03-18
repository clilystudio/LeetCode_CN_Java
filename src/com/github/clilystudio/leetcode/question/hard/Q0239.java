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
/// [239] 滑动窗口最大值
///
/// https://leetcode-cn.com/problems/sliding-window-maximum/description/
///
/// 给定一个数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口 k
/// 内的数字。滑动窗口每次只向右移动一位。
///
/// 返回滑动窗口最大值。
///
/// 示例:
///
/// 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
/// 输出: [3,3,5,5,6,7]
/// 解释:
///
/// ⁠ 滑动窗口的位置                最大值
/// ---------------               -----
/// [1  3  -1] -3  5  3  6  7       3
/// ⁠1 [3  -1  -3] 5  3  6  7       3
/// ⁠1  3 [-1  -3  5] 3  6  7       5
/// ⁠1  3  -1 [-3  5  3] 6  7       5
/// ⁠1  3  -1  -3 [5  3  6] 7       6
/// ⁠1  3  -1  -3  5 [3  6  7]      7
///
/// 注意：
///
/// 你可以假设 k 总是有效的，1 ≤ k ≤ 输入数组的大小，且输入数组不为空。
///
/// 进阶：
///
/// 你能在线性时间复杂度内解决此题吗？
/// -----------------------------------------------------------------------------
public class Q0239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TODO
        return null;
    }
}
