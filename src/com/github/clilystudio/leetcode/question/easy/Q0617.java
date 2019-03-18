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

import com.github.clilystudio.leetcode.define.TreeNode;

/// -----------------------------------------------------------------------------
/// [617] 合并二叉树
///
/// https://leetcode-cn.com/problems/merge-two-binary-trees/description/
///
/// 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
///
/// 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL
/// 的节点将直接作为新二叉树的节点。
///
/// 示例 1:
///
/// 输入:
/// Tree 1                     Tree 2
/// ⁠         1                         2
/// ⁠        / \                       / \
/// ⁠       3   2                     1   3
/// ⁠      /                           \   \
/// ⁠     5                             4   7
/// 输出:
/// 合并后的树:
/// 3
/// / \
/// 4   5
/// / \   \
/// 5   4   7
///
/// 注意: 合并必须从两个树的根节点开始。
/// -----------------------------------------------------------------------------
public class Q0617 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // TODO
        return null;
    }
}
