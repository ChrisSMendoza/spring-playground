package com.chriscodes.playground;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.chriscodes.playground.POJO.Capsule;
import com.chriscodes.playground.services.SpaceXService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HomeController {
    
    @Autowired
    private SpaceXService spaceXService;
    
    @GetMapping("/home")
    public String getHomepage(Model model) {
        
        String capsuleSerial = "C112";        
        Capsule fetchedCapsule = spaceXService.getCapsuleById(capsuleSerial);
                        
        model.addAttribute("capsule", fetchedCapsule);
        return "home";
    }

}