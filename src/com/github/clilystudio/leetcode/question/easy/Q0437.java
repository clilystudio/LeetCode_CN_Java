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
/// [437] 路径总和 III
///
/// https://leetcode-cn.com/problems/path-sum-iii/description/
///
/// 给定一个二叉树，它的每个结点都存放着一个整数值。
///
/// 找出路径和等于给定数值的路径总数。
///
/// 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
///
/// 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
///
/// 示例：
///
/// root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
///
/// ⁠     10
/// ⁠    /  \
/// ⁠   5   -3
/// ⁠  / \    \
/// ⁠ 3   2   11
/// ⁠/ \   \
/// 3  -2   1
///
/// 返回 3。和等于 8 的路径有:
///
/// 1.  5 -> 3
/// 2.  5 -> 2 -> 1
/// 3.  -3 -> 11
/// -----------------------------------------------------------------------------
public class Q0437 {
    public int pathSum(TreeNode root, int sum) {
        // TODO
        return 0;
    }
}
