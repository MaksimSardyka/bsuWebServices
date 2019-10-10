
package by.bsu.client.remote;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for reader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reader">
 *   &lt;complexContent>
 *     &lt;extension base="{http://services.server.bsu.by/}person">
 *       &lt;sequence>
 *         &lt;element name="takenBooks" type="{http://services.server.bsu.by/}book" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reader", propOrder = {
    "takenBooks"
})
public class Reader
    extends Person
{

    @XmlElement(nillable = true)
    protected List<Book> takenBooks;

    /**
     * Gets the value of the takenBooks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the takenBooks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTakenBooks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Book }
     * 
     * 
     */
    public List<Book> getTakenBooks() {
        if (takenBooks == null) {
            takenBooks = new ArrayList<Book>();
        }
        return this.takenBooks;
    }

}
