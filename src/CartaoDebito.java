/**
 * Classe que representa o meio de pagamento Cartão de Débito.
 * Esta classe estende a interface PagamentoStrategy
 * Sobrescreve o método processarPagamento da interface.
 * É um dos meios de pagamentos disponiveis neste App.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 24.07.10
 */
public class CartaoDebito implements PagamentoStrategy {

  @Override
  public void processarPagamento(double valor) {
    System.out.println("Processando meio de pagamento cartão de débito:" + valor);
  }

}