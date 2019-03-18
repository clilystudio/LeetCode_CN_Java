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
/// [636] 函数的独占时间
///
/// https://leetcode-cn.com/problems/exclusive-time-of-functions/description/
///
/// 给出一个非抢占单线程CPU的 n 个函数运行日志，找到函数的独占时间。
///
/// 每个函数都有一个唯一的 Id，从 0 到 n-1，函数可能会递归调用或者被其他函数调用。
///
/// 日志是具有以下格式的字符串：function_id：start_or_end：timestamp。例如："0:start:0" 表示函数 0 从 0
/// 时刻开始运行。"0:end:0" 表示函数 0 在 0 时刻结束。
///
/// 函数的独占时间定义是在该方法中花费的时间，调用其他函数花费的时间不算该函数的独占时间。你需要根据函数的 Id 有序地返回每个函数的独占时间。
///
/// 示例 1:
///
/// 输入:
/// n = 2
/// logs =
/// ["0:start:0",
/// ⁠"1:start:2",
/// ⁠"1:end:5",
/// ⁠"0:end:6"]
/// 输出:[3, 4]
/// 说明：
/// 函数 0 在时刻 0 开始，在执行了  2个时间单位结束于时刻 1。
/// 现在函数 0 调用函数 1，函数 1 在时刻 2 开始，执行 4 个时间单位后结束于时刻 5。
/// 函数 0 再次在时刻 6 开始执行，并在时刻 6 结束运行，从而执行了 1 个时间单位。
/// 所以函数 0 总共的执行了 2 +1 =3 个时间单位，函数 1 总共执行了 4 个时间单位。
///
/// 说明：
///
/// 输入的日志会根据时间戳排序，而不是根据日志Id排序。
/// 你的输出会根据函数Id排序，也就意味着你的输出数组中序号为 0 的元素相当于函数 0 的执行时间。
/// 两个函数不会在同时开始或结束。
/// 函数允许被递归调用，直到运行结束。
/// 1 <= n <= 100
/// -----------------------------------------------------------------------------
public class Q0636 {
    public int[] exclusiveTime(int n, List<String> logs) {
        // TODO
        return null;
    }
}
