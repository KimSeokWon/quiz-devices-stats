package com.kim_seokwon.quiz.bank.loader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.springframework.util.Assert;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;

public class CSVFileLoader {
    private CSVParser csvParser = null;
    public CSVFileLoader() {

    }
    public void open(InputStream in) throws IOException {
        Assert.notNull(in, "InputStream cannot null");
        csvParser = CSVParser.parse(in, Charset.forName("UTF-8"), CSVFormat.DEFAULT);
    }

    public void destroy() throws IOException{
        if ( csvParser != null ) {
            csvParser.close();
        }
    }
    public void store() {

    }
}
