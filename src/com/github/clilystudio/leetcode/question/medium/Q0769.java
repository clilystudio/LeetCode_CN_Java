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
/// [769] 最大加号标志
///
/// https://leetcode-cn.com/problems/max-chunks-to-make-sorted/description/
///
/// 数组arr是[0, 1, ..., arr.length -
/// 1]的一种排列，我们将这个数组分割成几个“块”，并将这些块分别进行排序。之后再连接起来，使得连接的结果和按升序排序后的原数组相同。
///
/// 我们最多能将数组分成多少块？
///
/// 示例 1:
///
/// 输入: arr = [4,3,2,1,0]
/// 输出: 1
/// 解释:
/// 将数组分成2块或者更多块，都无法得到所需的结果。
/// 例如，分成 [4, 3], [2, 1, 0] 的结果是 [3, 4, 0, 1, 2]，这不是有序的数组。
///
/// 示例 2:
///
/// 输入: arr = [1,0,2,3,4]
/// 输出: 4
/// 解释:
/// 我们可以把它分成两块，例如 [1, 0], [2, 3, 4]。
/// 然而，分成 [1, 0], [2], [3], [4] 可以得到最多的块数。
///
/// 注意:
///
/// arr 的长度在 [1, 10] 之间。
/// arr[i]是 [0, 1, ..., arr.length - 1]的一种排列。
/// -----------------------------------------------------------------------------
public class Q0769 {
    public int maxChunksToSorted(int[] arr) {
        // TODO
        return 0;
    }
}
