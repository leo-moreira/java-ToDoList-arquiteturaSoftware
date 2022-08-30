package funcionalidades;

import java.util.Scanner;

public class Funcionalidades implements IFuncionalidades {

    public String receberInput(String mensagem) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        exibirMensagem(mensagem);
        return entrada.next();
    }

    public int receberInputNumero(String mensagem) {
        exibirMensagem(mensagem);
        try {
            return Integer.parseInt(receberInput());
        } catch (NumberFormatException e) {
            exibirMensagem(NAN_ENTRADA_INCORRETA);
        }
        return receberInputNumero(mensagem);
    }

    public String receberInput() {
        Scanner entrada = new Scanner(System.in);
        return entrada.next();
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public int exibirMenu() {
        exibirMensagem(TEXTO_MENU);
        try {
            return Integer.parseInt(receberInput());
        } catch (NumberFormatException e) {
            exibirMensagem(NAN_ENTRADA_INCORRETA);
        }
        return exibirMenu();
    }

    public void exibirMensagemInputIncorreto() {
        exibirMensagem(ENTRADA_INCORRETA);
    }
}
