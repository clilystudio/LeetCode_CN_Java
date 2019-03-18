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

import java.util.Iterator;
import java.util.List;

import com.github.clilystudio.leetcode.define.NestedInteger;

/// -----------------------------------------------------------------------------
/// [341] 扁平化嵌套列表迭代器
///
/// https://leetcode-cn.com/problems/flatten-nested-list-iterator/description/
///
/// 给定一个嵌套的整型列表。设计一个迭代器，使其能够遍历这个整型列表中的所有整数。
///
/// 列表中的项或者为一个整数，或者是另一个列表。
///
/// 示例 1:
///
/// 输入: [[1,1],2,[1,1]]
/// 输出: [1,1,2,1,1]
/// 解释: 通过重复调用 next 直到 hasNext 返回false，next 返回的元素的顺序应该是: [1,1,2,1,1]。
///
/// 示例 2:
///
/// 输入: [1,[4,[6]]]
/// 输出: [1,4,6]
/// 解释: 通过重复调用 next 直到 hasNext 返回false，next 返回的元素的顺序应该是: [1,4,6]。
/// -----------------------------------------------------------------------------
/// NestedIterator对象将被实例化，并按下面方式调用：
/// NestedIterator i = new NestedIterator(nestedList);
/// while (i.hasNext()) v[f()] = i.next();
/// -----------------------------------------------------------------------------
public class Q0341 {
    public class NestedIterator implements Iterator<Integer> {

        public NestedIterator(List<NestedInteger> nestedList) {
            // TODO
        }

        @Override
        public Integer next() {
            // TODO
            return null;
        }

        @Override
        public boolean hasNext() {
            // TODO
            return false;
        }
    }
}
