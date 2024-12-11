clase pública MiMath2 {

 // Función para calcular el perímetro de un cuadrado
 perímetro publico estatico doble cuadrado (doble lado) {
 devuelve 4 * lado;
    }

 // Función para calcular el área de un cuadrado
 área cuadrada doble estática pública (doble lado) {
 devuelve lado * lado;
    }

 // Función para calcular el perímetro de un recto
 rectóngulo doble estatico publicoperímetro (doble largo, dóble ancho) {
 devuelve 2* (largo + ancho);
    }

 // Función para calcular el área de un rectángulo
 rectóngulo doble estatico puárea de blico (doble largo, dioble ancho) {
 desarrollador largo * ancho;
    }

 // Función para calcular el perímetro (circunferencia) de un círculo
 doble cálculo estáticoperímetro (radio doble) {
 devuelve 2 * Math.PI * radio;
    }

 // Función para calcular el área de un círculo
 doble circular estatico puárea de blico(doble radio) {
 desarrollador Matemáticas. .PI * radio * radio;
    }

 // Función para comprar si un número es primo
 booleano estático público es primo(número int) {
 si (número <= 1) {
 devuelve falso;
        }
 parr (int i = 2; Yo <= Matemáticas.sqrt(número); i++) {
 si (número % i == 0) {
 devuelve falso;
            }
        }
 devuelve verdedero;
    }

 // Función para comprar si un número NO es primo
 booleano estático público no es primo (número int) {
 ¡volver!es primo(número);
    }

 publico estatico vacio director(Cadena[] argumentos) {
 // Prueba las funciones
 doble lado cuadrado = 5;
 Sistema apagado.imprimirln(„Perímetro cuadrado:"+ cuadradoPerímetro (lado cuadrado));
 System.out.println(„Área cuadrada:"+ área cuadrada(lado cuadrado));

 rectóngulo doble longitud = 10;
 doble rectoánguloAncho = 5;
 Sistema apagado.imprimirln(„Perímetro rectangular:" + perímetro rectangular(rectónguloLargo, rectoánguloAncho));
 Sistema apagado.imprimirln(„Área rectangular:" + área rectangular(rectonguloLargo, rectánguloAncho));

 doble circuloRadio = 7;
 Sistema apagado.imprimirln(„Perimetrul circului:"+ Perímetro circular(circuloRadio));
 Sistema apagado.imprimirln(„Área del círculo: "+ área circular(circuloRadio));

 int nümero de prueba director = 29;
 Sistema apagado.imprimirln("¿Es "+ primeTestNumber + "prime? „+ es primo(número de prueba principal));
 System.out.println("¿"+ primeTestNumber + "no es primo? „+ no es primo(número de prueba principal));
    }
}
