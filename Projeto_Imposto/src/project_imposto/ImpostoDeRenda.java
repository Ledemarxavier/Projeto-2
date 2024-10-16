package project_imposto;
import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);

	        // Leitura dos dados de entrada
	        System.out.print("Renda anual com salário: ");
	        double rendaSalario = scanner.nextDouble();

	        System.out.print("Renda anual com prestação de serviço: ");
	        double rendaServico = scanner.nextDouble();

	        System.out.print("Renda anual com ganho de capital: ");
	        double ganhoCapital = scanner.nextDouble();

	        System.out.print("Gastos médicos: ");
	        double gastosMedicos = scanner.nextDouble();

	        System.out.print("Gastos educacionais: ");
	        double gastosEducacionais = scanner.nextDouble();

	        // Cálculo do imposto sobre o salário
	        double salarioMensal = rendaSalario / 12;
	        double impostoSalario = 0;

	        if (salarioMensal >= 5000) {
	            impostoSalario = rendaSalario * 0.20;
	        } else if (salarioMensal >= 3000 && salarioMensal < 5000) {
	            impostoSalario = rendaSalario * 0.10;
	        }

	        // Cálculo do imposto sobre a prestação de serviços
	        double impostoServico = rendaServico * 0.15;

	        // Cálculo do imposto sobre o ganho de capital
	        double impostoGanhoCapital = ganhoCapital * 0.20;

	        // Imposto bruto total
	        double impostoBruto = impostoSalario + impostoServico + impostoGanhoCapital;

	        // Cálculo das deduções
	        double maxDedutivel = impostoBruto * 0.30;
	        double gastosDedutiveis = Math.min(gastosMedicos + gastosEducacionais, maxDedutivel);

	        // Cálculo do imposto devido
	        double impostoDevido = impostoBruto - gastosDedutiveis;

	        // Geração do relatório
	        System.out.println("\n### RELATÓRIO DE IMPOSTO DE RENDA ###");
	        System.out.println("* CONSOLIDADO DE RENDA:");
	        System.out.printf("Imposto sobre salário: %.2f\n", impostoSalario);
	        System.out.printf("Imposto sobre serviços: %.2f\n", impostoServico);
	        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoGanhoCapital);

	        System.out.println("\n* DEDUÇÕES:");
	        System.out.printf("Máximo dedutível: %.2f\n", maxDedutivel);
	        System.out.printf("Gastos dedutíveis: %.2f\n", gastosDedutiveis);

	        System.out.println("\n* RESUMO:");
	        System.out.printf("Imposto bruto total: %.2f\n", impostoBruto);
	        System.out.printf("Abatimento: %.2f\n", gastosDedutiveis);
	        System.out.printf("Imposto devido: %.2f\n", impostoDevido);

	        scanner.close();

	}

}
