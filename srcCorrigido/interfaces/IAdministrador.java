package srcCorrigido.interfaces;

import model.Produto;

public interface IAdministrador extends InteracaoUsuario {
    void adicionarProduto(Produto produto);
    void removerProduto(Produto produto);
    void processarPedido(int numeroPedido);
}

