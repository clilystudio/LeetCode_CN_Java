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
/// [911] 盈利计划
///
/// https://leetcode-cn.com/problems/online-election/description/
///
/// 在选举中，第 i 张票是在时间为 times[i] 时投给 persons[i] 的。
///
/// 现在，我们想要实现下面的查询函数： TopVotedCandidate.q(int t) 将返回在 t 时刻主导选举的候选人的编号。
///
/// 在 t 时刻投出的选票也将被计入我们的查询之中。在平局的情况下，最近获得投票的候选人将会获胜。
///
/// 示例：
///
/// 输入：["TopVotedCandidate","q","q","q","q","q","q"],
/// [[[0,1,1,0,0,1,0],[0,5,10,15,20,25,30]],[3],[12],[25],[15],[24],[8]]
/// 输出：[null,0,1,1,0,0,1]
/// 解释：
/// 时间为 3，票数分布情况是 [0]，编号为 0 的候选人领先。
/// 时间为 12，票数分布情况是 [0,1,1]，编号为 1 的候选人领先。
/// 时间为 25，票数分布情况是 [0,1,1,0,0,1]，编号为 1 的候选人领先（因为最近的投票结果是平局）。
/// 在时间 15、24 和 8 处继续执行 3 个查询。
///
/// 提示：
///
/// 1 <= persons.length = times.length <= 5000
/// 0 <= persons[i] <= persons.length
/// times 是严格递增的数组，所有元素都在 [0, 10^9] 范围中。
/// 每个测试用例最多调用 10000 次 TopVotedCandidate.q。
/// TopVotedCandidate.q(int t) 被调用时总是满足 t >= times[0]。
/// -----------------------------------------------------------------------------
/// TopVotedCandidate对象将被实例化，并按下面方式调用：
/// TopVotedCandidate obj = new TopVotedCandidate(persons, times);
/// int param_1 = obj.q(t);
/// -----------------------------------------------------------------------------
public class Q0911 {
    public class TopVotedCandidate {

        public TopVotedCandidate(int[] persons, int[] times) {
            // TODO
        }

        public int q(int t) {
            // TODO
            return 0;
        }
    }
}
