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
/// [790] 全局倒置与局部倒置
///
/// https://leetcode-cn.com/problems/domino-and-tromino-tiling/description/
///
/// 有两种形状的瓷砖：一种是 2x1 的多米诺形，另一种是形如 "L" 的托米诺形。两种形状都可以旋转。
///
/// XX  <- 多米诺
///
/// XX  <- "L" 托米诺
/// X
///
/// 给定 N 的值，有多少种方法可以平铺 2 x N 的面板？返回值 mod 10^9 + 7。
///
/// （平铺指的是每个正方形都必须有瓷砖覆盖。两个平铺不同，当且仅当面板上有四个方向上的相邻单元中的两个，使得恰好有一个平铺有一个瓷砖占据两个正方形。）
///
/// 示例:
/// 输入: 3
/// 输出: 5
/// 解释:
/// 下面列出了五种不同的方法，不同字母代表不同瓷砖：
/// XYZ XXZ XYY XXY XYY
/// XYZ YYZ XZZ XYY XXY
///
/// 提示：
///
/// N  的范围是 [1, 1000]
/// -----------------------------------------------------------------------------
public class Q0790 {
    public int numTilings(int N) {
        // TODO
        return 0;
    }
}
