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

/// -----------------------------------------------------------------------------
/// [331] 验证二叉树的前序序列化
///
/// https://leetcode-cn.com/problems/verify-preorder-serialization-of-a-binary-tree/description/
///
/// 序列化二叉树的一种方法是使用前序遍历。当我们遇到一个非空节点时，我们可以记录下这个节点的值。如果它是一个空节点，我们可以使用一个标记值记录，例如 #。
///
/// ⁠    _9_
/// ⁠   /   \
/// ⁠  3     2
/// ⁠ / \   / \
/// ⁠4   1  #  6
/// / \ / \   / \
/// # # # #   # #
///
/// 例如，上面的二叉树可以被序列化为字符串 "9,3,4,#,#,1,#,#,2,#,6,#,#"，其中 # 代表一个空节点。
///
/// 给定一串以逗号分隔的序列，验证它是否是正确的二叉树的前序序列化。编写一个在不重构树的条件下的可行算法。
///
/// 每个以逗号分隔的字符或为一个整数或为一个表示 null 指针的 '#' 。
///
/// 你可以认为输入格式总是有效的，例如它永远不会包含两个连续的逗号，比如 "1,,3" 。
///
/// 示例 1:
///
/// 输入: "9,3,4,#,#,1,#,#,2,#,6,#,#"
/// 输出: true
///
/// 示例 2:
///
/// 输入: "1,#"
/// 输出: false
///
/// 示例 3:
///
/// 输入: "9,#,#,1"
/// 输出: false
/// -----------------------------------------------------------------------------
public class Q0331 {
    public boolean isValidSerialization(String preorder) {
        // TODO
        return false;
    }
}
