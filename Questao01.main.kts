fun verificarEnderecos(enderecos: List<String?>) {
    for (endereco in enderecos) {
        val local = endereco ?: "Endereço Desconhecido"

        if (local == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $local")
        }
    }
}

fun main() {
    val enderecos = listOf("Rua A", null, "Rua B", null)
    verificarEnderecos(enderecos)
}
