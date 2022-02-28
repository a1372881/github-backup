import com.dida.dao.blogMapper;
import com.dida.pojo.Blog;
import com.dida.utils.IDutils;
import com.dida.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.*;

public class Mytest {


    @Test
    public void addblogtest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);


        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis如此困难");
        blog.setAuthor("dida");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addblog(blog);


        blog.setId(IDutils.getId());
        blog.setTitle("Spring如此困难");
        blog.setAuthor("dida");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addblog(blog);


        blog.setId(IDutils.getId());
        blog.setTitle("SpringMVC如此困难");
        blog.setAuthor("dida");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addblog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("JAVA如此困难");
        blog.setAuthor("dida");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addblog(blog);

        sqlSession.close();

    }


    @Test
    public void findByanything(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);
        Map hashMap = new HashMap<>();
        hashMap.put("title","JAVA如此困难");
        hashMap.put("id","609ac9b2584c4ef3b8448c266ecec5e2");
        List<Blog> blogs = mapper.findByanything(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void findByanything2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);
        Map hashMap = new HashMap<>();
        hashMap.put("id","aedf1462d0c241c3be4c060955dbf1d5");

        List<Blog> blogs = mapper.findByanything2(hashMap);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void useByforeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        blogMapper mapper = sqlSession.getMapper(blogMapper.class);
        Map hashMap = new HashMap<>();

        ArrayList<Integer> ids = new ArrayList<>();


        hashMap.put("ids",ids);

        ids.add(1);
        ids.add(2);
        List<Blog> blogs = mapper.useByforeach(hashMap);

        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
