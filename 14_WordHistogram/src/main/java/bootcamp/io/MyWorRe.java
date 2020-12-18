package bootcamp.io;

import bootcamp.data.Result;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MyWorRe extends WordReader {

    public MyWorRe(InputStream inStream) {
        super(inStream);
    }

    @Override
    public Result<List<String>> getWords() {

        List<String> words = new ArrayList<String>();
        try {
            InputStream reader = new FileInputStream(String.valueOf(this.inStream));
            InputStreamReader isr = new InputStreamReader(reader);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while((line = br.readLine()) != null){
                words.add(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //that list wrapped in an Optional inside a Result instance
        return new Result<>(Optional.ofNullable(words));
    }
}
