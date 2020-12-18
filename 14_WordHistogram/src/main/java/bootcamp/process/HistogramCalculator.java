package bootcamp.process;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HistogramCalculator {


    public Map<String, Integer> calculate(final List<String> words) {

        Map<String,Integer> countMap = new HashMap<>();

        for(String str: words) {
            Integer i = countMap.get(str);
            countMap.put(str, (i == null) ? 1 : i + 1);

        }


        return countMap;
    }
}
