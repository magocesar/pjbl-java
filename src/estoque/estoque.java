package estoque;
import java.util.ArrayList;
import java.util.Scanner;

import excep.NoCpfInDatabaseException;
import excep.NoIdInDatabaseException;
import produtos.*;
import padaria.*;

public class estoque {
    private ArrayList<produtoIndustrializado> produtoIndustrializados = new ArrayList<produtoIndustrializado>();

    private ArrayList<produtoProduzido> produtoProduzido = new ArrayList<produtoProduzido>();

    private ArrayList<ingrediente> ingredientes = new ArrayList<ingrediente>();


    public void adicionarProdutoIndustrializado(Scanner scanner){
        int id = 0;
        String nome = null; 
        double preco = 0;
        String descricao = null;
        String fabricante = null; 
        String dataDeFabricacao = null; 
        String dataDeValidade = null;

        System.out.println("\n--------------------");
        System.out.println("Adicionar Produto Industrializado");
        System.out.println("Caso deseja cancelar, digite '0' em qualquer campo.");
        System.out.println("--------------------");

        boolean nomeValido = false;
        while(!nomeValido){
            try{
                System.out.print("Digite o nome do Produto: ");
                nome = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Nome inválido!");
            }

            if(nome.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(nome.length() == 0){
                System.out.println("Nome inválido!");
            }else{	
                nomeValido = true;
            }
        }

        boolean precoValido = false;
        while(!precoValido){
            try{
                System.out.print("Digite o preço do produto: ");
                preco = scanner.nextDouble();
            }catch(Exception e){
                System.out.println("Preço inválido!");
            }

            if(preco == 0){
                System.out.println("Cancelando...");
                return;
            }

            if(preco < 0){
                System.out.println("Preço inválido!");
            }else{	
                precoValido = true;
            }
        }

        boolean descricaoValida = false;
        while(!descricaoValida){
            try{
                System.out.print("Digite a descrição do produto: ");
                descricao = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Descrição inválida!");
            }

            if(descricao.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(descricao.length() == 0){
                System.out.println("Descrição inválida!");
            }else{	
                descricaoValida = true;
            }
        }

        boolean fabricanteValido = false;
        while(!fabricanteValido){
            try{
                System.out.print("Digite o fabricante do produto: ");
                fabricante = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Fabricante inválido!");
            }

            if(fabricante.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(fabricante.length() == 0){
                System.out.println("Fabricante inválido!");
            }else{	
                fabricanteValido = true;
            }
        }

        boolean dataDeFabricacaoValida = false;
        while(!dataDeFabricacaoValida){
            try{
                System.out.print("Digite a data de fabricação do produto: ");
                dataDeFabricacao = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Data de fabricação inválida!");
            }

            if(dataDeFabricacao.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(dataDeFabricacao.length() == 0){
                System.out.println("Data de fabricação inválida!");
            }else{	
                dataDeFabricacaoValida = true;
            }
        }

        boolean dataDeValidadeValida = false;
        while(!dataDeValidadeValida){
            try{
                System.out.print("Digite a data de validade do produto: ");
                dataDeValidade = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Data de validade inválida!");
            }

            if(dataDeValidade.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(dataDeValidade.length() == 0){
                System.out.println("Data de validade inválida!");
            }else{	
                dataDeValidadeValida = true;
            }
        }

        System.out.println("--------------------");
        System.out.println("Resumo dos dados inseridos: ");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Data de Fabricação: " + dataDeFabricacao);
        System.out.println("Data de Validade: " + dataDeValidade);
        System.out.println("--------------------");

        boolean opcaoValida = false;
        String op = null;
        ArrayList<String> opcoes = new ArrayList<String>(){
            {
                add("S");
                add("N");
            }
        };

        while(!opcaoValida){
            try{
                System.out.print("Confirmar? (S / N): ");
                op = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Opção inválida!");
            }

            if(!opcoes.contains(op)){
                System.out.println("Opção inválida, digite 'S' ou 'N'!");
            }else{
                opcaoValida = true;
            }
        }

        if(op.equals("N")){
            System.out.println("Cancelando...");
            return;
        }

        this.produtoIndustrializados.add(new produtoIndustrializado(id, nome, preco, descricao, fabricante, dataDeFabricacao, dataDeValidade));
        System.out.println("Produto Industrializado adicionado com sucesso!");
    }

    public void adicionarProdutoProduzido(Scanner scanner){
        int id = 0;
        String nome = null; 
        double preco = 0;
        String descricao = null;
        String fabricante = null; 
        String dataDeFabricacao = null; 
        String dataDeValidade = null;

        System.out.println("\n--------------------");
        System.out.println("Adicionar Produto Produzido");
        System.out.println("Caso deseja cancelar, digite '0' em qualquer campo.");
        System.out.println("--------------------");

        boolean nomeValido = false;
        while(!nomeValido){
            try{
                System.out.print("Digite o nome do Produto: ");
                nome = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Nome inválido!");
            }

            if(nome.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(nome.length() == 0){
                System.out.println("Nome inválido!");
            }else{	
                nomeValido = true;
            }
        }

        boolean precoValido = false;
        while(!precoValido){
            try{
                System.out.print("Digite o preço do produto: ");
                preco = scanner.nextDouble();
            }catch(Exception e){
                System.out.println("Preço inválido!");
            }

            if(preco == 0){
                System.out.println("Cancelando...");
                return;
            }

            if(preco < 0){
                System.out.println("Preço inválido!");
            }else{	
                precoValido = true;
            }
        }

        boolean descricaoValida = false;
        while(!descricaoValida){
            try{
                System.out.print("Digite a descrição do produto: ");
                descricao = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Descrição inválida!");
            }

            if(descricao.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(descricao.length() == 0){
                System.out.println("Descrição inválida!");
            }else{	
                descricaoValida = true;
            }
        }

        boolean fabricanteValido = false;
        while(!fabricanteValido){
            try{
                System.out.print("Digite o fabricante do produto: ");
                fabricante = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Fabricante inválido!");
            }

            if(fabricante.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(fabricante.length() == 0){
                System.out.println("Fabricante inválido!");
            }else{	
                fabricanteValido = true;
            }
        }

        boolean dataDeFabricacaoValida = false;
        while(!dataDeFabricacaoValida){
            try{
                System.out.print("Digite a data de fabricação do produto: ");
                dataDeFabricacao = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Data de fabricação inválida!");
            }

            if(dataDeFabricacao.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(dataDeFabricacao.length() == 0){
                System.out.println("Data de fabricação inválida!");
            }else{	
                dataDeFabricacaoValida = true;
            }
        }

        boolean dataDeValidadeValida = false;
        while(!dataDeValidadeValida){
            try{
                System.out.print("Digite a data de validade do produto: ");
                dataDeValidade = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Data de validade inválida!");
            }

            if(dataDeValidade.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(dataDeValidade.length() == 0){
                System.out.println("Data de validade inválida!");
            }else{	
                dataDeValidadeValida = true;
            }
        }

        System.out.println("--------------------");
        System.out.println("Resumo dos dados inseridos: ");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Data de Fabricação: " + dataDeFabricacao);
        System.out.println("Data de Validade: " + dataDeValidade);
        System.out.println("--------------------");

        boolean opcaoValida = false;
        String op = null;
        ArrayList<String> opcoes = new ArrayList<String>(){
            {
                add("S");
                add("N");
            }
        };

        while(!opcaoValida){
            try{
                System.out.print("Confirmar? (S / N): ");
                op = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Opção inválida!");
            }

            if(!opcoes.contains(op)){
                System.out.println("Opção inválida, digite 'S' ou 'N'!");
            }else{
                opcaoValida = true;
            }
        }

        if(op.equals("N")){
            System.out.println("Cancelando...");
            return;
        }

        this.produtoProduzido.add(new produtoProduzido(id, nome, preco, descricao, fabricante, dataDeFabricacao, dataDeValidade));
        System.out.println("Produto Industrializado adicionado com sucesso!");
    }

    public void adicionarIngrediente(Scanner scanner){
        int id = 0;
        String nome = null; 
        double preco = 0;
        String descricao = null;
        String fabricante = null; 
        String dataDeFabricacao = null; 
        String dataDeValidade = null;

        System.out.println("\n--------------------");
        System.out.println("Adicionar Produto Produzido");
        System.out.println("Caso deseja cancelar, digite '0' em qualquer campo.");
        System.out.println("--------------------");

        boolean nomeValido = false;
        while(!nomeValido){
            try{
                System.out.print("Digite o nome do Produto: ");
                nome = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Nome inválido!");
            }

            if(nome.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(nome.length() == 0){
                System.out.println("Nome inválido!");
            }else{	
                nomeValido = true;
            }
        }

        boolean precoValido = false;
        while(!precoValido){
            try{
                System.out.print("Digite o preço do produto: ");
                preco = scanner.nextDouble();
            }catch(Exception e){
                System.out.println("Preço inválido!");
            }

            if(preco == 0){
                System.out.println("Cancelando...");
                return;
            }

            if(preco < 0){
                System.out.println("Preço inválido!");
            }else{	
                precoValido = true;
            }
        }

        boolean descricaoValida = false;
        while(!descricaoValida){
            try{
                System.out.print("Digite a descrição do produto: ");
                descricao = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Descrição inválida!");
            }

            if(descricao.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(descricao.length() == 0){
                System.out.println("Descrição inválida!");
            }else{	
                descricaoValida = true;
            }
        }

        boolean fabricanteValido = false;
        while(!fabricanteValido){
            try{
                System.out.print("Digite o fabricante do produto: ");
                fabricante = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Fabricante inválido!");
            }

            if(fabricante.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(fabricante.length() == 0){
                System.out.println("Fabricante inválido!");
            }else{	
                fabricanteValido = true;
            }
        }

        boolean dataDeFabricacaoValida = false;
        while(!dataDeFabricacaoValida){
            try{
                System.out.print("Digite a data de fabricação do produto: ");
                dataDeFabricacao = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Data de fabricação inválida!");
            }

            if(dataDeFabricacao.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(dataDeFabricacao.length() == 0){
                System.out.println("Data de fabricação inválida!");
            }else{	
                dataDeFabricacaoValida = true;
            }
        }

        boolean dataDeValidadeValida = false;
        while(!dataDeValidadeValida){
            try{
                System.out.print("Digite a data de validade do produto: ");
                dataDeValidade = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Data de validade inválida!");
            }

            if(dataDeValidade.equals("0")){
                System.out.println("Cancelando...");
                return;
            }

            if(dataDeValidade.length() == 0){
                System.out.println("Data de validade inválida!");
            }else{	
                dataDeValidadeValida = true;
            }
        }

        System.out.println("--------------------");
        System.out.println("Resumo dos dados inseridos: ");
        System.out.println("Id: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Descrição: " + descricao);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Data de Fabricação: " + dataDeFabricacao);
        System.out.println("Data de Validade: " + dataDeValidade);
        System.out.println("--------------------");

        boolean opcaoValida = false;
        String op = null;
        ArrayList<String> opcoes = new ArrayList<String>(){
            {
                add("S");
                add("N");
            }
        };

        while(!opcaoValida){
            try{
                System.out.print("Confirmar? (S / N): ");
                op = scanner.nextLine();
            }catch(Exception e){
                System.out.println("Opção inválida!");
            }

            if(!opcoes.contains(op)){
                System.out.println("Opção inválida, digite 'S' ou 'N'!");
            }else{
                opcaoValida = true;
            }
        }

        if(op.equals("N")){
            System.out.println("Cancelando...");
            return;
        }

        this.ingredientes.add(new ingrediente(id, nome, preco, descricao, fabricante, dataDeFabricacao, dataDeValidade));
        System.out.println("Produto Industrializado adicionado com sucesso!");
    }

    public void removerProdutoIndustrializado(Scanner scanner) throws NoIdInDatabaseException{
        if(this.produtoIndustrializados.size() == 0){
            System.out.println("Não há produtos industrializados cadastrados!");
            return;
        }

        boolean idValido = false;
        boolean idEncontrado = false;
        int id = 0; 

        while(!idValido){
            try{
                System.out.println("Para cancelar digite '0'! \n" );
                System.out.print("Digite o id do produto industrializado: ");
                id = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Id inválido!");
            }

            if(id == 0){
                System.out.println("Cancelando...");
                return;
            }

            if(id < 0){
                System.out.println("Id inválido!");
            }else{
                idValido = true;
            }
        }

        for(int i = 0; i < this.produtoIndustrializados.size(); i++){
            if(this.produtoIndustrializados.get(i).getId()==0){
                boolean opValida = false;
                String op = null;
                ArrayList<String> ops = new ArrayList<String>(){
                    {
                        add("S");
                        add("N");
                    }
                };
                while(!opValida){
                    try{
                        System.out.print("Confirma a remoção do produto " + this.produtoIndustrializados.get(i).getNome() + "? (S / N): ");
                        op = scanner.nextLine();
                    }catch(Exception e){
                        System.out.println("Opção inválida!");
                    }

                    if(!ops.contains(op)){
                        System.out.println("Opção inválida, digite 'S' ou 'N'!");
                    }else{
                        opValida = true;
                    }
                }

                if(op.equals("N")){
                    System.out.println("Cancelando...");
                    return;
                }

                this.produtoIndustrializados.remove(i);
                idEncontrado = true;
                break;
            }
        }

        if(idEncontrado){
            System.out.println("Produto removido com sucesso!");
        }else{
            throw new NoIdInDatabaseException("Id não encontrado no banco de dados!", id);
        }
    }

    public void removerProdutoProduzido(Scanner scanner) throws NoIdInDatabaseException{
        if(this.produtoProduzido.size() == 0){
            System.out.println("Não há Produtos Produzidos cadastrados!");
            return;
        }

        boolean idValido = false;
        boolean idEncontrado = false;
        int id = 0; 

        while(!idValido){
            try{
                System.out.println("Para cancelar digite '0'! \n" );
                System.out.print("Digite o id do Produto Produzido: ");
                id = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Id inválido!");
            }

            if(id == 0){
                System.out.println("Cancelando...");
                return;
            }

            if(id < 0){
                System.out.println("Id inválido!");
            }else{
                idValido = true;
            }
        }

        for(int i = 0; i < this.produtoProduzido.size(); i++){
            if(this.produtoProduzido.get(i).getId()==0){
                boolean opValida = false;
                String op = null;
                ArrayList<String> ops = new ArrayList<String>(){
                    {
                        add("S");
                        add("N");
                    }
                };
                while(!opValida){
                    try{
                        System.out.print("Confirma a remoção do produto " + this.produtoProduzido.get(i).getNome() + "? (S / N): ");
                        op = scanner.nextLine();
                    }catch(Exception e){
                        System.out.println("Opção inválida!");
                    }

                    if(!ops.contains(op)){
                        System.out.println("Opção inválida, digite 'S' ou 'N'!");
                    }else{
                        opValida = true;
                    }
                }

                if(op.equals("N")){
                    System.out.println("Cancelando...");
                    return;
                }

                this.produtoProduzido.remove(i);
                idEncontrado = true;
                break;
            }
        }

        if(idEncontrado){
            System.out.println("Produto removido com sucesso!");
        }else{
            throw new NoIdInDatabaseException("Id não encontrado no banco de dados!", id);
        }
    }

    public void removerIngrediente(Scanner scanner) throws NoIdInDatabaseException{
        if(this.ingredientes.size() == 0){
            System.out.println("Não há Ingredientes cadastrados!");
            return;
        }

        boolean idValido = false;
        boolean idEncontrado = false;
        int id = 0; 

        while(!idValido){
            try{
                System.out.println("Para cancelar digite '0'! \n" );
                System.out.print("Digite o id do Ingrediente: ");
                id = scanner.nextInt();
            }catch(Exception e){
                System.out.println("Id inválido!");
            }

            if(id == 0){
                System.out.println("Cancelando...");
                return;
            }

            if(id < 0){
                System.out.println("Id inválido!");
            }else{
                idValido = true;
            }
        }

        for(int i = 0; i < this.ingredientes.size(); i++){
            if(this.ingredientes.get(i).getId()==0){
                boolean opValida = false;
                String op = null;
                ArrayList<String> ops = new ArrayList<String>(){
                    {
                        add("S");
                        add("N");
                    }
                };
                while(!opValida){
                    try{
                        System.out.print("Confirma a remoção do ingrediente " + this.ingredientes.get(i).getNome() + "? (S / N): ");
                        op = scanner.nextLine();
                    }catch(Exception e){
                        System.out.println("Opção inválida!");
                    }

                    if(!ops.contains(op)){
                        System.out.println("Opção inválida, digite 'S' ou 'N'!");
                    }else{
                        opValida = true;
                    }
                }

                if(op.equals("N")){
                    System.out.println("Cancelando...");
                    return;
                }

                this.produtoProduzido.remove(i);
                idEncontrado = true;
                break;
            }
        }

        if(idEncontrado){
            System.out.println("Ingrediente removido com sucesso!");
        }else{
            throw new NoIdInDatabaseException("Id não encontrado no banco de dados!", id);
        }
    }
}
