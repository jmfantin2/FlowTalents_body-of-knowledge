public class Cliente {
  private String nome;
  private Compra compra;

  public Cliente(String nome, Compra compra) {
    this.nome = nome;
    this.compra = compra;
  }

  public String getNome() {
    return nome;
  }

  public Compra getCompra() {
    return compra;
  }
}
