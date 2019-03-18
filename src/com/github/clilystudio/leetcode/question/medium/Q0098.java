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
/// [98] 验证二叉搜索树
///
/// https://leetcode-cn.com/problems/validate-binary-search-tree/description/
///
/// 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
///
/// 假设一个二叉搜索树具有如下特征：
///
/// 节点的左子树只包含小于当前节点的数。
/// 节点的右子树只包含大于当前节点的数。
/// 所有左子树和右子树自身必须也是二叉搜索树。
///
/// 示例 1:
///
/// 输入:
/// ⁠   2
/// ⁠  / \
/// ⁠ 1   3
/// 输出: true
///
/// 示例 2:
///
/// 输入:
/// ⁠   5
/// ⁠  / \
/// ⁠ 1   4
/// / \
/// 3   6
/// 输出: false
/// 解释: 输入为: [5,1,4,null,null,3,6]。
/// 根节点的值为 5 ，但是其右子节点值为 4 。
/// -----------------------------------------------------------------------------
public class Q0098 {
    public boolean isValidBST(TreeNode root) {
        // TODO
        return false;
    }
}
