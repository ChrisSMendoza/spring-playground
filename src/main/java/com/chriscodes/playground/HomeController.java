package com.chriscodes.playground;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.chriscodes.playground.POJO.Capsule;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HomeController {
    
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/home")
    public String getHomepage(Model model) {

//        RestTemplate restTemplate = new RestTemplate();
        final String singleCapsuleUrl = "https://api.spacexdata.com/v3/capsules/{capsule_serial}";
        String capsuleID = "C112";
        
        Capsule capsule = restTemplate.getForObject(singleCapsuleUrl, Capsule.class, capsuleID);

        System.err.println(capsule);
        
        model.addAttribute("capsule", capsule);
        return "home";
    }

}