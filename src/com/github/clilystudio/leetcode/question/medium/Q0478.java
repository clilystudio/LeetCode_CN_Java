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
/// [478] Generate Random Point in a Circle
///
/// https://leetcode-cn.com/problems/generate-random-point-in-a-circle/description/
///
/// 给定圆的半径和圆心的 x、y 坐标，写一个在圆中产生均匀随机点的函数 randPoint 。
///
/// 说明:
///
/// 输入值和输出值都将是浮点数。
/// 圆的半径和圆心的 x、y 坐标将作为参数传递给类的构造函数。
/// 圆周上的点也认为是在圆中。
/// randPoint 返回一个包含随机点的x坐标和y坐标的大小为2的数组。
///
/// 示例 1：
///
/// 输入:
/// ["Solution","randPoint","randPoint","randPoint"]
/// [[1,0,0],[],[],[]]
/// 输出: [null,[-0.72939,-0.65505],[-0.78502,-0.28626],[-0.83119,-0.19803]]
///
/// 示例 2：
///
/// 输入:
/// ["Solution","randPoint","randPoint","randPoint"]
/// [[10,5,-7.5],[],[],[]]
/// 输出: [null,[11.52438,-8.33273],[2.46992,-16.21705],[11.13430,-12.42337]]
///
/// 输入语法说明：
///
/// 输入是两个列表：调用成员函数名和调用的参数。Solution 的构造函数有三个参数，圆的半径、圆心的 x 坐标、圆心的 y 坐标。randPoint
/// 没有参数。输入参数是一个列表，即使参数为空，也会输入一个 [] 空列表。
/// -----------------------------------------------------------------------------
public class Q0478 {
    public Q0478(double radius, double x_center, double y_center) {
        this.Solution(radius, x_center, y_center);
    }

    public void Solution(double radius, double x_center, double y_center) {
        // TODO
        return;

    }

    public double[] randPoint() {
        // TODO
        return null;
    }
}
///*
/// Your Solution object will be instantiated and called as such: Solution obj =
/// new Solution(radius, x_center, y_center); double[] param_1 = obj.randPoint();
/// -----------------------------------------------------------------------------
