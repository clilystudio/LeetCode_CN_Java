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

import com.github.clilystudio.leetcode.define.Interval;

/// -----------------------------------------------------------------------------
/// [352] 将数据流变为多个不相交间隔
///
/// https://leetcode-cn.com/problems/data-stream-as-disjoint-intervals/description/
///
/// 给定一个非负整数的数据流输入 a1，a2，…，an，…，将到目前为止看到的数字总结为不相交的区间列表。
///
/// 例如，假设数据流中的整数为 1，3，7，2，6，…，每次的总结为：
///
/// [1, 1]
/// [1, 1], [3, 3]
/// [1, 1], [3, 3], [7, 7]
/// [1, 3], [7, 7]
/// [1, 3], [6, 7]
///
/// 进阶：
/// 如果有很多合并，并且与数据流的大小相比，不相交区间的数量很小，该怎么办?
///
/// 提示：
/// 特别感谢 @yunhong 提供了本问题和其测试用例。
/// -----------------------------------------------------------------------------
/// SummaryRanges对象将被实例化，并按下面方式调用：
/// SummaryRanges obj = new SummaryRanges();
/// obj.addNum(val);
/// List<Interval> param_2 = obj.getIntervals();
/// -----------------------------------------------------------------------------
public class Q0352 {
    public class SummaryRanges {

        /** Initialize your data structure here. */
        public SummaryRanges() {
            // TODO
        }

        public void addNum(int val) {
            // TODO
        }

        public List<Interval> getIntervals() {
            // TODO
            return null;
        }
    }
}
