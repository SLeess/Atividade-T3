package srcCorrigido.interfaces;

import srcCorrigido.model.*;

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
}
