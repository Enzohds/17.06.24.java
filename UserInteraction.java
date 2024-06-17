import java.util.Scanner;

public class UserInteraction {
    public static void main(String[] args) {
    String status = "Ate agora nada aconteceu...";
    try{
        Scanner senUsuario = new Scanner(System.in);
        Scanner senSenha = new Scanner(System.in);
        System.out.println("Digite o usuario e tecle Enter"); 
        String txtUsuario = senUsuario.nextLine();
        System.out.println("Digite a senha e tecle Enter");
        String txtSenha = senSenha.nextLine();
        if (txtUsuario.equals("teste") && txtSenha.equals("teste")){
            status = "Usuario logado com sucesso!";
        }
        senUsuario.close();
        senSenha.close();
    }catch(Exception e){
        status = "Erro Exception: " + e;
    }
    System.out.println(status);
    
    }
}
