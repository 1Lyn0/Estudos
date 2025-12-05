import java.util.Scanner;

public class Leitura {
    static Scanner teclado = new Scanner(System.in);

    static void limparBuffer() {
        if (teclado.hasNextLine()) {
            teclado.nextLine();
        }
    }

    // ---------- TIPOS NUMÉRICOS ----------

    static int lerValorInteiro(String mensagem) {
        int valor = 0;
        try {
            System.out.print(mensagem);
            valor = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        return valor;
    }

    static float lerValorFloat(String mensagem) {
        float valor = 0;
        try {
            System.out.print(mensagem);
            valor = teclado.nextFloat();
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        return valor;
    }

    static double lerValorDouble(String mensagem) {
        double valor = 0;
        try {
            System.out.print(mensagem);
            valor = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        return valor;
    }

    static long lerValorLong(String mensagem) {
        long valor = 0;
        try {
            System.out.print(mensagem);
            valor = teclado.nextLong();
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        return valor;
    }

    static short lerValorShort(String mensagem) {
        short valor = 0;
        try {
            System.out.print(mensagem);
            valor = teclado.nextShort();
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        return valor;
    }

    static byte lerValorByte(String mensagem) {
        byte valor = 0;
        try {
            System.out.print(mensagem);
            valor = teclado.nextByte();
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        } finally {
            limparBuffer();
        }
        return valor;
    }

    // ---------- TIPOS TEXTUAIS ----------

    static String lerValorString(String mensagem) {
        String valor = "";
        try {
            System.out.print(mensagem);
            valor = teclado.nextLine();
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        }
        return valor;
    }

    static char lerValorChar(String mensagem) {
        char valor = '\0';
        try {
            System.out.print(mensagem);
            String entrada = teclado.nextLine();
            if (entrada.length() > 0) {
                valor = entrada.charAt(0);
            }
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto.");
        }
        return valor;
    }

    // ---------- TIPOS LÓGICOS ----------

    static boolean lerValorBoolean(String mensagem) {
        boolean valor = false;
        try {
            System.out.print(mensagem);
            valor = teclado.nextBoolean();
        } catch (Exception e) {
            System.out.println("Valor digitado é incorreto. Digite true ou false.");
        } finally {
            limparBuffer();
        }
        return valor;
    }
}