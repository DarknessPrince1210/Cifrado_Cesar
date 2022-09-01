/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifrado_cesar;

/**
 *
 * @author diazt
 */
public class cifrar {
    
    public String codificar(String letras, String texto, int num){
        String textoCodificado="";
        texto=texto.toUpperCase();
        
        char caracter;
        
        if(num==0){
            num=1;
        }
        
        for(int i=0;i<texto.length();i++){
            caracter=texto.charAt(i);
            
            int pos=letras.indexOf(caracter);
            
            if(pos==-1){
                textoCodificado+=caracter;
            }else{
                textoCodificado+=letras.charAt((pos+num)%letras.length());
            }
        }
        
        
        
        
        
        
        return textoCodificado;
    }
    
    public String decodificar(String letras, String texto, int num){
        String textoDecodificado="";
        texto=texto.toUpperCase();
        
        char caracter;
        
        
        for(int i=0;i<texto.length();i++){
            caracter=texto.charAt(i);
            
            int pos=letras.indexOf(caracter);
            
            if(pos==-1){
                textoDecodificado+=caracter;
            }else{
                textoDecodificado+=letras.charAt((pos-num)%letras.length());
            }
        }
        
        System.out.println(textoDecodificado);
        

        return textoDecodificado;
    }
    
}
