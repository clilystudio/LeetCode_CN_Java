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
/// [553] 最优除法
///
/// https://leetcode-cn.com/problems/optimal-division/description/
///
/// 给定一组正整数，相邻的整数之间将会进行浮点除法操作。例如， [2,3,4] -> 2 / 3 / 4 。
///
/// 但是，你可以在任意位置添加任意数目的括号，来改变算数的优先级。你需要找出怎么添加括号，才能得到最大的结果，并且返回相应的字符串格式的表达式。你的表达式不应该含有冗余的括号。
///
/// 示例：
///
/// 输入: [1000,100,10,2]
/// 输出: "1000/(100/10/2)"
/// 解释:
/// 1000/(100/10/2) = 1000/((100/10)/2) = 200
/// 但是，以下加粗的括号 "1000/((100/10)/2)" 是冗余的，
/// 因为他们并不影响操作的优先级，所以你需要返回 "1000/(100/10/2)"。
///
/// 其他用例:
/// 1000/(100/10)/2 = 50
/// 1000/(100/(10/2)) = 50
/// 1000/100/10/2 = 0.5
/// 1000/100/(10/2) = 2
///
/// 说明:
///
/// 输入数组的长度在 [1, 10] 之间。
/// 数组中每个元素的大小都在 [2, 1000] 之间。
/// 每个测试用例只有一个最优除法解。
/// -----------------------------------------------------------------------------
public class Q0553 {
    public String optimalDivision(int[] nums) {
        // TODO
        return null;
    }
}
