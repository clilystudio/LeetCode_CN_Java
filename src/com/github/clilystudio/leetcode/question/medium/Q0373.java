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

import java.util.List;

/// -----------------------------------------------------------------------------
/// [373] 查找和最小的K对数字
///
/// https://leetcode-cn.com/problems/find-k-pairs-with-smallest-sums/description/
///
/// 给定两个以升序排列的整形数组 nums1 和 nums2, 以及一个整数 k。
///
/// 定义一对值 (u,v)，其中第一个元素来自 nums1，第二个元素来自 nums2。
///
/// 找到和最小的 k 对数字 (u1,v1), (u2,v2) ... (uk,vk)。
///
/// 示例 1:
///
/// 输入: nums1 = [1,7,11], nums2 = [2,4,6], k = 3
/// 输出: [1,2],[1,4],[1,6]
/// 解释: 返回序列中的前 3 对数：
/// ⁠    [1,2],[1,4],[1,6],[7,2],[7,4],[11,2],[7,6],[11,4],[11,6]
///
/// 示例 2:
///
/// 输入: nums1 = [1,1,2], nums2 = [1,2,3], k = 2
/// 输出: [1,1],[1,1]
/// 解释: 返回序列中的前 2 对数：
/// [1,1],[1,1],[1,2],[2,1],[1,2],[2,2],[1,3],[1,3],[2,3]
///
/// 示例 3:
///
/// 输入: nums1 = [1,2], nums2 = [3], k = 3
/// 输出: [1,3],[2,3]
/// 解释: 也可能序列中所有的数对都被返回:[1,3],[2,3]
/// -----------------------------------------------------------------------------
public class Q0373 {
    public List<int[]> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        // TODO
        return null;
    }
}
