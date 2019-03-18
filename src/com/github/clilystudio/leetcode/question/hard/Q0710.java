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
/// [710] Random Pick with Blacklist
///
/// https://leetcode-cn.com/problems/random-pick-with-blacklist/description/
///
/// 给定一个包含 [0，n ) 中独特的整数的黑名单 B，写一个函数从 [ 0，n ) 中返回一个不在 B 中的随机整数。
///
/// 对它进行优化使其尽量少调用系统方法 Math.random() 。
///
/// 提示:
///
/// 1 <= N <= 1000000000
/// 0 <= B.length < min(100000, N)
/// [0, N) 不包含 N，详细参见 interval notation 。
///
/// 示例 1:
///
/// 输入:
/// ["Solution","pick","pick","pick"]
/// [[1,[]],[],[],[]]
/// 输出: [null,0,0,0]
///
/// 示例 2:
///
/// 输入:
/// ["Solution","pick","pick","pick"]
/// [[2,[]],[],[],[]]
/// 输出: [null,1,1,1]
///
/// 示例 3:
///
/// 输入:
/// ["Solution","pick","pick","pick"]
/// [[3,[1]],[],[],[]]
/// Output: [null,0,0,2]
///
/// 示例 4:
///
/// 输入:
/// ["Solution","pick","pick","pick"]
/// [[4,[2]],[],[],[]]
/// 输出: [null,1,3,1]
///
/// 输入语法说明：
///
/// 输入是两个列表：调用成员函数名和调用的参数。Solution的构造函数有两个参数，N 和黑名单 B。pick
/// 没有参数，输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。
/// -----------------------------------------------------------------------------
public class Q0710 {
    public Q0710(int N, int[] blacklist) {
        // TODO
        Solution(N, blacklist);
    }

    public void Solution(int N, int[] blacklist) {
        // TODO
        return;

    }

    public int pick() {
        // TODO
        return 0;
    }
}
///*
/// Your Solution object will be instantiated and called as such: Solution obj =
/// new Solution(N, blacklist); int param_1 = obj.pick();
/// -----------------------------------------------------------------------------
