////////////////////////////////////////////////////////////////////////////////
// HotelModel: $Source$
// TODO Class summary goes here
//
// Created : 15 nov. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.javaworld.hotels.model;

import java.util.ArrayList;
import java.util.List;

import com.javaworld.hotels.businessobjects.Country;
import com.javaworld.hotels.businessobjects.Hotel;
import com.javaworld.hotels.businessobjects.Language;

/**
 * A simple class providing lookup services for a Hotel database.
 *
 * @author jfsmart
 *
 */
public class HotelModel {

    /**
     * The list of all known cities in the database.
     */
    private static String[] cities =
    {
        "Paris",
        "London",
    };

    /**
     * The list of all hotels in the database.
     */
    private static Hotel[] hotels = {
        new Hotel("Hotel Latin", "Quartier latin", "Paris", 3, Country.FR,
                  new Language[] {Language.FR, Language.EN, Language.ES}),
        new Hotel("Hotel Etoile", "Place de l'Etoile", "Paris", 4, Country.FR,
                  new Language[] {Language.FR, Language.EN}),
        new Hotel("Hotel Vendome", "Place Vendome", "Paris", 5, Country.FR,
                  new Language[] {Language.FR, Language.ES}),
        new Hotel("Hotel Hilton", "Trafalgar Square", "London", 4, Country.UK,
                  new Language[] {Language.EN, Language.ES}),
        new Hotel("Hotel Ibis", "The City", "London", 3, Country.UK,
                  new Language[] {Language.FR, Language.EN, Language.ES}),
    };

    /**
     * Returns the hotels in a given city.
     * @param city the name of the city
     * @return a list of Hotel objects
     */
    public List findHotelsByCity(final String city) {
        List hotelsFound = new ArrayList();

        for (int i = 0; i < hotels.length; i++) {
            Hotel hotel = (Hotel) hotels[i];
            if (hotel.getCity().equalsIgnoreCase(city)) {
                hotelsFound.add(hotel);
            }
        }

        return hotelsFound;
    }

    /**
     * Find hotels where a given language is spoken.
     * @param language
     * @return a list of Hotel objects
     */
    public List findHotelsByLanguage(final Language language) {
        List hotelsFound = new ArrayList();

        for (int i = 0; i < hotels.length; i++) {
            Hotel hotel = (Hotel) hotels[i];
            if (hotel.isLanguageSpoken(language)) {
                hotelsFound.add(hotel);
            }
        }

        return hotelsFound;
    }

    /**
     * Find hotels in a given country.
     * @param country
     * @return a list of Hotel objects
     */
    public List findHotelsInCountry(final Country country) {
        List hotelsFound = new ArrayList();

        for (int i = 0; i < hotels.length; i++) {
            Hotel hotel = (Hotel) hotels[i];
            if (hotel.getCountry().equals(country)) {
                hotelsFound.add(hotel);
            }
        }

        return hotelsFound;
    }

    /**
     * Returns the list of cities in the database which have a hotel.
     * @return a list of city names
     */
    public String[] findAvailableCities() {
        return cities;
    }
}
