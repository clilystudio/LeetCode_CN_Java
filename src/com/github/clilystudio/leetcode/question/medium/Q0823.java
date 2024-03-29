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
/// [823] 数组的均值分割
///
/// https://leetcode-cn.com/problems/binary-trees-with-factors/description/
///
/// 给出一个含有不重复整数元素的数组，每个整数均大于 1。
///
/// 我们用这些整数来构建二叉树，每个整数可以使用任意次数。
///
/// 其中：每个非叶结点的值应等于它的两个子结点的值的乘积。
///
/// 满足条件的二叉树一共有多少个？返回的结果应模除 10 ** 9 + 7。
///
/// 示例 1:
///
/// 输入: A = [2, 4]
/// 输出: 3
/// 解释: 我们可以得到这些二叉树: [2], [4], [4, 2, 2]
///
/// 示例 2:
///
/// 输入: A = [2, 4, 5, 10]
/// 输出: 7
/// 解释: 我们可以得到这些二叉树: [2], [4], [5], [10], [4, 2, 2], [10, 2, 5], [10, 5, 2].
///
/// 提示:
///
/// 1 <= A.length <= 1000.
/// 2 <= A[i] <= 10 ^ 9.
/// -----------------------------------------------------------------------------
public class Q0823 {
    public int numFactoredBinaryTrees(int[] A) {
        // TODO
        return 0;
    }
}
