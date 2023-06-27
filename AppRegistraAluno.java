/**
 * AppRegistraAluno
 */
public class AppRegistraAluno {

    public static void main(String[] args) {
        RegistraAluno registra = new RegistraAluno();
        registra.setNome("jubileu");
        registra.setEndereco("cajazeiras");
        registra.setMatricula(1234);
        registra.imprimir();
    }
}