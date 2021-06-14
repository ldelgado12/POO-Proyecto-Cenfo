package delgado.luis.bl.entities;

/**
 * clase que representa al usuario general de la aplicacion
 */

public class Usuario {
    /**
     * El String que almacena el nombre del usuario regular
     */
    protected String nombre;
    /**
     * El String que almacena los apellidos del usuario regular
     */
    protected String apellidos;
    /**
     * El String que almacena la edad del usuario
     */
    protected String edad;
    /**
     * El String que almacena el pais del usuario
     */
    protected String pais;
    /**
     * El String que almacena la identificacion del usuario
     */
    protected String identificacion;
    /**
     * El String que almacena el avatar del usuario
     */
    protected String avatar;
    /**
     * El String que almacena el correo electronico del usuario
     */
    protected String correoElectronico;
    /**
     * El String que almacena el nombre del usuario
     */
    protected String nombreUsuario;
    /**
     * El String que almacena la contrasenna del usuario
     */
    protected String contrasenna;

    /**
     * Inicializa los atributos en sus valores por defecto
     */
    public Usuario() {
    }

    /**
     * Inicializa los atributos principales de la clase
     * @param nombre del usuario general de la aplicacion
     * @param apellidos del usuario general de la aplicacion
     * @param edad del usuario general de la aplicacion
     * @param pais del usuario general de la aplicacion
     * @param identificacion del usuario general de la aplicacion
     * @param avatar del usuario general de la aplicacion
     * @param correoElectronico del usuario general de la aplicacion
     * @param nombreUsuario del usuario general de la aplicacion
     * @param contrasenna del usuario general de la aplicacion
     */
    public Usuario(String nombre, String apellidos, String edad, String pais, String identificacion, String avatar, String correoElectronico, String nombreUsuario, String contrasenna) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.pais = pais;
        this.identificacion = identificacion;
        this.avatar = avatar;
        this.correoElectronico = correoElectronico;
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
    }

    public Usuario(String nombreUsuario, String avatar, String nombre, String apellidos, String contrasenna, String correoElectronico) {
    }

    public Usuario(String nombre, String apellido, String edad) {
    }

    /**
     * Acceso al atributo del nombre del usuario
     * @return del String del nombre del usuario
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Modificador del valor del atributo del nombre del usuario
     * @param nombre del String del nombre del usuario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Acceso al atributo de los apellidos del usuario
     * @return del String de los apellidos del usuario
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Modificador del valor del atributo de los apellidos del usuario
     * @param apellidos del String de los apellidos del usuario
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Acceso al atributo de la edad
     * @return del String de la edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * Modificador del valor del atributo de la edad
     * @param edad del String de la edad
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * Acceso al atributo del pais
     * @return del String del pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Modificador del valor del atributo del pais
     * @param pais del String del pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Acceso al atributo de la identificacion del usuario
     * @return del String de la identificacion del usuario
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Modificador del valor del atributo de la identificacion del usuario
     * @param identificacion del String de la identificacion del usuario
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Acceso al atributo del avatar del usuario
     * @return del string del avatar del usuario
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * Modificador del valor del atributo del avatar del usuario
     * @param avatar del string del avatar del usuario
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * Acceso al atributo del correo electronico
     * @return del string del correo electronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Modificador del valor del atributo del correo electronico
     * @param correoElectronico del string del correo electronico
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Acceso al atributo del nombre de usuario
     * @return del String del nombre de usuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Modificador del valor del atributo del nombre de usuario
     * @param nombreUsuario del String del nombre de usuario
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Acceso al atributo de la contrasenna
     * @return del String de la contrasenna
     */
    public String getContrasenna() {
        return contrasenna;
    }

    /**
     * Modificador del valor del atributo de la contrasenna
     * @param contrasenna del String de la contrasenna
     */
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    /**
     * metodo toString de la clase usuario
     * @return las variables presentes en la clase usuario
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad='" + edad + '\'' +
                ", pais='" + pais + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", avatar='" + avatar + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasenna='" + contrasenna + '\'' +
                '}';
    }
}
