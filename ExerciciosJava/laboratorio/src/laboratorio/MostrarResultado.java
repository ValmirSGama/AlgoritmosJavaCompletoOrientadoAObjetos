package laboratorio;

public class MostrarResultado {

	 System.out.println("Colesterol HDL: " + quantidadeHDL + " mg/dL (Risco " + risco + ")");
     System.out.println("Colesterol LDL: " + quantidadeLDL + " mg/dL (Risco " + risco + ")");
 

 // Método para cadastrar o resultado do exame de colesterol
 public void cadastrarExame(double quantidadeLDL, double quantidadeHDL) {
     this.quantidadeLDL = quantidadeLDL;
     this.quantidadeHDL = quantidadeHDL;
     calcularRisco();
 }

}
