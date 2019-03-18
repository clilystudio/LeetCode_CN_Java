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
/// [753] 打开转盘锁
///
/// https://leetcode-cn.com/problems/cracking-the-safe/description/
///
/// 有一个需要密码才能打开的保险箱。密码是 n 位数, 密码的每一位是 k 位序列 0, 1, ..., k-1 中的一个 。
///
/// 你可以随意输入密码，保险箱会自动记住最后 n 位输入，如果匹配，则能够打开保险箱。
///
/// 举个例子，假设密码是 "345"，你可以输入 "012345" 来打开它，只是你输入了 6 个字符.
///
/// 请返回一个能打开保险箱的最短字符串。
///
/// 示例1:
///
/// 输入: n = 1, k = 2
/// 输出: "01"
/// 说明: "10"也可以打开保险箱。
///
/// 示例2:
///
/// 输入: n = 2, k = 2
/// 输出: "00110"
/// 说明: "01100", "10011", "11001" 也能打开保险箱。
///
/// 提示：
///
/// n 的范围是 [1, 4]。
/// k 的范围是 [1, 10]。
/// k^n 最大可能为 4096。
/// -----------------------------------------------------------------------------
public class Q0753 {
    public String crackSafe(int n, int k) {
        // TODO
        return null;
    }
}
