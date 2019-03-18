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
package com.github.clilystudio.leetcode.define.bintree;

/**
 * 二叉树节点类
 */
public class Node {
    /** 节点值 */
    public int val;
    
    /** 左节点 */
    public Node left;
    
    /** 右节点 */
    public Node right;
    
    /** 下一节点 */
    public Node next;

    /**
     * 构造函数
     */
    public Node() {
    }

    /**
     * 构造函数
     * @param _val 节点值
     * @param _left 左节点
     * @param _right 右节点
     * @param _next 下一节点
     */
    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
