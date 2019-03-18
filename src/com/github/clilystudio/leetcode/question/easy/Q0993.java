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
/// [993] 最高的广告牌
///
/// https://leetcode-cn.com/problems/cousins-in-binary-tree/description/
///
/// 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
///
/// 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
///
/// 我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。
///
/// 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。
///
/// 示例 1：
///
/// 输入：root = [1,2,3,4], x = 4, y = 3
/// 输出：false
///
/// 示例 2：
///
/// 输入：root = [1,2,3,null,4,null,5], x = 5, y = 4
/// 输出：true
///
/// 示例 3：
///
/// 输入：root = [1,2,3,null,4], x = 2, y = 3
/// 输出：false
///
/// 提示：
///
/// 二叉树的节点数介于 2 到 100 之间。
/// 每个节点的值都是唯一的、范围为 1 到 100 的整数。
/// -----------------------------------------------------------------------------
public class Q0993 {
    public boolean isCousins(TreeNode root, int x, int y) {
        // TODO
        return false;
    }
}
