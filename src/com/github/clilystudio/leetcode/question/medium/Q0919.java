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
/// [919] 三维形体投影面积
///
/// https://leetcode-cn.com/problems/complete-binary-tree-inserter/description/
///
/// 完全二叉树是每一层（除最后一层外）都是完全填充（即，结点数达到最大）的，并且所有的结点都尽可能地集中在左侧。
///
/// 设计一个用完全二叉树初始化的数据结构 CBTInserter，它支持以下几种操作：
///
/// CBTInserter(TreeNode root) 使用头结点为 root 的给定树初始化该数据结构；
/// CBTInserter.insert(int v) 将 TreeNode 插入到存在值为 node.val = v
/// 的树中以使其保持完全二叉树的状态，并返回插入的 TreeNode 的父结点的值；
/// CBTInserter.get_root() 将返回树的头结点。
///
/// 示例 1：
///
/// 输入：inputs = ["CBTInserter","insert","get_root"], inputs = [[[1]],[2],[]]
/// 输出：[null,1,[1,2]]
///
/// 示例 2：
///
/// 输入：inputs = ["CBTInserter","insert","insert","get_root"], inputs =
/// [[[1,2,3,4,5,6]],[7],[8],[]]
/// 输出：[null,3,4,[1,2,3,4,5,6,7,8]]
///
/// 提示：
///
/// 最初给定的树是完全二叉树，且包含 1 到 1000 个结点。
/// 每个测试用例最多调用 CBTInserter.insert  操作 10000 次。
/// 给定结点或插入结点的每个值都在 0 到 5000 之间。
/// -----------------------------------------------------------------------------
/// CBTInserter对象将被实例化，并按下面方式调用：
/// CBTInserter obj = new CBTInserter(root);
/// int param_1 = obj.insert(v);
/// TreeNode param_2 = obj.get_root();
/// -----------------------------------------------------------------------------
public class Q0919 {
    public class CBTInserter {

        public CBTInserter(TreeNode root) {
            // TODO
        }

        public int insert(int v) {
            // TODO
            return 0;
        }

        public TreeNode get_root() {
            // TODO
            return null;
        }
    }
}
