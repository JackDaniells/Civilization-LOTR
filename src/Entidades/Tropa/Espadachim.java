/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades.Tropa;

import Entidades.Mapa.Posicao;

/**
 *
 * @author filipe
 */
public class Espadachim extends Tropa{
    private String simbolo = "♙";
    public Espadachim(Posicao posicao) {
        super(15, 1, 7, 1, 2, "♙", posicao);
    }
}