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
/// [563] 二叉树的坡度
///
/// https://leetcode-cn.com/problems/binary-tree-tilt/description/
///
/// 给定一个二叉树，计算整个树的坡度。
///
/// 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
///
/// 整个树的坡度就是其所有节点的坡度之和。
///
/// 示例:
///
/// 输入:
/// ⁠        1
/// ⁠      /   \
/// ⁠     2     3
/// 输出: 1
/// 解释:
/// 结点的坡度 2 : 0
/// 结点的坡度 3 : 0
/// 结点的坡度 1 : |2-3| = 1
/// 树的坡度 : 0 + 0 + 1 = 1
///
/// 注意:
///
/// 任何子树的结点的和不会超过32位整数的范围。
/// 坡度的值不会超过32位整数的范围。
/// -----------------------------------------------------------------------------
public class Q0563 {
    public int findTilt(TreeNode root) {
        // TODO
        return 0;
    }
}
