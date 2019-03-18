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
/// [382] 链表随机节点
///
/// https://leetcode-cn.com/problems/linked-list-random-node/description/
///
/// 给定一个单链表，随机选择链表的一个节点，并返回相应的节点值。保证每个节点被选的概率一样。
///
/// 进阶:
/// 如果链表十分大且长度未知，如何解决这个问题？你能否使用常数级空间复杂度实现？
///
/// 示例:
///
/// // 初始化一个单链表 [1,2,3].
/// ListNode head = new ListNode(1);
/// head.next = new ListNode(2);
/// head.next.next = new ListNode(3);
/// Solution solution = new Solution(head);
///
/// // getRandom()方法应随机返回1,2,3中的一个，保证每个元素被返回的概率相等。
/// solution.getRandom();
/// -----------------------------------------------------------------------------
public class Q0382 {
    /**
     * 本地测试的需要，将Solution改为Q0382
     * @param head 单链表的头节点
     */
    public Q0382(ListNode head) {
        this.Solution(head);
    }

    /**
     * 构造函数，因为本地测试的需要，外面包了一层类Q0382
     * @param head 单链表的头节点，链表至少有一个节点
     */
    public void Solution(ListNode head) {
        // TODO
        return;
    }

    /**
     * 返回一个随机节点值
     * @return 随机节点值
     */
    public int getRandom() {
        // TODO
        return 0;
    }
}
