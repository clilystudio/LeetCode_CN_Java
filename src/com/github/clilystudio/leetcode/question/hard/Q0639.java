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
/// [639] 解码方法 2
///
/// https://leetcode-cn.com/problems/decode-ways-ii/description/
///
/// 一条包含字母 A-Z 的消息通过以下的方式进行了编码：
///
/// 'A' -> 1
/// 'B' -> 2
/// ...
/// 'Z' -> 26
///
/// 除了上述的条件以外，现在加密字符串可以包含字符 '*'了，字符'*'可以被当做1到9当中的任意一个数字。
///
/// 给定一条包含数字和字符'*'的加密信息，请确定解码方法的总数。
///
/// 同时，由于结果值可能会相当的大，所以你应当对10^9 + 7取模。（翻译者标注：此处取模主要是为了防止溢出）
///
/// 示例 1 :
///
/// 输入: "*"
/// 输出: 9
/// 解释: 加密的信息可以被解密为: "A", "B", "C", "D", "E", "F", "G", "H", "I".
///
/// 示例 2 :
///
/// 输入: "1*"
/// 输出: 9 + 9 = 18（翻译者标注：这里1*可以分解为1,* 或者当做1*来处理，所以结果是9+9=18）
///
/// 说明 :
///
/// 输入的字符串长度范围是 [1, 10^5]。
/// 输入的字符串只会包含字符 '*' 和 数字'0' - '9'。
/// -----------------------------------------------------------------------------
public class Q0639 {
    public int numDecodings(String s) {
        // TODO
        return 0;
    }
}
