package com.mudanza.controller;

import com.mudanza.service.ProvinciasService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mudanza")
public class MudanzaController {

    private static final String PROVINCIAS_VIEW = "mudanza";

    private static final Log LOG = LogFactory.getLog(MudanzaController.class);

    @Autowired
    @Qualifier("provinciasService")
    private ProvinciasService provinciasService;

    @GetMapping("/prov")
    public String listProvincias(Model model) {
        LOG.info("CALL: listProvincias() -- PARAMS: EMPTY");
        model.addAttribute("vegs",provinciasService.listProvincias(50.1));
        return PROVINCIAS_VIEW;
    }
    @PostMapping("/submit")
    public String submit(@ModelAttribute("provincias")Double veg) {

        return "redirect:/mudanza/prov";
    }
}