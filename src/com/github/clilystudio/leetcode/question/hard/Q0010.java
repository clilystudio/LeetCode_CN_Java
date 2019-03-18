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

/// -----------------------------------------------------------------------------
/// [10] 正则表达式匹配
///
/// https://leetcode-cn.com/problems/regular-expression-matching/description/
///
/// 给定一个字符串 (s) 和一个字符模式 (p)。实现支持 '.' 和 '*' 的正则表达式匹配。
///
/// '.' 匹配任意单个字符。
/// '*' 匹配零个或多个前面的元素。
///
/// 匹配应该覆盖整个字符串 (s) ，而不是部分字符串。
///
/// 说明:
///
/// s 可能为空，且只包含从 a-z 的小写字母。
/// p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
///
/// 示例 1:
///
/// 输入:
/// s = "aa"
/// p = "a"
/// 输出: false
/// 解释: "a" 无法匹配 "aa" 整个字符串。
///
/// 示例 2:
///
/// 输入:
/// s = "aa"
/// p = "a*"
/// 输出: true
/// 解释: '*' 代表可匹配零个或多个前面的元素, 即可以匹配 'a' 。因此, 重复 'a' 一次, 字符串可变为 "aa"。
///
/// 示例 3:
///
/// 输入:
/// s = "ab"
/// p = ".*"
/// 输出: true
/// 解释: ".*" 表示可匹配零个或多个('*')任意字符('.')。
///
/// 示例 4:
///
/// 输入:
/// s = "aab"
/// p = "c*a*b"
/// 输出: true
/// 解释: 'c' 可以不被重复, 'a' 可以被重复一次。因此可以匹配字符串 "aab"。
///
/// 示例 5:
///
/// 输入:
/// s = "mississippi"
/// p = "mis*is*p*."
/// 输出: false
/// -----------------------------------------------------------------------------
public class Q0010 {
    public boolean isMatch(String s, String p) {
        // TODO
        return false;
    }
}
