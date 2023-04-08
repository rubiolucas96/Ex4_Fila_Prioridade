package Controller;


import br.edu.fateczl.filaobj.Fila;

public class FilaController {
    
    public static void inserirNaFila(Fila fila, Object senha) {
        fila.insert(senha);
        System.out.println("Senha " + senha + " inserida na fila.");
    }
    
    public static void inserirFilaPrioritaria(Fila filaPrioritarios, Object senha) {
        filaPrioritarios.insert(senha);
        System.out.println("Senha prioritária " + senha + " inserida na fila.");
    }
    
    public static void removerDaFila(Fila fila) throws Exception {
        Object senhaRemovida = fila.remove();
        System.out.println("Senha " + senhaRemovida + " removida da fila.");
    }
    
    public static void chamarProximoCliente(Fila fila, Fila filaPrioritarios) throws Exception {
        if (!filaPrioritarios.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                if (!filaPrioritarios.isEmpty()) {
                    Object senhaRemovida = filaPrioritarios.remove();
                    System.out.println("Senha prioritária " + senhaRemovida + " chamada.");
                }
            }
        }
        if (!fila.isEmpty()) {
            Object senhaRemovida = fila.remove();
            System.out.println("Senha " + senhaRemovida + " chamada.");
        } else if (filaPrioritarios.isEmpty()) {
            System.out.println("Não há senhas na fila.");
        }
    }
    
}

