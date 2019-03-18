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
/// [958] 按奇偶排序数组 II
///
/// https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree/description/
///
/// 给定一个二叉树，确定它是否是一个完全二叉树。
///
/// 百度百科中对完全二叉树的定义如下：
///
/// 若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h
/// 层所有的结点都连续集中在最左边，这就是完全二叉树。（注：第 h 层可能包含 1~ 2^h 个节点。）
///
/// 示例 1：
///
/// 输入：[1,2,3,4,5,6]
/// 输出：true
/// 解释：最后一层前的每一层都是满的（即，结点值为 {1} 和 {2,3} 的两层），且最后一层中的所有结点（{4,5,6}）都尽可能地向左。
///
/// 示例 2：
///
/// 输入：[1,2,3,4,5,null,7]
/// 输出：false
/// 解释：值为 7 的结点没有尽可能靠向左侧。
///
/// 提示：
///
/// 树中将会有 1 到 100 个结点。
/// -----------------------------------------------------------------------------
public class Q0958 {
    public boolean isCompleteTree(TreeNode root) {
        // TODO
        return false;
    }
}
