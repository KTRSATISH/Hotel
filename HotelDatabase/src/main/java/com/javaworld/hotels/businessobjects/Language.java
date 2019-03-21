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
 * A spoken lanuage.
 *
 * @author jfsmart
 */
public class Language {

    /** Languages : English .*/
    public static final Language EN = new Language("en", "English");

    /** Languages : French. */
    public static final Language FR = new Language("fr", "French");

    /** Languages : Spanish. */
    public static final Language ES = new Language("es", "Spanish");

    /** ISO language code. */
    private String code;

    /** Language name. */
    private String name;


    /**
     * Default constructor.
     */
    public Language() {
        super();
        // TODO Auto-generated constructor stub
    }


    /**
     * Field-based constructor.
     * @param code
     * @param name
     */
    public Language(final String code, final String name) {
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
