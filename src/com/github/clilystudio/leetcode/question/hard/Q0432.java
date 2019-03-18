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
/// [432] 全 O(1) 的数据结构
///
/// https://leetcode-cn.com/problems/all-oone-data-structure/description/
///
/// 实现一个数据结构支持以下操作：
///
/// Inc(key) - 插入一个新的值为 1 的 key。或者使一个存在的 key 增加一，保证 key 不为空字符串。
/// Dec(key) - 如果这个 key 的值是 1，那么把他从数据结构中移除掉。否者使一个存在的 key 值减一。如果这个 key
/// 不存在，这个函数不做任何事情。key 保证不为空字符串。
/// GetMaxKey() - 返回 key 中值最大的任意一个。如果没有元素存在，返回一个空字符串""。
/// GetMinKey() - 返回 key 中值最小的任意一个。如果没有元素存在，返回一个空字符串""。
///
/// 挑战：以 O(1) 的时间复杂度实现所有操作。
/// -----------------------------------------------------------------------------
/// AllOne对象将被实例化，并按下面方式调用：
/// AllOne obj = new AllOne();
/// obj.inc(key);
/// obj.dec(key);
/// String param_3 = obj.getMaxKey();
/// String param_4 = obj.getMinKey();
/// -----------------------------------------------------------------------------
public class Q0432 {
    public class AllOne {

        /** Initialize your data structure here. */
        public AllOne() {
            // TODO
        }

        /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
        public void inc(String key) {
            // TODO
        }

        /**
         * Decrements an existing key by 1. If Key's value is 1, remove it from the data
         * structure.
         */
        public void dec(String key) {
            // TODO
        }

        /** Returns one of the keys with maximal value. */
        public String getMaxKey() {
            // TODO
            return null;
        }

        /** Returns one of the keys with Minimal value. */
        public String getMinKey() {
            // TODO
            return null;
        }
    }
}
