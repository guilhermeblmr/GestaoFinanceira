import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Gasto> gastos = new ArrayList<>();
        gastos.add(new Gasto("Alimentação", new Date(), 500.0, "Débito"));
        gastos.add(new Gasto("Faculdade", new Date(), 1303.0, "Débito"));
        gastos.add(new Gasto("Lazer", new Date(), 100.0, "Débito"));
        gastos.add(new Gasto("Computador", new Date(), 630.0, "Crédito"));

        List<Ganho> ganhos = new ArrayList<>();
        ganhos.add(new Ganho("Salário", new Date(), 1800.0));
        ganhos.add(new Ganho("Freelance", new Date(), 300.0));
        ganhos.add(new Ganho("Investimentos", new Date(), 1000.0));

        String run;

        do {
            run = "no";
            
            System.out.println("selecione uma das opções:");
            System.out.println("=========================");
            System.out.println("1 - Gerar relatório de gastos");
            System.out.println("2 - Gerar relatório de ganhos");
            System.out.println("3 - Gerar relatório de mensal");
            System.out.println("4 - Sair");
            System.out.println("=========================");

            Scanner scanner = new Scanner(System.in);

            int choice = scanner.nextInt();

            Relatorio relatorio = new Relatorio();

            switch (choice) {
                case 1:
                    relatorio.gerarRelatorioDespesas(gastos);
                    run = scanner.nextLine();
                    break;
                case 2:
                    relatorio.gerarRelatorioReceitas(ganhos);
                    run = scanner.nextLine();
                    break;
                case 3:
                    relatorio.gerarRelatorioSaldoMensal(ganhos, gastos);
                    break;
                case 4:
                    break;
                default:
                System.out.println("Opção invalida!");

            }
            System.out.println("Deseja continuar? (sim/não)");
            run = scanner.nextLine();
            }while (run.equals("sim") );
            
            System.out.println("Finalizando...");

    }
}