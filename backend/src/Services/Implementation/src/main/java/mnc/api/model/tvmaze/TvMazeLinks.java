package mnc.api.model.tvmaze;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * System:                 Mnc
 * Name:                   TvMazeLinks
 * Description:            Class that represents a TvMazeLinks's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 15/7/20
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TvMazeLinks
{
    private TvMazeLink self;

    @JsonProperty(value="previousepisode")
    private TvMazeLink previousEpisode;

    @JsonProperty(value="nextepisode")
    private TvMazeLink nextEpisode;
}
