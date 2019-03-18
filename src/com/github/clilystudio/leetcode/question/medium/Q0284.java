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

/// -----------------------------------------------------------------------------
/// [284] 顶端迭代器
///
/// https://leetcode-cn.com/problems/peeking-iterator/description/
///
/// 给定一个迭代器类的接口，接口包含两个方法： next() 和 hasNext()。设计并实现一个支持 peek() 操作的顶端迭代器 --
/// 其本质就是把原本应由 next() 方法返回的元素 peek() 出来。
///
/// 示例:
///
/// 假设迭代器被初始化为列表 [1,2,3]。
///
/// 调用 next() 返回 1，得到列表中的第一个元素。
/// 现在调用 peek() 返回 2，下一个元素。在此之后调用 next() 仍然返回 2。
/// 最后一次调用 next() 返回 3，末尾元素。在此之后调用 hasNext() 应该返回 false。
///
/// 进阶：你将如何拓展你的设计？使之变得通用化，从而适应所有的类型，而不只是整数型？
/// -----------------------------------------------------------------------------
/// Java Iterator interface reference:
/// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
/// -----------------------------------------------------------------------------
public class Q0284 {
    public class PeekingIterator implements Iterator<Integer> {

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            // TODO
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            // TODO
            return 0;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            // TODO
            return 0;
        }

        @Override
        public boolean hasNext() {
            // TODO
            return false;
        }
    }
}
