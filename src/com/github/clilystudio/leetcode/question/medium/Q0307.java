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
/// [307] 区域和检索 - 数组可修改
///
/// https://leetcode-cn.com/problems/range-sum-query-mutable/description/
///
/// 给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
///
/// update(i, val) 函数可以通过将下标为 i 的数值更新为 val，从而对数列进行修改。
///
/// 示例:
///
/// Given nums = [1, 3, 5]
///
/// sumRange(0, 2) -> 9
/// update(1, 2)
/// sumRange(0, 2) -> 8
///
/// 说明:
///
/// 数组仅可以在 update 函数下进行修改。
/// 你可以假设 update 函数与 sumRange 函数的调用次数是均匀分布的。
/// -----------------------------------------------------------------------------
/// NumArray对象将被实例化，并按下面方式调用：
/// NumArray obj = new NumArray(nums);
/// obj.update(i,val);
/// int param_2 = obj.sumRange(i,j);
/// -----------------------------------------------------------------------------
public class Q0307 {
    public class NumArray {

        public NumArray(int[] nums) {
            // TODO
        }

        public void update(int i, int val) {
            // TODO
        }

        public int sumRange(int i, int j) {
            // TODO
            return 0;
        }
    }
}
