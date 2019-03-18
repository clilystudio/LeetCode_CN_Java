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
/// [641] Design Circular Deque
///
/// https://leetcode-cn.com/problems/design-circular-deque/description/
///
/// 设计实现双端队列。
/// 你的实现需要支持以下操作：
///
/// MyCircularDeque(k)：构造函数,双端队列的大小为k。
/// insertFront()：将一个元素添加到双端队列头部。 如果操作成功返回 true。
/// insertLast()：将一个元素添加到双端队列尾部。如果操作成功返回 true。
/// deleteFront()：从双端队列头部删除一个元素。 如果操作成功返回 true。
/// deleteLast()：从双端队列尾部删除一个元素。如果操作成功返回 true。
/// getFront()：从双端队列头部获得一个元素。如果双端队列为空，返回 -1。
/// getRear()：获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
/// isEmpty()：检查双端队列是否为空。
/// isFull()：检查双端队列是否满了。
///
/// 示例：
///
/// MyCircularDeque circularDeque = new MycircularDeque(3); // 设置容量大小为3
/// circularDeque.insertLast(1);                    // 返回 true
/// circularDeque.insertLast(2);                    // 返回 true
/// circularDeque.insertFront(3);                    // 返回 true
/// circularDeque.insertFront(4);                    // 已经满了，返回 false
/// circularDeque.getRear();                  // 返回 2
/// circularDeque.isFull();                        // 返回 true
/// circularDeque.deleteLast();                    // 返回 true
/// circularDeque.insertFront(4);                    // 返回 true
/// circularDeque.getFront();                // 返回 4
///
/// 提示：
///
/// 所有值的范围为 [1, 1000]
/// 操作次数的范围为 [1, 1000]
/// 请不要使用内置的双端队列库。
/// -----------------------------------------------------------------------------
/// MyCircularDeque对象将被实例化，并按下面方式调用：
/// MyCircularDeque obj = new MyCircularDeque(k);
/// boolean param_1 = obj.insertFront(value);
/// boolean param_2 = obj.insertLast(value);
/// boolean param_3 = obj.deleteFront();
/// boolean param_4 = obj.deleteLast();
/// int param_5 = obj.getFront();
/// int param_6 = obj.getRear();
/// boolean param_7 = obj.isEmpty();
/// boolean param_8 = obj.isFull();
/// -----------------------------------------------------------------------------
public class Q0641 {
    public class MyCircularDeque {

        /** Initialize your data structure here. Set the size of the deque to be k. */
        public MyCircularDeque(int k) {
            // TODO
        }

        /**
         * Adds an item at the front of Deque. Return true if the operation is
         * successful.
         */
        public boolean insertFront(int value) {
            // TODO
            return false;
        }

        /**
         * Adds an item at the rear of Deque. Return true if the operation is
         * successful.
         */
        public boolean insertLast(int value) {
            // TODO
            return false;
        }

        /**
         * Deletes an item from the front of Deque. Return true if the operation is
         * successful.
         */
        public boolean deleteFront() {
            // TODO
            return false;
        }

        /**
         * Deletes an item from the rear of Deque. Return true if the operation is
         * successful.
         */
        public boolean deleteLast() {
            // TODO
            return false;
        }

        /** Get the front item from the deque. */
        public int getFront() {
            // TODO
            return 0;
        }

        /** Get the last item from the deque. */
        public int getRear() {
            // TODO
            return 0;
        }

        /** Checks whether the circular deque is empty or not. */
        public boolean isEmpty() {
            // TODO
            return false;
        }

        /** Checks whether the circular deque is full or not. */
        public boolean isFull() {
            // TODO
            return false;
        }
    }
}
