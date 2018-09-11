package com.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author zhiwj
 * @date 2018/9/11
 */
public class Main {

        public static void main(String[] args) {
            ServiceLoader<Search> s = ServiceLoader.load(Search.class);
            Iterator<Search> iterator = s.iterator();
            while (iterator.hasNext()) {
                Search search =  iterator.next();
                search.searchDoc("hello world");
            }
        }
}
