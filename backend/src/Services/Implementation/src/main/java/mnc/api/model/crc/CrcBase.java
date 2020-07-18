package mnc.api.model.crc;

/**
 * System:                 Mnc
 * Name:                   CrcBase
 * Description:            Class that represents a CrcBase's Entity in the application
 *
 * @author teixbr
 * @version 1.0
 * @since 15/7/20
 */
public class CrcBase
{
    //region Attributes

    private long id;
    private String name;
    private String ssn;
    private String dateOfBirth;

    //endregion

    //region Getters & Setters

    public long getId()
    {
        return id;
    }

    public void setId( long id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getSsn()
    {
        return ssn;
    }

    public void setSsn( String ssn )
    {
        this.ssn = ssn;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth( String dateOfBirth )
    {
        this.dateOfBirth = dateOfBirth;
    }

    //endregion
}
