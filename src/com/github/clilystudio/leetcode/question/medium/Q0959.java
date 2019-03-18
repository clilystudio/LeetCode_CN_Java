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
/// [959] 三数之和的多种可能
///
/// https://leetcode-cn.com/problems/regions-cut-by-slashes/description/
///
/// 在由 1 x 1 方格组成的 N x N 网格 grid 中，每个 1 x 1 方块由 /、\ 或空格构成。这些字符会将方块划分为一些共边的区域。
///
/// （请注意，反斜杠字符是转义的，因此 \ 用 "\\" 表示。）。
///
/// 返回区域的数目。
///
/// 示例 1：
///
/// 输入：
/// [
/// " /",
/// "/ "
/// ]
/// 输出：2
/// 解释：2x2 网格如下：
///
/// 示例 2：
///
/// 输入：
/// [
/// " /",
/// "  "
/// ]
/// 输出：1
/// 解释：2x2 网格如下：
///
/// 示例 3：
///
/// 输入：
/// [
/// "\\/",
/// "/\\"
/// ]
/// 输出：4
/// 解释：（回想一下，因为 \ 字符是转义的，所以 "\\/" 表示 \/，而 "/\\" 表示 /\。）
/// 2x2 网格如下：
///
/// 示例 4：
///
/// 输入：
/// [
/// "/\\",
/// "\\/"
/// ]
/// 输出：5
/// 解释：（回想一下，因为 \ 字符是转义的，所以 "/\\" 表示 /\，而 "\\/" 表示 \/。）
/// 2x2 网格如下：
///
/// 示例 5：
///
/// 输入：
/// [
/// "//",
/// "/ "
/// ]
/// 输出：3
/// 解释：2x2 网格如下：
///
/// 提示：
///
/// 1 <= grid.length == grid[0].length <= 30
/// grid[i][j] 是 '/'、'\'、或 ' '。
/// -----------------------------------------------------------------------------
public class Q0959 {
    public int regionsBySlashes(String[] grid) {
        // TODO
        return 0;
    }
}
