////////////////////////////////////////////////////////////////////////////////
// Country: $Source$
// TODO Class summary goes here
//
// Created : 18 nov. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.javaworld.hotels.businessobjects;

/**
 * A country.
 * @author jfsmart
 *
 * To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Generation - Code and Comments
 */
public class Country {

    /** Countries : UK. */
    public static final Country UK = new Country("uk", "United Kingdom");

    /** Countries : France. */
    public static final Country FR = new Country("fr", "France");

    /** ISO country code. */
    private String code;

    /** Country name. */
    private String name;

    /**
     * Default constructor.
     */
    public Country() {
        super();
        // TODO Auto-generated constructor stub
    }


    /**
     * Field-based constructor.
     * @param code ISO country code
     * @param name User-readable country name
     */
    public Country(final String code, final String name) {
        super();
        this.code = code;
        this.name = name;
    }


    /**
     * @return Returns the code.
     */
    public String getCode() {
        return code;
    }


    /**
     * @param code The code to set.
     */
    public void setCode(final String code) {
        this.code = code;
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
}