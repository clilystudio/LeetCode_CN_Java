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

/**
 * 区间类
 */
public class Interval {
    /** 区间开始值 */
    public int start;

    /** 区间结束值 */
    public int end;

    /**
     * 构造函数
     */
    public Interval() {
        start = 0;
        end = 0;
    }

    /**
     * 构造函数
     * 
     * @param s 区间开始值
     * @param e 区间结束值
     */
    public Interval(int s, int e) {
        start = s;
        end = e;
    }
}
