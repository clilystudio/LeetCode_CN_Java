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
/// [173] 二叉搜索树迭代器
///
/// https://leetcode-cn.com/problems/binary-search-tree-iterator/description/
///
/// 实现一个二叉搜索树迭代器。你将使用二叉搜索树的根节点初始化迭代器。
///
/// 调用 next() 将返回二叉搜索树中的下一个最小的数。
///
/// 示例：
///
/// BSTIterator iterator = new BSTIterator(root);
/// iterator.next();    // 返回 3
/// iterator.next();    // 返回 7
/// iterator.hasNext(); // 返回 true
/// iterator.next();    // 返回 9
/// iterator.hasNext(); // 返回 true
/// iterator.next();    // 返回 15
/// iterator.hasNext(); // 返回 true
/// iterator.next();    // 返回 20
/// iterator.hasNext(); // 返回 false
///
/// 提示：
///
/// next() 和 hasNext() 操作的时间复杂度是 O(1)，并使用 O(h) 内存，其中 h 是树的高度。
/// 你可以假设 next() 调用总是有效的，也就是说，当调用 next() 时，BST 中至少存在一个下一个最小的数。
/// -----------------------------------------------------------------------------
/// BSTIterator对象将被实例化，并按下面方式调用：
/// BSTIterator obj = new BSTIterator(root);
/// int param_1 = obj.next();
/// boolean param_2 = obj.hasNext();
/// -----------------------------------------------------------------------------
public class Q0173 {
    public class BSTIterator {

        /**
         * 构造函数
         * @param root 树节点
         */
        public BSTIterator(TreeNode root) {
            // TODO
        }

        /**
         * 返回下一个最小数
         * @return 下一个最小数
         */
        public int next() {
            // TODO
            return 0;
        }

        /**
         * 判断是否有下一个最小数
         * @return 是否有下一个最小数
         */
        public boolean hasNext() {
            // TODO
            return false;
        }
    }
}
