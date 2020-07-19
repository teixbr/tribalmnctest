package mnc.api.implementation;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

/**
 * System:                 Mnc
 * Name:                   CORSFilter
 * Description:            Class for handling headers for all incoming HTTP/HTTPS request
 *
 * @author teixbr
 * @version 1.0
 * @since 15/07/20
 */
@Provider
public class CORSFilter implements ContainerResponseFilter
{
    @Override
    public void filter( ContainerRequestContext containerRequestContext, ContainerResponseContext response )
    {
        response.getHeaders().add( "Access-Control-Allow-Origin", "*" );
        response.getHeaders().add( "Access-Control-Allow-Headers", "Origin, X-Atmosphere-tracking-id, " +
                                   "X-Atmosphere-Framework, X-Cache-Date, Content-Type, X-Atmosphere-Transport, *" );
        response.getHeaders().add( "Access-Control-Allow-Credentials","true" );
        response.getHeaders().add( "Access-Control-Allow-Methods","POST, GET, OPTIONS , PUT" );
        response.getHeaders().add( "Access-Control-Request-Headers", "Origin, X-Atmosphere-tracking-id, " +
                                     "X-Atmosphere-Framework, X-Cache-Date, Content-Type, X-Atmosphere-Transport,  *" );
    }
}
