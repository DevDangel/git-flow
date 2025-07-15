public class Main {
    
    protected final double SALARIO_BASE = 30000;
    protected final double HORA_EXTRA = 5000;
    
    public double calcularSalario(int hora){
        double calcular = hora * SALARIO_BASE;
        return calcular;
    }
    public double calcularPrima(){
        double prima = this.calcularSalario(0) * 30 * 12;
        return prima;
    }
}
