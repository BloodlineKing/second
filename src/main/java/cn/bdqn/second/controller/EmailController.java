package cn.bdqn.second.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class EmailController {
    @RequestMapping("/email.html")
    public String toEmail(HttpServletRequest request, Model model){
        Cookie[] cookies=request.getCookies();
        if (cookies!=null){
            for (Cookie cookie:cookies) {
                if(cookie.getName().equals("login")&&cookie.getValue().equals("yes")){
                    return "email";
                }
            }
        }
        model.addAttribute("url","email");
        return "login";
    }
}
