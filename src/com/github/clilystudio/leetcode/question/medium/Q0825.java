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
/// [825] 保持城市天际线
///
/// https://leetcode-cn.com/problems/friends-of-appropriate-ages/description/
///
/// 人们会互相发送好友请求，现在给定一个包含有他们年龄的数组，ages[i] 表示第 i 个人的年龄。
///
/// 当满足以下条件时，A 不能给 B（A、B不为同一人）发送好友请求：
///
/// age[B] <= 0.5 * age[A] + 7
/// age[B] > age[A]
/// age[B] > 100 && age[A] < 100
///
/// 否则，A 可以给 B 发送好友请求。
///
/// 注意如果 A 向 B 发出了请求，不等于 B 接受了 A 的请求。而且，人们不会给自己发送好友请求。 
///
/// 求总共会发出多少份好友请求?
///
/// 示例 1:
///
/// 输入: [16,16]
/// 输出: 2
/// 解释: 二人可以互发好友申请。
///
/// 示例 2:
///
/// 输入: [16,17,18]
/// 输出: 2
/// 解释: 好友请求可产生于 17 -> 16, 18 -> 17.
///
/// 示例 3:
///
/// 输入: [20,30,100,110,120]
/// 输出: 3
/// 解释: 好友请求可产生于 110 -> 100, 120 -> 110, 120 -> 100.
///
/// 说明:
///
/// 1 <= ages.length <= 20000.
/// 1 <= ages[i] <= 120.
/// -----------------------------------------------------------------------------
public class Q0825 {
    public int numFriendRequests(int[] ages) {
        // TODO
        return 0;
    }
}
