
package com.todocodeacademy.helloWorld.controller;



import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController //este va a hacer nuestro contolador dentro d nuestras llaves creamos un endpoint
public class HelloController {  // Este va hacer nuestro controlador
    
   /* @GetMapping("/hello") // si se hace una solicitud GET va a devolver. Las llaves {} indican que el valor de la variable es variable.  El parametro es de la URL ej Luisina
    public String sayHello(@RequestParam String nombre) { // recibe el nombre de la variable que va a recibir este parametro puesto por ej Luisina.El parametro es del metodo
        return "Hello World " + nombre;// "Hello World" + el nombre.
    }
    
    @GetMapping("/bye") // si se hace una solicitud GET el cliente va a poner como parametro por ejemplo: Luisina, 30, Ingeniera
    public String sayBye(@RequestParam String nombre, // Variables reciben el valor
                         @RequestParam int edad,
                         @RequestParam String profesion) {
        return "Bye World " + " Nombre: " + nombre + " Edad: " + edad
                + " Profesión: " + profesion;
    }*/
    
    // Ejercicio 1 suma entre 2 numeros
    
    /*@GetMapping("/matematica/{n1}/{n2}")
        public String sumMath (@PathVariable int n1,
                               @PathVariable int n2) {
            
            int resultado;
            resultado = n1 + n2;
            
            return " matematica: " + " numero1:  " + n1 +  "  numero2:  " + n2
                +  " Resultado:  " + resultado;
        
        }*/
    
    
    // Ejercicio 2 
        
       @GetMapping ("/imc") // como se va a llamar la ruta  que mapearemos
       public String calcularSuma (@RequestParam double imc_persona) {
          
       String estado_peso=""; // declaramos la variable como vacia y contendra la descripcion
                              // que corresponde a cada uno de las 4 opciones. 
       if (imc_persona<=18.5) {
           estado_peso = "Peso insuficiente";
       }
       else if (imc_persona >=18.6 && imc_persona <=24.9){
            estado_peso = "Peso saludable";
       }
        else if (imc_persona >=25.0 && imc_persona <=29.9){
            estado_peso = "Sobrepeso";
       }
        else if (imc_persona >=30){
            estado_peso = "Obesidad";
       }
   
   return "El estado de peso del paciente es: " + estado_peso;
        
       }  
}