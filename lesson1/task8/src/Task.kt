fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
        // não precisa fazer a checagem se o client é "null". Basta usar o "?"
        
    //if (client == null || message == null) return

    //val personalInfo = client?.personalInfo?: return

    //val email = personalInfo?.email?: return

    //mailer.sendMessage(email, message)
        
        val email = client?.personlInfo?.email          //veja como o código é menos verborrágico que a versão Java
        if(email != null && message != null){
                mailer.sendMessage(email, message)
        }
        
        
    /*
    copy+paste+conversion+renomear("getPersonalInfo" -> "personalInfo")
    * if (client == null || message == null) return

    val personalInfo = client.getPersonalInfo() ?: return

    val email = personalInfo!!.email ?: return

    mailer.sendMessage(email, message)
    * */
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
