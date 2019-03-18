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
/// [814] 得分最高的最小轮调
///
/// https://leetcode-cn.com/problems/binary-tree-pruning/description/
///
/// 给定二叉树根结点 root ，此外树的每个结点的值要么是 0，要么是 1。
///
/// 返回移除了所有不包含 1 的子树的原二叉树。
///
/// ( 节点 X 的子树为 X 本身，以及所有 X 的后代。)
///
/// 示例1:
/// 输入: [1,null,0,0,1]
/// 输出: [1,null,0,null,1]
/// ⁠
/// 解释:
/// 只有红色节点满足条件“所有不包含 1 的子树”。
/// 右图为返回的答案。
///
/// 示例2:
/// 输入: [1,0,1,0,0,0,1]
/// 输出: [1,null,1,null,1]
///
/// 示例3:
/// 输入: [1,1,0,1,1,0,1,0]
/// 输出: [1,1,0,1,1,null,1]
///
/// 说明:
///
/// 给定的二叉树最多有 100 个节点。
/// 每个节点的值只会为 0 或 1 。
/// -----------------------------------------------------------------------------
public class Q0814 {
    public TreeNode pruneTree(TreeNode root) {
        // TODO
        return null;
    }
}
