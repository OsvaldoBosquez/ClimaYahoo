/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.climayahoo;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import java.io.IOException;
import javax.xml.bind.JAXBException;

/**
 *
 * @author sr_os
 */
public class Prueba {
    public static void main(String[] args) throws JAXBException, IOException {
        YahooWeatherService s = new YahooWeatherService();
        //System.out.println(s.getForecast("24552534", DegreeUnit.CELSIUS).getUnits());
         //System.out.println(s.getForecast("24552534", DegreeUnit.CELSIUS).getAstronomy());
          //System.out.println(s.getForecast("24552534", DegreeUnit.CELSIUS).getImage());
    //System.out.println(s.getForecast("24552534", DegreeUnit.CELSIUS).getItem().getCondition().getTemp());
          //  System.out.println(s.getForecast("24552534", DegreeUnit.CELSIUS).getLocation());
             //System.out.println(s.getForecast("24552534", DegreeUnit.CELSIUS).getTitle());
              //System.out.println(s.getForecast("24552534", DegreeUnit.CELSIUS).getTtl());
              // System.out.println(s.getForecast("24552534", DegreeUnit.CELSIUS).getWind());

    }
}
