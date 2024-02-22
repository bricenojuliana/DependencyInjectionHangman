package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("powerScore")
public class PowerScore implements GameScore{
    /** Calcula el puntaje de acuerdo a las letras correctas e incorrectas.
     *
     * @pre  inicia con 0 puntos.
     * @post El minimo puntaje es 0 y el maximo es 500.
     * @param correctCount Cantidad de letras correctas.
     * @param incorrectCount Cantidad de letras incorrectas.
     * @return Puntaje con bonificacion de 5^i puntos por la i-esima letra correcta
     * y con una  penalizacion de 8 puntos por cada letra incorrecta.
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
