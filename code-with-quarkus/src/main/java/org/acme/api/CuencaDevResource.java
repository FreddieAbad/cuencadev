package org.acme.api;

import javax.ws.rs.*;

import org.jboss.logging.Logger;

@Path("/trx")
@Consumes("application/json")
@Produces("application/json")

public class CuencaDevResource {
/*    Logger logger = Logger.getLogger(String.valueOf(TransactionResource.class));*/


    /*metrica que da promedio de tiempo de consulta */
  /*  @Timed(
            name = "promedio-consulta-cuentas",
            unit = MetricUnits.SECONDS,
            description = "Promedio duracion consulta cuenta"
    )*/
/*
    public List <Transaction> getTransactions(@PathParam("account") String account){
*/





    @GET
    @Path("/proyectos")
    // retornara lista de proyectos con atributos id_proyecto, posicion, titulo_proyecto, url_imagen, uri_proyecto
    public void getProyectos(){

    }


    @GET
    @Path("/proyectos/{id}")
    // retornara proyecto con atributos id_proyecto, fecha_proyecto, titulo_proyecto, contenido_proyecto
    public void getProyecto(int identiificador){

    }

    @GET
    @Path("/articulos")
    // retornara lista de proyectos con atributos id_articulo, posicion, fecha_articulo, titulo_articulo, url_imagen, uri_articulo
    public void getArticulos(){

    }


    @GET
    @Path("/articulos/{id}")
    // retornara articulo id_articulo, fecha_articulo, titulo_articulo, contenido_articulo
//     id_articulo
// fecha_articulo
// titulo_articulo
// contenido_articulo
    public void getArticulo(){

    }


// id_servicio
// desc_servicio
// posicion_servicio
// icono_servicio

    @GET
    @Path("/servicios")
    public void getServicios(){

    }

// id_tecnologia
// posicion_tecnologia
// icono_tecnologia

    @GET
    @Path("/tecnologias")
    public void getTecnologias(){

    }

// id_opinion
// nombre_opinion
// desc_opinion
// posicion_opinion
// uri_foto_opinion

    @GET
    @Path("/opiniones")
    public void getOpiniones(){

    }


    // id_empresa
// nombre_empresa
// posicion_opinion
// uri_foto_empresa
    @GET
    @Path("/empresas")
    public void getEmpresas(){

    }

// id_redsocial
// nombre_redsocial
// posicion_redsocial
// uri_foto_redsocial

    @GET
    @Path("/rrss")
    public void getRedesSociales(){

    }

    // id_libro
// posicion
// uri_imagen
// frase_descripcion
    @GET
    @Path("/libros")
    public void getLIBROS(){

    }

// posicion
// titulo_proyecto
// url_imagen
// uri_proyecto

    @POST
    @Path("/proyecto")
    public void postProyecto (){}

// posicion
// fecha_articulo
// titulo_articulo
// url_imagen
// uri_articulo

    @POST
    @Path("/articulo")
    public void postArticulo (){}

// desc_servicio
// posicion_servicio
// icono_servicio

    @POST
    @Path("/servicio")
    public void postServicio (){}

// posicion_tecnologia
// icono_tecnologia

    @POST
    @Path("/tecnologia")
    public void postTecnologia (){}

// nombre_opinion
// desc_opinion
// posicion_opinion
// uri_foto_opinion

    @POST
    @Path("/opinion")
    public void postOpinion (){}

// nombre_empresa
// posicion_opinion
// uri_foto_empresa

    @POST
    @Path("/empresa")
    public void postEmpresa (){}

// nombre_redsocial
// posicion_redsocial
// uri_foto_redsocial

    @POST
    @Path("/rrss")
    public void postRedSocial (){}

    //     posicion
// uri_imagen
// frase_descripcion
    @POST
    @Path("/libro")
    public void postLibro (){}
// id_proyecto
// posicion
// titulo_proyecto
// url_imagen
// uri_proyecto

    @PUT
    @Path("/proyecto")
    public void putProyecto (){}
// id_articulo
// fecha_articulo
// titulo_articulo
// contenido_articulo


    @PUT
    @Path("/articulo")
    public void putArticulo (){}
// id_servicio
// desc_servicio
// posicion_servicio
// icono_servicio

// id_servicio
// desc_servicio
// posicion_servicio
// icono_servicio

    @PUT
    @Path("/servicio")
    public void putServicio (){}

// id_tecnologia
// posicion_tecnologia
// icono_tecnologia


    @PUT
    @Path("/tecnologia")
    public void putTecnologia (){}

// id_opinion
// nombre_opinion
// desc_opinion
// posicion_opinion
// uri_foto_opinion

    @PUT
    @Path("/opinion")
    public void putOpinion (){}

// id_empresa
// nombre_empresa
// posicion_opinion
// uri_foto_empresa

    @PUT
    @Path("/empresa")
    public void putEmpresa (){}

// id_redsocial
// nombre_redsocial
// posicion_redsocial
// uri_foto_redsocial

    @PUT
    @Path("/rrss")
    public void putRedSocial (){}

    //     id_libro
// posicion
// uri_imagen
// frase_descripcion
    @PUT
    @Path("/libro")
    public void putLibro (){}

    // id_proyecto
    @DELETE
    @Path("/proyecto")
    public void deleteProyecto (){}
    // id_articulo
    @DELETE
    @Path("/articulo")
    public void deleteArticulo (){}
    // id_servicio
    @DELETE
    @Path("/servicio")
    public void deleteServicio (){}
    // id_tecnologia
    @DELETE
    @Path("/tecnologia")
    public void deleteTecnologia (){}
    // id_opinion
    @DELETE
    @Path("/opinion")
    public void deleteOpinion (){}
    // id_empresa
    @DELETE
    @Path("/empresa")
    public void deleteEmpresa (){}
    // id_rrss
    @DELETE
    @Path("/rrss")
    public void deleteRedSocial (){}

    // id_libro
    @DELETE
    @Path("/libro")
    public void deleteLibro (){}
}
