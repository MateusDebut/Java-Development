import com.opencsv.bean.CsvBindByName;

import java.math.BigDecimal;

public class EstatisticasCovid {

    @CsvBindByName
    public String fips;
    @CsvBindByName
    public String Admin2;
    @CsvBindByName
    public String Province_State;
    @CsvBindByName
    public String Country_Region;
    @CsvBindByName
    public String Last_Update;
    @CsvBindByName
    public double Lat;
    @CsvBindByName
    public double Long_;
    @CsvBindByName
    public int Confirmed;
    @CsvBindByName
    public int Deaths;
    @CsvBindByName
    public int Recovered;
    @CsvBindByName
    public int Active;
    @CsvBindByName
    public String Combined_Key;
    @CsvBindByName
    public BigDecimal Incident_Rate;
    @CsvBindByName
    public BigDecimal Case_Fatality_Ratio;

    @Override
    public String toString() {
        return "EstatisticasCovid{" + "\n" +
                "\tFIPS=" + fips + "\n" +
                "\tAdmin2=" + Admin2 + "\n" +
                "\tProvince_State=" + Province_State + "\n" +
                "\tCountry_Region=" + Country_Region + "\n" +
                "\tLast_Update=" + Last_Update + "\n" +
                "\tLat=" + Lat + "\n" +
                "\tLong_=" + Long_ + "\n" +
                "\tConfirmed=" + Confirmed + "\n" +
                "\tDeaths=" + Deaths + "\n" +
                "\tRecovered=" + Recovered + "\n" +
                "\tActive=" + Active + "\n" +
                "\tCombined_Key=" + Combined_Key + "\n" +
                "\tIncident_Rate=" + Incident_Rate + "\n" +
                "\tCase_Fatality_Ratio=" + Case_Fatality_Ratio + "\n" +
                "}";
    }
}
