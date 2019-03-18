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
/// [895] 获取所有钥匙的最短路径
///
/// https://leetcode-cn.com/problems/maximum-frequency-stack/description/
///
/// 实现 FreqStack，模拟类似栈的数据结构的操作的一个类。
///
/// FreqStack 有两个函数：
///
/// push(int x)，将整数 x 推入栈中。
/// pop()，它移除并返回栈中出现最频繁的元素。
///
/// 如果最频繁的元素不只一个，则移除并返回最接近栈顶的元素。
///
/// 示例：
///
/// 输入：
///
/// ["FreqStack","push","push","push","push","push","push","pop","pop","pop","pop"],
/// [[],[5],[7],[5],[7],[4],[5],[],[],[],[]]
/// 输出：[null,null,null,null,null,null,null,5,7,5,4]
/// 解释：
/// 执行六次 .push 操作后，栈自底向上为 [5,7,5,7,4,5]。然后：
///
/// pop() -> 返回 5，因为 5 是出现频率最高的。
/// 栈变成 [5,7,5,7,4]。
///
/// pop() -> 返回 7，因为 5 和 7 都是频率最高的，但 7 最接近栈顶。
/// 栈变成 [5,7,5,4]。
///
/// pop() -> 返回 5 。
/// 栈变成 [5,7,4]。
///
/// pop() -> 返回 4 。
/// 栈变成 [5,7]。
///
/// 提示：
///
/// 对 FreqStack.push(int x) 的调用中 0 <= x <= 10^9。
/// 如果栈的元素数目为零，则保证不会调用  FreqStack.pop()。
/// 单个测试样例中，对 FreqStack.push 的总调用次数不会超过 10000。
/// 单个测试样例中，对 FreqStack.pop 的总调用次数不会超过 10000。
/// 所有测试样例中，对 FreqStack.push 和 FreqStack.pop 的总调用次数不会超过 150000。
/// -----------------------------------------------------------------------------
/// FreqStack对象将被实例化，并按下面方式调用：
/// FreqStack obj = new FreqStack();
/// obj.push(x);
/// int param_2 = obj.pop();
/// -----------------------------------------------------------------------------
public class Q0895 {
    public class FreqStack {

        public FreqStack() {
            // TODO
        }

        public void push(int x) {
            // TODO
        }

        public int pop() {
            // TODO
            return 0;
        }
    }
}
