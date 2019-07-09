/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainersbean.controllers;

import com.mycompany.trainersbean.services.TrainerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author alexa
 */
 @Controller
  @RequestMapping(value={"/trainers"})
public class TrainerController {
     
     TrainerService ss=new TrainerService();
     
   @RequestMapping(value="",method= RequestMethod.GET)
   public String getTrainers(ModelMap model){
       model.addAttribute("trainers",ss.getTrainers());
       return "trainers";
   }
 
 
 @RequestMapping(value="/{id}",method= RequestMethod.GET)
   public String getTrainerById(ModelMap model,@PathVariable String id){
       model.addAttribute("trainers",ss.getTrainerById(Integer.parseInt(id)));
       return "index";
   }
 
 
 
 
 }
