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
package com.github.clilystudio.leetcode.question.hard;

import com.github.clilystudio.leetcode.define.TreeNode;

/// -----------------------------------------------------------------------------
/// [297] 二叉树的序列化与反序列化
///
/// https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/description/
///
/// 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
///
/// 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 /
/// 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
///
/// 示例: 
///
/// 你可以将以下二叉树：
///
/// ⁠   1
/// ⁠  / \
/// ⁠ 2   3
/// ⁠    / \
/// ⁠   4   5
///
/// 序列化为 "[1,2,3,null,null,4,5]"
///
/// 提示: 这与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode
/// 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
///
/// 说明: 不要使用类的成员 / 全局 / 静态变量来存储状态，你的序列化和反序列化算法应该是无状态的。
/// -----------------------------------------------------------------------------
/// Codec对象将被实例化，并按下面方式调用：
/// Codec codec = new Codec();
/// codec.deserialize(codec.serialize(root));
/// -----------------------------------------------------------------------------
public class Q0297 {
    public class Codec {

        /**
         * 把一个树序列化为字符串
         * @param root 树的根节点
         * @return 序列化的字符串
         */
        public String serialize(TreeNode root) {
            // TODO
            return null;
        }

        /**
         * 将字符串反序列化为一个树
         * @param data 字符串
         * @return 一个树
         */
        public TreeNode deserialize(String data) {
            // TODO
            return null;
        }
    }
}
