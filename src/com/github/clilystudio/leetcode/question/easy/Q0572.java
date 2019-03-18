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
/// [572] 另一个树的子树
///
/// https://leetcode-cn.com/problems/subtree-of-another-tree/description/
///
/// 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s
/// 也可以看做它自身的一棵子树。
///
/// 示例 1:
/// 给定的树 s:
///
/// ⁠    3
/// ⁠   / \
/// ⁠  4   5
/// ⁠ / \
/// ⁠1   2
///
/// 给定的树 t：
///
/// ⁠  4
/// ⁠ / \
/// ⁠1   2
///
/// 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
///
/// 示例 2:
/// 给定的树 s：
///
/// ⁠    3
/// ⁠   / \
/// ⁠  4   5
/// ⁠ / \
/// ⁠1   2
/// ⁠   /
/// ⁠  0
///
/// 给定的树 t：
///
/// ⁠  4
/// ⁠ / \
/// ⁠1   2
///
/// 返回 false。
/// -----------------------------------------------------------------------------
public class Q0572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        // TODO
        return false;
    }
}
