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
/// [846] Hand of Straights
///
/// https://leetcode-cn.com/problems/hand-of-straights/description/
///
/// 爱丽丝有一手（hand）由整数数组给定的牌。 
///
/// 现在她想把牌重新排列成组，使得每个组的大小都是 W，且由 W 张连续的牌组成。
///
/// 如果她可以完成分组就返回 true，否则返回 false。
///
/// 示例 1：
///
/// 输入：hand = [1,2,3,6,2,3,4,7,8], W = 3
/// 输出：true
/// 解释：爱丽丝的手牌可以被重新排列为 [1,2,3]，[2,3,4]，[6,7,8]。
///
/// 示例 2：
///
/// 输入：hand = [1,2,3,4,5], W = 4
/// 输出：false
/// 解释：爱丽丝的手牌无法被重新排列成几个大小为 4 的组。
///
/// 提示：
///
/// 1 <= hand.length <= 10000
/// 0 <= hand[i] <= 10^9
/// 1 <= W <= hand.length
/// -----------------------------------------------------------------------------
public class Q0846 {
    public boolean isNStraightHand(int[] hand, int W) {
        // TODO
        return false;
    }
}
