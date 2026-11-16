import java.lang.Math.pow
import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Lambda sumar dos numeros
val sum = {x: Int,y:Int -> x+y}
//funcion nullaria
fun obtenerMensaje(): String = "Hola mundo"
val mensajeLambda : ()->String = {"Hola mundo"}
//funcion unario
fun calcularCubo(numero: Int): Int = numero*numero*numero
//funcion binaria
fun sumar(numero1: Int, numero2: Int): Int = numero1 + numero2
//funcion ternaria
//fun enearia
fun calcularCosto(precio:Double,cantidad: Int,descuento:Double,impuesto:Double,transporte:Double): Double{
    val subtotal = precio * cantidad
    val descuento = subtotal * descuento / 100
    val subtotal2 = subtotal - descuento
    return subtotal2 + (subtotal2*impuesto/100) + transporte
} //Se puede redefinirla para hacerla más pequeña(subtotal, transporte, calculo de impuestos)
val costo: (Double, Int, Double, Double, Double) -> Double = { p, c, d, i, t ->

    val subtotal = p * c
    val descuento = subtotal * d / 100
    val subtotal2 = subtotal - descuento

    subtotal2 + (subtotal2 * i / 100) + t
}
data class Estudiante(
    val nombre: String,
    val nota: Double
)
val crearEstudiante:(String,Double)->Estudiante ={nombre,nota -> Estudiante(nombre,nota)}
fun crearEstudiante1(nombre:String,nota:Double):Estudiante = Estudiante(nombre,nota)
//Esta no es una función pura
val mostrarEstudiante: (String,Double)->Unit = {nombre,nota -> println("Nombre del estudiante: $nombre y calificacion: $nota")}
//Determinar si el estudiante aprobo si su nota es mayor o igual que 7
val estaAprobado: (Estudiante)->Boolean = {estudiante ->
    if(estudiante.nota >=7){
        true
    }else{
        false
    }

}
//Crea una clase triangulo que reciba las coordenadas de los tres vertices
//Distancia entre los tres pares de puntos, perimetro de la figura, area del triangulo mediante la formula de heron(raizcuadrada del semiperimetro)
data class Triangulo(
    val x1: Double,
    val y1: Double,
    val x2: Double,
    val y2: Double,
    val x3: Double,
    val y3: Double,
)
val distancia: (Double,Double,Double,Double)->Double = {x1,y1,x2,y2-> sqrt(pow((x2-x1))+pow(y2-y1))}
val perimetro: (Double,Double,Double)->Double = {d1,d2,d3 -> d1+d2+d3}
val area: (Double,Double,Double,Double)->Double = {semiperimetro,a,b,c -> sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c)) }
fun main() {
    print(obtenerMensaje())
    println(mensajeLambda)
    //unaria con lambdas
    val cubo : (Int) -> Int = {numero-> numero*numero*numero}
    //binaria con lambdas
    val sumarl : (Int,Int) -> Int = {numero1,numero2 -> numero1 + numero2}
    //enearias con lambdas
    val estudiante = Estudiante("Alex",7.1)
    println("El estudiante aprobo? : ${estaAprobado(estudiante)}")


}

