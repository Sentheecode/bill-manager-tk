package com.wubin.controller;

import com.wubin.entity.Bill;
import com.wubin.entity.BillType;
import com.wubin.service.BillService;
import com.wubin.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/bill")
public class BillerController {

    @Autowired
    private BillService billService;

    @Autowired
    private TypeService typeService;

    @RequestMapping("/list")
    public String list(Bill bill, Model model){
        List<BillType> types = typeService.list();
        model.addAttribute("types",types);

        List<Bill> bills = billService.list(bill);
        model.addAttribute("bills",bills);

        return "/bill/list";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        List<BillType> types = typeService.list();
        model.addAttribute("types",types);

        return "/bill/add";
    }

    @RequestMapping("/add")
    public String add(Bill bill){
        billService.add(bill);

        return "redirect:/bill/list";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        billService.delete(id);

        return "redirect:/bill/list";
    }

    @RequestMapping("/toUpdate/{id}")
    public String toUpdate(@PathVariable("id") Long id,Model model){
        List<BillType> types = typeService.list();
        model.addAttribute("types",types);

        Bill bill = billService.get(id);
        model.addAttribute("bill",bill);
        return "/bill/update";
    }

    @RequestMapping("/update")
    public String save(Bill bill){
        billService.update(bill);
        return "redirect:/bill/list";
    }
}
