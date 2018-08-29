
package webService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConfirmarUsuario_QNAME = new QName("http://webservice/", "confirmarUsuario");
    private final static QName _ConfirmarUsuarioResponse_QNAME = new QName("http://webservice/", "confirmarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConfirmarUsuario }
     * 
     */
    public ConfirmarUsuario createConfirmarUsuario() {
        return new ConfirmarUsuario();
    }

    /**
     * Create an instance of {@link ConfirmarUsuarioResponse }
     * 
     */
    public ConfirmarUsuarioResponse createConfirmarUsuarioResponse() {
        return new ConfirmarUsuarioResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "confirmarUsuario")
    public JAXBElement<ConfirmarUsuario> createConfirmarUsuario(ConfirmarUsuario value) {
        return new JAXBElement<ConfirmarUsuario>(_ConfirmarUsuario_QNAME, ConfirmarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "confirmarUsuarioResponse")
    public JAXBElement<ConfirmarUsuarioResponse> createConfirmarUsuarioResponse(ConfirmarUsuarioResponse value) {
        return new JAXBElement<ConfirmarUsuarioResponse>(_ConfirmarUsuarioResponse_QNAME, ConfirmarUsuarioResponse.class, null, value);
    }

}
