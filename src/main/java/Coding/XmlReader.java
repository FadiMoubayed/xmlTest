package Coding;

import Model.Measurement;
import Model.Measurements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;


@RestController

public class XmlReader {

    @GetMapping(value ="/xml-data" , produces = "application/json")
    public List<Measurement> raedXml() throws JAXBException {
        String filePath = "./data/file2.xml";
        JAXBContext jContext = JAXBContext.newInstance(Measurements.class);
        Unmarshaller jUnmarshaller = jContext.createUnmarshaller();
        Measurements unmarshaledList = (Measurements) jUnmarshaller.unmarshal(new File(filePath));
        return unmarshaledList.getMeasurements();
    }


    @GetMapping(value ="/test-String")
    public String testString(){
        return "test string successful";
    }
}
