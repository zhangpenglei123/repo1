package cn.itheima.controller;

import cn.itheima.damain.Items;
import cn.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/items")
    public String findItems(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }

}
