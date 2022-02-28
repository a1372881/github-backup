import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName Controller
 * @Description 类的详细说明
 * @Author lxl
 * @Date 2021/10/25
 * @Version 1.0
 **/
public class Controller implements org.springframework.web.servlet.mvc.Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        ModelAndView modelAndView = new ModelAndView();
        //给modelandview插入数据和值
        modelAndView.addObject("msg","小明");
        //绑定jsp文件,前缀和后缀自动填充
        modelAndView.setViewName("user");
        return modelAndView;
    }
}
