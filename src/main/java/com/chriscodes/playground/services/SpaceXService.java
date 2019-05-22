
package com.chriscodes.playground.services;

import com.chriscodes.playground.POJO.Capsule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SpaceXService {
    
    @Autowired
    private RestTemplate restTemplate;

    public Capsule getCapsuleById(String id) {
        final String singleCapsuleUrl = "https://api.spacexdata.com/v3/capsules/{capsule_serial}";

        return restTemplate.getForObject(singleCapsuleUrl, Capsule.class, id);
    }
}
