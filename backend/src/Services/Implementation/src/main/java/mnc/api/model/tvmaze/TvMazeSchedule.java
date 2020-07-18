package mnc.api.model.tvmaze;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * System:                 Mnc
 * Name:                   TvMazeSchedule
 * Description:            Class that represents a TvMazeSchedule's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 15/7/20
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
        getterVisibility = JsonAutoDetect.Visibility.NONE,
        setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TvMazeSchedule
{
    private String time;
    private String[] days;
}
