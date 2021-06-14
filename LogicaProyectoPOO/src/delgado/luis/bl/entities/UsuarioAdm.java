package delgado.luis.bl.entities;

/**
 * Clase que representa el perfil del usuario administrador
 */

public class UsuarioAdm extends Usuario{
//    /**
//     *El String que almacena el nombre del usuario
//     */
//    private String nombreUsuario;
//    /**
//     *El String que almacena el avatar del usuario administrador
//     */
//    private String avatar;
//    /**
//     *El String que almacena el nombre del usuario Administrador
//     */
//    private String nombre;
//    /**
//     *El String que almacena el apellido del usuario administrador
//     */
//    private String apellidos;
//    /**
//     *El String que almacena la contrasena del usuario administrador
//     */
//    private String contrasenna;
//    /**
//     *El String que almacena el correo electronico del usuario administrador
//     */
//    private String correoElectronico;

    /**
     * Inicializa los atributos en sus valores por defecto
     */
    public UsuarioAdm() {
    }

    /**
     * Inicializa los atributos principales de la clase
     * @param nombreUsuario del administrador de la aplicacion
     * @param avatar del administrador de la aplicacion
     * @param nombre del administrador de la aplicacion
     * @param apellidos del administrador de la aplicacion
     * @param contrasenna del administrador de la aplicacion
     * @param correoElectronico del administrador de la aplicacion
     */
    public UsuarioAdm(String nombreUsuario, String avatar, String nombre, String apellidos, String contrasenna, String correoElectronico) {

        super(nombreUsuario, avatar, nombre, apellidos, contrasenna, correoElectronico);


//        this.nombreUsuario = nombreUsuario;
//        this.avatar = avatar;
//        this.nombre = nombre;
//        this.apellidos = apellidos;
//        this.contrasenna = contrasenna;
//        this.correoElectronico = correoElectronico;
    }

//    /**
//     * Acceso al atributo nombre del usuario
//     * @return del nombre del usuario
//     */
//    public String getNombreUsuario() {
//        return nombreUsuario;
//    }
//
//    /**
//     * Modificador del valor del atributo nombre del usuario
//     * @param nombreUsuario del nombre del usuario
//     */
//    public void setNombreUsuario(String nombreUsuario) {
//        this.nombreUsuario = nombreUsuario;
//    }
//
//    /**
//     * Acceso al atributo avatar
//     * @return del String avatar
//     */
//    public String getAvatar() {
//        return avatar;
//    }
//
//    /**
//     * Modificador del valor del atributo avatar
//     * @param avatar del String avatar
//     */
//    public void setAvatar(String avatar) {
//        this.avatar = avatar;
//    }
//
//    /**
//     * Acceso al atributo nombre
//     * @return del String nombre
//     */
//    public String getNombre() {
//        return nombre;
//    }
//
//    /**
//     * Modificador del valor del atributo nombre
//     * @param nombre del String nombre
//     */
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    /**
//     * Acceso al atributo apellido
//     * @return del String apellido
//     */
//    public String getApellidos() {
//        return apellidos;
//    }
//
//    /**
//     * Modificador del valor del atributo apellido
//     * @param apellidos del String apellido
//     */
//    public void setApellidos(String apellidos) {
//        this.apellidos = apellidos;
//    }
//
//    /**
//     * Acceso al atributo del string de la contrasena
//     * @return del string de la contrasena
//     */
//    public String getContrasenna() {
//        return contrasenna;
//    }
//
//    /**
//     * Modificador del valor del atributo
//     * @param contrasenna del string de la contrasena
//     */
//    public void setContrasenna(String contrasenna) {
//        this.contrasenna = contrasenna;
//    }
//
//    /**
//     * Acceso al atributo del correo electronico
//     * @return el String correo electronico
//     */
//    public String getCorreoElectronico() {
//        return correoElectronico;
//    }
//
//    /**
//     * Modificador del valor del atributo del correco electronico
//     * @param correoElectronico del String correo electronico
//     */
//    public void setCorreoElectronico(String correoElectronico) {
//        this.correoElectronico = correoElectronico;
//    }




    /**
     * metodo toString de la clase usuario administrador
     * @return las variables presentes en la clase de usuario administrador
     */

    @Override
    public String toString() {
        return "UsuarioAdm{" +
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



//    @Override
//    public String toString() {
//        return "UsuarioAdm{" +
//                "nombreUsuario='" + nombreUsuario + '\'' +
//                ", avatar='" + avatar + '\'' +
//                ", nombre='" + nombre + '\'' +
//                ", apellidos='" + apellidos + '\'' +
//                ", contrasenna='" + contrasenna + '\'' +
//                ", correoElectronico='" + correoElectronico + '\'' +
//                '}';
//    }
}
