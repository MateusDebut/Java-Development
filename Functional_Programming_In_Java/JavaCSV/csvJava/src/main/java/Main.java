import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/file.csv"));
        CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();

        List<String[]> pessoas = csvReader.readAll();
        for (String[] pessoa : pessoas)
            System.out.println("FIPS : " + pessoa[0] +
                    " - Admin2 : " + pessoa[1] +
                    " - Province_State : " + pessoa[2] +
                    " - Country_Region : " + pessoa[3] +
                    " - Last_Update : " + pessoa[4] +
                    " - Lat : " + pessoa[5] +
                    " - Long_ : " + pessoa[6] +
                    " - Confirmed : " + pessoa[7] +
                    " - Deaths : " + pessoa[8] +
                    " - Recovered : " + pessoa[9] +
                    " - Active : " + pessoa[10] +
                    " - Combined_Key : " + pessoa[11] +
                    " - Incident_Rate : " + pessoa[12] +
                    " - Case_Fatality_Ratio : " + pessoa[13] + "\n");
    }
}
