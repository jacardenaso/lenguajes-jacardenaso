/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author SPR
 */
import java.io.*;
import java.util.ArrayList;

public class PersistenciaUsuario {
    ArrayList<Usuario> usuarios=new ArrayList<>();

    //primero metodo de tipo accion guaradr
    
    public void guardar(Usuario u)throws Exception{
    
        File file=new File("tabla-usuario");
        if(file.exists())usuarios=buscarTodos();
        
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
        
      
    }
    
    
    // buscar todos
    public ArrayList<Usuario> buscarTodos() throws Exception{
    File file=new File("tabla-usuario");
    FileInputStream fis=new FileInputStream(file);
    ObjectInputStream ois=new ObjectInputStream(fis);
    usuarios=(ArrayList<Usuario>) ois.readObject();
    
    
    
        
        return usuarios;
    
    
    
    
    }
    
     public Usuario busarPorNombre(String nombre)throws Exception{
        File file=new File("tabla-usuario");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario encontrado=null;
   Usuario u=     (Usuario) ois.readObject();
       //Comparamos
       if(u.getNomnbre().equals(nombre))encontrado=u;
       return encontrado;
    }
     
     
     
     public Usuario buscarId(int id) throws Exception{
     
         Usuario buscado=null;
            usuarios=buscarTodos();
            //comienza la busqueda
            buscado=usuarios.get(id);
     return buscado;
     
     }
}

