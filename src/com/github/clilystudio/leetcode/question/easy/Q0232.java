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
/// [232] 用栈实现队列
///
/// https://leetcode-cn.com/problems/implement-queue-using-stacks/description/
///
/// 使用栈实现队列的下列操作：
///
/// push(x) -- 将一个元素放入队列的尾部。
/// pop() -- 从队列首部移除元素。
/// peek() -- 返回队列首部的元素。
/// empty() -- 返回队列是否为空。
///
/// 示例:
///
/// MyQueue queue = new MyQueue();
///
/// queue.push(1);
/// queue.push(2);
/// queue.peek();  // 返回 1
/// queue.pop();   // 返回 1
/// queue.empty(); // 返回 false
///
/// 说明:
///
/// 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty
/// 操作是合法的。
/// 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
/// 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
/// -----------------------------------------------------------------------------
/// MyQueue对象将被实例化，并按下面方式调用：
/// MyQueue obj = new MyQueue();
/// obj.push(x);
/// int param_2 = obj.pop();
/// int param_3 = obj.peek();
/// boolean param_4 = obj.empty();
/// -----------------------------------------------------------------------------
public class Q0232 {
    public class MyQueue {

        /** Initialize your data structure here. */
        public MyQueue() {
            // TODO
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            // TODO
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            // TODO
            return 0;
        }

        /** Get the front element. */
        public int peek() {
            // TODO
            return 0;
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            // TODO
            return false;
        }
    }
}
