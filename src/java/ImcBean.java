
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos

*/
@ManagedBean
public class ImcBean {
    
    private float altura;
    private float peso;
    private float imc;
    private String info;
    
    public void resultado(){
        imc=(float)(peso/Math.pow(altura, 2));
        
         if(imc<18){
            setInfo("Magro");
        }else if(imc>24){
            setInfo("Gordo");
        }else{
            setInfo("Normal");
        }
        FacesMessage msg = new FacesMessage("IMC: "+imc+" "+getInfo());
        FacesContext contexto=FacesContext.getCurrentInstance();
        contexto.addMessage(null, msg);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
