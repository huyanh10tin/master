/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dich;

/**
 *
 * @author nguyen
 */
public class Bai1 {
    public int dem(String s){
        int d=0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                d++;
            }
        }
        return d;
    }
}
