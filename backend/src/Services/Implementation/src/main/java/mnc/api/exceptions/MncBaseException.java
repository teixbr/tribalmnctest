package mnc.api.exceptions;

import java.io.Serializable;

/**
 * System:                  Mnc
 * Name:                    MncBaseException
 * Description:             Base Exception class for handling personalized errors inside Mnc's API
 *
 * @author teixbr
 * @version 1.0
 * @since 15/07/20
 */
public abstract class MncBaseException extends RuntimeException implements Serializable
{
    public MncBaseException( Exception e )
    {
        super( e );
    }

    public MncBaseException( Exception e, String str )
    {
        super( str, e );
    }

    public MncBaseException( String str )
    {
        super( str );
    }

    public MncBaseException( )
    {
        super();
    }
}
