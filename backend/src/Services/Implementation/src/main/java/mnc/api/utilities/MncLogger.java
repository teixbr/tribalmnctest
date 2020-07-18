package mnc.api.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * System:                 Mnc
 * Name:                   MncLogger
 * Description:            Command class that will persist an specific offer (promo) in the DB
 *
 * @author teixbr
 * @version 1.0
 * @since 01/04/19
 */
public class MncLogger
{
    /**
     * Object for handling Logging of Mnc API
     */
    private Logger _logger;

    /**
     * Constructor of the MncLogger class
     *
     * @param classToLog Class object representing class to be logged
     */
    public MncLogger( Class classToLog )
    {
        _logger = LoggerFactory.getLogger( classToLog );
    }

    /**
     * Name:                    debug
     * Description:             Method that will register a log entry on the debug level
     *
     * @param message           String representing name of the method to be logged
     * @param parameters        String representing extra info to be recorded
     */
    public void debug( String message, String... parameters )
    {
        String result = message;

        if ( parameters.length > 0 )
        {
            result = String.format( message, ( Object[] ) parameters );
        }

        _logger.debug( result );
    }

    /**
     * Name:                    beginningMethod
     * Description:             Method that will register the start of a method in the log registry
     *
     * @param parameters        String representing info to be recorded
     */
    public void beginningMethod( String... parameters )
    {
        String debug = "Entering method ";

        if ( parameters.length > 0 )
        {
            for ( String param : parameters )
            {
                debug += param + " ";
            }
        }
        _logger.debug( debug );
    }

    /**
     * Name:                    finishingMethod
     * Description:             Method that will register the end of a method in the log registry
     *
     * @param parameters        String representing info to be recorded
     */
    public void finishingMethod( String... parameters )
    {
        String debug = "Finishing method ";

        if ( parameters.length != 0 )
        {
            for ( String param : parameters )
            {
                debug += param + " ";
            }
        }

        _logger.debug( debug );
    }

    /**
     * Name:                    error
     * Description:             Method that will register an error in the log
     *
     * @param message           String representing error message
     * @param e                 Exception object representing encountered
     */
    public void error( String message, Exception e )
    {
        _logger.error( message, e );
    }

    /**
     * Name:                    error
     * Description:             Method that will register an error in the log
     *
     * @param e                 Exception object representing encountered
     */
    public void error( Exception e )
    {
        _logger.error( e.getMessage(), e.toString() );
    }

    /**
     * Name:                    info
     * Description:             Method that will register a new entry into the info level
     *
     * @param message           String representing message to be registered
     */
    public void info( String message )
    {
        _logger.info( message );
    }

    /**
     * Name:                    info
     * Description:             Method that will register a new entry into the info level
     *
     * @param message           String representing message to be registered
     * @param parameters        String representing extra info to be saved
     */
    public void info( String message, Object... parameters )
    {
        _logger.info( message, parameters );
    }

    /**
     * Name:                  isDebug
     * Description:           Method that will indicate if Logger session is currently on debug
     *
     * @return boolean        representing answer of the Debug state
     */
    public boolean isDebug()
    {
        return _logger.isDebugEnabled();
    }
}


