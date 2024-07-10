/**
 * Classe do sistema de pagamentos com construtor default e dois métodos:
 * selecionar o meio de pagamento e realizar o pagamento.
 *
 * @author webemnatt
 * @version 1.0.0
 * @since 24.07.10
 */

public class SistemaDePagamentos {
  /**
   * Atributo meioDePagamento encapsulado para que somente esta classse o acesse.
   */
  private PagamentoStrategy meioDePagamento;

  /**
   * Método para selecionar o meio de pagamento (EmEspecie, CartaoDebito,
   * CartaoCredito, Pix, PicPay)
   * 
   * @param meioDePagamento do tipo da Interface PagamentosStrategy
   */
  public void SetMeioDePagamento(PagamentoStrategy meioDePagamento) {
    this.meioDePagamento = meioDePagamento;
  }

  /**
   * Método para efetivar o pagamento, fazendo uso do método processarPagamento da
   * interface.
   * 
   * @param valor
   */
  public void realizarPagamento(double valor) {
    meioDePagamento.processarPagamento(valor);
  }

}
