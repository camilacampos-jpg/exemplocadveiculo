 import java.util.ArrayList;
 import java.util.List;

 List<String> veiculos = new ArrayList<>();
 
 void main (){
    IO.println("Bem vindo ao Sistema CadVeiculos");
    String menu = """
            MENU DE OPÇÕES
            1 - Cadastrar Veiculo
            2 - Listar Veiculos
            3 - Remover Veiculo
            0 - Sair
            """;

    int opcao;
    do { 
        IO.println(menu);
        opcao = Input.scanInt("Digite a opção desejada: ");
        switch (opcao) {
            case 1 -> {
                cadastrar(); 
                IO.readln("Precione ENTER para cadastrar um veiculo");
            }
            case 2 -> {
                listar();
                IO.readln("Precione ENTER para listar os veiculos");
            }
            case 3 -> {
                excluir();
                IO.readln("Precione ENTER para remover um veiculo");
            }
            case 0 -> {
                IO.println("Volte sempre!");
            }
            default -> {
                IO.println("Opção inválida!");
                IO.readln("Pressione ENTER para continuar");
            }
        }
    } while (opcao !=0);

 }



void excluir() {
    listar();
    int indice = Input.scanInt("Digite o ínidice do veículo à ser removido: ");
    if (indice > veiculos.size() || indice <= 0)
        IO.println("Veículo não encontrado");
    else{
        veiculos.remove(indice -1);
    IO.println("Veículo removido com sucesso!");

    }

    }

void cadastrar() {
    String veiculo = IO.readln("Digite o nome do veiculo: ");

// veiculo.equalsIgnoreCase USAR NO TRABALHO
 //for(String veiculoCad : veiculos) { USAR NO TRABALHO
  //  if(veiculoCad.equalsIgnoreCase(veiculo)) {USAR NO TRABALHO
  // veiculos.set (i, -1  veiculo) = ALTERAR O NOME 
  // FAZER COM UM ALGORITIMO COM (ALGORITIMO ORDENAR VEICULOS) - BUBBLE SORT  (ALGORITIMO DE ORDENAR VEICULOS) - BUBBLE SORT
  // REMOMOVER POR NOME 
  // GIT 
  
//BUBBLE SORT  (ALGORITIMO DE ORDENAR VEICULO

  // LIST STRING >VEICULOS = NEW ARRAYLIST<>(); 
  // FOR (int i = 0, i < veiculos.size() - i ++)  - lembra que é loop
  // FOR (int j = 0 , j <veiculos.size() -1 - i; j++) - lembra que é loop Faz as comparações 
        //if (veiculos get (j) compare toIgnoreCase (veiculos get (j + 1))>=1
        
        // stringaux veiclo.get.(j) 
        // veiculo get (j) = veiculo.get (j + 1)
        // veiculo get (j + 1) = aux
             
    )
    }
 

    veiculo = veiculo.trim();{
    if (veiculo.isEmpty())
        IO.println("Nome do veiculo invalido!");
    else 
        veiculos.add(veiculo);

}

    void listar() { //melhorar essa descrição 
      for (int i = 1; i <= veiculos.size(); i++) {
        IO.println(i+" - " + veiculos.get(i - 1));
            
        }
    }
    


