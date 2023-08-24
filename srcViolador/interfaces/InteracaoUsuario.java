package interfaces;

import model.*;

public interface InteracaoUsuario {
    void visualizarProdutos();
    void adicionarAoCarrinho(Produto produto);
    void visualizarCarrinho();
    void finalizarCompra();
    void visualizarPedidos();
    void cancelarPedido(int numeroPedido);
    void alterarSenha(String novaSenha);
    void visualizarPerfil();
    void editarPerfil(String novoNome, String novoEmail);
    void escreverAvaliacao(Produto produto, String avaliacao);
    void avaliarProduto(Produto produto, int avaliacao);
    void adicionarProduto(Produto produto);
    void removerProduto(Produto produto);
    void processarPedido(int numeroPedido);
}
