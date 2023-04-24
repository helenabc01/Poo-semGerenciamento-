public class Cliente {
    String cpf;
    String nome;
    char estadoCivil;
    int idade;
    String verificarMaiorIdade(){
        if (idade >= 18){
            return "parabéns, vc ja pode ser preso!";
        } else {
            return "que pena, vc n pode ser preso :/";
        }
    }
    boolean comparaNomes(String args){
        if (args == this.nome){
            return true;
        } else {
            return false;
        }
    }

}
