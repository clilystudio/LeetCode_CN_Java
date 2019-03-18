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
/// [129] 求根到叶子节点数字之和
///
/// https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/description/
///
/// 给定一个二叉树，它的每个结点都存放一个 0-9 的数字，每条从根到叶子节点的路径都代表一个数字。
///
/// 例如，从根到叶子节点路径 1->2->3 代表数字 123。
///
/// 计算从根到叶子节点生成的所有数字之和。
///
/// 说明: 叶子节点是指没有子节点的节点。
///
/// 示例 1:
///
/// 输入: [1,2,3]
/// ⁠   1
/// ⁠  / \
/// ⁠ 2   3
/// 输出: 25
/// 解释:
/// 从根到叶子节点路径 1->2 代表数字 12.
/// 从根到叶子节点路径 1->3 代表数字 13.
/// 因此，数字总和 = 12 + 13 = 25.
///
/// 示例 2:
///
/// 输入: [4,9,0,5,1]
/// ⁠   4
/// ⁠  / \
/// ⁠ 9   0
/// / \
/// 5   1
/// 输出: 1026
/// 解释:
/// 从根到叶子节点路径 4->9->5 代表数字 495.
/// 从根到叶子节点路径 4->9->1 代表数字 491.
/// 从根到叶子节点路径 4->0 代表数字 40.
/// 因此，数字总和 = 495 + 491 + 40 = 1026.
/// -----------------------------------------------------------------------------
public class Q0129 {
    public int sumNumbers(TreeNode root) {
        // TODO
        return 0;
    }
}
