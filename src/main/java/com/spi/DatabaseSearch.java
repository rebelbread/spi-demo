package com.spi;

import java.util.List;

/**
 * @author zhiwj
 * @date 2018/9/11
 */
public class DatabaseSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据搜索 "+keyword);
        return null;
    }
}
