package srcCorrigido.interfaces;

import model.Produto;

public interface IFornecedor extends InteracaoUsuario {
    void adicionarNovoEstoque(Produto produto, int quantidade);
    void atualizarEstoque(Produto produto, int quantidade);
}