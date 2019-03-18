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
/// [902] 最低加油次数
///
/// https://leetcode-cn.com/problems/numbers-at-most-n-given-digit-set/description/
///
/// 我们有一组排序的数字 D，它是  {'1','2','3','4','5','6','7','8','9'} 的非空子集。（请注意，'0'
/// 不包括在内。）
///
/// 现在，我们用这些数字进行组合写数字，想用多少次就用多少次。例如 D = {'1','3','5'}，我们可以写出像 '13', '551',
/// '1351315' 这样的数字。
///
/// 返回可以用 D 中的数字写出的小于或等于 N 的正整数的数目。
///
/// 示例 1：
///
/// 输入：D = ["1","3","5","7"], N = 100
/// 输出：20
/// 解释：
/// 可写出的 20 个数字是：
/// 1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75,
/// 77.
///
/// 示例 2：
///
/// 输入：D = ["1","4","9"], N = 1000000000
/// 输出：29523
/// 解释：
/// 我们可以写 3 个一位数字，9 个两位数字，27 个三位数字，
/// 81 个四位数字，243 个五位数字，729 个六位数字，
/// 2187 个七位数字，6561 个八位数字和 19683 个九位数字。
/// 总共，可以使用D中的数字写出 29523 个整数。
///
/// 提示：
///
/// D 是按排序顺序的数字 '1'-'9' 的子集。
/// 1 <= N <= 10^9
/// -----------------------------------------------------------------------------
public class Q0902 {
    public int atMostNGivenDigitSet(String[] D, int N) {
        // TODO
        return 0;
    }
}
