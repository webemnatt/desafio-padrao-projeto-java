/**
 * Classe de teste do sistema de pagamentos.
 * Instanciado primeiro os meios de pagamento.
 * Instanciado em seguida o sistema de pagamentos da loja.
 * Selecionado o meio de pagamento para aquele pagamento.
 * Chamado o sistema de pagamento para realizar o pagamento em si.
 * 
 * @author webemnatt
 * @version 1.0.0
 * @since 24.07.10
 */

public class SistemaDePagamentosTest {
    public static void main(String[] args) throws Exception {
        PagamentoStrategy picpay = new PicPay();
        PagamentoStrategy pix = new Pix();
        PagamentoStrategy cartaoCredito = new CartaoCredito();
        PagamentoStrategy cartaoDebito = new CartaoDebito();
        PagamentoStrategy especie = new EmEspecie();

        SistemaDePagamentos sistemaDePagamentos = new SistemaDePagamentos();
        double valor1 = 100.0;
        sistemaDePagamentos.SetMeioDePagamento(especie);
        sistemaDePagamentos.realizarPagamento(valor1);

        double valor2 = 1_000.0;
        sistemaDePagamentos.SetMeioDePagamento(picpay);
        sistemaDePagamentos.realizarPagamento(valor2);

        double valor3 = 5_000.0;
        sistemaDePagamentos.SetMeioDePagamento(cartaoCredito);
        sistemaDePagamentos.realizarPagamento(valor3);

        double valor4 = 60.0;
        sistemaDePagamentos.SetMeioDePagamento(cartaoDebito);
        sistemaDePagamentos.realizarPagamento(valor4);

        double valor5 = 25.0;
        sistemaDePagamentos.SetMeioDePagamento(pix);
        sistemaDePagamentos.realizarPagamento(valor5);

    }
}
