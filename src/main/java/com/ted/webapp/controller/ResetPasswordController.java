package com.ted.webapp.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import com.ted.model.User;
import com.ted.webapp.util.RequestUtil;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
@RequestMapping("/resetpassword*")
public class ResetPasswordController extends BaseFormController {

    public ResetPasswordController() {
        setCancelView("redirect:login");
        setSuccessView("redirect:home");
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView handleRequest()
    {
    	System.out.println("abc'ded!");
        return new ModelAndView();
    }
}