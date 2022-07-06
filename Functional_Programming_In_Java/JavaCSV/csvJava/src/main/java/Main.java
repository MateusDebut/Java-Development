import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/file.csv"));

        CsvToBean<EstatisticasCovid> csvToBean = new CsvToBeanBuilder(reader)
                .withType(EstatisticasCovid.class)
                .build();
        List<EstatisticasCovid> estatisticasCovid = csvToBean.parse();
        estatisticasCovid.forEach(linha -> System.out.println(linha));
    }
}
