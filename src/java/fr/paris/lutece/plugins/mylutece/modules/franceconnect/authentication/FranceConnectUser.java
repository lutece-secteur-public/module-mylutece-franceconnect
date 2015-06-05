/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.mylutece.modules.franceconnect.authentication;

import fr.paris.lutece.portal.service.security.LuteceAuthentication;
import fr.paris.lutece.portal.service.security.LuteceUser;

import java.io.Serializable;


/**
 * This class implements The Lutece User in a OpenID configuration.
 */
public class FranceConnectUser extends LuteceUser implements Serializable
{
    public static final String BIRTH_DATE = "franceconnect.user.birthDate";
    public static final String BIRTH_PLACE = "franceconnect.user.birthPlace";
    public static final String BIRTH_COUNTRY = "franceconnect.user.birthCountry";
    public static final String ADDRESS = "franceconnect.user.address";
    
    private static final long serialVersionUID = 1L;
    private String _strEmail;
    private String _strBirthPlace;
    private String _strBirthCountry;

    /**
     * Constructor
     * @param strUserName The user's name
     * @param authenticationService The authentication service that authenticates the user
     */
    public FranceConnectUser( String strUserName, LuteceAuthentication authenticationService )
    {
        super( strUserName, authenticationService );
        this.setLuteceAuthenticationService( authenticationService );
    }

    /**
     * {@inheritDoc }
     */
    @Override
    public String getEmail(  )
    {
        return ( _strEmail != null ) ? _strEmail : "";
    }

    /**
     * Returns the BirthCountry
     * @return The BirthCountry
     */
    public String getBirthCountry(  )
    {
        return _strBirthCountry;
    }

    /**
     * Sets the BirthCountry
     * @param strBirthCountry The BirthCountry
     */
    public void setBirthCountry( String strBirthCountry )
    {
        _strBirthCountry = strBirthCountry;
    }

    /**
     * Returns the BirthPlace
     * @return The BirthPlace
     */
    public String getBirthPlace(  )
    {
        return _strBirthPlace;
    }

    /**
     * Sets the BirthPlace
     * @param strBirthPlace The BirthPlace
     */
    public void setBirthPlace( String strBirthPlace )
    {
        _strBirthPlace = strBirthPlace;
    }

    /**
     * Sets the Email
     * @param strEmail         The Email
     */
    public void setEmail( String strEmail )
    {
        _strEmail = strEmail;
    }
}
