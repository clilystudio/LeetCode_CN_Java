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
 * 坐标类
 */
public class Point {
    /** 坐标X */
    public int x;

    /** 坐标Y */
    public int y;

    /**
     * 构造函数
     */
    public Point() {
        x = 0;
        y = 0;
    }

    /**
     * 构造函数
     * 
     * @param a 坐标X
     * @param b 坐标Y
     */
    public Point(int a, int b) {
        x = a;
        y = b;
    }
}
