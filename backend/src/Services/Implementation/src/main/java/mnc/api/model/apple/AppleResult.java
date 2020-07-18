package mnc.api.model.apple;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * System:                 Mnc
 * Name:                   AppleResult
 * Description:            Class that represents a AppleResult's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 15/7/20
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE)
public class AppleResult
{
    //Attributes

    private String wrapperType;
    private String kind;
    private long artistId;
    private long collectionId;
    private long trackId;
    private String artistName;
    private String collectionName;
    private String trackName;
    private String collectionCensoredName;
    private String trackCensoredName;
    private String artistViewUrl;
    private String collectionViewUrl;
    private String trackViewUrl;
    private String previewUrl;
    private String artworkUrl30;
    private String artworkUrl60;
    private String artworkUrl100;
    private String copyright;
    private double collectionPrice;
    private double trackPrice;
    private String releaseDate;
    private String collectionExplicitness;
    private String trackExplicitness;
    private int discCount;
    private int discNumber;
    private int trackCount;
    private int trackNumber;
    private long trackTimeMillis;
    private String country;
    private String currency;
    private String primaryGenreName;
    private boolean isStreamable;
    private String contentAdvisoryRating;

    //endregion

    //region Getters

    public String getArtistName()
    {
        return artistName;
    }

    //endregion
}
