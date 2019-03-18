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
/// [703] Kth Largest Element in a Stream
///
/// https://leetcode-cn.com/problems/kth-largest-element-in-a-stream/description/
///
/// 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
///
/// 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用
/// KthLargest.add，返回当前数据流中第K大的元素。
///
/// 示例:
///
/// int k = 3;
/// int[] arr = [4,5,8,2];
/// KthLargest kthLargest = new KthLargest(3, arr);
/// kthLargest.add(3);   // returns 4
/// kthLargest.add(5);   // returns 5
/// kthLargest.add(10);  // returns 5
/// kthLargest.add(9);   // returns 8
/// kthLargest.add(4);   // returns 8
///
/// 说明:
/// 你可以假设 nums 的长度≥ k-1 且k ≥ 1。
/// -----------------------------------------------------------------------------
/// KthLargest对象将被实例化，并按下面方式调用：
/// KthLargest obj = new KthLargest(k, nums);
/// int param_1 = obj.add(val);
/// -----------------------------------------------------------------------------
public class Q0703 {

    public class KthLargest {

        public KthLargest(int k, int[] nums) {
            // TODO
        }

        public int add(int val) {
            // TODO
            return 0;
        }
    }
}
