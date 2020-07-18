package mnc.api.model.dto;

import mnc.api.model.apple.AppleResult;
import mnc.api.model.crc.CrcBase;
import mnc.api.model.tvmaze.TvMazeBase;

/**
 * System:                 Mnc
 * Name:                   GroupedDto
 * Description:            Class that groups all the results from the different API's and holds them as a
 *                          Data Transfer Object
 *
 * @author teixbr
 * @version 1.0
 * @since 15/7/20
 */
public class GroupedDto
{
    //Attributes

    private String name;
    private AppleResult itunesInfo;
    private CrcBase crcInfo;
    private TvMazeBase tvMazeInfo;

    //endregion

    //region Getters & Setters

    public AppleResult getItunesInfo()
    {
        return itunesInfo;
    }

    public CrcBase getCrcInfo()
    {
        return crcInfo;
    }

    public TvMazeBase getTvMazeInfo()
    {
        return tvMazeInfo;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public void setItunesInfo( AppleResult itunesInfo )
    {
        this.itunesInfo = itunesInfo;
    }

    public void setCrcInfo( CrcBase crcInfo )
    {
        this.crcInfo = crcInfo;
    }

    public void setTvMazeInfo( TvMazeBase tvMazeInfo )
    {
        this.tvMazeInfo = tvMazeInfo;
    }

    //endregion
}
