////////////////////////////////////////////////////////////////////////////////
// HotelModelTest: $Source$
// TODO Class summary goes here
//
// Created : 15 nov. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.javaworld.hotels.model;

import java.util.List;

import com.javaworld.hotels.businessobjects.Country;
import com.javaworld.hotels.businessobjects.Hotel;
import com.javaworld.hotels.businessobjects.Language;

import junit.framework.TestCase;

public class HotelModelTest extends TestCase {
    
    public void testFindHotelsByCity1() {
        HotelModel finder = new HotelModel();
        List hotels = finder.findHotelsByCity("Paris");
        assertTrue(hotels.size() > 0);
        for(int i = 0; i < hotels.size(); i++) {
            Hotel h = (Hotel) hotels.get(i);
            assertEquals(h.getCity(),"Paris");            
        }
    }
    
    public void testFindHotelsByCity2() {
        HotelModel finder = new HotelModel();
        List hotels = finder.findHotelsByCity("London");
        assertTrue(hotels.size() > 0);
        for(int i = 0; i < hotels.size(); i++) {
            Hotel h = (Hotel) hotels.get(i);
            assertEquals(h.getCity(),"London");
            assertNotNull(h.getAddress());
            assertNotNull(h.getName());
            assertTrue(h.getStars() >= 0);
            assertTrue(h.getStars() <= 5);
        }
    }

    public void testFindHotelsByEmptyCity() {
        HotelModel finder = new HotelModel();
        List hotels = finder.findHotelsByCity("");
        assertTrue(hotels.size() == 0);
    }

    public void testFindHotelsByNullCity() {
        HotelModel finder = new HotelModel();
        List hotels = finder.findHotelsByCity(null);
        assertTrue(hotels.size() == 0);
    }

    public void testFindAvaliableCities() {
        HotelModel finder = new HotelModel();
        String[] cities = finder.findAvailableCities();
        assertEquals(cities.length, 2);
    }

    public void testFindHotelsByLanguage() {
        HotelModel finder = new HotelModel();
        List hotels = finder.findHotelsByLanguage(Language.FR);
        assertTrue(hotels.size() > 0);
        for(int i = 0; i < hotels.size(); i++) {
            Hotel h = (Hotel) hotels.get(i);
            assertTrue(h.isLanguageSpoken(Language.FR));            
        }
    }
    
    public void testFindHotelsByCountry() {
        HotelModel finder = new HotelModel();
        List hotels = finder.findHotelsInCountry(Country.FR);
        assertTrue(hotels.size() > 0);
        for(int i = 0; i < hotels.size(); i++) {
            Hotel h = (Hotel) hotels.get(i);
            assertEquals(h.getCountry(), Country.FR);            
        }
    }

}
