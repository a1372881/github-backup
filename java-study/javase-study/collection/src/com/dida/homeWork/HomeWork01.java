package com.dida.homeWork;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 23216
 * @version 1.0
 * @description: 按要求实现：
 * (1)封装一个新闻类，包含标题和内容属性，提供get、set方法，重写toString方法，打印对象
 * 时只打印标题;
 * (2) 只提供一个带参数的构造器，实例化对象时，只初始化标题；并且实例化两个对象：
 * 新闻一:
 *新闻一：新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧
 * 新闻二：男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生
 * (3)将新闻对象添加到ArrayList集合中，并且进行倒序遍历;
 * (4) 在遍历集合过程中，对新闻标题进行处理，超过15字的只保留言
 * ）在控制台打印遍历出经过处理的新闻标题;
 * @date 2022/1/25 13:51
 */
public class HomeWork01 {
    public static void main(String[] args) {
        News news = new News("新冠确诊病例超千万，数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News news1 = new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生");

        ArrayList list = new ArrayList<News>();
        list.add(news);
        list.add(news1);

        int size = list.size();
        for (int i = 0; i < size; i++) {
            News o = (News) list.get(size - (i+1));
            if (o.title.length() < 15){
                System.out.println(o.getTitle());
            }else{
                String title = o.getTitle();
                System.out.println(title.substring(0,15)+"...");
            }

        }


    }

    static class News{
        private String title;
        private String contents;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        @Override
        public String toString() {
            return "News{" +
                    "title='" + title + '\'' +
                    '}';
        }

        public News(String title) {
            this.title = title;
        }
    }
}
