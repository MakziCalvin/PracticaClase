/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Matzi
 */
public class Operaciones {

        private int resultado;
      
        
        public int sumar(int a,int b){
           return this.resultado=a+b;
        }
        public int resta(int a,int b){
           return this.resultado=a-b;
        }
        public int multiplicacion(int a,int b){
           return this.resultado=a*b;
        }
        public int divicion(int a,int b){
           return this.resultado=a/b;
        }
    
}
