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

import com.github.clilystudio.leetcode.define.VersionControl;

/// -----------------------------------------------------------------------------
/// [278] 第一个错误的版本
///
/// https://leetcode-cn.com/problems/first-bad-version/description/
///
/// 你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
///
/// 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
///
/// 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version
/// 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
///
/// 示例:
///
/// 给定 n = 5，并且 version = 4 是第一个错误的版本。
///
/// 调用 isBadVersion(3) -> false
/// 调用 isBadVersion(5) -> true
/// 调用 isBadVersion(4) -> true
///
/// 所以，4 是第一个错误的版本。 
/// -----------------------------------------------------------------------------
/// isBadVersion是在父类VersionControl中定义的API.
///   boolean isBadVersion(int version);
/// -----------------------------------------------------------------------------
public class Q0278 extends VersionControl {
    /**
     * 本地测试用，传入参数应该和firstBadVersion的参数相同
     * @param version
     */
    public Q0278(int version) {
        super(version);
    }

    public int firstBadVersion(int n) {
        // TODO
        return 0;
    }
}
