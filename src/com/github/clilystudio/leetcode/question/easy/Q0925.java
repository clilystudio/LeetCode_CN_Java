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

/// -----------------------------------------------------------------------------
/// [925] 根据前序和后序遍历构造二叉树
///
/// https://leetcode-cn.com/problems/long-pressed-name/description/
///
/// 你的朋友正在使用键盘输入他的名字 name。偶尔，在键入字符 c 时，按键可能会被长按，而字符可能被输入 1 次或多次。
///
/// 你将会检查键盘输入的字符 typed。如果它对应的可能是你的朋友的名字（其中一些字符可能被长按），那么就返回 True。
///
/// 示例 1：
///
/// 输入：name = "alex", typed = "aaleex"
/// 输出：true
/// 解释：'alex' 中的 'a' 和 'e' 被长按。
///
/// 示例 2：
///
/// 输入：name = "saeed", typed = "ssaaedd"
/// 输出：false
/// 解释：'e' 一定需要被键入两次，但在 typed 的输出中不是这样。
///
/// 示例 3：
///
/// 输入：name = "leelee", typed = "lleeelee"
/// 输出：true
///
/// 示例 4：
///
/// 输入：name = "laiden", typed = "laiden"
/// 输出：true
/// 解释：长按名字中的字符并不是必要的。
///
/// 提示：
///
/// name.length <= 1000
/// typed.length <= 1000
/// name 和 typed 的字符都是小写字母。
/// -----------------------------------------------------------------------------
public class Q0925 {
    public boolean isLongPressedName(String name, String typed) {
        // TODO
        return false;
    }
}
