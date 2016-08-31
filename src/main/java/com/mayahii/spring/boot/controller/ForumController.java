package com.mayahii.spring.boot.controller;

import com.mayahii.spring.boot.bean.Forum;
import com.mayahii.spring.boot.repository.ForumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by root on 31/08/16.
 */
@Controller
public class ForumController {
    
    @Autowired
    private ForumRepository forumRepository;
    
    //ALL
    @RequestMapping(name= "/index", method = RequestMethod.GET)
    public String index(Model model){
        List<Forum> list = (List<Forum>) forumRepository.findAll();
        model.addAttribute("lists",list);
        model.addAttribute("forum",new Forum());
        return "index";
    }
    
    //Create
    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String indexSubmit(@ModelAttribute(value="forum") Forum forum){
        forumRepository.save(forum);
        return "redirect:/index";
    }
    
    //Delete
    @RequestMapping("/delete")
    public String indexDelete(Long id){
        Forum forum  = new Forum();
        forum.setId(id);
        forumRepository.delete(forum);
        return "redirect:/index";
    }
}
