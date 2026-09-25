**Ex01 — Decisões arquiteturais**



O teste utilizado é o \*\*custo de reverter a decisão\*\*. Quanto maior o impacto de uma decisão sobre a estrutura do sistema e quanto mais difícil for alterá-la posteriormente, maior a chance de ela ser arquitetural.



| **Decisão**                                                                                            | **Classificação**        | **Atributo de qualidade** |

| -------------------------------------------------------------------------------------------------- | -------------------- | --------------------- |

| (a) Usar o mesmo banco para prontuário e dados administrativos                                     | Arquitetural         | Segurança         |

| (b) Adotar a biblioteca X para gerar PDF                                                           | Não arquitetural     | —                     |

| (c) O sistema continuar operando com o ERP fora do ar                                              | Arquitetural         | Disponibilidade   |

| (d) Padronizar o nome dos arquivos de log                                                          | Não arquitetural     | —                     |

| (e) Dividir o sistema em dois serviços implantados separadamente                                   | Arquitetural         | Modificabilidade  |

| (f) Trocar a fonte da interface                                                                    | Não arquitetural     | —                     |

| (g) Guardar o pedido no aparelho do entregador enquanto não houver sinal, e sincronizar depois     | Arquitetural         | Disponibilidade   |

| (h) Adotar um padrão de indentação para todo o código do projeto                                   | Não arquitetural     | —                     |



**Decisões arquiteturais

(a) Mesmo banco para prontuário e dados administrativos — Segurança**

A decisão influencia o isolamento dos dados e os controles de acesso. Como o prontuário possui informações sensíveis, separar ou compartilhar a infraestrutura de armazenamento pode ter impacto significativo sobre a segurança do sistema.



**(c) Operar com o ERP fora do ar — Disponibilidade**

Essa decisão define como o sistema se comportará diante da indisponibilidade de uma dependência externa. Permitir operação temporária sem o ERP exige mecanismos de armazenamento, sincronização e tratamento de inconsistências.



**(e) Dois serviços implantados separadamente — Modificabilidade**

Separar componentes em serviços independentes modifica a estrutura de implantação e a forma como as partes do sistema evoluem e se comunicam. A decisão pode facilitar alterações independentes, mas também introduz complexidade de comunicação e operação.



**(g) Armazenar o pedido no dispositivo e sincronizar posteriormente — Disponibilidade**

A estratégia permite que o sistema continue funcionando mesmo quando o entregador estiver sem conexão. Isso muda o comportamento arquitetural do sistema, introduzindo armazenamento local, sincronização posterior e tratamento de possíveis conflitos.



**Conclusão**



As quatro decisões arquiteturais não são definidas pelo nome de uma tecnologia específica. Elas estabelecem \*\*propriedades estruturais e comportamentais do sistema\*\*, afetando atributos como segurança, disponibilidade e modificabilidade.


\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**Ex02 — Arquitetura em camadas**



**Projeto: Delivery de Restaurante do Bairro**



flowchart TD 

&#x09;A\[Camada de Apresentação<br/>Web / Aplicativo] --> B\[Camada de Negócio<br/>Regras do Delivery] 

&#x09;B --> C\[Camada de Dados<br/>Persistência] 

&#x09;C --> D\[(Banco de Dados)]



**Regra do estilo**



Na arquitetura em camadas, cada camada deve depender somente das camadas imediatamente inferiores, mantendo responsabilidades separadas.



Assim:



**Apresentação → Negócio → Dados → Banco de Dados**


A camada de apresentação não deve acessar diretamente o banco de dados, e as regras de negócio não devem ficar espalhadas na interface.



**Exemplo concreto de violação**



Imagine que, para implementar rapidamente a tela de acompanhamento do pedido, um desenvolvedor coloque no código da interface uma consulta SQL diretamente no banco:



Tela de acompanhamento

&#x20;       ↓

&#x20;   SQL direto

&#x20;       ↓

Banco de Dados





Isso seria uma violação porque a **camada de apresentação estaria pulando a camada de negócio e a camada de dados**.



Um atalho desse tipo pode parecer conveniente para uma consulta simples, mas cria acoplamento entre a interface e o banco, dificultando futuras mudanças na estrutura de dados.



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**Ex03 — Microsserviços no Marketplace de Serviços Autônomos**



**Resposta como gerente**



Antes de decidir pela adoção de microsserviços, eu faria a seguinte pergunta:



> \*\*Qual problema concreto de escalabilidade o marketplace possui que não pode ser resolvido adequadamente com uma aplicação modular implantada como um único serviço?\*\*



A proposta apresentada afirma que microsserviços proporcionariam escalabilidade, mas isso não é suficiente para justificar a decisão arquitetural.



Precisamos saber, por exemplo:



* qual componente terá necessidade de escalar de forma independente;
* qual volume de usuários ou transações é esperado;
* quais partes do sistema terão cargas muito diferentes;
* quais são os requisitos de disponibilidade;
* quais são os limites esperados de crescimento;
* qual problema da arquitetura atual motivaria a separação.



**Custo da proposta**



Para uma equipe de apenas três pessoas, microsserviços podem trazer custos operacionais e de desenvolvimento importantes:



* mais componentes para desenvolver e manter;
* comunicação entre serviços;
* configuração de infraestrutura;
* monitoramento distribuído;
* tratamento de falhas de rede;
* gerenciamento de deploys independentes;
* maior dificuldade para depuração;
* necessidade de definir contratos entre serviços.



Portanto, a proposta não deve ser rejeitada simplesmente por utilizar microsserviços, mas precisa demonstrar que o benefício esperado compensa essa complexidade.



**Quando passaria a fazer sentido**



A proposta passaria a fazer sentido se a equipe apresentasse \*\*um requisito concreto de escalabilidade ou isolamento\*\* que justificasse a separação.



Por exemplo, se o marketplace demonstrasse que o serviço de busca recebe uma carga muito superior à de outras funcionalidades e precisa ser escalado independentemente, poderíamos avaliar a separação desse componente.



Nesse caso, a decisão estaria baseada em uma necessidade arquitetural identificável, e não simplesmente na preferência por microsserviços.



**Decisão**



Não aprovaria nem recusaria a proposta neste momento.



Solicitaria que a equipe apresentasse:



1\. o cenário de carga esperado;

2\. quais componentes precisam escalar independentemente;

3\. quais atributos de qualidade serão melhorados;

4\. o custo operacional estimado;

5\. a alternativa de arquitetura modular em um único serviço.



Com essas informações, seria possível comparar as alternativas e tomar uma decisão arquitetural fundamentada.


\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**Ex04 — ADR: Armazenamento do prontuário**



**ADR-001 — Separação do banco de dados do prontuário**



Status: Aceito



**Contexto**



A clínica-escola precisa armazenar prontuários dos pacientes e dados administrativos. Os prontuários possuem informações sensíveis e exigem controles de acesso e proteção diferentes dos dados administrativos.



**Decisão**



Os dados do prontuário serão armazenados em \*\*um banco separado dos dados administrativos\*\*, com controles de acesso específicos.



**Alternativas consideradas**



**Alternativa 1 — Mesmo banco de dados**



Descartada porque aumenta o acoplamento entre os dois domínios e pode dificultar o isolamento dos dados sensíveis e seus respectivos controles de acesso.



**Alternativa 2 — Mesmo banco, mas com tabelas separadas**



Descartada como solução principal porque, embora permita alguma separação lógica, mantém os dados dentro da mesma infraestrutura de armazenamento e não oferece o mesmo nível de isolamento da alternativa escolhida.



**Alternativa 3 — Banco separado para o prontuário**



Escolhida porque proporciona maior isolamento dos dados sensíveis e permite aplicar políticas de acesso e proteção específicas.



**Consequências**



* **Positivas:**



\* maior isolamento dos dados do prontuário;

\* possibilidade de aplicar controles de acesso específicos;

\* menor acoplamento entre dados clínicos e administrativos;

\* facilita políticas específicas de proteção e auditoria.



* **Negativas:**



* aumenta a complexidade da infraestrutura;
* exige administração e monitoramento de mais de um banco;
* pode tornar algumas consultas que combinam informações clínicas e administrativas mais complexas.



**Revisar se**



A decisão deverá ser revisada caso \*\*os requisitos de segurança, volume de dados ou modelo de integração entre informações clínicas e administrativas mudem significativamente\*\*, especialmente se uma nova exigência regulatória ou técnica tornar necessário outro nível de isolamento.



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**Ex05 — Comunicação da decisão arquitetural**



**Assunto: Decisão sobre processamento das operações da transportadora**



À equipe técnica



A decisão é adotar **processamento assíncrono, com armazenamento temporário das informações e sincronização posterior**, em vez de exigir processamento integral em tempo real.



A restrição determinante é o contexto operacional da transportadora: os veículos podem trabalhar em regiões com conectividade instável, e a prioridade do sistema é garantir que a operação continue funcionando mesmo quando não houver comunicação imediata com o servidor.



Isso significa que a equipe deverá implementar mecanismos para armazenar os dados localmente, controlar o estado das operações e sincronizar as informações quando a conexão estiver disponível.



O que perdemos com essa escolha é a \*\*atualização imediatamente consistente entre todos os pontos do sistema\*\*. Será necessário lidar com atrasos de sincronização e possíveis conflitos de dados.



\---------------



**Ao gestor de frota**



O sistema não vai depender de internet funcionando o tempo todo para registrar uma operação.



Se o motorista estiver em uma região sem sinal, ele poderá continuar registrando as informações necessárias. Quando a conexão voltar, os dados serão enviados para o sistema central.



Na prática, isso reduz o risco de o motorista ficar impedido de trabalhar por causa de uma falha de comunicação.



A contrapartida é que \*\*o painel da frota poderá levar algum tempo para refletir uma informação registrada no veículo\*\*, porque a atualização poderá acontecer somente depois que o dispositivo recuperar a conexão.



\---------------

**À diretoria**



A decisão prioriza \*\*continuidade operacional e redução do impacto causado por indisponibilidade de conectividade\*\*.



O sistema poderá continuar registrando operações mesmo em situações nas quais a comunicação com o servidor esteja temporariamente indisponível, reduzindo o risco de interrupção da operação por falhas de rede.



A consequência financeira é que a solução exige mecanismos adicionais de armazenamento e sincronização, aumentando a complexidade de desenvolvimento e manutenção.



Também é importante deixar explícito o que se perde: \*\*não teremos garantia de que todas as informações estarão disponíveis centralmente em tempo real\*\*. Haverá uma janela de atraso entre o registro da operação e sua disponibilidade no sistema central.



Essa é uma troca deliberada: aceitamos eventual atraso de atualização para preservar a continuidade da operação da transportadora diante de uma restrição real de conectividade.





