package condicionais;

public class OperadoresLogicos {
    public static void main(String[] args) {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // && (and) só é true quando os dois forem true
        System.out.println("b1 && b2 " + (b1 && b2));

        // ||  só é false quando os dois forem false
        System.out.println("b1 || b2 " + (b1 || b2));

        // ^ só é true quando os dois são diferentes
        System.out.println("b1 ^ b2 " + (b1 ^ b2));

        // negação (inverte), o que é false vira true
        System.out.println(!b1);


        double salarioMensal = 1158.50d;
        double mediaSalario = 4587d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes > mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe auxílio:  " + recebeAuxilio);


    }
}
