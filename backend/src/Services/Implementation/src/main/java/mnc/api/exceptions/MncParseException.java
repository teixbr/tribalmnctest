package mnc.api.exceptions;

/**
 * System:                  Mnc
 * Name:                    MncParseException
 * Description:             Base Exception class for handling errors while trying to parse collected data
 *
 * @author teixbr
 * @version 1.0
 * @since 28/09/19
 */
public class MncParseException extends MncBaseException
{
    public MncParseException( String extra )
    {
        super( "Error while trying to parse data from: " + extra );
    }
}
