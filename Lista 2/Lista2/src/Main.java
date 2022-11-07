import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<TContaBancaria> contas = new ArrayList <TContaBancaria>();
		TContaBancaria conta_encontrada = null;
		TContaBancaria conta_encontrada_transferencia = null;
		int num_conta_desejada;
		int num_agencia_desejada;
		double saldo_sacado;
		double saldo_atual;
		double saldo_depositado;
		double saldo_transferido;
		String nome_conta;
		boolean x = true;
		
		while(x == true){
			
			System.out.println("Selecione a função desejada: ");
			System.out.println("1 - Inicicar uma nova conta");
			System.out.println("2 - Depositar valores");
			System.out.println("3 - Saque");
			System.out.println("4 - Exibir seu saldo");
			System.out.println("5 - Transferência");
			System.out.println("6 - Sair");
			System.out.println();
			
			System.out.print("Sua opção (1, 2, 3, 4, 5, 6): ");
			int opcao = entrada.nextInt();
			System.out.println();
			
			switch(opcao) {
			
				case 1:
					TContaBancaria conta = new TContaBancaria();
					
					System.out.print("Digite sua conta: ");
					int num_conta = entrada.nextInt(); 
					conta.setNumero(num_conta);
					
					System.out.print("Digite sua agencia: ");
					int num_agencia = entrada.nextInt(); 
					conta.setAgencia(num_agencia);

					System.out.print("Digite seu nome: ");
					String nome_da_conta = entrada.next(); 
					conta.setNome(nome_da_conta);
					
					System.out.print("Digite seu CPF: ");
					int num_cpf = entrada.nextInt(); 
					conta.setCpf(num_cpf);

					System.out.print("Digite seu saldo: ");
					double num_saldo = entrada.nextDouble(); 
					conta.setSaldo(num_saldo);
					System.out.println();
					
					contas.add(conta);
					
					break;
					
				case 2:
					System.out.println("Digite o numero e agencia da conta desejada:");
					System.out.print("Conta: ");
					num_conta_desejada = entrada.nextInt();
					
					System.out.print("Agencia: ");
					num_agencia_desejada = entrada.nextInt();
					System.out.println();
					
					for (TContaBancaria conta_loop: contas) {
						if ((num_conta_desejada == conta_loop.getNumero()) && (num_agencia_desejada == conta_loop.getAgencia())){
							conta_encontrada = conta_loop;
							
						}
					}
					
					saldo_atual = conta_encontrada.getSaldo();
					nome_conta = conta_encontrada.getNome(); 
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					
					System.out.print("Digite o valor a ser depositado: R$");
					saldo_depositado = entrada.nextDouble();
					System.out.println();
					conta_encontrada.setSaldo(saldo_atual + saldo_depositado);
					
					saldo_atual = conta_encontrada.getSaldo();
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					System.out.println();
					
					break;
				
				case 3:
					System.out.println("Digite o numero e agencia da conta desejada:");
					System.out.print("Conta: ");
					num_conta_desejada = entrada.nextInt();
					
					System.out.print("Agencia: ");
					num_agencia_desejada = entrada.nextInt();
					System.out.println();
					
					for (TContaBancaria conta_loop: contas) {
						if ((num_conta_desejada == conta_loop.getNumero()) && (num_agencia_desejada == conta_loop.getAgencia())){
							conta_encontrada = conta_loop;
							
						}
					}
					
					saldo_atual = conta_encontrada.getSaldo();
					nome_conta = conta_encontrada.getNome(); 
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					System.out.println();
					
					System.out.print("Digite o valor a ser retirado: R$");
					saldo_sacado = entrada.nextDouble();
					System.out.println();
					conta_encontrada.setSaldo(saldo_atual - saldo_sacado);
					
					saldo_atual = conta_encontrada.getSaldo();
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					System.out.println();
					
					break;
					
				case 4:
					System.out.println("Digite o numero e agencia da conta desejada:");
					System.out.print("Conta: ");
					num_conta_desejada = entrada.nextInt();

					System.out.print("Agencia: ");
					num_agencia_desejada = entrada.nextInt();
					System.out.println();
					
					for (TContaBancaria conta_loop: contas) {
						if ((num_conta_desejada == conta_loop.getNumero()) && (num_agencia_desejada == conta_loop.getAgencia())){
							conta_encontrada = conta_loop;
							
						}
					}
					
					saldo_atual = conta_encontrada.getSaldo();
					nome_conta = conta_encontrada.getNome(); 
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					System.out.println();
					
					break;
					
				case 5: 
					System.out.println("Digite o numero e agencia da sua conta:");
					System.out.print("Conta: ");
					num_conta_desejada = entrada.nextInt();
					
					System.out.print("Agencia: ");
					num_agencia_desejada = entrada.nextInt();
					System.out.println();
					
					for (TContaBancaria conta_loop: contas) {
						if ((num_conta_desejada == conta_loop.getNumero()) && (num_agencia_desejada == conta_loop.getAgencia())){
							conta_encontrada = conta_loop;
							
						}
					}
					
					saldo_atual = conta_encontrada.getSaldo();
					nome_conta = conta_encontrada.getNome(); 
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					System.out.println();
					
					System.out.print("Digite o valor a ser retirado: R$");
					saldo_transferido = entrada.nextDouble();
					System.out.println();
					conta_encontrada.setSaldo(saldo_atual - saldo_transferido);
					
					saldo_atual = conta_encontrada.getSaldo();
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					System.out.println();
					
					System.out.println("Digite o numero e agee cia da conta a ser transferida:");
					System.out.print("Conta: ");
					num_conta_desejada = entrada.nextInt();
					
					System.out.print("Agencia: ");
					num_agencia_desejada = entrada.nextInt();
					System.out.println();
					
					for (TContaBancaria conta_loop1: contas) {
						if ((num_conta_desejada == conta_loop1.getNumero()) && (num_agencia_desejada == conta_loop1.getAgencia())){
							conta_encontrada_transferencia = conta_loop1;
							
						}
					}
					
					saldo_atual = conta_encontrada_transferencia.getSaldo();
					nome_conta = conta_encontrada_transferencia.getNome();
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					System.out.println();
					
					System.out.print("Valor recebido: R$" + saldo_transferido);
					conta_encontrada_transferencia.setSaldo(saldo_atual + saldo_transferido);
					System.out.println();
					
					saldo_atual = conta_encontrada_transferencia.getSaldo();
					System.out.println(nome_conta + ", seu saldo atual é: R$" + saldo_atual);
					System.out.println();
					
					break;
					
				case 6:
					x = false;
					break;
			}
		}
		
		entrada.close();
		
	}

}
