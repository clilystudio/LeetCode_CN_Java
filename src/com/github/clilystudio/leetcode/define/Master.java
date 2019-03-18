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
import java.util.Random;

/**
 * 字典类
 */
public class Master {
    // 最大猜测次数
    private static final int GUESS_LIMIT = 10;

    // 猜测次数
    private int guessTimes;

    // 密码单词
    private String secret;

    /** 单词列表 */
    public String[] wordlist;

    /**
     * 构造函数
     * 
     * @param n 单词列表长度
     */
    public Master(int n) {
        guessTimes = 0;
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String temp = "";
            char c = 'a';
            for (int j = 0; j < 6; j++) {
                char s = (char) (c + new Random().nextInt(26));
                temp = temp + String.valueOf(s);
            }
            words.add(temp);
        }
        words.toArray(this.wordlist);
        int idx = new Random().nextInt(this.wordlist.length);
        this.secret = this.wordlist[idx];
    }

    /**
     * 构造函数，为了测试指定用例
     * 
     * @param wordlist 单词列表
     */
    public Master(String[] wordlist) {
        guessTimes = 0;
        this.wordlist = wordlist.clone();
        int idx = new Random().nextInt(this.wordlist.length);
        this.secret = this.wordlist[idx];
    }

    /**
     * 猜测密码单词
     * 
     * @param word 猜测的单词
     * @return 返回匹配的字符数量
     */
    public int guess(String word) {
        guessTimes++;
        if (guessTimes > GUESS_LIMIT) {
            System.err.println(GUESS_LIMIT + "次没能猜到答案！");
            System.exit(1);
        }
        if (word.length() != 6) {
            System.err.println("密码应该为6个字符");
            System.exit(1);
        }
        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (word.charAt(i) == this.secret.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
