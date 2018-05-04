package com.sapp.controller.login;

import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;








import net.sf.json.JSONObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import org.springframework.web.bind.annotation.ResponseBody;

import com.sapp.service.LoginService;



@Controller
@RequestMapping(value="/shop/user")
public class LoginController {
	@Resource
	private LoginService loginService;
	private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	@RequestMapping(value = "/login", method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
    public JSONObject getUserDetail(HttpServletRequest request) {
		LOGGER.debug("getUserDetail begin");
		String sellerId = request.getParameter("seller_id");
		LOGGER.debug("seller_id is " + sellerId);
		String code = request.getParameter("code");
		LOGGER.debug("code is " + code);
		JSONObject object = new JSONObject();
		object.put("code", "0000");
		object.put("msg", "success");
		object.put("token", UUID.randomUUID().toString());
		return object;
    }
}
