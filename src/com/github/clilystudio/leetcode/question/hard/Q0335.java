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
/// [335] 路径交叉
///
/// https://leetcode-cn.com/problems/self-crossing/description/
///
/// 给定一个含有 n 个正数的数组 x。从点 (0,0) 开始，先向北移动 x[0] 米，然后向西移动 x[1] 米，向南移动 x[2] 米，向东移动
/// x[3] 米，持续移动。也就是说，每次移动后你的方位会发生逆时针变化。
///
/// 编写一个 O(1) 空间复杂度的一趟扫描算法，判断你所经过的路径是否相交。
///
/// 示例 1:
///
/// ┌───┐
/// │   │
/// └───┼──>
/// │
///
/// 输入: [2,1,1,2]
/// 输出: true
///
/// 示例 2:
///
/// ┌──────┐
/// │      │
/// │
/// │
/// └────────────>
///
/// 输入: [1,2,3,4]
/// 输出: false
///
/// 示例 3:
///
/// ┌───┐
/// │   │
/// └───┼>
///
/// 输入: [1,1,1,1]
/// 输出: true
/// -----------------------------------------------------------------------------
public class Q0335 {
    public boolean isSelfCrossing(int[] x) {
        // TODO
        return false;
    }
}
