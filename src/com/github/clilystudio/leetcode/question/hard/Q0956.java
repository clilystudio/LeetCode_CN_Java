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
/// [956] 播放列表的数量
///
/// https://leetcode-cn.com/problems/tallest-billboard/description/
///
/// 你正在安装一个广告牌，并希望它高度最大。这块广告牌将有两个钢制支架，两边各一个。每个钢支架的高度必须相等。
///
/// 你有一堆可以焊接在一起的钢筋 rods。举个例子，如果钢筋的长度为 1、2 和 3，则可以将它们焊接在一起形成长度为 6 的支架。
///
/// 返回广告牌的最大可能安装高度。如果没法安装广告牌，请返回 0。
///
/// 示例 1：
///
/// 输入：[1,2,3,6]
/// 输出：6
/// 解释：我们有两个不相交的子集 {1,2,3} 和 {6}，它们具有相同的和 sum = 6。
///
/// 示例 2：
///
/// 输入：[1,2,3,4,5,6]
/// 输出：10
/// 解释：我们有两个不相交的子集 {2,3,5} 和 {4,6}，它们具有相同的和 sum = 10。
///
/// 示例 3：
///
/// 输入：[1,2]
/// 输出：0
/// 解释：没法安装广告牌，所以返回 0。
///
/// 提示：
///
/// 0 <= rods.length <= 20
/// 1 <= rods[i] <= 1000
/// 钢筋的长度总和最多为 5000
/// -----------------------------------------------------------------------------
public class Q0956 {
    public int tallestBillboard(int[] rods) {
        // TODO
        return 0;
    }
}
