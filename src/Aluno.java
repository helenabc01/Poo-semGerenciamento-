public class Aluno {
    String nome;
    int idade;
    float n1;
    float n2;
    int faltas;
    int matricula;

    String media(float n1, float n2){
        if((n1 + n2)/2 > 7){
            return "passou";
        } else {
            return "reprovou";
        }
    }
}
