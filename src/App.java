public class App {
    public static void main(String[] args) throws Exception {
        try {
            System.out.print("Introduzca un número entero positivo (relativamente grande): ");
            int Superior = Integer.parseInt(System.console().readLine());

            System.out.print("Introduzca otro numero (relativamente pequeño): ");
            int Limite = Integer.parseInt(System.console().readLine());
            System.out.printf("""
                    Los numeros enteros ppositivos menores que %d que no son divisibles
                    entre %d son los siguientes:
                            """, Superior, Limite);
            for (int i = 1; i < Superior; i++) {

                if (i % Limite != 0) {
                    System.out.print(i + " ");
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Número mal introducido.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado.");
        }
    }
}