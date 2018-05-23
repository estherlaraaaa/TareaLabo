/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricas_concretas;

import Fabricas_Abstractas.AbstractFactory;
import productos_abstractos.Operacion;
import productos_concretos.Binario;

/**
 *
 * @author User
 */
public class FactoryConvertor implements AbstractFactory {
    @Override
    public Operacion getConvertor(String type) {
        switch(type){
            case "binario":
                return new Binario();
        }
        return null;
    }

    @Override
    public Operacion getAritmetica(String type) {
        return null;
    }
    
}
