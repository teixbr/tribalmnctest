package mnc.api.logic;

import mnc.api.model.apple.AppleBaseResult;
import mnc.api.model.apple.AppleResult;
import mnc.api.model.crc.CrcBase;
import mnc.api.model.dto.GroupedDto;
import mnc.api.model.tvmaze.TvMazeBase;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * System:                 Mnc
 * Name:                   Mapper
 * Description:            Class for handling and formatting http response for the frontend
 *
 * @author teixbr
 * @version 1.0
 * @since 15/07/20
 */
public class Mapper
{
    public static List<GroupedDto> mapResults( AppleBaseResult itunes, List<CrcBase> crc, List<TvMazeBase> tvMaze )
    {
        final List<GroupedDto> response = new ArrayList<>();

        response.addAll( mapItunesResults( itunes ) );
        response.addAll( mapCrcResults( crc ));
        response.addAll( mapTvMazeResults( tvMaze ));

        return response.stream().sorted( Comparator.comparing( GroupedDto::getName ) )
                .collect( Collectors.toList());
    }

    private static List<GroupedDto> mapItunesResults( AppleBaseResult itunes )
    {
        final List<GroupedDto> response = new ArrayList<>();

        if ( !itunes.getResults().isEmpty() )
        {
            for ( AppleResult ar : itunes.getResults() )
            {
                final GroupedDto dto = new GroupedDto();

                dto.setName( ar.getArtistName() );
                dto.setItunesInfo( ar );

                response.add( dto );
            }
        }

        return response;
    }

    private static List<GroupedDto> mapCrcResults( List<CrcBase> crcResults )
    {
        final List<GroupedDto> response = new ArrayList<>();

        if ( !crcResults.isEmpty() )
        {
            for ( CrcBase crc : crcResults )
            {
                final GroupedDto dto = new GroupedDto();

                dto.setName( crc.getName() );
                dto.setCrcInfo( crc );

                response.add( dto );
            }
        }

        return response;
    }

    private static List<GroupedDto> mapTvMazeResults( List<TvMazeBase> tvMazeResults )
    {
        final List<GroupedDto> response = new ArrayList<>();

        if ( !tvMazeResults.isEmpty() )
        {
            for ( TvMazeBase tv : tvMazeResults )
            {
                final GroupedDto dto = new GroupedDto();

                dto.setName( tv.getShow().getName() );
                dto.setTvMazeInfo( tv );

                response.add( dto );
            }
        }

        return response;
    }
}
