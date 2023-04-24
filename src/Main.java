import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Conta conta007 = new Conta();
        conta007.nome = "Justin";
        conta007.limite = 912;
        conta007.numero = 790;
        conta007.saldo = 733;

        System.out.println("Numero: " + conta007.numero + "\nNome: "+ conta007.nome +"\n");

        Cliente cliente09 = new Cliente();
        cliente09.cpf = "9876543";
        cliente09.nome = "Carlos";
        cliente09.estadoCivil = 'c';
        cliente09.idade = 51;

        System.out.println(cliente09.cpf +"\n"+ cliente09.nome +"\n"+ cliente09.estadoCivil +"\n"+ cliente09.idade);

        Personagem personagem01 = new Personagem();
        personagem01.codigo = (int) (Math.random() * 1000);
        personagem01.nome = "Gabriel";
        personagem01.dinheiro = 150.50;
        personagem01.forca = 7;
        personagem01.saude = 9;
        System.out.println("Id: " + personagem01.codigo + "\nNome: " + personagem01.nome + "\nDinheiro: R$" + personagem01.dinheiro + "\nSaúde inicial: " + personagem01.saude + "\nForça inicial: " + personagem01.forca);

        System.out.println(conta007.debitarSaldo(300));
        System.out.println(conta007.saldo);



    }
}