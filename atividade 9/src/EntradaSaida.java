import javax.swing.*;

public class EntradaSaida {

    public static void menu() {
        String[] opcoes = {"1 - Cadastrar Times", "2 - Simular Jogos", "3 - Sair"};
        int escolha = JOptionPane.showOptionDialog(
                null, "Selecione a opção desejada:", "Menu Principal",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

    }

    public static int lerInteiro(String mensagem) {
        String valor = JOptionPane.showInputDialog(mensagem);
        return Integer.parseInt(valor);
    }

    public static String lerString(String mensagem) {
        String texto = JOptionPane.showInputDialog(mensagem);
        return texto;
    }
    public static double lerDouble(String mensagem) {
        String valor2 = JOptionPane.showInputDialog(mensagem);
        return Double.parseDouble(valor2);
    }
    public static String exibir(String mensagem) {
        String msg = JOptionPane.showInputDialog(mensagem);
        return msg;
    }
}
