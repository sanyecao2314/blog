package com.lili.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lili.base.ResultJson;
import com.lili.blog.view.CarouselView;

@Controller
public class CtrlIndex {

	/**
	 * 获取首页走马灯的图片和链接
	 * 
	 * @author lili
	 * @date 2019年10月11日
	 * @return
	 */
	@RequestMapping(value = { "getCarouseInfo" })
	@ResponseBody
	public ResultJson getCarouseInfo() {
		List<CarouselView> lsCarouselViews = new ArrayList<>();
		return ResultJson.trueState("success", lsCarouselViews);
	}

}
