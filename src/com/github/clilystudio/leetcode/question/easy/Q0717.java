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
/// [717] 1比特与2比特字符
///
/// https://leetcode-cn.com/problems/1-bit-and-2-bit-characters/description/
///
/// 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
///
/// 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
///
/// 示例 1:
///
/// 输入:
/// bits = [1, 0, 0]
/// 输出: True
/// 解释:
/// 唯一的编码方式是一个两比特字符和一个一比特字符。所以最后一个字符是一比特字符。
///
/// 示例 2:
///
/// 输入:
/// bits = [1, 1, 1, 0]
/// 输出: False
/// 解释:
/// 唯一的编码方式是两比特字符和两比特字符。所以最后一个字符不是一比特字符。
///
/// 注意:
///
/// 1 <= len(bits) <= 1000.
/// bits[i] 总是0 或 1.
/// -----------------------------------------------------------------------------
public class Q0717 {
    public boolean isOneBitCharacter(int[] bits) {
        // TODO
        return false;
    }
}
