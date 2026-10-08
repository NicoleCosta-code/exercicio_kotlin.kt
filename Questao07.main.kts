fun verificarEmails(emails: List<String?>) {
    var invalidas = 0

    for (email in emails) {
        if (email == null || (email?.length ?: 0) == 0) {
            invalidas++
            println("Conta inválida. Deve ser apagada.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Contas que precisam ser apagadas: $invalidas")
}

fun main() {
    val emails = listOf("ana@email.com", null, "", "joao@email.com")
    verificarEmails(emails)
}
