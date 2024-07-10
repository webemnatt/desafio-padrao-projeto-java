/**
 * Interface de meio de pagamento com o único método de processar pagamento.
 *
 * @author webemnatt
 * @version 1.0.0
 * @since 24.07.10
 */
public interface PagamentoStrategy {
  /**
   * Método de processar o pagamento.
   * 
   * @param valor valor a ser recebido do tipo double.
   */
  public void processarPagamento(double valor);
}
