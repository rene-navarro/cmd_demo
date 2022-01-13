public class DisplayVars {

    public static void main (String[] args) {
        for (String env: args) {

            // Obtener el valor de la variable de ambiente
            String value = System.getenv(env);

            if (value != null) {
                System.out.format("%s=%s%n",
                        env, value);
            } else {
                // la variable no existe
                System.out.format("%s is"
                        + " not assigned.%n", env);
            }
        }
    }
}

