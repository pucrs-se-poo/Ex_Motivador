public class Funcionario {
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    
    public Funcionario(String matricula, String nome, double salarioBruto){
        this.matricula = matricula;
        this.nome = nome;
        this. salarioBruto = salarioBruto;
    }

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){
        if (salarioBruto <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = salarioBruto - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    public double getSalarioLiquido(){
        return salarioBruto - getINSS() - getImpRenda();
    }
}