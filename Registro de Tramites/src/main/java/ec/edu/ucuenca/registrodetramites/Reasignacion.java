package ec.edu.ucuenca.registrodetramites;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Reasignacion implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "REASIGNACION_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(sequenceName = "REASIGNACION_ID_SEQ", name = "REASIGNACION_ID_GENERATOR")
    private java.lang.Long id;

    public Reasignacion() {
    }
    
    public Reasignacion(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }

}