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
package com.github.clilystudio.leetcode.define;

import java.util.Random;

/**
 * 猜想游戏类
 */
public class GuessGame {

    // 待猜想的数字
    private int randNum;

    /**
     * 根据给定的范围，生成一个1～N之间的一个随机数供猜想
     * 
     * @param num 随机数生成范围
     */
    public void initRand(int num) {
        randNum = new Random().nextInt(num) + 1;
    }

    /**
     * 给出猜想结果
     * 
     * @param 猜想的数
     * @return 猜想的数小了的话，返回-1，大了的话，返回1，正确的话，返回0
     */
    public int guess(int num) {
        if (num < randNum) {
            return -1;
        } else if (num > randNum) {
            return 1;
        }
        return 0;
    }
}
