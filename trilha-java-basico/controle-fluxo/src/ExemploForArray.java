public class ExemploForArray {
    public static void main(String[] args) {

        // em arrays o indice se inicia em 0
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int i=0; i < alunos.length; i++){
            System.out.println("O aluno no indice i = " + i + "é o aluno "+ alunos[i]);
        }

        for (String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
