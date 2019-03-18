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

/// -----------------------------------------------------------------------------
/// [946] 最小差值 II
///
/// https://leetcode-cn.com/problems/validate-stack-sequences/description/
///
/// 给定 pushed 和 popped 两个序列，只有当它们可能是在最初空栈上进行的推入 push 和弹出 pop 操作序列的结果时，返回
/// true；否则，返回 false 。
///
/// 示例 1：
///
/// 输入：pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
/// 输出：true
/// 解释：我们可以按以下顺序执行：
/// push(1), push(2), push(3), push(4), pop() -> 4,
/// push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
///
/// 示例 2：
///
/// 输入：pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
/// 输出：false
/// 解释：1 不能在 2 之前弹出。
///
/// 提示：
///
/// 0 <= pushed.length == popped.length <= 1000
/// 0 <= pushed[i], popped[i] < 1000
/// pushed 是 popped 的排列。
/// -----------------------------------------------------------------------------
public class Q0946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // TODO
        return false;
    }
}
