import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 10;
        this.generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.generarPassword();
    }

    public boolean esFuerte() {
        int numMayusculas = 0;
        int numMinusculas = 0;
        int numNumeros = 0;

        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                numMayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                numMinusculas++;
            } else if (Character.isDigit(caracter)) {
                numNumeros++;
            }
        }

        return numMayusculas > 2 && numMinusculas > 1 && numNumeros > 4;
    }

    public void generarPassword() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            sb.append(letras.charAt((int)(Math.random()*letras.length())));
        }

        this.contrasena = sb.toString();
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.generarPassword();
    }
}