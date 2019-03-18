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
/// [942] 超级回文数
///
/// https://leetcode-cn.com/problems/di-string-match/description/
///
/// 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
///
/// 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
///
/// 如果 S[i] == "I"，那么 A[i] < A[i+1]
/// 如果 S[i] == "D"，那么 A[i] > A[i+1]
///
/// 示例 1：
///
/// 输出："IDID"
/// 输出：[0,4,1,3,2]
///
/// 示例 2：
///
/// 输出："III"
/// 输出：[0,1,2,3]
///
/// 示例 3：
///
/// 输出："DDI"
/// 输出：[3,2,0,1]
///
/// 提示：
///
/// 1 <= S.length <= 1000
/// S 只包含字符 "I" 或 "D"。
/// -----------------------------------------------------------------------------
public class Q0942 {
    public int[] diStringMatch(String S) {
        // TODO
        return null;
    }
}
