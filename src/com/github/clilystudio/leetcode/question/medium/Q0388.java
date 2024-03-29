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
/// [388] 文件的最长绝对路径
///
/// https://leetcode-cn.com/problems/longest-absolute-file-path/description/
///
/// 假设我们以下述方式将我们的文件系统抽象成一个字符串:
///
/// 字符串 "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext" 表示:
///
/// dir
/// ⁠   subdir1
/// ⁠   subdir2
/// ⁠       file.ext
///
/// 目录 dir 包含一个空的子目录 subdir1 和一个包含一个文件 file.ext 的子目录 subdir2 。
///
/// 字符串
/// "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
/// 表示:
///
/// dir
/// ⁠   subdir1
/// ⁠       file1.ext
/// ⁠       subsubdir1
/// ⁠   subdir2
/// ⁠       subsubdir2
/// ⁠           file2.ext
///
/// 目录 dir 包含两个子目录 subdir1 和 subdir2。 subdir1 包含一个文件 file1.ext 和一个空的二级子目录
/// subsubdir1。subdir2 包含一个二级子目录 subsubdir2 ，其中包含一个文件 file2.ext。
///
/// 我们致力于寻找我们文件系统中文件的最长 (按字符的数量统计) 绝对路径。例如，在上述的第二个例子中，最长路径为
/// "dir/subdir2/subsubdir2/file2.ext"，其长度为 32 (不包含双引号)。
///
/// 给定一个以上述格式表示文件系统的字符串，返回文件系统中文件的最长绝对路径的长度。 如果系统中没有文件，返回 0。
///
/// 说明:
///
/// 文件名至少存在一个 . 和一个扩展名。
/// 目录或者子目录的名字不能包含 .。
///
/// 要求时间复杂度为 O(n) ，其中 n 是输入字符串的大小。
///
/// 请注意，如果存在路径 aaaaaaaaaaaaaaaaaaaaa/sth.png 的话，那么  a/aa/aaa/file1.txt
/// 就不是一个最长的路径。
/// -----------------------------------------------------------------------------
public class Q0388 {
    public int lengthLongestPath(String input) {
        // TODO
        return 0;
    }
}
