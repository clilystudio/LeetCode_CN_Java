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
package com.github.clilystudio.leetcode.question.easy;

import com.github.clilystudio.leetcode.define.Node;

/// -----------------------------------------------------------------------------
/// [427] Construct Quad Tree
///
/// https://leetcode-cn.com/problems/construct-quad-tree/description/
///
/// 我们想要使用一棵四叉树来储存一个 N x N 的布尔值网络。网络中每一格的值只会是真或假。树的根结点代表整个网络。对于每个结点,
/// 它将被分等成四个孩子结点直到这个区域内的值都是相同的.
///
/// 每个结点还有另外两个布尔变量: isLeaf 和 val。isLeaf 当这个节点是一个叶子结点时为真。val 变量储存叶子结点所代表的区域的值。
///
/// 你的任务是使用一个四叉树表示给定的网络。下面的例子将有助于你理解这个问题：
///
/// 给定下面这个8 x 8 网络，我们将这样建立一个对应的四叉树：
///
/// 由上文的定义，它能被这样分割：
///
/// 对应的四叉树应该像下面这样，每个结点由一对 (isLeaf, val) 所代表.
///
/// 对于非叶子结点，val 可以是任意的，所以使用 * 代替。
///
/// 提示：
///
/// N 将小于 1000 且确保是 2 的整次幂。
/// 如果你想了解更多关于四叉树的知识，你可以参考这个 wiki 页面。
/// -----------------------------------------------------------------------------
public class Q0427 {
    public Node construct(int[][] grid) {
        // TODO
        return null;
    }
}
