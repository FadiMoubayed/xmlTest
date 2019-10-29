import Coding.XmlReader;
import Model.Measurement;

import javax.xml.bind.JAXBException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws JAXBException {
        //Creating an instance of the XmlReader class
        XmlReader reader = new XmlReader();
        //Reading the Xml file
        List<Measurement> measurementsXML = reader.raedXml("./data/file2.xml");

        for(Measurement m: measurementsXML){
            System.out.println(m.toString());
        }
    }
}
