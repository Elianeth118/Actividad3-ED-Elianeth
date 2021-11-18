import java.util.Random
fun main(args:Array<String>) {

    val lista = MutableList(10) {
        var nAleatorio = Random()
        var num = nAleatorio.nextInt(10 )

        println("posicion $it:numero $num")

    }


}













