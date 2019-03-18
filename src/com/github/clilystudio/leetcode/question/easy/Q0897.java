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
/// [897] 回文素数
///
/// https://leetcode-cn.com/problems/increasing-order-search-tree/description/
///
/// 给定一个树，按中序遍历重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
///
/// 示例 ：
///
/// 输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]
///
/// ⁠      5
/// ⁠     / \
/// ⁠   3    6
/// ⁠  / \    \
/// ⁠ 2   4    8
/// /        / \
/// 1        7   9
///
/// 输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
///
/// ⁠1
///  \
///   2
///    \
///     3
///      \
///       4
///        \
///         5
///          \
///           6
///            \
///             7
///              \
///               8
///                \
///                 9
///
/// 提示：
///
/// 给定树中的结点数介于 1 和 100 之间。
/// 每个结点都有一个从 0 到 1000 范围内的唯一整数值。
/// -----------------------------------------------------------------------------
public class Q0897 {
    public TreeNode increasingBST(TreeNode root) {
        // TODO
        return null;
    }
}
