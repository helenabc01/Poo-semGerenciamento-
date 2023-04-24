public class Personagem {
    int codigo;
    String nome;
    int forca;
    int saude;
    double dinheiro;

    void andar() {
        this.saude = this.saude + 1;
    }

    void correr() {
        this.saude = this.saude + 1;
        this.forca = this.forca + 1;
    }

    boolean defender() {
        if (this.saude > 0) {
            this.saude = this.saude - 1;
            return true;
        } else {
            return false;
        }
    }

    boolean atacar() {
        if (this.saude > 0 && this.forca > 0) {
            this.saude = this.saude - 1;
            this.forca = this.forca - 1;
            return true;
        } else {
            return false;
        }
    }

    void vender(double dinheiroVenda){
        this.dinheiro = this.dinheiro + dinheiroVenda;
    }
    boolean comprar(double valorComprar){
        if(this.dinheiro - valorComprar > 0){
            this.dinheiro = this.dinheiro - valorComprar;
            return true;
        } else {
            return false;
        }
    }
}
