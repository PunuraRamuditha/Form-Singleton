/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registration;

import javax.swing.JCheckBox;
/**
 *
 * @author Skyynemo
 */
public class CheckBoxWithId extends JCheckBox {
     private Integer _id;

    public CheckBoxWithId(String text, Integer id) {
        super(text);
        _id = id;
    }

    public void setId(Integer id) {
        _id = id;
    }

    public Integer getId() {
        return _id;
    }
}
