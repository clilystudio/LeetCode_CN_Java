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
/// [380] 常数时间插入、删除和获取随机元素
///
/// https://leetcode-cn.com/problems/insert-delete-getrandom-o1/description/
///
/// 设计一个支持在平均 时间复杂度 O(1) 下，执行以下操作的数据结构。
///
/// insert(val)：当元素 val 不存在时，向集合中插入该项。
/// remove(val)：元素 val 存在时，从集合中移除该项。
/// getRandom：随机返回现有集合中的一项。每个元素应该有相同的概率被返回。
///
/// 示例 :
///
/// // 初始化一个空的集合。
/// RandomizedSet randomSet = new RandomizedSet();
///
/// // 向集合中插入 1 。返回 true 表示 1 被成功地插入。
/// randomSet.insert(1);
///
/// // 返回 false ，表示集合中不存在 2 。
/// randomSet.remove(2);
///
/// // 向集合中插入 2 。返回 true 。集合现在包含 [1,2] 。
/// randomSet.insert(2);
///
/// // getRandom 应随机返回 1 或 2 。
/// randomSet.getRandom();
///
/// // 从集合中移除 1 ，返回 true 。集合现在包含 [2] 。
/// randomSet.remove(1);
///
/// // 2 已在集合中，所以返回 false 。
/// randomSet.insert(2);
///
/// // 由于 2 是集合中唯一的数字，getRandom 总是返回 2 。
/// randomSet.getRandom();
/// -----------------------------------------------------------------------------
/// RandomizedSet对象将被实例化，并按下面方式调用：
/// RandomizedSet obj = new RandomizedSet();
/// boolean param_1 = obj.insert(val);
/// boolean param_2 = obj.remove(val);
/// int param_3 = obj.getRandom();
/// -----------------------------------------------------------------------------
public class Q0380 {
    public class RandomizedSet {

        /** Initialize your data structure here. */
        public RandomizedSet() {
            // TODO
        }

        /**
         * Inserts a value to the set. Returns true if the set did not already contain
         * the specified element.
         */
        public boolean insert(int val) {
            // TODO
            return false;
        }

        /**
         * Removes a value from the set. Returns true if the set contained the specified
         * element.
         */
        public boolean remove(int val) {
            // TODO
            return false;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            // TODO
            return 0;
        }
    }
}
