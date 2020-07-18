package mnc.api.dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import mnc.api.exceptions.MncParseException;
import mnc.api.model.tvmaze.TvMazeBase;
import mnc.api.utilities.MncLogger;

import java.io.IOException;
import java.util.List;

/**
 * System:                  Mnc
 * Name:                    DaoTvMaze
 * Description:             Base class for handling HTTP Get requests TvMaze' API
 *
 * @author teixbr
 * @version 1.0
 * @since 15/07/2
 */
public class DaoTvMaze extends Dao
{
    private static final String basePath = "http://api.tvmaze.com/search/shows?";

    public static List<TvMazeBase> search( List<String> params ) throws IOException
    {
        final MncLogger _logger = new MncLogger( DaoTvMaze.class );
        String path = basePath;

        try
        {
            if ( !params.isEmpty() )
            {
                for ( String s : params )
                {
                    path = path + "q=" + s + "&";
                }
            }

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);

            return mapper.readValue(collect( path ).toString(), new TypeReference<List<TvMazeBase>>(){});
        }
        catch ( Exception e )
        {
            _logger.error( e );
            throw new MncParseException( path );
        }
    }
}
