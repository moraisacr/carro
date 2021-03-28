package Bancocarro;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();
        int opcao = 0;
    do{
		System.out.println("\n                 =========================");
		System.out.println("                  |     1 - Listar         |");
        System.out.println("                  |     2 - Inserir        |");
		System.out.println("                  |     3 - Exluir         |");
        System.out.println("                  |     4 - Atualizar      |");
		System.out.println("                  |     0 - Sair           |");
		System.out.println("                   =========================\n");

        opcao = Console.readInt("Opção -> ");
		System.out.print("\n");

		switch (opcao) {
		case 1:

                System.out.println("==== Mostrar carros === ");
                carros = dao.getCarros();
                for(int i = 0; i < carros.length; i++) {
                    System.out.println(carros[i].toString());
                }

			break;
		case 2:
            Carro carro = new Carro(2021, "branco", "uno","fiat");
            if(dao.inserirCarro(carro) == true) {
                System.out.println("Inserção com sucesso -> " + carro.toString());
            }
			break;

        case 3:
            //Excluir Ano
            dao.excluirCarro(carro.getAno());
			break;    
                   
		case 4:

            //Atualizar carro
            carro.setModelo("novo modelo");
            dao.atualizarCarro(carro);
			break;

		case 0:
			break;
		default:
			System.out.println("Opção Inválida!");
			break;
		}
	} while (opcao != 0);


		
		dao.close();
	}
}
