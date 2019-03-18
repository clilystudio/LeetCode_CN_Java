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
/// [606] 根据二叉树创建字符串
///
/// https://leetcode-cn.com/problems/construct-string-from-binary-tree/description/
///
/// 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
///
/// 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
///
/// 示例 1:
///
/// 输入: 二叉树: [1,2,3,4]
/// ⁠      1
/// ⁠    /   \
/// ⁠   2     3
/// ⁠  /
/// ⁠ 4
///
/// 输出: "1(2(4))(3)"
///
/// 解释: 原本将是“1(2(4)())(3())”，
/// 在你省略所有不必要的空括号对之后，
/// 它将是“1(2(4))(3)”。
///
/// 示例 2:
///
/// 输入: 二叉树: [1,2,3,null,4]
/// ⁠      1
/// ⁠    /   \
/// ⁠   2     3
/// ⁠    \
/// ⁠     4
///
/// 输出: "1(2()(4))(3)"
///
/// 解释: 和第一个示例相似，
/// 除了我们不能省略第一个对括号来中断输入和输出之间的一对一映射关系。
/// -----------------------------------------------------------------------------
public class Q0606 {
    public String tree2str(TreeNode t) {
        // TODO
        return null;
    }
}
