**Ex01 — Entregas incrementais e iterativas**



**Critério usado:**



* **Incremental:** entrega algo que ainda não existia.
* **Iterativa:** melhora, altera ou refaz algo que já existia.



| Itens                                                                                                                                                                    

| (a) A segunda versão da tela de busca, refeita depois de observar dez atendimentos 

| (b) O módulo de relatórios, que não existia                                        

| (c) O cadastro reescrito para aceitar item sem patrimônio                           

| (d) A reserva antecipada, entregue no terceiro mês                                  

| (e) O fluxo de devolução simplificado de cinco para dois passos                     

| (f) A integração com o portal, entregue por último                                  



Resultado



* &#x20;**Iterativas:** (a), (c), (e)
* &#x20;**Incrementais:** (b), (d), (f)



O critério não é a dificuldade, o tempo de desenvolvimento ou a ordem da entrega. A pergunta decisiva é: \*\*aquilo já existia antes?\*\*


\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**Ex02 — Eixo preditivo–adaptativo**



**(a) Ouvidoria municipal — Predominantemente preditivo**



A Ouvidoria municipal fica no lado **preditivo** do eixo.



O projeto possui um contrato público com escopo anexado ao edital, prazo definido de oito meses, multa por atraso e uma regra formal para mudanças de escopo. Alterações precisam passar por aditivo contratual, que pode levar de 30 a 60 dias.



Isso indica que uma parte significativa do projeto precisa ser planejada e controlada com base em uma linha de base definida previamente. A mudança não pode simplesmente ser incorporada durante o desenvolvimento, pois existe uma consequência contratual.



**Razão principal:** o projeto possui escopo contratual, prazo e regras formais de mudança que limitam a adaptação durante a execução.



\-----------------



**(b) Marketplace de serviços autônomos — Adaptativo**



O Marketplace fica no lado **adaptativo** do eixo.



O principal problema do projeto ainda não está resolvido: ninguém sabe se existe demanda suficiente pelo serviço. Além disso, a equipe tem apenas seis meses de reserva financeira.



Nesse cenário, seria arriscado definir antecipadamente toda a solução. O mais adequado é construir pequenas entregas que permitam testar hipóteses, observar a reação de usuários e decidir os próximos passos com base no aprendizado.



**Razão principal:** o produto ainda precisa descobrir o que realmente deve ser construído, pois a demanda ainda não foi validada.



\-----------------



**(c) Prontuário de clínica-escola — Híbrido**



O Prontuário fica em uma posição \*\*híbrida\*\*, porque possui características tanto preditivas quanto adaptativas.



* **Parte preditiva**



A parte relacionada a **conformidade, segurança e auditoria** precisa ser planejada previamente.



O sistema trabalha com dados de saúde protegidos, possui exigência de aprovação pelo comitê de ética e está sujeito a auditoria externa. Portanto, requisitos de segurança, controle de acesso, rastreabilidade e proteção dos dados não devem ser descobertos somente durante a execução.



* **Parte adaptativa**



A parte relacionada à **experiência de uso e aos fluxos da clínica** pode ser desenvolvida de forma adaptativa.



É possível entregar versões menores para que alunos, professores e coordenação utilizem e forneçam feedback sobre os fluxos de atendimento, supervisão e consulta das informações.



**Razão principal:** os requisitos de conformidade e segurança exigem planejamento antecipado, enquanto os fluxos de uso podem ser refinados por meio de entregas e feedback.



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**Ex03 — Entregas incrementais**



**Sistema de Empréstimo de Equipamentos**



O recorte foi feito para que cada entrega tenha utilidade própria e não seja apenas uma etapa técnica necessária para a próxima.



O projeto precisa lidar com equipamentos audiovisuais, reservas, empréstimos, devoluções, atrasos e equipamentos danificados.



\-----------------



**Incremento 1 — Consulta de equipamentos e disponibilidade**



**Entrega:**



* &#x20;Cadastro dos equipamentos.
* &#x20;Consulta do catálogo.
* &#x20;Identificação de equipamento disponível ou indisponível.



**Prova de que é utilizável sozinho:**



> Um servidor consegue consultar o sistema e descobrir quais equipamentos existem e quais estão disponíveis antes de organizar um empréstimo.



Esse incremento já produz valor porque substitui a consulta manual do acervo por uma consulta centralizada.



\-----------------



**Incremento 2 — Reserva e empréstimo**



**Entrega:**



* &#x20;Solicitação de empréstimo.
* &#x20;Reserva de equipamento.
* &#x20;Registro da retirada.
* &#x20;Definição da data prevista para devolução.



**Prova de que é utilizável sozinho:**



> Um usuário consegue reservar um equipamento disponível e registrar seu empréstimo com uma data de devolução.



O segundo incremento utiliza o catálogo e a disponibilidade já entregues, mas acrescenta uma capacidade completa de negócio.



\-----------------



**Incremento 3 — Devolução, atraso e equipamento danificado**



**Entrega:**



* &#x20;Registro da devolução.
* &#x20;Identificação de atraso.
* &#x20;Aplicação da penalidade prevista.
* &#x20;Registro de equipamento danificado.
* &#x20;Retirada do equipamento danificado de circulação.



**Prova de que é utilizável sozinho:**



> Um servidor consegue registrar a devolução de um equipamento, identificar se houve atraso e retirar de circulação um equipamento devolvido com dano.



\-----------------



**Ordem das entregas**



1\. Consultar equipamentos e disponibilidade

2\. Reservar e registrar empréstimos

3\. Registrar devoluções, atrasos e danos



A divisão é incremental porque cada entrega acrescenta uma capacidade utilizável do sistema. Nenhuma delas é apenas uma fase técnica que só terá utilidade depois que a próxima for concluída.

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**Ex04 — O time é realmente iterativo?**



A afirmação não se sustenta apenas pelas três entregas apresentadas.



As últimas três entregas foram:



1\. Módulo de relatórios;

2\. Integração com o portal;

3\. Tela de auditoria.



\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

**Ex05 — Decisão de ciclo de vida**



**Projeto: Semana Acadêmica com Submissões**



A Semana Acadêmica possui data de evento imóvel, equipe formada por voluntários com disponibilidade imprevisível e orçamento pequeno já comprometido. O evento acontecerá mesmo que o sistema não esteja pronto.



&#x20;1. Qual ciclo de vida será escolhido?



Será adotado um ciclo de vida híbrido.



* **Parte preditiva**



A parte preditiva será utilizada para aquilo que não pode mudar facilmente:



* &#x20;data do evento;
* &#x20;orçamento disponível;
* &#x20;necessidades mínimas para que o evento aconteça;
* &#x20;marcos que dependem do calendário;
* &#x20;plano de contingência caso o sistema não esteja disponível.



A data do evento é fixa, portanto não faz sentido tratar a realização do evento como uma variável adaptável.



* **Parte adaptativa**



O desenvolvimento do sistema será conduzido de forma \*\*adaptativa\*\*, por pequenas entregas.



A equipe poderá priorizar e repriorizar funcionalidades conforme a disponibilidade dos voluntários e os riscos identificados.



\-----------------



**2. Qual será o recorte da primeira entrega?**



A primeira entrega será o fluxo básico de inscrição em atividades com controle de vagas.



Ela permitirá:



* &#x20;cadastrar uma atividade;
* &#x20;definir quantidade de vagas;
* &#x20;realizar inscrição;
* &#x20;impedir inscrição acima do limite;
* &#x20;consultar a inscrição realizada.



* **Critério utilizado**



O critério é priorizar a capacidade que possui maior impacto operacional e maior risco de uso em pico.



A abertura das inscrições pode receber muitos acessos em pouco tempo. Portanto, colocar esse fluxo em funcionamento cedo permite validar uma parte crítica do sistema enquanto ainda existe tempo para corrigir problemas.



A primeira entrega também é utilizável sozinha: a organização já consegue utilizá-la para controlar inscrições de uma atividade, mesmo sem possuir ainda submissão de trabalhos, presença e emissão de certificados.



\-----------------



**3. O que se perde com essa escolha?**



Ao escolher um ciclo híbrido com desenvolvimento adaptativo, perde-se a garantia de que todo o escopo originalmente imaginado será desenvolvido antes do evento.



Também existe o risco de algumas funcionalidades menos prioritárias precisarem ser simplificadas ou substituídas por procedimentos manuais.



Por outro lado, essa escolha evita comprometer toda a capacidade da equipe com um planejamento rígido que pode deixar de ser viável quando a disponibilidade dos voluntários variar.



\-----------------



**4. Em que cenário essa escolha se mostraria errada?**



A escolha se mostraria inadequada, por exemplo, se em setembro apenas duas pessoas da equipe permanecessem disponíveis e nenhuma delas tivesse disponibilidade suficiente para manter as entregas semanais, enquanto ainda faltassem as funcionalidades essenciais para inscrições, avaliação, presença e certificados.



Esse cenário seria verificável pela quantidade real de voluntários disponíveis e pelo volume de funcionalidades essenciais ainda não concluídas.



Nesse caso, seria necessário reduzir ainda mais o escopo, assumir processos manuais para algumas atividades ou mudar a estratégia para garantir que o evento aconteça mesmo sem a solução completa.



**Decisão final**



O ciclo híbrido é adotado porque combina:



* **preditivo:** data, orçamento, marcos e plano de contingência;
* **adaptativo:** desenvolvimento e priorização das funcionalidades.



A primeira entrega será o controle de inscrições e vagas, escolhida pelo impacto operacional e pelo risco de pico de acesso.



A principal perda é a possibilidade de não entregar todo o escopo originalmente desejado. A decisão deverá ser revista se a disponibilidade real da equipe cair a um nível que impeça a manutenção das entregas essenciais.



