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
package com.github.clilystudio.leetcode.define.rand;

/**
 * 带随机指针的链表节点类
 */
public class Node {
    /** 节点值 */
    public int val;
    
    /** 下一节点 */
    public Node next;
    
    /** 随机指针 */
    public Node random;

    /**
     * 构造函数
     */
    public Node() {
    }

    /**
     * 构造函数
     * @param _val 节点值
     * @param _next 下一节点
     * @param _random 随机指针
     */
    public Node(int _val, Node _next, Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
