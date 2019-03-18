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
/// [552] 学生出勤记录 II
///
/// https://leetcode-cn.com/problems/student-attendance-record-ii/description/
///
/// 给定一个正整数 n，返回长度为 n 的所有可被视为可奖励的出勤记录的数量。 答案可能非常大，你只需返回结果mod 10^9 + 7的值。
///
/// 学生出勤记录是只包含以下三个字符的字符串：
///
/// 'A' : Absent，缺勤
/// 'L' : Late，迟到
/// 'P' : Present，到场
///
/// 如果记录不包含多于一个'A'（缺勤）或超过两个连续的'L'（迟到），则该记录被视为可奖励的。
///
/// 示例 1:
///
/// 输入: n = 2
/// 输出: 8
/// 解释：
/// 有8个长度为2的记录将被视为可奖励：
/// "PP" , "AP", "PA", "LP", "PL", "AL", "LA", "LL"
/// 只有"AA"不会被视为可奖励，因为缺勤次数超过一次。
///
/// 注意：n 的值不会超过100000。
/// -----------------------------------------------------------------------------
public class Q0552 {
    public int checkRecord(int n) {
        // TODO
        return 0;
    }
}
