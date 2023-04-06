package com.iset.projet.controllers;

import com.iset.projet.entities.Membre;
import com.iset.projet.services.membreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class catController {
    @Autowired
    membreService membreService;
    @RequestMapping("/showCreate")
    public String showCreate()
    {
        return "createMembre";
    }
    @RequestMapping("/saveMembre")
    public String saveMembre(@ModelAttribute("membre") Membre membre,
                              ModelMap modelMap) throws ParseException
    {
        Membre saveMembre= membreService.saveMembre(membre);
        String msg ="membre enregistré ";
        modelMap.addAttribute("msg", msg);
        return "createMembre";
    }
    @RequestMapping("/listeMembre")
    public String listeMembre(
            ModelMap modelMap,
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "5") int size)
    {
        Page<Membre> formats = membreService.getAllMembreParPage(page, size);
        modelMap.addAttribute("membres", formats);
        modelMap.addAttribute("pages", new int[formats.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        return "listeMembre";
    }
    @RequestMapping("/supprimerMembre")
    public String supprimerFormation(@RequestParam("id") Long id, ModelMap
            modelMap,
                                     @RequestParam(name = "page", defaultValue = "1") int page,
                                     @RequestParam(name = "size", defaultValue = "5") int size) {
        membreService.deleteMembreById(id);
        Page<Membre> formats = membreService.getAllMembreParPage(page, size);
        modelMap.addAttribute("membres", formats);
        modelMap.addAttribute("pages", new int[formats.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        modelMap.addAttribute("size", size);
        return "listeMembre";
    }
    @RequestMapping("/modifierMembre")
    public String editerMembre(@RequestParam("id") Long id,ModelMap modelMap)
    {
        Membre f= membreService.getMembre(id);
        modelMap.addAttribute("membre", f);
        return "editerMembre";
    }
    @PostMapping("/updateMembre")
    public String updateMembre(@ModelAttribute("membre") Membre membre,@RequestParam(name = "page", defaultValue = "1") int page,
                                  @RequestParam(name = "size", defaultValue = "5") int size,
                                  ModelMap modelMap )throws ParseException
    {
        membreService.updateMembre(membre);
        Page<Membre> formats = membreService.getAllMembreParPage(page, size);
        modelMap.addAttribute("membres", formats);
        modelMap.addAttribute("pages", new int[formats.getTotalPages()]);
        modelMap.addAttribute("currentPage", page);
        modelMap.addAttribute("size", size);
        return "listeMembre";
    }
}