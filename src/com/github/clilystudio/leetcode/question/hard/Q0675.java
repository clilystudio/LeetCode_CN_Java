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

import java.util.List;

/// -----------------------------------------------------------------------------
/// [675] 为高尔夫比赛砍树
///
/// https://leetcode-cn.com/problems/cut-off-trees-for-golf-event/description/
///
/// 你被请来给一个要举办高尔夫比赛的树林砍树. 树林由一个非负的二维数组表示， 在这个数组中：
///
/// 0 表示障碍，无法触碰到.
/// 1 表示可以行走的地面.
/// 比1大的数 表示一颗允许走过的树的高度.
///
/// 你被要求按照树的高度从低向高砍掉所有的树，每砍过一颗树，树的高度变为1。
///
/// 你将从（0，0）点开始工作，你应该返回你砍完所有树需要走的最小步数。 如果你无法砍完所有的树，返回 -1 。
///
/// 可以保证的是，没有两棵树的高度是相同的，并且至少有一颗树需要你砍。
///
/// 示例 1:
///
/// 输入:
/// [
/// ⁠[1,2,3],
/// ⁠[0,0,4],
/// ⁠[7,6,5]
/// ]
/// 输出: 6
///
/// 示例 2:
///
/// 输入:
/// [
/// ⁠[1,2,3],
/// ⁠[0,0,0],
/// ⁠[7,6,5]
/// ]
/// 输出: -1
///
/// 示例 3:
///
/// 输入:
/// [
/// ⁠[2,3,4],
/// ⁠[0,0,5],
/// ⁠[8,7,6]
/// ]
/// 输出: 6
///
/// 解释: (0,0) 位置的树，你可以直接砍去，不用算步数
///
/// 提示: 矩阵大小不会超过 50x50 。
/// -----------------------------------------------------------------------------
public class Q0675 {
    public int cutOffTree(List<List<Integer>> forest) {
        // TODO
        return 0;
    }
}
