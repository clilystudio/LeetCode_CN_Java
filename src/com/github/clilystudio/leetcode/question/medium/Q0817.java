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

import com.github.clilystudio.leetcode.define.ListNode;

/// -----------------------------------------------------------------------------
/// [817] 设计哈希映射
///
/// https://leetcode-cn.com/problems/linked-list-components/description/
///
/// 给定一个链表（链表结点包含一个整型值）的头结点 head。
///
/// 同时给定列表 G，该列表是上述链表中整型值的一个子集。
///
/// 返回列表 G 中组件的个数，这里对组件的定义为：链表中一段最长连续结点的值（该值必须在列表 G 中）构成的集合。
///
/// 示例 1：
///
/// 输入:
/// head: 0->1->2->3
/// G = [0, 1, 3]
/// 输出: 2
/// 解释:
/// 链表中,0 和 1 是相连接的，且 G 中不包含 2，所以 [0, 1] 是 G 的一个组件，同理 [3] 也是一个组件，故返回 2。
///
/// 示例 2：
///
/// 输入:
/// head: 0->1->2->3->4
/// G = [0, 3, 1, 4]
/// 输出: 2
/// 解释:
/// 链表中，0 和 1 是相连接的，3 和 4 是相连接的，所以 [0, 1] 和 [3, 4] 是两个组件，故返回 2。
///
/// 注意:
///
/// 如果 N 是给定链表 head 的长度，1 <= N <= 10000。
/// 链表中每个结点的值所在范围为 [0, N - 1]。
/// 1 <= G.length <= 10000
/// G 是链表中所有结点的值的一个子集.
/// -----------------------------------------------------------------------------
public class Q0817 {
    public int numComponents(ListNode head, int[] G) {
        // TODO
        return 0;
    }
}
