package mnc.api.model.apple;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.List;

/**
 * System:                 Mnc
 * Name:                   AppleBaseResult
 * Description:            Class that represents a AppleBaseResult's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 15/7/20
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE)
public class AppleBaseResult
{
    //region Attributes

    private String resultCount;
    private List<AppleResult> results;

    //endregion

    //region Getters

    public List<AppleResult> getResults()
    {
        return results;
    }

    //endregion
}
