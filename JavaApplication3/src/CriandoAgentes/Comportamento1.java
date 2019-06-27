package CriandoAgentes;

import jade.core.behaviours.SimpleBehaviour;
import jade.lang.acl.ACLMessage;


 
public class Comportamento1 extends SimpleBehaviour {
    boolean terminou = false;
    
    @Override
    public void action() {
        ACLMessage msg  =  myAgent.receive();
        if(msg != null){
            System.out.println(myAgent.getLocalName() + " recebeu de "+ msg.getSender().getLocalName() + ":" + msg.getContent());   
        
            ACLMessage resposta = msg.createReply();
            resposta.setContent("OK Recebido");
            myAgent.send(resposta);
            terminou = true;
        
                    
        }
    }

    @Override
    public boolean done() {
       return terminou;
    }
    
}
