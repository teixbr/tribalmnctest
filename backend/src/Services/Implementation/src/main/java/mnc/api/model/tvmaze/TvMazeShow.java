package mnc.api.model.tvmaze;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import java.util.List;

/**
 * System:                 Mnc
 * Name:                   TvMazeShow
 * Description:            Class that represents a TvMazeShow's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 15/7/20
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TvMazeShow
{
    //region Attributes

    private long id;
    private String url;
    private String name;
    private String type;
    private String language;
    private List<String> genres;
    private String status;
    private String runtime;
    private String premiered;
    private String officialSite;
    private int weight;
    private long updated;
    private TvMazeNetwork network;
    private String summary;
    private TvMazeWebChannel webChannel;
    private TvMazeSchedule schedule;
    private TvMazeRating rating;
    private TvMazeExternals externals;
    private TvMazeImage image;
    private TvMazeLinks _links;

    //endregion

    //region Getters

    public String getName()
    {
        return name;
    }

    //endregion
}
