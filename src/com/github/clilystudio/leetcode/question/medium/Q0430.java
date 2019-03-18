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

import com.github.clilystudio.leetcode.define.multilevel.Node;

/// -----------------------------------------------------------------------------
/// [430] 多级双向链表扁平化
///
/// https://leetcode-cn.com/problems/flatten-a-multilevel-doubly-linked-list/description/
///
/// 您将获得一个双向链表，除了下一个和前一个指针之外，它还有一个子指针，可能指向单独的双向链表。这些子列表可能有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
///
/// 扁平化列表，使所有结点出现在单级双链表中。您将获得列表第一级的头部。
///
/// 示例:
///
/// 输入:
/// ⁠1---2---3---4---5---6--NULL
/// ⁠        |
/// ⁠        7---8---9---10--NULL
/// ⁠            |
/// ⁠            11--12--NULL
///
/// 输出:
/// 1-2-3-7-8-11-12-9-10-4-5-6-NULL
///
/// 以上示例的说明:
///
/// 给出多级双向链表，应该返回预定义的扁平双向链表:
/// -----------------------------------------------------------------------------
public class Q0430 {
    public Node flatten(Node head) {
        // TODO
        return null;
    }
}
