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
/// [706] Design HashMap
///
/// https://leetcode-cn.com/problems/design-hashmap/description/
///
/// 不使用任何内建的哈希表库设计一个哈希映射
///
/// 具体地说，你的设计应该包含以下的功能
///
/// put(key, value)：向哈希映射中插入(键,值)的数值对。如果键对应的值已经存在，更新这个值。
/// get(key)：返回给定的键所对应的值，如果映射中不包含这个键，返回-1。
/// remove(key)：如果映射中存在这个键，删除这个数值对。
///
/// 示例：
///
/// MyHashMap hashMap = new MyHashMap();
/// hashMap.put(1, 1);          
/// hashMap.put(2, 2);        
/// hashMap.get(1);            // 返回 1
/// hashMap.get(3);            // 返回 -1 (未找到)
/// hashMap.put(2, 1);         // 更新已有的值
/// hashMap.get(2);            // 返回 1
/// hashMap.remove(2);         // 删除键为2的数据
/// hashMap.get(2);            // 返回 -1 (未找到)
///
/// 注意：
///
/// 所有的值都在 [1, 1000000]的范围内。
/// 操作的总数目在[1, 10000]范围内。
/// 不要使用内建的哈希库。
/// -----------------------------------------------------------------------------
/// MyHashMap对象将被实例化，并按下面方式调用：
/// MyHashMap obj = new MyHashMap();
/// obj.put(key,value);
/// int param_2 = obj.get(key);
/// obj.remove(key);
/// -----------------------------------------------------------------------------
public class Q0706 {
    public class MyHashMap {

        /** Initialize your data structure here. */
        public MyHashMap() {
            // TODO
        }

        /** value will always be non-negative. */
        public void put(int key, int value) {
            // TODO
        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map
         * contains no mapping for the key
         */
        public int get(int key) {
            // TODO
            return 0;
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping
         * for the key
         */
        public void remove(int key) {
            // TODO
        }
    }
}
