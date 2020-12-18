package bootcamp.process;

import bootcamp.data.Result;
import bootcamp.io.HistogramWriter;
import bootcamp.io.WordReader;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class HistogramProcessor {
    final HistogramCalculator calculator = new HistogramCalculator();


    //read text from inputStream
    //calc histogram of words and write to outputStream

    public Result<?> process(final WordReader reader, final HistogramWriter writer) {

        Result<List<String>> read_text = reader.getWords();
//        Optional<List<String>> all_values = read_text.getValue();
        Map<String,Integer> word_to_calc = calculator.calculate(read_text.getValue().orElse(new ArrayList<>()));
        return writer.writeHistogram(word_to_calc);





    }
}
