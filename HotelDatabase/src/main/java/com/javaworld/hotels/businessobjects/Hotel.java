////////////////////////////////////////////////////////////////////////////////
// Hotel: $Source$
// TODO Class summary goes here
//
// Created : 15 nov. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.javaworld.hotels.businessobjects;

import java.util.HashSet;
import java.util.Set;

/**
 * A simplified hotel business class.
 * A hotel, for this tutorial, has a name, an address,
 * a city, and a number of stars.
 *
 * @author jfsmart
 */
public class Hotel {
    /** The name of the hotel. */
    private String name;

    /** The address of the hotel. */
    private String address;

    /** The city of the hotel. */
    private String city;

    /** The hotel stars rating. */
    private int stars;

    /** The country of the hotel. */
    private Country country;

    /** The languages spoken at this hotel. */
    private Set languages;

    /**
     * @return Returns the languages.
     */
    public Set getLanguages() {
        return languages;
    }
    /**
     * @param languages The languages to set.
     */
    public void setLanguages(final Set languages) {
        this.languages = languages;
    }
    /**
     * Bean Constructor using field values.
     * @param name The name of the hotel.
     * @param address The address of the hotel
     * @param city The city of the hotel.
     * @param stars The hotel stars rating.
     */
    public Hotel(final String name,
                 final String address,
                 final String city,
                 final int stars,
                 final Country country,
                 final Language[] spoken) {
        super();
        // TODO Auto-generated constructor stub
        this.name = name;
        this.address = address;
        this.city = city;
        this.stars = stars;
        this.country = country;
        this.languages = new HashSet();
        for (int i = 0; i < spoken.length; i++) {
            languages.add((Language)spoken[i]);
        }
    }

    /**
     * @return Returns the address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address The address to set.
     */
    public void setAddress(final String address) {
        this.address = address;
    }

    /**
     * @return Returns the city.
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city to set.
     */
    public void setCity(final String city) {
        this.city = city;
    }

    /**
     * @return Returns the name.
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name to set.
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return Returns the stars.
     */
    public int getStars() {
        return stars;
    }

    /**
     * @param stars The stars to set.
     */
    public void setStars(final int stars) {
        this.stars = stars;
    }

    /**
     * @return Returns the country.
     */
    public Country getCountry() {
        return country;
    }

    /**
     * @param country The country to set.
     */
    public void setCountry(final Country country) {
        this.country = country;
    }

    /**
     * Is this language spoken at this hotel?
     * @param language
     * @return
     */
    public boolean isLanguageSpoken(final Language language) {
        return getLanguages().contains(language);

    }
}
