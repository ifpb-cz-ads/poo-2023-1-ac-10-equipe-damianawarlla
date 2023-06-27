/**
 * RegistraAluno
 */
public class RegistraAluno {

    private String nome;
    private String endereco;
    private int matricula;

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    private float nota1;
    private float nota2;
    private float nota3;
   
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void imprimir (){
        System.out.println("Nome " + nome);
        System.out.println("endereço " + endereco);
        System.out.println("matricula " + matricula);
    }
    public void imprimir ( float nota1, float nota2, float nota3){
        System.out.println(" nome " + nome);
        System.out.println(" nota 1 " + nota1);
        System.out.println(" nota 2 " + nota2);
        System.out.println(" nota 3 " + nota3);
    }
}
