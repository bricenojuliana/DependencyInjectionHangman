package co.edu.escuelaing.hangman.model;

import org.springframework.stereotype.Component;

@Component("bonusScore")
public class BonusScore implements GameScore{
    /** Calcula el puntaje de acuerdo a las letras correctas e incorrectas.
     *
     * @pre  inicia con 0 puntos.
     * @post El minimo puntaje es 0.
     * @param correctCount Cantidad de letras correctas.
     * @param incorrectCount Cantidad de letras incorrectas.
     * @return Puntaje con bonificacion de 10 puntos por cada letra correcta
     * y penalizacion de 5 puntos por cada letra incorrecta.
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        return 0;
    }
}
