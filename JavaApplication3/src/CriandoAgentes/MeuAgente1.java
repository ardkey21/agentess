
package CriandoAgentes;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;


import java.util.Iterator;

public class MeuAgente1 extends Agent{
    
    public void setup(){
        System.out.println("Criando o agente"+getLocalName());
        System.out.println("Minha GUID é "+getLocalName()+"):"+getName());
        System.out.println("Mesus endereços são ("+ getLocalName()+"):");
        
       /* 
        for (int cont = 0; cont < 50000; cont++) {
            System.out.println(getLocalName() +" - "+cont);
        }
        */
        addBehaviour(new Comportamento1());
       
        if(getArguments() != null){
            ACLMessage msg = new ACLMessage();
            msg.addReceiver(new AID("Lucas ",AID.ISLOCALNAME));
            msg.setContent("Olá Maria!");
            send(msg);
        }
        
        
        /*
        Iterator  it = getAID().getAllAddresses();
        while(it.hasNext()){
            System.out.println("-"+ it.next());
        }
        System.out.println("Meus argumentos de inicialização são ( "+getLocalName()+ ")");
        Object argumentos[] = getArguments();
        if(argumentos != null){
            for (int cont = 0; cont < argumentos.length; cont++) {
                System.out.println(" - Argumentos [ "+ cont + " ]: "+ argumentos[cont]);
                
            }
            System.out.println("\n \n");
        }
        */
    }
    
    
    
}
