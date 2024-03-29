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
/// [920] 两句话中的不常见单词
///
/// https://leetcode-cn.com/problems/number-of-music-playlists/description/
///
/// 你的音乐播放器里有 N 首不同的歌，在旅途中，你的旅伴想要听 L 首歌（不一定不同，即，允许歌曲重复）。请你为她按如下规则创建一个播放列表：
///
/// 每首歌至少播放一次。
/// 一首歌只有在其他 K 首歌播放完之后才能再次播放。
///
/// 返回可以满足要求的播放列表的数量。由于答案可能非常大，请返回它模 10^9 + 7 的结果。
///
/// 示例 1：
///
/// 输入：N = 3, L = 3, K = 1
/// 输出：6
/// 解释：有 6 种可能的播放列表。[1, 2, 3]，[1, 3, 2]，[2, 1, 3]，[2, 3, 1]，[3, 1, 2]，[3, 2,
/// 1].
///
/// 示例 2：
///
/// 输入：N = 2, L = 3, K = 0
/// 输出：6
/// 解释：有 6 种可能的播放列表。[1, 1, 2]，[1, 2, 1]，[2, 1, 1]，[2, 2, 1]，[2, 1, 2]，[1, 2,
/// 2]
///
/// 示例 3：
///
/// 输入：N = 2, L = 3, K = 1
/// 输出：2
/// 解释：有 2 种可能的播放列表。[1, 2, 1]，[2, 1, 2]
///
/// 提示：
///
/// 0 <= K < N <= L <= 100
/// -----------------------------------------------------------------------------
public class Q0920 {
    public int numMusicPlaylists(int N, int L, int K) {
        // TODO
        return 0;
    }
}
