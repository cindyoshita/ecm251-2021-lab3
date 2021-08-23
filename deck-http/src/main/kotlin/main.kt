fun main(args: Array<String>) {
    val r = khttp.get("https://viacep.com.br/ws/01502001/json/")
    println(r.statusCode)
// 200
   println(r.headers["Content-Type"])
    // arquivo json = javascript object notation = forma neutra de trocar dados
// "application/json; charset=utf-8"
    println(r.text) // Corpo como string
// """{"type": "User"..S."""
    println(r.jsonObject["bairro"])// Informação do bairro
// org.json.JSONObject
}
