package mnc.api.dao;

import mnc.api.exceptions.MncParseException;
import mnc.api.model.crc.CrcBase;
import mnc.api.utilities.MncLogger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

/**
 * System:                  Mnc
 * Name:                    DaoCrc
 * Description:             Base class for handling HTTP Get requests CRC' API
 *
 * @author teixbr
 * @version 1.0
 * @since 15/07/20
 */
public class DaoCrc extends Dao
{
    private static final String basePath =
            "http://www.crcind.com/csp/samples/SOAP.Demo.cls?soap_method=GetListByName&name=";

    public static List<CrcBase> search( List<String> params )
    {
        final MncLogger _logger = new MncLogger( DaoCrc.class );

        String path = basePath;
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        List<CrcBase> response = new ArrayList<>();

        try
        {
            if ( !params.isEmpty() )
            {
                for (String s : params)
                {
                    path = path + s + "+";
                }
            }

            db = dbf.newDocumentBuilder();
            InputSource is = new InputSource();
            is.setCharacterStream(new StringReader( collect( path ).toString() ));
            Document doc = db.parse( is );
            NodeList auxList = doc.getDocumentElement().getElementsByTagName( "PersonIdentification" );

            int i = 0;

            while ( auxList.item( i ) != null )
            {
                final CrcBase crcBase = new CrcBase();
                crcBase.setId( Long.parseLong( auxList.item( i ).getFirstChild().getTextContent()) );
                crcBase.setName( auxList.item( i ).getFirstChild().getNextSibling().getTextContent() );
                crcBase.setSsn( auxList.item( i ).getFirstChild().getNextSibling().getNextSibling().getTextContent() );
                crcBase.setDateOfBirth( auxList.item( i )
                                .getFirstChild().getNextSibling().getNextSibling().getNextSibling().getTextContent() );
                response.add( crcBase );
                i++;
            }
        }
        catch ( Exception e )
        {
            _logger.error( e );
            throw new MncParseException( path );
        }

        return response;
    }
}
