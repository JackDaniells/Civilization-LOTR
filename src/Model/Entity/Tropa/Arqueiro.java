/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity.Tropa;

import Model.Entity.Mapa.Posicao;

/**
 *
 * @author filipe
 */
public class Arqueiro extends Tropa{
    private String simbolo = "➵";
    public Arqueiro() {
        super(15, 1, 3, 5, "➵");
    }   
}