package app.budiq.os.xjustiz.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XJustiz {

    private final Unmarshaller unmarshaller;


    public XJustiz() {
        try {
            this.unmarshaller = JAXBContext.newInstance("app.budiq.os.xjustiz.xml").createUnmarshaller();
        } catch (JAXBException e) {
            throw new XJustizException("Could not create JAXBContext");
        }
    }

    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }
}
