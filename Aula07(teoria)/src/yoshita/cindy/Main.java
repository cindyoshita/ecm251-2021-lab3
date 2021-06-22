package yoshita.cindy;

public class Main {

    public static void main(String[] args) {
        // Referencia (Pessoa) q n pode mudar
	    final Pessoa pessoa = new Pessoa("Deku", "1234");
	    pessoa.mudar = 69;
        System.out.println(pessoa);
        //pessoa.mudaTudo();
        //Não pode realizar a nova instãncia, pois a referência (DEKU) é final
        //pessoa = new Pessoa("Bakugo", "1233");
        pessoa.mudar = 14;
        System.out.println(pessoa);

        //EXEMPLO DE SOBRECARGA
        // SOBRECARREGADO porque tem 2 construtores e é diferenciado pela assinatura
        System.out.println("----------Sobrecarga-----------");
        Estudante estudante1 = new Estudante("Asuka","02","02");
        Estudante estudante2 = new Estudante("Rei","01");
        System.out.println("Estudante 1:" + estudante1);
        System.out.println("Estudante 2:" + estudante2);

        // Exemplo de Sobreposição
        System.out.println("----------Sobreposição-----------");
        Pessoa pessoa1 = new Estudante("Shinji","33","01"); // PEGA O QUE SOBREESCREVEU n pega o pai
        Estudante estudante3 = new Estudante("Kaoru","44","02");
        Object estudante4 = new Estudante("Han Solo","00","00");
        System.out.println("Estudante como pessoa:" + pessoa1);
        System.out.println("Estudante como pessoa:" + estudante3);
        System.out.println("Estudante como pessoa:" + estudante4);


        //IMPORTANTE
        System.out.println("-----------Cuidado com a Herança-------");
        System.out.println("Ola de Estudante como Pessoa:" + pessoa1.Ola());
        System.out.println("Ola de Estudante como Estudante:" + estudante3.Ola());
        // ERRO pq a classe pai (OBJECT) n acessa a classe filha (PESSOA)
        //System.out.println("Ola de Estudante como Object:" + estudante4.Ola());
        // Fazendo o cast feinho- assumindo algo q pode n ser
        System.out.println("Ola de Estudante como Object:" + ((Estudante)estudante4).Ola());

        //Não é possível fazer, pois tod@ Estudante é uma Pessoa, mas Pessoa não é um Estudante
        //Estudante estudante5 = new Pessoa("Murilo","123");
        System.out.println("---------typeOf()-------");
        System.out.println("Ola de Estudante como Pessoa:" + pessoa1.getClass());
        System.out.println("Ola de Estudante como Estudante:" + estudante3.getClass());
        System.out.println("Ola de Estudante como Object:" + estudante4.getClass());
    }
}
