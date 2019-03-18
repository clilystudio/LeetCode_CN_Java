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

import com.github.clilystudio.leetcode.define.SolBase;

/// -----------------------------------------------------------------------------
/// [470] Implement Rand10() Using Rand7()
///
/// https://leetcode-cn.com/problems/implement-rand10-using-rand7/description/
///
/// 已有方法 rand7 可生成 1 到 7 范围内的均匀随机整数，试写一个方法 rand10 生成 1 到 10 范围内的均匀随机整数。
///
/// 不要使用系统的 Math.random() 方法。
///
/// 示例 1:
///
/// 输入: 1
/// 输出: [7]
///
/// 示例 2:
///
/// 输入: 2
/// 输出: [8,4]
///
/// 示例 3:
///
/// 输入: 3
/// 输出: [8,1,10]
///
/// 提示:
///
/// rand7 已定义。
/// 传入参数: n 表示 rand10 的调用次数。
///
/// 进阶:
///
/// rand7()调用次数的 期望值 是多少 ?
/// 你能否尽量少调用 rand7() ?
/// -----------------------------------------------------------------------------
/// rand7()是由父类SolBase提供的API
/// 能够返回位于1到7之间的一个随机整数
/// public int rand7();
/// -----------------------------------------------------------------------------
public class Q0470 extends SolBase {
    public int rand10() {
        // TODO
        return 0;
    }
}
