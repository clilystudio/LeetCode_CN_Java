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
/// [381] O(1) 时间插入、删除和获取随机元素 - 允许重复
///
/// https://leetcode-cn.com/problems/insert-delete-getrandom-o1-duplicates-allowed/description/
///
/// 设计一个支持在平均 时间复杂度 O(1) 下， 执行以下操作的数据结构。
///
/// 注意: 允许出现重复元素。
///
/// insert(val)：向集合中插入元素 val。
/// remove(val)：当 val 存在时，从集合中移除一个 val。
/// getRandom：从现有集合中随机获取一个元素。每个元素被返回的概率应该与其在集合中的数量呈线性相关。
///
/// 示例:
///
/// // 初始化一个空的集合。
/// RandomizedCollection collection = new RandomizedCollection();
///
/// // 向集合中插入 1 。返回 true 表示集合不包含 1 。
/// collection.insert(1);
///
/// // 向集合中插入另一个 1 。返回 false 表示集合包含 1 。集合现在包含 [1,1] 。
/// collection.insert(1);
///
/// // 向集合中插入 2 ，返回 true 。集合现在包含 [1,1,2] 。
/// collection.insert(2);
///
/// // getRandom 应当有 2/3 的概率返回 1 ，1/3 的概率返回 2 。
/// collection.getRandom();
///
/// // 从集合中删除 1 ，返回 true 。集合现在包含 [1,2] 。
/// collection.remove(1);
///
/// // getRandom 应有相同概率返回 1 和 2 。
/// collection.getRandom();
/// -----------------------------------------------------------------------------
/// RandomizedCollection对象将被实例化，并按下面方式调用：
/// RandomizedCollection obj = new RandomizedCollection();
/// boolean param_1 = obj.insert(val);
/// boolean param_2 = obj.remove(val);
/// int param_3 = obj.getRandom();
/// -----------------------------------------------------------------------------
public class Q0381 {
    public class RandomizedCollection {

        /** Initialize your data structure here. */
        public RandomizedCollection() {
            // TODO
        }

        /**
         * Inserts a value to the collection. Returns true if the collection did not
         * already contain the specified element.
         */
        public boolean insert(int val) {
            // TODO
            return false;
        }

        /**
         * Removes a value from the collection. Returns true if the collection contained
         * the specified element.
         */
        public boolean remove(int val) {
            // TODO
            return false;
        }

        /** Get a random element from the collection. */
        public int getRandom() {
            // TODO
            return 0;
        }
    }
}
