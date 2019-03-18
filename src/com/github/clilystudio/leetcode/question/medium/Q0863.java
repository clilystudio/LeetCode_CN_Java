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

import java.util.List;

import com.github.clilystudio.leetcode.define.TreeNode;

/// -----------------------------------------------------------------------------
/// [863] 树中距离之和
///
/// https://leetcode-cn.com/problems/all-nodes-distance-k-in-binary-tree/description/
///
/// 给定一个二叉树（具有根结点 root）， 一个目标结点 target ，和一个整数值 K 。
///
/// 返回到目标结点 target 距离为 K 的所有结点的值的列表。 答案可以以任何顺序返回。
///
/// 示例 1：
///
/// 输入：root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, K = 2
///
/// 输出：[7,4,1]
///
/// 解释：
/// 所求结点为与目标结点（值为 5）距离为 2 的结点，
/// 值分别为 7，4，以及 1
///
/// 注意，输入的 "root" 和 "target" 实际上是树上的结点。
/// 上面的输入仅仅是对这些对象进行了序列化描述。
///
/// 提示：
///
/// 给定的树是非空的，且最多有 K 个结点。
/// 树上的每个结点都具有唯一的值 0 <= node.val <= 500 。
/// 目标结点 target 是树上的结点。
/// 0 <= K <= 1000.
/// -----------------------------------------------------------------------------
public class Q0863 {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        // TODO
        return null;
    }
}
