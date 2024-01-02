/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

public class MhsController {
    private LoginMahasiswa page1;
    private Mahasiswa page2;
    
    public MhsController(){
        page1 = new LoginMahasiswa();
        page1.setVisible(true);
        
        page2 = new Mahasiswa();
        page2.setVisible(false);    
    }
    
     
}
