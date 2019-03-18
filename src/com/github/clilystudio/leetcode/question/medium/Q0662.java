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
/// [662] 二叉树最大宽度
///
/// https://leetcode-cn.com/problems/maximum-width-of-binary-tree/description/
///
/// 给定一个二叉树，编写一个函数来获取这个树的最大宽度。树的宽度是所有层中的最大宽度。这个二叉树与满二叉树（full binary
/// tree）结构相同，但一些节点为空。
///
/// 每一层的宽度被定义为两个端点（该层最左和最右的非空节点，两端点间的null节点也计入长度）之间的长度。
///
/// 示例 1:
///
/// 输入:
///
/// ⁠          1
/// ⁠        /   \
/// ⁠       3     2
/// ⁠      / \     \
/// ⁠     5   3     9
///
/// 输出: 4
/// 解释: 最大值出现在树的第 3 层，宽度为 4 (5,3,null,9)。
///
/// 示例 2:
///
/// 输入:
///
/// ⁠         1
/// ⁠        /
/// ⁠       3
/// ⁠      / \
/// ⁠     5   3
///
/// 输出: 2
/// 解释: 最大值出现在树的第 3 层，宽度为 2 (5,3)。
///
/// 示例 3:
///
/// 输入:
///
/// ⁠         1
/// ⁠        / \
/// ⁠       3   2
/// ⁠      /
/// ⁠     5
///
/// 输出: 2
/// 解释: 最大值出现在树的第 2 层，宽度为 2 (3,2)。
///
/// 示例 4:
///
/// 输入:
///
/// ⁠         1
/// ⁠        / \
/// ⁠       3   2
/// ⁠      /     \
/// ⁠     5       9
/// ⁠    /         \
/// ⁠   6           7
/// 输出: 8
/// 解释: 最大值出现在树的第 4 层，宽度为 8 (6,null,null,null,null,null,null,7)。
///
/// 注意: 答案在32位有符号整数的表示范围内。
/// -----------------------------------------------------------------------------
public class Q0662 {
    public int widthOfBinaryTree(TreeNode root) {
        // TODO
        return 0;
    }
}
