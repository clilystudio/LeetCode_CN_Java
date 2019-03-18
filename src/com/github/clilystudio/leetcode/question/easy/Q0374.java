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
package com.github.clilystudio.leetcode.question.easy;

import com.github.clilystudio.leetcode.define.GuessGame;
/// -----------------------------------------------------------------------------
/// [374] 猜数字大小
///
/// https://leetcode-cn.com/problems/guess-number-higher-or-lower/description/
///
/// 我们正在玩一个猜数字游戏。 游戏规则如下：
/// 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
/// 每次你猜错了，我会告诉你这个数字是大了还是小了。
/// 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
/// -----------------------------------------------------------------------------1 : 我的数字比较小
/// ⁠1 : 我的数字比较大
/// ⁠0 : 恭喜！你猜对了！
///
/// 示例 :
///
/// 输入: n = 10, pick = 6
/// 输出: 6
/// -----------------------------------------------------------------------------
/// 父类GuessGame提供了API函数guess.
///   @param num 你猜想的数
///   @return 猜想的数小了的话，返回-1，大了的话，返回1，正确的话，返回0
///   int guess(int num);
/// -----------------------------------------------------------------------------
public class Q0374 extends GuessGame {    
    /**
     * 构造函数，本地测试需要
     * @param n 用来初始化一个随机数供猜想，需要和guessNumber的参数相同
     */
    public Q0374(int n) {
        initRand(n);
    }

    public int guessNumber(int n) {
        // TODO
        return 0;
    }
}
