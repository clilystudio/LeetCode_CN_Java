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
/// [855] 独特字符串
///
/// https://leetcode-cn.com/problems/exam-room/description/
///
/// 在考场里，一排有 N 个座位，分别编号为 0, 1, 2, ..., N-1 。
///
/// 当学生进入考场后，他必须坐在能够使他与离他最近的人之间的距离达到最大化的座位上。如果有多个这样的座位，他会坐在编号最小的座位上。(另外，如果考场里没有人，那么学生就坐在
/// 0 号座位上。)
///
/// 返回 ExamRoom(int N) 类，它有两个公开的函数：其中，函数 ExamRoom.seat() 会返回一个 int
/// （整型数据），代表学生坐的位置；函数 ExamRoom.leave(int p) 代表坐在座位 p 上的学生现在离开了考场。请确保每次调用
/// ExamRoom.leave(p) 时都有学生坐在座位 p 上。
///
/// 示例：
///
/// 输入：["ExamRoom","seat","seat","seat","seat","leave","seat"],
/// [[10],[],[],[],[],[4],[]]
/// 输出：[null,0,9,4,2,null,5]
/// 解释：
/// ExamRoom(10) -> null
/// seat() -> 0，没有人在考场里，那么学生坐在 0 号座位上。
/// seat() -> 9，学生最后坐在 9 号座位上。
/// seat() -> 4，学生最后坐在 4 号座位上。
/// seat() -> 2，学生最后坐在 2 号座位上。
/// leave(4) -> null
/// seat() -> 5，学生最后坐在 5 号座位上。
///
/// 提示：
///
/// 1 <= N <= 10^9
/// 在所有的测试样例中 ExamRoom.seat() 和 ExamRoom.leave() 最多被调用 10^4 次。
/// 调用 ExamRoom.leave(p) 时需要确保当前有学生坐在座位 p 上。
/// -----------------------------------------------------------------------------
/// ExamRoom对象将被实例化，并按下面方式调用：
/// ExamRoom obj = new ExamRoom(N);
/// int param_1 = obj.seat();
/// obj.leave(p);
/// -----------------------------------------------------------------------------
public class Q0855 {
    public class ExamRoom {

        public ExamRoom(int N) {
            // TODO
        }

        public int seat() {
            // TODO
            return 0;
        }

        public void leave(int p) {
            // TODO
        }
    }
}
