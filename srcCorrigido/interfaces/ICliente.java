package srcCorrigido.interfaces;

import model.Produto;

public interface ICliente extends InteracaoUsuario {
    void escreverAvaliacao(Produto produto, String avaliacao);
    void avaliarProduto(Produto produto, int avaliacao);
}