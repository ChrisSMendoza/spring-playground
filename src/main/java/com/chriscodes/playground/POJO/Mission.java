
package com.chriscodes.playground.POJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mission {

    private String name;
    private int flight;


    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }

    public int getFlight() {
            return flight;
    }
    public void setFlight(int flight) {
            this.flight = flight;
    }

    @Override
    public String toString() {
        return "Mission{" + "name=" + name + ", flight=" + flight + '}';
    }
        
        
}