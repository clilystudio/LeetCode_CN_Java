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
/// [669] 修剪二叉搜索树
///
/// https://leetcode-cn.com/problems/trim-a-binary-search-tree/description/
///
/// 给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L)
/// 。你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点。
///
/// 示例 1:
///
/// 输入:
/// ⁠   1
/// ⁠  / \
/// ⁠ 0   2
///
/// ⁠ L = 1
/// ⁠ R = 2
///
/// 输出:
/// ⁠   1
/// ⁠     \
/// ⁠      2
///
/// 示例 2:
///
/// 输入:
/// ⁠   3
/// ⁠  / \
/// ⁠ 0   4
/// ⁠  \
/// ⁠   2
/// ⁠  /
/// ⁠ 1
///
/// ⁠ L = 1
/// ⁠ R = 3
///
/// 输出:
/// ⁠     3
/// ⁠    /
/// ⁠  2
/// ⁠ /
/// ⁠1
/// -----------------------------------------------------------------------------
public class Q0669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        // TODO
        return null;
    }
}
