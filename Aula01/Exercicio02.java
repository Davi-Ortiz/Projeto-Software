 /**
leia os quatro relatos de fracasso abaixo e classifique cada um numa das causas da seção 3, justificando em uma frase: 
(a) "aceitamos 14 pedidos pequenos e entregamos com 3 meses de atraso"; 
(b) "o auditor só foi ouvido na homologação e vetou o formato do relatório"; 
(c) "passamos cinco semanas alternando entre duas soluções"; 
(d) "a diretoria anunciou a data numa reunião e depois perguntamos o que cabia". 

Confere assim: cada relato mapeia numa causa diferente, e a (c) é a única que não tem nada a ver com escopo nem com prazo.
*/

public class Exercicio02 {
    public static void main(String[] args) {
        
        System.out.print("*** 2) Classifique cada relato de fracasso numa das causas da seção 3, justificando em uma frase: *** \n\n");
        System.out.print("RELATOS DE FRACASSO E CAUSAS: \n");
        
        System.out.print("Relato | A) Aceitamos 14 pedidos pequenos e entregamos com 3 meses de atraso.\n");
        System.out.print("Causa: Escopo - Justificativa: A aceitação de vários pedidos adicionais/pequenos aumentou o escopo e contribuiu para o atraso.\n\n");
       
        System.out.print("Relato | B) O auditor só foi ouvido na homologação e vetou o formato do relatório. \n");
        System.out.print("Causa: Comunicação - Justificativa: o auditor não foi envolvido/consultado antecipadamente, e sua necessidade só foi descoberta na homologação.\n\n");
       
        System.out.print("Relato | C) Passamos cinco semanas alternando entre duas soluções.\n");
        System.out.print("Causa: Decisão - Justificativa: A causa está na falta de uma decisão clara entre alternativas, gerando retrabalho e perda de tempo.\n\n");
       
        System.out.print("Relato | D) A diretoria anunciou a data numa reunião e depois perguntamos o que cabia.\n");
        System.out.print("Causa: Prazo - Justificativa: O prazo foi definido antes de delimitar o que seria entregue, criando um compromisso temporal sem escopo definido.\n\n");
    }
}
