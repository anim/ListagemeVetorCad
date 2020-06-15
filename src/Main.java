
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Funcionario vetor[] = new Funcionario[10];
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i <= 9; i++){
            Funcionario funcionario = new Funcionario();
            
            System.out.println("Digite a matricula do funcionario: ");
            funcionario.setMatricula(scan.nextInt());
            System.out.println("Digite o Nome do funcionario: ");
            funcionario.setNome(scan.next());
            System.out.println("Digite a data de admissao: ");
            funcionario.setAdmissao(scan.nextInt());
            System.out.println("Digite o salario: ");
            funcionario.setSalario(scan.nextInt());
            
            vetor[i] = funcionario;
        }
        
        System.out.println("DADOS DOS FUNCIONARIOS");
        for (int i = 0; i <= 9; i++){
            System.out.println("Matricula do Funcionario: " + vetor[i].getMatricula());
            System.out.println("Nome Funcionario: " + vetor[i].getNome());
            System.out.println("Data de Admissao: " + vetor[i].getAdmissao());
            System.out.println("Valor do salário: " + vetor[i].getSalario());
            System.out.println("\n");
        }
        
    }
}
