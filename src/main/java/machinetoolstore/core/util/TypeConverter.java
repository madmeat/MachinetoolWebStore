/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machinetoolstore.core.util;

import java.util.List;
import machinetoolstore.core.model.MachineFilter;

/**
 *
 * @author main
 */
public class TypeConverter {
    private static List<String> maker = null;
    public static void convert(MachineFilter filter) {
        maker = filter.getSelectedType();
        for(int i = 0; i < maker.size(); i++) {
            switch(maker.get(i)) {
                case "Asynchronous":
                    maker.set(i, "Ассиметричный");
                    break;
                case "Hydraulic":
                    maker.set(i, "Гидравлический");
                    break;
                case "Manual":
                    maker.set(i, "Ручной");
                    break;
                default:
                    System.err.print("TypeConverter warning");
            }
        }
    }
}
