package mnc.api.implementation;

import mnc.api.dao.DaoApple;
import mnc.api.dao.DaoCrc;
import mnc.api.dao.DaoTvMaze;
import mnc.api.logic.Mapper;
import mnc.api.model.dto.GroupedDto;
import mnc.api.utilities.MncLogger;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.List;

/**
 * System:                 Mnc
 * Name:                   SearchService
 * Description:            Class for handling http requests to find in the different APIs
 *
 * @author teixbr
 * @version 1.0
 * @since 15/07/20
 */
@Path( "/search" )
@Produces( MediaType.APPLICATION_JSON )
@Consumes( MediaType.APPLICATION_JSON )
public class SearchService  extends BaseApplication
{
    private MncLogger _logger;

    public SearchService()
    {
        _logger = new MncLogger( getClass() );
    }

    /**
     * System:          MnC
     * Name:            getData
     * Description:     Method that will return all results related from given params
     *
     *
     * @return response Result specific Dto
     *
     * @author teixbr
     * @since 15/7/20
     */
    @GET
    @Path( "/data/{params}" )
    public List<GroupedDto> getData( @PathParam( "params" ) String keywords )
    {
        final String METHOD_NAME = "getData";
        final List<GroupedDto> response;

        _logger.beginningMethod( METHOD_NAME );

        try
        {
            final List<String> params = Arrays.asList(keywords.split( "-" ));
            response = Mapper.mapResults( DaoApple.search( params ), DaoCrc.search( params ),
                                          DaoTvMaze.search( params ) );

            _logger.info( METHOD_NAME, response );
        }
        catch ( Exception e )
        {
            _logger.error( e );
            throw new WebApplicationException( Response.status( Response.Status.INTERNAL_SERVER_ERROR ).
                    entity( e ).build() );
        }

        _logger.finishingMethod( METHOD_NAME );
        return response;
    }
}
