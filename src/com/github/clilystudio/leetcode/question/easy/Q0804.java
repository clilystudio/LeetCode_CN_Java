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
/// [804] 旋转数字
///
/// https://leetcode-cn.com/problems/unique-morse-code-words/description/
///
/// 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...",
/// "c" 对应 "-.-.", 等等。
///
/// 为了方便，所有26个英文字母对应摩尔斯密码表如下：
///
/// [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
///
/// 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." +
/// "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
///
/// 返回我们可以获得所有词不同单词翻译的数量。
///
/// 例如:
/// 输入: words = ["gin", "zen", "gig", "msg"]
/// 输出: 2
/// 解释:
/// 各单词翻译如下:
/// "gin" -> "--...-."
/// "zen" -> "--...-."
/// "gig" -> "--...--."
/// "msg" -> "--...--."
///
/// 共有 2 种不同翻译, "--...-." 和 "--...--.".
///
/// 注意:
///
/// 单词列表words 的长度不会超过 100。
/// 每个单词 words[i]的长度范围为 [1, 12]。
/// 每个单词 words[i]只包含小写字母。
/// -----------------------------------------------------------------------------
public class Q0804 {
    public int uniqueMorseRepresentations(String[] words) {
        // TODO
        return 0;
    }
}
