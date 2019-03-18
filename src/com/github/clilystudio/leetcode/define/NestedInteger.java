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

import java.util.ArrayList;
import java.util.List;

/**
 * 嵌套整数列表类
 */
public final class NestedInteger {

    // 单个整数值
    private Integer value;

    // 嵌套列表
    private List<NestedInteger> list;

    /**
     * 构造函数
     */
    public NestedInteger() {
        this.value = null;
        this.list = null;
    }

    /**
     * 构造函数，存放一个单独整数
     * 
     * @param value 整数值
     */
    public NestedInteger(int value) {
        this.value = value;
        this.list = null;
    }

    /**
     * 判断是否为存放单独整数
     * 
     * @return 如果存放的是一个单独整数时，返回true，否则返回false
     */
    public boolean isInteger() {
        return (this.list == null && this.value != null);
    }

    /**
     * 获取单独整数
     * 
     * @return 如果是存放的单独整数，则返回保存的单独整数，否则返回null
     */
    public Integer getInteger() {
        if (this.list != null) {
            return null;
        }
        return this.value;
    }

    /**
     * 保存一个单独整数
     * 
     * @param value 存放的单独整数值
     */
    public void setInteger(int value) {
        this.value = value;
        this.list = null;
    }

    /**
     * 保存一个嵌套列表，并把一个嵌套整数加到列表中
     * 
     * @param ni 嵌套整数列表
     */
    public void add(NestedInteger ni) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(ni);
        this.value = null;
    }

    /**
     * 取得嵌套列表
     * 
     * @return 如果存放的是嵌套列表，则返回保存的嵌套列表，否则返回null
     */
    public List<NestedInteger> getList() {
        if (isInteger()) {
            return null;
        }
        return this.list;
    }
}
