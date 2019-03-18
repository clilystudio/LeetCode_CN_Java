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
/// [979] 增减字符串匹配
///
/// https://leetcode-cn.com/problems/distribute-coins-in-binary-tree/description/
///
/// 给定一个有 N 个结点的二叉树的根结点 root，树中的每个结点上都对应有 node.val 枚硬币，并且总共有 N 枚硬币。
///
/// 在一次移动中，我们可以选择两个相邻的结点，然后将一枚硬币从其中一个结点移动到另一个结点。(移动可以是从父结点到子结点，或者从子结点移动到父结点。)。
///
/// 返回使每个结点上只有一枚硬币所需的移动次数。
///
/// 示例 1：
///
/// 输入：[3,0,0]
/// 输出：2
/// 解释：从树的根结点开始，我们将一枚硬币移到它的左子结点上，一枚硬币移到它的右子结点上。
///
/// 示例 2：
///
/// 输入：[0,3,0]
/// 输出：3
/// 解释：从根结点的左子结点开始，我们将两枚硬币移到根结点上 [移动两次]。然后，我们把一枚硬币从根结点移到右子结点上。
///
/// 示例 3：
///
/// 输入：[1,0,2]
/// 输出：2
///
/// 示例 4：
///
/// 输入：[1,0,0,null,3]
/// 输出：4
///
/// 提示：
///
/// 1<= N <= 100
/// 0 <= node.val <= N
/// -----------------------------------------------------------------------------
public class Q0979 {
    public int distributeCoins(TreeNode root) {
        // TODO
        return 0;
    }
}
