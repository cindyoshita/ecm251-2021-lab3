import models.Produto
import java.sql.DriverManager

fun main(args: Array<String>) {
    // Criando uma conexão com o banco
    val connection = DriverManager.getConnection("jdbc:sqlite:meuBanco.db")
    // Cria um caminho para realizar queries no banco
    val sqlStatement = connection.createStatement()
    //Executa uma query de busca
    val resultSet = sqlStatement.executeQuery("SELECT * FROM produtos;")
    // Intera pelo resultado obtido
    while(resultSet.next()){
        val produto = Produto(
            resultSet.getInt("id"),
            resultSet.getString("nome"),
            resultSet.getDouble("valor"),
            resultSet.getInt("quantidade"),
        )
        println("Produto encontrado: ${produto}$")
    }
    resultSet.close();
    connection.close();
}