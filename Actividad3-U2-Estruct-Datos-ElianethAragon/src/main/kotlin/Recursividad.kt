import java.util.Random
fun main(args:Array<String>) {
    val lista = MutableList(10 + 1) {
        "$it"
        var nAleatorio = Random()
        var num = nAleatorio.nextInt(10 + 1)

        println("lista $it numero aleatorio $num")
        val listaResultado=num
        if (num == 5) {

            println("Es 5 en  lista $it")
        }

    }


    }














