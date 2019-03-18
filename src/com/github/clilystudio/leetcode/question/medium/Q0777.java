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
/// [777] 托普利茨矩阵
///
/// https://leetcode-cn.com/problems/swap-adjacent-in-lr-string/description/
///
/// 在一个由 'L' , 'R' 和 'X'
/// 三个字符组成的字符串（例如"RXXLRXRXL"）中进行移动操作。一次移动操作指用一个"LX"替换一个"XL"，或者用一个"XR"替换一个"RX"。现给定起始字符串start和结束字符串end，请编写代码，当且仅当存在一系列移动操作使得start可以转换成end时，
/// 返回True。
///
/// 示例 :
///
/// 输入: start = "RXXLRXRXL", end = "XRLXXRRLX"
/// 输出: True
/// 解释:
/// 我们可以通过以下几步将start转换成end:
/// RXXLRXRXL ->
/// XRXLRXRXL ->
/// XRLXRXRXL ->
/// XRLXXRRXL ->
/// XRLXXRRLX
///
/// 注意:
///
/// 1 <= len(start) = len(end) <= 10000。
/// start和end中的字符串仅限于'L', 'R'和'X'。
/// -----------------------------------------------------------------------------
public class Q0777 {
    public boolean canTransform(String start, String end) {
        // TODO
        return false;
    }
}
