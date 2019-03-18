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
/// [844] Backspace String Compare
///
/// https://leetcode-cn.com/problems/backspace-string-compare/description/
///
/// 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
///
/// 示例 1：
///
/// 输入：S = "ab#c", T = "ad#c"
/// 输出：true
/// 解释：S 和 T 都会变成 “ac”。
///
/// 示例 2：
///
/// 输入：S = "ab##", T = "c#d#"
/// 输出：true
/// 解释：S 和 T 都会变成 “”。
///
/// 示例 3：
///
/// 输入：S = "a##c", T = "#a#c"
/// 输出：true
/// 解释：S 和 T 都会变成 “c”。
///
/// 示例 4：
///
/// 输入：S = "a#c", T = "b"
/// 输出：false
/// 解释：S 会变成 “c”，但 T 仍然是 “b”。
///
/// 提示：
///
/// 1 <= S.length <= 200
/// 1 <= T.length <= 200
/// S 和 T 只含有小写字母以及字符 '#'。
/// -----------------------------------------------------------------------------
public class Q0844 {
    public boolean backspaceCompare(String S, String T) {
        // TODO
        return false;
    }
}
