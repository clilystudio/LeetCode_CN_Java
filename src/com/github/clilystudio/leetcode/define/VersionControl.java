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
 * 版本控制类
 */
public class VersionControl {
    // 第一个错误的版本
    private int firstBadVersion;

    /**
     * 构造函数，为了本地测试用
     * 
     * @param version 版本号个数
     */
    public VersionControl(int version) {
        this.firstBadVersion = new Random().nextInt(version) + 1;
    }

    /**
     * 判断是否为错误版本
     * 
     * @param version 版本号
     * @return 是否为错误版本
     */
    public boolean isBadVersion(int version) {
        return (version <= this.firstBadVersion);
    }
}
