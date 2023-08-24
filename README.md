# Atividade-T3
Ambiente de controle do software desenvolvido para a apresentação

## Contexto

O código fonte apresenta um exemplo de aplicação do princípio de *Segregação de Interfaces* em um cenário de comércio eletrônico. Ele define interfaces gerais de interação de usuários, que incluem uma variedade de métodos relacionados a visualizar produtos, gerenciar carrinho de compras, finalizar pedidos, entre outros. 

Para evitar interfaces grandes e genéricas, o código divide essas interfaces em categorias específicas para diferentes tipos de usuários: clientes e administradores. Cada uma dessas interfaces especializadas estende a interface geral e adiciona apenas os métodos relevantes ao papel específico do usuário. 

Dessa forma, o princípio de Segregação de Interfaces é aplicado, garantindo que as classes implementem **apenas os métodos pertinentes a suas funcionalidades**, tornando o código mais modular, legível e adaptável às diferentes necessidades dos usuários.