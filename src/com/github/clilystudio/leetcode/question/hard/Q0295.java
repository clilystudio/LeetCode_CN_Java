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
/// [295] 数据流的中位数
///
/// https://leetcode-cn.com/problems/find-median-from-data-stream/description/
///
/// 中位数是有序列表中间的数。如果列表长度是偶数，中位数则是中间两个数的平均值。
///
/// 例如，
///
/// [2,3,4] 的中位数是 3
///
/// [2,3] 的中位数是 (2 + 3) / 2 = 2.5
///
/// 设计一个支持以下两种操作的数据结构：
///
/// void addNum(int num) - 从数据流中添加一个整数到数据结构中。
/// double findMedian() - 返回目前所有元素的中位数。
///
/// 示例：
///
/// addNum(1)
/// addNum(2)
/// findMedian() -> 1.5
/// addNum(3)
/// findMedian() -> 2
///
/// 进阶:
///
/// 如果数据流中所有整数都在 0 到 100 范围内，你将如何优化你的算法？
/// 如果数据流中 99% 的整数都在 0 到 100 范围内，你将如何优化你的算法？
/// -----------------------------------------------------------------------------
/// MedianFinder对象将被实例化，并按下面方式调用：
/// MedianFinder obj = new MedianFinder();
/// obj.addNum(num);
/// double param_2 = obj.findMedian();
/// -----------------------------------------------------------------------------
public class Q0295 {
    public class MedianFinder {

        /** initialize your data structure here. */
        public MedianFinder() {
            // TODO
        }

        public void addNum(int num) {
            // TODO
        }

        public double findMedian() {
            // TODO
            return 0.0;
        }
    }
}
