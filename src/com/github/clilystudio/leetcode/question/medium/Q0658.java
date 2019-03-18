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
/// [658] 找到 K 个最接近的元素
///
/// https://leetcode-cn.com/problems/find-k-closest-elements/description/
///
/// 给定一个排序好的数组，两个整数 k 和 x，从数组中找到最靠近 x（两数之差最小）的 k 个数。返回的结果必须要是按升序排好的。如果有两个数与 x
/// 的差值一样，优先选择数值较小的那个数。
///
/// 示例 1:
///
/// 输入: [1,2,3,4,5], k=4, x=3
/// 输出: [1,2,3,4]
///
/// 示例 2:
///
/// 输入: [1,2,3,4,5], k=4, x=-1
/// 输出: [1,2,3,4]
///
/// 说明:
///
/// k 的值为正数，且总是小于给定排序数组的长度。
/// 数组不为空，且长度不超过 10^4
/// 数组里的每个元素与 x 的绝对值不超过 10^4
///
/// 更新(2017/9/19):
/// 这个参数 arr 已经被改变为一个整数数组（而不是整数列表）。 请重新加载代码定义以获取最新更改。
/// -----------------------------------------------------------------------------
public class Q0658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // TODO
        return null;
    }
}
