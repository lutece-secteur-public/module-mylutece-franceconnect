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
package fr.paris.lutece.plugins.mylutece.modules.franceconnect.oauth2;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;


/**
 * OAuth RegisteredClient
 */
public class RegisteredClient implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String _strClientId;
    private String _strClientSecret;
    private String _strTokenEndpointAuthMethod;
    private String _strRedirectUri;
    private Set<String> _scope;
    private Set<String> _redirectUris;

    /**
     * Returns the ClientId
     * @return The ClientId
     */
    public String getClientId(  )
    {
        return _strClientId;
    }

    /**
     * Sets the ClientId
     * @param strClientId The ClientId
     */
    public void setClientId( String strClientId )
    {
        _strClientId = strClientId;
    }

    /**
     * Returns the ClientSecret
     * @return The ClientSecret
     */
    public String getClientSecret(  )
    {
        return _strClientSecret;
    }

    /**
     * Sets the ClientSecret
     * @param strClientSecret The ClientSecret
     */
    public void setClientSecret( String strClientSecret )
    {
        _strClientSecret = strClientSecret;
    }

    /**
     * Returns the TokenEndpointAuthMethod
     * @return The TokenEndpointAuthMethod
     */
    public String getTokenEndpointAuthMethod(  )
    {
        return _strTokenEndpointAuthMethod;
    }

    /**
     * Sets the TokenEndpointAuthMethod
     * @param strTokenEndpointAuthMethod The TokenEndpointAuthMethod
     */
    public void setTokenEndpointAuthMethod( String strTokenEndpointAuthMethod )
    {
        _strTokenEndpointAuthMethod = strTokenEndpointAuthMethod;
    }

    /**
     * Returns the Scope
     * @return The Scope
     */
    public Set getScope(  )
    {
        return _scope;
    }

    /**
     * Sets the Scope
     * @param scope The Scope
     */
    public void setScope( Set scope )
    {
        _scope = scope;
    }

    /**
     * Returns the RedirectUri
     * @return The RedirectUri
     */
    public String getRedirectUri(  )
    {
        return _strRedirectUri;
    }

    /**
     * Sets the RedirectUri
     * @param strRedirectUri The RedirectUri
     */
    public void setRedirectUri( String strRedirectUri )
    {
        _strRedirectUri = strRedirectUri;
    }

    /**
     * Returns the RedirectUris
     * @return The RedirectUris
     */
    public Set getRedirectUris(  )
    {
        return _redirectUris;
    }

    /**
     * Sets the RedirectUris
     * @param redirectUris The RedirectUris
     */
    public void setRedirectUris( Set redirectUris )
    {
        _redirectUris = redirectUris;
    }

    /**
     * Build a string that contains the list of scope separated by a plus
     * @return The scopes
     */
    public String getScopes(  )
    {
        StringBuilder sbScopes = new StringBuilder(  );

        Iterator i = _scope.iterator(  );
        boolean bFirst = true;

        while ( i.hasNext(  ) )
        {
            if ( !bFirst )
            {
                sbScopes.append( '+' );
            }

            bFirst = false;
            sbScopes.append( i.next(  ) );
        }

        return sbScopes.toString(  );
    }
}
