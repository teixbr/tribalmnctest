package mnc.api.dao;

import mnc.api.exceptions.MncGetException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * System:                  Mnc
 * Name:                    Dao
 * Description:             Base class for handling HTTP Get requests to the different API's implementations
 *
 * @author teixbr
 * @version 1.0
 * @since 15/07/20
 */
public class Dao
{
    public static StringBuffer collect( String urlString )
    {
        final StringBuffer response = new StringBuffer();

        try
        {
            final URL url = new URL( urlString );
            final HttpURLConnection conn = ( HttpURLConnection ) url.openConnection();
            conn.setRequestMethod( "GET" );

            final BufferedReader in = new BufferedReader( new InputStreamReader( conn.getInputStream() ) );
            String inputLine;

            while ( ( inputLine = in.readLine()) != null )
            {
                response.append( inputLine );
            }
            in.close();

            return response;
        }
        catch ( Exception e )
        {
            throw new MncGetException( urlString );
        }
    }
}
