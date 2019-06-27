package CriandoAgentes;

import jade.core.*;
import jade.core.Runtime;
import jade.wrapper.AgentController;

import jade.wrapper.ContainerController;


public class CriandoAgentes {
    
    
    public static void main(String[]args){
        String host = "localhost";
        String porta = "1099";
        
        Runtime rt = Runtime.instance();
        rt.setCloseVM(true);
        
        
        Profile p = new ProfileImpl();
        p.setParameter(Profile.MAIN_PORT, porta);
        p.setParameter(Profile.MAIN_HOST, host);
        ContainerController cc = rt.createMainContainer(p);
        
        AgentController agt1;
        
        try {
            AgentController rma = cc.createNewAgent("rma", "jade.tools.rma.rma",new Object[0]);
            rma.start();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        if (cc != null) {
            try {
                String nomeDoAgente = "Lucas";
                String classeDOAgente = "CriandoAgentes.MeuAgente1";
                agt1 = cc.createNewAgent(nomeDoAgente, classeDOAgente, null);
                agt1.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        AgentController agt2;
        if (cc != null) {
            try {
                String nomeDoAgente = "Boll";
                String classeDOAgente = "CriandoAgentes.MeuAgente1";
                Object argumentos[] = {"um ", "dois", "tres ", "quatro"};
                agt2 = cc.createNewAgent(nomeDoAgente, classeDOAgente, argumentos);
                agt2.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
}
