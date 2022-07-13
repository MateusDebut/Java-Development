import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String nomeArquivo = args[0];

        Reader reader = Files.newBufferedReader(Paths.get(nomeArquivo));

        CsvToBean<EstatisticasCovid> csvToBean = new CsvToBeanBuilder(reader)
                .withType(EstatisticasCovid.class)
                .build();
        List<EstatisticasCovid> estatisticasCovid = csvToBean.parse();

        System.out.println("----------------------------------------------------");

        System.out.println("Três países com os maiores valores de \"Confirmed\" em ordem alfabética\n");

        // Três países com os maiores valores de "Confirmed" em ordem alfabética
        estatisticasCovid
                .stream()
                .sorted((o1, o2) -> (int) (o2.Confirmed - o1.Confirmed))
                .limit(3)
                .sorted((o1, o2) -> o1.Country_Region.compareTo(o2.Country_Region))
                .forEach(dado -> System.out.println(dado));

        System.out.println("----------------------------------------------------");

        System.out.printf("a soma dos \"Deaths\" dos cinco países com menores valores de \"Confirmed\"" +
                " Dentre os dez países com maiores valores de \"Active\": ");
        int resultado = estatisticasCovid
                .stream()
                .sorted((o1, o2) -> (int) (o2.Active - o1.Active))
                .limit(10)
                .sorted((o1, o2) -> (int) (o1.Confirmed - o2.Confirmed))
                .limit(5)
                .mapToInt(o -> o.Deaths)
                .sum();
        System.out.println(resultado + "\n");

        System.out.println("----------------------------------------------------");

        System.out.printf("O maior valor de \"Deaths\" entre os países do hemisfério sul\n");

        estatisticasCovid
                .stream()
                .filter(o -> o.Lat < 0)
                .sorted((o1, o2) -> (int) (o2.Deaths - o1.Deaths))
                .limit(1)
                .forEach(o -> System.out.println(o));

        System.out.println("----------------------------------------------------");

        System.out.printf("O maior valor de \"Deaths\" entre os países do hemisfério norte\n");

        estatisticasCovid
                .stream()
                .filter(o -> o.Lat > 0)
                .sorted((o1, o2) -> (int) (o2.Deaths - o1.Deaths))
                .limit(1)
                .forEach(o -> System.out.println(o));

        System.out.println("----------------------------------------------------");

        int soma = estatisticasCovid
                .stream()
                .filter(o -> o.Confirmed >= 1000000)
                .mapToInt(o -> o.Active)
                .sum();

        System.out.println("A soma de \"Active\" de todos os países em que \"Confirmed\" é maior o igual que " +
                "1.000.000: " + soma);
    }
}
