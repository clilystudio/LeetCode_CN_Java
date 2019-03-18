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
package com.github.clilystudio.leetcode.define;

/**
 * 四叉树节点类
 */
public class Node {
    /** 节点值 */
    public boolean val;

    /** 是否为叶子 */
    public boolean isLeaf;

    /** 左上节点 */
    public Node topLeft;

    /** 右上节点 */
    public Node topRight;

    /** 左下节点 */
    public Node bottomLeft;

    /** 右下节点 */
    public Node bottomRight;

    /**
     * 构造函数
     */
    public Node() {
    }

    /**
     * 构造函数
     * 
     * @param _val         节点值
     * @param _isLeaf      是否为叶子
     * @param _topLeft     左上节点
     * @param _topRight    右上节点
     * @param _bottomLeft  左下节点
     * @param _bottomRight 右下节点
     */
    public Node(boolean _val, boolean _isLeaf, Node _topLeft, Node _topRight, Node _bottomLeft, Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
}
