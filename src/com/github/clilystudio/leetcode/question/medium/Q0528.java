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
/// [528] Random Pick with Weight
///
/// https://leetcode-cn.com/problems/random-pick-with-weight/description/
///
/// 给定一个正整数数组 w ，其中 w[i] 代表位置 i 的权重，请写一个函数 pickIndex ，它可以随机地获取位置 i，选取位置 i 的概率与
/// w[i] 成正比。
///
/// 说明:
///
/// 1 <= w.length <= 10000
/// 1 <= w[i] <= 10^5
/// pickIndex 将被调用不超过 10000 次
///
/// 示例1:
///
/// 输入:
/// ["Solution","pickIndex"]
/// [[[1]],[]]
/// 输出: [null,0]
///
/// 示例2:
///
/// 输入:
/// ["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
/// [[[1,3]],[],[],[],[],[]]
/// 输出: [null,0,1,1,1,0]
///
/// 输入语法说明：
///
/// 输入是两个列表：调用成员函数名和调用的参数。Solution 的构造函数有一个参数，即数组 w。pickIndex
/// 没有参数。输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。
/// -----------------------------------------------------------------------------
public class Q0528 {
    public Q0528(int[] w) {
        this.Solution(w);
    }

    public void Solution(int[] w) {
        // TODO
        return;

    }

    public int pickIndex() {
        // TODO
        return 0;
    }
}
///*
/// Your Solution object will be instantiated and called as such: Solution obj =
/// new Solution(w); int param_1 = obj.pickIndex();
/// -----------------------------------------------------------------------------
