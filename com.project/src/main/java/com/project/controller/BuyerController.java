package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.CityVO;
import com.project.model.ComplainVO;
import com.project.model.FeedbackVO;
import com.project.model.LoginVO;
import com.project.service.FeedbackService;
import com.project.service.LoginService;
import com.project.utils.Basemethods;

@Controller
public class BuyerController {
	@RequestMapping(value = "user/buyer")
	public String loadBuy() {

		return "dd";
	}
}
