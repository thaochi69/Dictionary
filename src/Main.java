
import controller.DictionaryManager;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thao Chi
 */
public class Main {
    public static void main(String[] args) {
        String title = "Dictionary program";
        String[] s = new String[]{"Add Word", "Delete Word", "Translate", "Exit"};
        Menu<String> menu = new DictionaryManager(title, s);
        menu.run();
        
    }
}
