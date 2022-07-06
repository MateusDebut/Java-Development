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
        return "EstatisticasCovid{" +
                "FIPS='" + fips + '\'' +
                ", Admin2='" + Admin2 + '\'' +
                ", Province_State='" + Province_State + '\'' +
                ", Country_Region='" + Country_Region + '\'' +
                ", Last_Update='" + Last_Update + '\'' +
                ", Lat=" + Lat +
                ", Long_=" + Long_ +
                ", Confirmed=" + Confirmed +
                ", Deaths=" + Deaths +
                ", Recovered=" + Recovered +
                ", Active=" + Active +
                ", Combined_Key='" + Combined_Key + '\'' +
                ", Incident_Rate=" + Incident_Rate +
                ", Case_Fatality_Ratio=" + Case_Fatality_Ratio +
                "}\n";
    }
}
