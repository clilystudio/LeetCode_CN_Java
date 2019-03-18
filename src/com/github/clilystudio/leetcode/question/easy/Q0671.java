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
/// [671] 二叉树中第二小的节点
///
/// https://leetcode-cn.com/problems/second-minimum-node-in-a-binary-tree/description/
///
/// 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或
/// 0。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。 
///
/// 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
///
/// 示例 1:
///
/// 输入:
/// ⁠   2
/// ⁠  / \
/// ⁠ 2   5
/// ⁠    / \
/// ⁠   5   7
///
/// 输出: 5
/// 说明: 最小的值是 2 ，第二小的值是 5 。
///
/// 示例 2:
///
/// 输入:
/// ⁠   2
/// ⁠  / \
/// ⁠ 2   2
///
/// 输出: -1
/// 说明: 最小的值是 2, 但是不存在第二小的值。
/// -----------------------------------------------------------------------------
public class Q0671 {
    public int findSecondMinimumValue(TreeNode root) {
        // TODO
        return 0;
    }
}
