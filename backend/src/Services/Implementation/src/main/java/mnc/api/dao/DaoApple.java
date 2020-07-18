package mnc.api.dao;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import mnc.api.exceptions.MncParseException;
import mnc.api.model.apple.AppleBaseResult;
import mnc.api.utilities.MncLogger;

import java.util.List;

/**
 * System:                  Mnc
 * Name:                    DaoApple
 * Description:             Base class for handling HTTP Get requests Itunes' API
 *
 * @author teixbr
 * @version 1.0
 * @since 15/07/20
 */
public class DaoApple extends Dao
{
    private static final String basePath = "https://itunes.apple.com/search?term=";

    public static AppleBaseResult search( List<String> params )
    {
        final MncLogger _logger = new MncLogger( DaoApple.class );
        String path = basePath;

        try
        {
            if ( !params.isEmpty() )
            {
                for (String s : params)
                {
                    path = path + s + "+";
                }
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            return mapper.readValue(collect( path ).toString(), AppleBaseResult.class);
        }
        catch ( Exception e )
        {
            _logger.error( e );
            throw new MncParseException( path );
        }
    }
}
