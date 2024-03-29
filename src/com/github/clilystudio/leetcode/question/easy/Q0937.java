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
/// [937] 股票价格跨度
///
/// https://leetcode-cn.com/problems/reorder-log-files/description/
///
/// 你有一个日志数组 logs。每条日志都是以空格分隔的字串。
///
/// 对于每条日志，其第一个字为字母数字标识符。然后，要么：
///
/// 标识符后面的每个字将仅由小写字母组成，或；
/// 标识符后面的每个字将仅由数字组成。
///
/// 我们将这两种日志分别称为字母日志和数字日志。保证每个日志在其标识符后面至少有一个字。
///
/// 将日志重新排序，使得所有字母日志都排在数字日志之前。字母日志按字母顺序排序，忽略标识符，标识符仅用于表示关系。数字日志应该按原来的顺序排列。
///
/// 返回日志的最终顺序。
///
/// 示例 ：
///
/// 输入：["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
/// 输出：["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]
///
/// 提示：
///
/// 0 <= logs.length <= 100
/// 3 <= logs[i].length <= 100
/// logs[i] 保证有一个标识符，并且标识符后面有一个字。
/// -----------------------------------------------------------------------------
public class Q0937 {
    public String[] reorderLogFiles(String[] logs) {
        // TODO
        return null;
    }
}
