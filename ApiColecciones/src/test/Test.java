package test;

import generico.ClaseGenerica;

public class Test {

    public static void main(String[] args) {

        ClaseGenerica<Integer> objInt = new ClaseGenerica(15);
        objInt.obtenerTipo();

        ClaseGenerica<String> objString = new ClaseGenerica("Santiago");
        objString.obtenerTipo();
    }
}
