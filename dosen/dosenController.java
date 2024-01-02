package tubes;

public class dosenController {
    private LoginDosen page1;
    private dosen page2;
    
    public dosenController(){
        page1 = new LoginDosen();
        page1.setVisible(true);
        
        page2 = new dosen();
        page2.setVisible(false);
    }
}
