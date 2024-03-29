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
/// [951] 分割数组
///
/// https://leetcode-cn.com/problems/flip-equivalent-binary-trees/description/
///
/// 我们可以为二叉树 T 定义一个翻转操作，如下所示：选择任意节点，然后交换它的左子树和右子树。
///
/// 只要经过一定次数的翻转操作后，能使 X 等于 Y，我们就称二叉树 X 翻转等价于二叉树 Y。
///
/// 编写一个判断两个二叉树是否是翻转等价的函数。这些树由根节点 root1 和 root2 给出。
///
/// 示例：
///
/// 输入：root1 = [1,2,3,4,5,6,null,null,null,7,8], root2 =
/// [1,3,2,null,6,4,5,null,null,null,null,8,7]
/// 输出：true
/// 解释：We flipped at nodes with values 1, 3, and 5.
///
/// 提示：
///
/// 每棵树最多有 100 个节点。
/// 每棵树中的每个值都是唯一的、在 [0, 99] 范围内的整数。
/// -----------------------------------------------------------------------------
public class Q0951 {
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        // TODO
        return false;
    }
}
