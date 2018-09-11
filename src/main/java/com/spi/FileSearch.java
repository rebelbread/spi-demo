package com.spi;

import java.util.List;

/**
 * @author zhiwj
 * @date 2018/9/11
 */
public class FileSearch implements Search{
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("文件搜索 "+keyword);
        return null;
    }
}
