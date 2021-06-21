package sample;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

public class XML {

 //       statisticsToXML("statistics.xml", statistics);


    public static void statisticsToXML(String filename, Statistics statistics) throws Exception {
        File file = new File(filename);
        JAXBContext jaxbContext = JAXBContext.newInstance(Statistics.class);

        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        jaxbMarshaller.marshal(statistics, file);
        jaxbMarshaller.marshal(statistics, System.out);
    }
}
