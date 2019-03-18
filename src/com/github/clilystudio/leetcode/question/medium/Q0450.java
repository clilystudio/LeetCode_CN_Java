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

import com.github.clilystudio.leetcode.define.TreeNode;

/// -----------------------------------------------------------------------------
/// [450] 删除二叉搜索树中的节点
///
/// https://leetcode-cn.com/problems/delete-node-in-a-bst/description/
///
/// 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key
/// 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。
///
/// 一般来说，删除节点可分为两个步骤：
///
/// 首先找到需要删除的节点；
/// 如果找到了，删除它。
///
/// 说明： 要求算法时间复杂度为 O(h)，h 为树的高度。
///
/// 示例:
///
/// root = [5,3,6,2,4,null,7]
/// key = 3
///
/// ⁠   5
/// ⁠  / \
/// ⁠ 3   6
/// ⁠/ \   \
/// 2   4   7
///
/// 给定需要删除的节点值是 3，所以我们首先找到 3 这个节点，然后删除它。
///
/// 一个正确的答案是 [5,4,6,2,null,null,7], 如下图所示。
///
/// ⁠   5
/// ⁠  / \
/// ⁠ 4   6
/// ⁠/     \
/// 2       7
///
/// 另一个正确答案是 [5,2,6,null,4,null,7]。
///
/// ⁠   5
/// ⁠  / \
/// ⁠ 2   6
/// ⁠  \   \
/// ⁠   4   7
/// -----------------------------------------------------------------------------
public class Q0450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        // TODO
        return null;
    }
}
