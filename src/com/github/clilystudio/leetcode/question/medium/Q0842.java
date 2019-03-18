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

import java.util.List;

/// -----------------------------------------------------------------------------
/// [842] 翻转卡片游戏
///
/// https://leetcode-cn.com/problems/split-array-into-fibonacci-sequence/description/
///
/// 给定一个数字字符串 S，比如 S = "123456579"，我们可以将它分成斐波那契式的序列 [123, 456, 579]。
///
/// 形式上，斐波那契式序列是一个非负整数列表 F，且满足：
///
/// 0 <= F[i] <= 2^31 - 1，（也就是说，每个整数都符合 32 位有符号整数类型）；
/// F.length >= 3；
/// 对于所有的0 <= i < F.length - 2，都有 F[i] + F[i+1] = F[i+2] 成立。
///
/// 另外，请注意，将字符串拆分成小块时，每个块的数字一定不要以零开头，除非这个块是数字 0 本身。
///
/// 返回从 S 拆分出来的所有斐波那契式的序列块，如果不能拆分则返回 []。
///
/// 示例 1：
///
/// 输入："123456579"
/// 输出：[123,456,579]
///
/// 示例 2：
///
/// 输入: "11235813"
/// 输出: [1,1,2,3,5,8,13]
///
/// 示例 3：
///
/// 输入: "112358130"
/// 输出: []
/// 解释: 这项任务无法完成。
///
/// 示例 4：
///
/// 输入："0123"
/// 输出：[]
/// 解释：每个块的数字不能以零开头，因此 "01"，"2"，"3" 不是有效答案。
///
/// 示例 5：
///
/// 输入: "1101111"
/// 输出: [110, 1, 111]
/// 解释: 输出 [11,0,11,11] 也同样被接受。
///
/// 提示：
///
/// 1 <= S.length <= 200
/// 字符串 S 中只含有数字。
/// -----------------------------------------------------------------------------
public class Q0842 {
    public List<Integer> splitIntoFibonacci(String S) {
        // TODO
        return null;
    }
}
