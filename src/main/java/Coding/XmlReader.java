package Coding;

import Model.Measurement;
import Model.Measurements;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XmlReader {

    public List<Measurement> raedXml(String filePath) throws JAXBException {

        JAXBContext jContext = JAXBContext.newInstance(Measurements.class);
        Unmarshaller jUnmarshaller = jContext.createUnmarshaller();

        Measurements unmarshaledList = (Measurements) jUnmarshaller.unmarshal(new File(filePath));

        return unmarshaledList.getMeasurements();
    }
}
