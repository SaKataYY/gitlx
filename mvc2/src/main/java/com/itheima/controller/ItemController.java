package com.itheima.controller;

import com.itheima.pojo.Item;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ItemController {

    @RequestMapping("itemList.action")
    public ModelAndView itemList() {
        ModelAndView modelAndView = new ModelAndView();
        List<Item> list = new ArrayList<Item>();
        list.add(new Item(1,"火箭",300,new Date() , "火箭最低价售卖"));
        list.add(new Item(2,"飞机",200,new Date() , "飞机最低价售卖"));
        list.add(new Item(3,"航母",500,new Date() , "航母最低价售卖"));
        list.add(new Item(4, "UFO", 800, new Date(), "UFO最低价售卖"));

        modelAndView.addObject("list", list);
        modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
        return modelAndView;
    }
}
