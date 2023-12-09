package conexion_con_bd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class clase1 {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    ejercicioconexion acceso = new ejercicioconexion();

    public void listar() {

        String sql = "select * from datos";

        try {
            //Inicializa la base de datos
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void crear(String nombre, String apellido, int edad, double nota_promedio) {

        String sql = "insert into datos (nombre,apellido,edad,nota_promedio) values (?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, edad);
            ps.setDouble(4, nota_promedio);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void modificar(int id_estudiante, String nombre, String apellido, int edad, double nota_promedio) {

        String sql = "update datos set nombre=?, apellido=?, edad=?, nota_promedio=? where id_estudiante=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setInt(3, edad);
            ps.setDouble(4, nota_promedio);
            ps.setInt(5, id_estudiante);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void eliminar(int id_estudiante) {
        String sql = "delete from datos where id_estudiante=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id_estudiante);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

//    public Usuario consultar(String correo_electronico, String contrasenia) {
//
//        String sql = "select * from usuarios where correo_electronico like ?  or contrasenia like ?;";
//
//        try {
//            //Inicializa la base de datos
//            con = acceso.Conectar();
//            ps = con.prepareStatement(sql);
//            ps.setString(1, "%"+correo_electronico+"%");
//            ps.setString(2, "%"+contrasenia+"%");
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                System.out.println(rs.getString(2));
//                System.out.println(rs.getString(3));
//                System.out.println(rs.getInt(8));
//               
//               
//            }
//             return null;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        return null;
//
//    }
    public static void main(String[] args) {
        clase1 md = new clase1();
        md.modificar(7, "Edu", "Est", 50, 100);
        md.listar();
    }
    
}
