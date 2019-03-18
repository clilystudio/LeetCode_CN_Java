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
/// [677] 键值映射
///
/// https://leetcode-cn.com/problems/map-sum-pairs/description/
///
/// 实现一个 MapSum 类里的两个方法，insert 和 sum。
///
/// 对于方法 insert，你将得到一对（字符串，整数）的键值对。字符串表示键，整数表示值。如果键已经存在，那么原来的键值对将被替代成新的键值对。
///
/// 对于方法 sum，你将得到一个表示前缀的字符串，你需要返回所有以该前缀开头的键的值的总和。
///
/// 示例 1:
///
/// 输入: insert("apple", 3), 输出: Null
/// 输入: sum("ap"), 输出: 3
/// 输入: insert("app", 2), 输出: Null
/// 输入: sum("ap"), 输出: 5
/// -----------------------------------------------------------------------------
/// MapSum对象将被实例化，并按下面方式调用：
/// MapSum obj = new MapSum();
/// obj.insert(key,val);
/// int param_2 = obj.sum(prefix);
/// -----------------------------------------------------------------------------
public class Q0677 {
    public class MapSum {

        /** Initialize your data structure here. */
        public MapSum() {
            // TODO
        }

        public void insert(String key, int val) {
            // TODO
        }

        public int sum(String prefix) {
            // TODO
            return 0;
        }
    }
}
