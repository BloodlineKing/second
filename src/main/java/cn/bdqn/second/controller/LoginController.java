package cn.bdqn.second.controller;

import cn.bdqn.second.pojo.First;
import cn.bdqn.second.service.FirstService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @Resource
    private FirstService firstService;

    @RequestMapping("/login.do")
    public String login(String username,String password,String url,HttpServletResponse response){
        First first=firstService.getFirst(username,password);
        System.out.print("1");
        if (first!=null){
            Cookie cookie=new Cookie("login","yes");
            response.addCookie(cookie);
            cookie.setPath("/");
            return url;
        }
        return "login";
    }
}
