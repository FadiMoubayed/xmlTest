package Coding;

import Model.Measurement;
import Model.Measurements;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class XmlReaderStream {

    public List<Measurement> readStream(InputStream stream) throws JAXBException {

            // Creating Unmarshaller
            JAXBContext jContext = JAXBContext.newInstance(Measurements.class);
            javax.xml.bind.Unmarshaller jUnmarshaller = jContext.createUnmarshaller();

            Measurements unmarshaledList = (Measurements) jUnmarshaller.unmarshal(stream);

            return unmarshaledList.getMeasurements();
    }
}
