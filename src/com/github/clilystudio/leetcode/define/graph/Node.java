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
package com.github.clilystudio.leetcode.define.graph;

import java.util.List;

/**
 * N 叉树节点类
 */
public class Node {
    /** 节点值 */
    public int val;
    
    /** 相邻节点列表 */
    public List<Node> neighbors;
    
    /**
     * 构造函数
     */
    public Node() {        
    }
    
    /**
     * 构造函数
     * @param _val 节点值
     * @param _neighbors 相邻节点列表
     */
    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
