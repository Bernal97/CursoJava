package Main.Java.Services;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;


import Main.Java.User.VOUsers;

@Path("/users")

public class ServiceUser {
    
    @POST
    @Path("/crear")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public VOUsers cargarDatos(@FormParam("id") int idUser,VOUsers usuario){
        usuario.setApellidos("Un apellido");
        usuario.setNombres("Un nombre");
        return usuario;
    }
    
    
    @GET
    @Path("/consultar/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public VOUsers solicitarDatos(@PathParam("id") int idUser, VOUsers usuario) {
        usuario.getApellidos();
        usuario.getNombres();
        return usuario;
    }    
    
    @GET
    @Path("/consultar/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public VOUsers solicitarDatosGeneral(VOUsers usuario) {
        usuario.getApellidos();
        usuario.getNombres();
        return usuario;
    }   
    
    @PUT
    @Path("/modificar/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public VOUsers modificarDatos(@FormParam("id") int idUser, VOUsers usuario){
        usuario.setNombres("Seteo Nombre");
        usuario.setApellidos("Seteo Apellido");
        return usuario;
    }
    
    
    
    @DELETE
    @Path("/borrar/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public VOUsers eliminarDatos(@FormParam("id") int idUser, VOUsers usuario){
        usuario.setApellidos(null);
        usuario.setNombres(null);
        return usuario;
    }
}
