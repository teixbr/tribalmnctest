package mnc.api.exceptions;

/**
 * System:                  Mnc
 * Name:                    MncGetException
 * Description:             Base Exception class for handling errors while trying to collect data
 *
 * @author teixbr
 * @version 1.0
 * @since 28/09/19
 */
public class MncGetException extends MncBaseException
{
    public MncGetException( String extra )
    {
        super( "Error while trying to collect data from: " + extra );
    }
}
