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

import com.github.clilystudio.leetcode.define.rand.Node;

/// -----------------------------------------------------------------------------
/// [138] 复制带随机指针的链表
///
/// https://leetcode-cn.com/problems/copy-list-with-random-pointer/description/
///
/// 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
///
/// 要求返回这个链表的深拷贝。 
///
/// 示例：
///
/// 输入：
///
/// {"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
///
/// 解释：
/// 节点 1 的值是 1，它的下一个指针和随机指针都指向节点 2 。
/// 节点 2 的值是 2，它的下一个指针指向 null，随机指针指向它自己。
///
/// 提示：
///
/// 你必须返回给定头的拷贝作为对克隆列表的引用。
/// -----------------------------------------------------------------------------
public class Q0138 {
    public Node copyRandomList(Node head) {
        // TODO
        return null;
    }
}
