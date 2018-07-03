package cn.bdqn.second.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class WeiBoController {
    @RequestMapping("/weibo.html")
    public String toEmail(HttpServletRequest request, Model model){
        Cookie[] cookies=request.getCookies();
        if (cookies!=null){
            for (Cookie cookie:cookies) {
                if(cookie.getName().equals("login")&&cookie.getValue().equals("yes")){
                    return "weibo";
                }
            }
        }
        model.addAttribute("url","weibo");
        return "login";
    }
}
