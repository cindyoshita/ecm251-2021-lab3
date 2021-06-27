package maua.cindy.thiago.sistema.metodos;


import maua.cindy.thiago.enumeracoes.TipoMembros;
import maua.cindy.thiago.registro.Usuario;

import java.io.FileWriter;
import java.util.Scanner;

public class RegistrarUsuario {
    /**
     * Cria um scanner dependendo do que for digitado, ele ira atribuir um ENUM tipoMembro diferente para ao parametro tm
     * @param tm parametro tipo ENUM tipoMembro
     * @param i parametro do tipo inteiro
     */
 public void registro(TipoMembros tm, int i){
 Scanner scanner = new Scanner(System.in);
 System.out.println("Digite a sigla da categoria de funcionario o qual deseja cadastrar: \n" +
 "bb -> BIGBROTHERS\n" +
 "hl -> HEAVYLIFTERS\n" +
 "mm -> MOBILEMEMBERS\n" +
 "sg -> SCRIPTGUYS\n");
 String cargo =  scanner.nextLine();
 try{
     if (cargo.equalsIgnoreCase("bb")) {
         tm = TipoMembros.BIGBROTHERS;
     } else if (cargo.equalsIgnoreCase("hl")) {
         tm = TipoMembros.HEAVYLIFTERS;
     } else if (cargo.equalsIgnoreCase("mm")) {
         tm = TipoMembros.MOBILEMEMBERS;
     } else if (cargo.equalsIgnoreCase("sg")) {
         tm = TipoMembros.SCRIPTGUYS;
     }
 }catch (Exception exception){
     System.out.println("Essa categoria não existe");
 }
 System.out.println("Digite o nome que deseja registrar:");
 String nomeUsuario = scanner.nextLine();

 System.out.println("Digite o email que deseja registrar:");
 String email = scanner.nextLine();

 new Usuario(nomeUsuario, i, email, tm);
 System.out.println(Usuario.usuarioListado);

 }

    /**
     * Responsavel por pegar os elementos do scanner do metodo registro e adicionar ao csv "arquivo_super_Secreto_nao_abrir.csv"
     * @param i parametro do tipo inteiro
     * @throws Exception Joga uma excessao
     */
 public void serializarRegistro(int i)throws Exception {
 FileWriter fw = new FileWriter("arquivo_super_Secreto_nao_abrir.csv");
 TipoMembros tm = null;
 registro(tm,i);

 for(Usuario usuario1 : Usuario.usuarioListado){
 fw.append(usuario1.toString() + "\n");
 }
 fw.close();
 }

 }
