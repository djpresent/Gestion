package ec.edu.ucuenca.reasignaciones;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity(name = "Tramite")
@javax.persistence.Table(schema = "public", name = "Tramite")
@org.kie.api.definition.type.TypeSafe(true)
public class Tramite implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "TRAMITE_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "TRAMITE_ID_SEQ", name = "TRAMITE_ID_GENERATOR")
   private java.lang.Long id;

   private java.lang.String dependenciaOrigen;

   private java.lang.String descripcion;

   private java.lang.Boolean esQuipux;

   private java.util.Date fechaDespacho;

   private java.util.Date fechaFinalizacion;

   private java.util.Date fechaIngresoTramite;

   private java.util.Date fechaSolicitud;

   private java.lang.Boolean finalizado;

   private java.lang.String numeroDocumento;

   private java.lang.String solicitante;

   @javax.persistence.OneToMany(cascade = { javax.persistence.CascadeType.ALL }, fetch = javax.persistence.FetchType.EAGER)
   private java.util.List<ec.edu.ucuenca.reasignaciones.Reasignacion> reasignacion;

   public Tramite()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.lang.String getDependenciaOrigen()
   {
      return this.dependenciaOrigen;
   }

   public void setDependenciaOrigen(java.lang.String dependenciaOrigen)
   {
      this.dependenciaOrigen = dependenciaOrigen;
   }

   public java.lang.String getDescripcion()
   {
      return this.descripcion;
   }

   public void setDescripcion(java.lang.String descripcion)
   {
      this.descripcion = descripcion;
   }

   public java.lang.Boolean getEsQuipux()
   {
      return this.esQuipux;
   }

   public void setEsQuipux(java.lang.Boolean esQuipux)
   {
      this.esQuipux = esQuipux;
   }

   public java.util.Date getFechaDespacho()
   {
      return this.fechaDespacho;
   }

   public void setFechaDespacho(java.util.Date fechaDespacho)
   {
      this.fechaDespacho = fechaDespacho;
   }

   public java.util.Date getFechaFinalizacion()
   {
      return this.fechaFinalizacion;
   }

   public void setFechaFinalizacion(java.util.Date fechaFinalizacion)
   {
      this.fechaFinalizacion = fechaFinalizacion;
   }

   public java.util.Date getFechaIngresoTramite()
   {
      return this.fechaIngresoTramite;
   }

   public void setFechaIngresoTramite(java.util.Date fechaIngresoTramite)
   {
      this.fechaIngresoTramite = fechaIngresoTramite;
   }

   public java.util.Date getFechaSolicitud()
   {
      return this.fechaSolicitud;
   }

   public void setFechaSolicitud(java.util.Date fechaSolicitud)
   {
      this.fechaSolicitud = fechaSolicitud;
   }

   public java.lang.Boolean getFinalizado()
   {
      return this.finalizado;
   }

   public void setFinalizado(java.lang.Boolean finalizado)
   {
      this.finalizado = finalizado;
   }

   public java.lang.String getNumeroDocumento()
   {
      return this.numeroDocumento;
   }

   public void setNumeroDocumento(java.lang.String numeroDocumento)
   {
      this.numeroDocumento = numeroDocumento;
   }

   public java.lang.String getSolicitante()
   {
      return this.solicitante;
   }

   public void setSolicitante(java.lang.String solicitante)
   {
      this.solicitante = solicitante;
   }

   public java.util.List<ec.edu.ucuenca.reasignaciones.Reasignacion> getReasignacion()
   {
      return this.reasignacion;
   }

   public void setReasignacion(
         java.util.List<ec.edu.ucuenca.reasignaciones.Reasignacion> reasignacion)
   {
      this.reasignacion = reasignacion;
   }

   public Tramite(java.lang.Long id, java.lang.String dependenciaOrigen,
         java.lang.String descripcion, java.lang.Boolean esQuipux,
         java.util.Date fechaDespacho, java.util.Date fechaFinalizacion,
         java.util.Date fechaIngresoTramite, java.util.Date fechaSolicitud,
         java.lang.Boolean finalizado, java.lang.String numeroDocumento,
         java.lang.String solicitante,
         java.util.List<ec.edu.ucuenca.reasignaciones.Reasignacion> reasignacion)
   {
      this.id = id;
      this.dependenciaOrigen = dependenciaOrigen;
      this.descripcion = descripcion;
      this.esQuipux = esQuipux;
      this.fechaDespacho = fechaDespacho;
      this.fechaFinalizacion = fechaFinalizacion;
      this.fechaIngresoTramite = fechaIngresoTramite;
      this.fechaSolicitud = fechaSolicitud;
      this.finalizado = finalizado;
      this.numeroDocumento = numeroDocumento;
      this.solicitante = solicitante;
      this.reasignacion = reasignacion;
   }

}