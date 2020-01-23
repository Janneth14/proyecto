
package com.agenda.controller;

import com.agenda.model.Personas;
import java.io.Serializable;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class PlantillaController implements Serializable{
    
    
    public void verificarSesion(){
        try{
           FacesContext context= FacesContext.getCurrentInstance();
           Personas per= (Personas) context.getExternalContext().getSessionMap().get("usuario");
            
           if(per == null){
               context.getExternalContext().redirect("./../permisos.xhtml");
           }
           
        }catch(Exception e){
              //guarda registro de un error
        }
    }
    
}
