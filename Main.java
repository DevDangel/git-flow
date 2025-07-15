public class Main {
    
    protected final double SALARIO_BASE = 30000;
    protected final double HORA_EXTRA = 5000;
    
    public double calcularSalario(int hora){
        double calcular = hora * SALARIO_BASE;
        return calcular;
    }
}
