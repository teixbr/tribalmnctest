package mnc.api.model.tvmaze;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * System:                 Mnc
 * Name:                   TvMazeBase
 * Description:            Class that represents a TvMazeBase's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 15/7/20
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TvMazeBase
{
    //region Attributes

    private double score;
    private TvMazeShow show;

    //endregion

    //region Getters

    public TvMazeShow getShow()
    {
        return show;
    }

    //endregion
}
