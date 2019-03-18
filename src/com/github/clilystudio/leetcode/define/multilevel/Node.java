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
package com.github.clilystudio.leetcode.define.multilevel;

/**
 * 多级双向链节点类
 */
public class Node {
    /** 节点值 */
    public int val;

    /** 前节点 */
    public Node prev;

    /** 后节点 */
    public Node next;

    /** 子节点 */
    public Node child;

    /**
     * 构造函数
     */
    public Node() {
    }

    /**
     * 构造函数
     * @param _val 节点值
     * @param _prev 前节点
     * @param _next 后节点
     * @param _child 子节点
     */
    public Node(int _val, Node _prev, Node _next, Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
}
