/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runtime;

import data.*;

/**
 *
 * @author DELL
 */
public class Run {

    public static void main(String[] args) {
        Shape ds[] = new Shape[4];
        ds[0] = new Disk("Tía", "pink", 2.0);
        ds[1] = new Rectangle("Hường", "Hồng", 2, 3);
        ds[2] = new Square("Lục", "Green", 5);
        
       	Disk d = new Disk("Mợ", "Hường", 10);
		ds[3] = d;
                for (Shape o : ds) {
                    o.paint();
        }
    }
}
