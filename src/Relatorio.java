import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Relatorio {
    public void gerarRelatorioDespesas(List<Gasto> gastos) {
        double total = 0.0;
        System.out.println("Relatório de Despesas");
        System.out.println("---------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Gasto gasto : gastos) {
            String formatDate = sdf.format(gasto.getData());
            System.out.println("Tipo: " + gasto.getTipo());
            System.out.println("Data: " + formatDate);
            System.out.println("Valor: " + gasto.getValor());
            System.out.println("Forma de Pagamento: " + gasto.getFormaPagamento());
            System.out.println();
            total += gasto.getValor();
        }
        System.out.println("Total de Despesas: " + total);
        System.out.println();
    }

    public void gerarRelatorioReceitas(List<Ganho> ganhos) {
        double total = 0.0;
        System.out.println("Relatório de Receitas");
        System.out.println("---------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (Ganho ganho : ganhos) {
            String formatDate = sdf.format(ganho.getData());
            System.out.println("Tipo: " + ganho.getTipo());
            System.out.println("Data: " + formatDate);
            System.out.println("Valor: " + ganho.getValor());
            System.out.println();
            total += ganho.getValor();
        }
    }
public void gerarRelatorioSaldoMensal(List<Ganho> ganhos, List<Gasto> gastos) {
        double totalGanhos = 0.0;
        double totalGastos = 0.0;
        for (Ganho ganho : ganhos) {
            totalGanhos += ganho.getValor();
        }
        for (Gasto gasto : gastos) {
            totalGastos += gasto.getValor();
        }
        double saldo = totalGanhos - totalGastos;
        System.out.println("Relatório de Saldo Mensal");
        System.out.println("-------------------------");
        System.out.println("Total de Receitas: " + totalGanhos);
        System.out.println("Total de Despesas: " + totalGastos);
        System.out.println("Saldo: " + saldo);
        System.out.println();
    }


}