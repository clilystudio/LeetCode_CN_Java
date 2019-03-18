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
/// [886] 括号的分数
///
/// https://leetcode-cn.com/problems/possible-bipartition/description/
///
/// 给定一组 N 人（编号为 1, 2, ..., N）， 我们想把每个人分进任意大小的两组。
///
/// 每个人都可能不喜欢其他人，那么他们不应该属于同一组。
///
/// 形式上，如果 dislikes[i] = [a, b]，表示不允许将编号为 a 和 b 的人归入同一组。
///
/// 当可以用这种方法将每个人分进两组时，返回 true；否则返回 false。
///
/// 示例 1：
///
/// 输入：N = 4, dislikes = [[1,2],[1,3],[2,4]]
/// 输出：true
/// 解释：group1 [1,4], group2 [2,3]
///
/// 示例 2：
///
/// 输入：N = 3, dislikes = [[1,2],[1,3],[2,3]]
/// 输出：false
///
/// 示例 3：
///
/// 输入：N = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
/// 输出：false
///
/// 提示：
///
/// 1 <= N <= 2000
/// 0 <= dislikes.length <= 10000
/// 1 <= dislikes[i][j] <= N
/// dislikes[i][0] < dislikes[i][1]
/// 对于 dislikes[i] == dislikes[j] 不存在 i != j 
/// -----------------------------------------------------------------------------
public class Q0886 {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        // TODO
        return false;
    }
}
