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

import com.github.clilystudio.leetcode.define.NestedInteger;

/// -----------------------------------------------------------------------------
/// [385] 迷你语法分析器
///
/// https://leetcode-cn.com/problems/mini-parser/description/
///
/// 给定一个用字符串表示的整数的嵌套列表，实现一个解析它的语法分析器。
///
/// 列表中的每个元素只可能是整数或整数嵌套列表
///
/// 提示：你可以假定这些字符串都是格式良好的：
///
/// 字符串非空
/// 字符串不包含空格
/// 字符串只包含数字0-9, [, - ,, ]
///
/// 示例 1：
///
/// 给定 s = "324",
///
/// 你应该返回一个 NestedInteger 对象，其中只包含整数值 324。
///
/// 示例 2：
///
/// 给定 s = "[123,[456,[789]]]",
///
/// 返回一个 NestedInteger 对象包含一个有两个元素的嵌套列表：
///
/// 1. 一个 integer 包含值 123
/// 2. 一个包含两个元素的嵌套列表：
/// ⁠   i.  一个 integer 包含值 456
/// ⁠   ii. 一个包含一个元素的嵌套列表
/// ⁠        a. 一个 integer 包含值 789
/// -----------------------------------------------------------------------------
public class Q0385 {
    public NestedInteger deserialize(String s) {
        // TODO
        return null;
    }
}
