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
/// [672] 灯泡开关 Ⅱ
///
/// https://leetcode-cn.com/problems/bulb-switcher-ii/description/
///
/// 现有一个房间，墙上挂有 n 只已经打开的灯泡和 4 个按钮。在进行了 m 次未知操作后，你需要返回这 n 只灯泡可能有多少种不同的状态。
///
/// 假设这 n 只灯泡被编号为 [1, 2, 3 ..., n]，这 4 个按钮的功能如下：
///
/// 将所有灯泡的状态反转（即开变为关，关变为开）
/// 将编号为偶数的灯泡的状态反转
/// 将编号为奇数的灯泡的状态反转
/// 将编号为 3k+1 的灯泡的状态反转（k = 0, 1, 2, ...)
///
/// 示例 1:
///
/// 输入: n = 1, m = 1.
/// 输出: 2
/// 说明: 状态为: [开], [关]
///
/// 示例 2:
///
/// 输入: n = 2, m = 1.
/// 输出: 3
/// 说明: 状态为: [开, 关], [关, 开], [关, 关]
///
/// 示例 3:
///
/// 输入: n = 3, m = 1.
/// 输出: 4
/// 说明: 状态为: [关, 开, 关], [开, 关, 开], [关, 关, 关], [关, 开, 开].
///
/// 注意： n 和 m 都属于 [0, 1000].
/// -----------------------------------------------------------------------------
public class Q0672 {
    public int flipLights(int n, int m) {
        // TODO
        return 0;
    }
}
