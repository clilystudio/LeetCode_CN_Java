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
/// [705] Design HashSet
///
/// https://leetcode-cn.com/problems/design-hashset/description/
///
/// 不使用任何内建的哈希表库设计一个哈希集合
///
/// 具体地说，你的设计应该包含以下的功能
///
/// add(value)：向哈希集合中插入一个值。
/// contains(value) ：返回哈希集合中是否存在这个值。
/// remove(value)：将给定值从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
///
/// 示例:
///
/// MyHashSet hashSet = new MyHashSet();
/// hashSet.add(1);        
/// hashSet.add(2);        
/// hashSet.contains(1);    // 返回 true
/// hashSet.contains(3);    // 返回 false (未找到)
/// hashSet.add(2);          
/// hashSet.contains(2);    // 返回 true
/// hashSet.remove(2);          
/// hashSet.contains(2);    // 返回  false (已经被删除)
///
/// 注意：
///
/// 所有的值都在 [1, 1000000]的范围内。
/// 操作的总数目在[1, 10000]范围内。
/// 不要使用内建的哈希集合库。
/// -----------------------------------------------------------------------------
/// MyHashSet对象将被实例化，并按下面方式调用：
/// MyHashSet obj = new MyHashSet();
/// obj.add(key);
/// obj.remove(key);
/// boolean param_3 = obj.contains(key);
/// -----------------------------------------------------------------------------
public class Q0705 {
    public class MyHashSet {

        /** Initialize your data structure here. */
        public MyHashSet() {
            // TODO
        }

        public void add(int key) {
            // TODO
        }

        public void remove(int key) {
            // TODO
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int key) {
            // TODO
            return false;
        }
    }
}
