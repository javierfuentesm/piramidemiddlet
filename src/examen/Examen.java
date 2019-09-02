/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author alumno
 */
public class Examen extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
    
    private Command backToList;
    private int w;
    private int h;
    
    private int centroX;
    private int centroY;
    
    private int vectorX=1;
    private int vectorY=1;
    private int vectorZ=1;

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command okCommand;
    private Form Form;
    private StringItem stringItem;
    private TextField txtX;
    private TextField txtY;
    private TextField txtZ;
//</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public Examen() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
if(command == backToList){
    switchDisplayable(null, getForm());
}        

// write pre-action user code here
if (displayable == Form) {//GEN-BEGIN:|7-commandAction|1|19-preAction
            if (command == exitCommand) {//GEN-END:|7-commandAction|1|19-preAction
                // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|2|19-postAction
                // write post-action user code here
} else if (command == okCommand) {//GEN-LINE:|7-commandAction|3|26-preAction
                tetraedro();
//GEN-LINE:|7-commandAction|4|26-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|7-postCommandAction
        }//GEN-END:|7-commandAction|5|7-postCommandAction
        // write post-action user code here
}//GEN-BEGIN:|7-commandAction|6|
//</editor-fold>//GEN-END:|7-commandAction|6|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
}//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|18-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of Form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (Form == null) {
//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
Form = new Form("Examen", new Item[]{getStringItem(), getTxtX(), getTxtY(), getTxtZ()});//GEN-BEGIN:|14-getter|1|14-postInit
            Form.addCommand(getExitCommand());
            Form.addCommand(getOkCommand());
            Form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
}//GEN-BEGIN:|14-getter|2|
        return Form;
    }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|16-getter|0|16-preInit
    /**
     * Returns an initialized instance of stringItem component.
     *
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {
//GEN-END:|16-getter|0|16-preInit
            // write pre-init user code here
stringItem = new StringItem("Bienvenido", "Porgrama que crea un tetraedro");//GEN-LINE:|16-getter|1|16-postInit
            // write post-init user code here
}//GEN-BEGIN:|16-getter|2|
        return stringItem;
    }
//</editor-fold>//GEN-END:|16-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|25-getter|0|25-preInit
    /**
     * Returns an initialized instance of okCommand component.
     *
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {
//GEN-END:|25-getter|0|25-preInit
 // write pre-init user code here
okCommand = new Command("Crear", Command.OK, 0);//GEN-LINE:|25-getter|1|25-postInit
 // write post-init user code here
}//GEN-BEGIN:|25-getter|2|
        return okCommand;
    }
//</editor-fold>//GEN-END:|25-getter|2|







//<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtX ">//GEN-BEGIN:|27-getter|0|27-preInit
    /**
     * Returns an initialized instance of txtX component.
     *
     * @return the initialized component instance
     */
    public TextField getTxtX() {
        if (txtX == null) {
//GEN-END:|27-getter|0|27-preInit
 // write pre-init user code here
txtX = new TextField("Ingrese el vector X:", "", 32, TextField.ANY);//GEN-LINE:|27-getter|1|27-postInit
 // write post-init user code here
}//GEN-BEGIN:|27-getter|2|
        return txtX;
    }
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtY ">//GEN-BEGIN:|28-getter|0|28-preInit
    /**
     * Returns an initialized instance of txtY component.
     *
     * @return the initialized component instance
     */
    public TextField getTxtY() {
        if (txtY == null) {
//GEN-END:|28-getter|0|28-preInit
 // write pre-init user code here
txtY = new TextField("Ingrese el vector Y:", "", 32, TextField.ANY);//GEN-LINE:|28-getter|1|28-postInit
 // write post-init user code here
}//GEN-BEGIN:|28-getter|2|
        return txtY;
    }
//</editor-fold>//GEN-END:|28-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: txtZ ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initialized instance of txtZ component.
     *
     * @return the initialized component instance
     */
    public TextField getTxtZ() {
        if (txtZ == null) {
//GEN-END:|29-getter|0|29-preInit
 // write pre-init user code here
txtZ = new TextField("Ingrese el vector Z:", "", 32, TextField.ANY);//GEN-LINE:|29-getter|1|29-postInit
 // write post-init user code here
}//GEN-BEGIN:|29-getter|2|
        return txtZ;
    }
//</editor-fold>//GEN-END:|29-getter|2|

    public Command getbackToList(){
        if (backToList == null) {
            backToList = new Command("Back", Command.BACK, 0);                                      
        } 
        return backToList;
    }
    
    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

    private void tetraedro() {
        Command SalirCanvas = getbackToList();
        Display d; 
        d = getDisplay();
        Tetraedro di;
        di = new Tetraedro();
        di.addCommand(SalirCanvas);
        di.setCommandListener(this);
        d.setCurrent(di);
    }
    
    public class Tetraedro extends Canvas{
       
        public void paint(Graphics g){
            w=getWidth();
            h=getHeight();
            centroX = w/2;
            centroY = h/2;
            g.setColor(0, 0, 0);
            g.fillRect(0, 0, w, h);
            g.setColor(255, 255, 255);
            g.setStrokeStyle(Graphics.SOLID);
            g.drawLine(centroX, centroY,centroX, 0);
            g.drawLine(centroX, centroY, w, centroY);
            g.drawLine(centroX, centroY, centroX-200, centroY+200);
            g.setColor(255, 23, 0);
            vectorX = Integer.parseInt(txtX.getString());
            vectorY = Integer.parseInt(txtX.getString());
            vectorZ = Integer.parseInt(txtX.getString());
            g.drawLine(centroX, centroY,centroX+vectorX, centroY);
            g.drawLine(centroX, centroY,centroX, centroY-vectorY);
            g.drawLine(centroX, centroY, centroX-vectorZ+15, centroY+vectorZ-15);
            //Ahora unimos las aristas
            g.drawLine(centroX+vectorX, centroY,centroX, centroY-vectorY); //Y CON X
            g.drawLine(centroX+vectorX, centroY,centroX-vectorZ+15, centroY+vectorZ-15); //X CON Z
            g.drawLine(centroX, centroY-vectorY,centroX-vectorZ+15, centroY+vectorZ-15); //Y CON Z
            
            // Finalmente escribimos las cordenadas
            g.setColor(255, 255, 255);
            g.setStrokeStyle(Graphics.SOLID);
            g.drawString("("+vectorX+",0,0)", centroX+vectorX+20, centroY, (Graphics.BASELINE| Graphics.HCENTER));
            g.drawString("(0,"+vectorY+",0)", centroX, centroY-vectorY-20, (Graphics.BASELINE| Graphics.HCENTER));
            g.drawString("(0,0,"+vectorZ+")", centroX-vectorZ+35, centroY+vectorZ, (Graphics.BASELINE| Graphics.HCENTER));
        
            //CALCULAMOS EL VOLUMEN
           
                int xx1 = vectorX;
                int xx2 = 0;
                int xx3 = 0;
                int yy1 = 0;
                int yy2 = vectorY;
                int yy3 = 0;
                int zz1 = 0;
                int zz2 = 0;
                int zz3 = vectorZ;
                int det = (xx1*yy2*zz3 + xx2*yy3*zz1 + xx3*yy1*zz2 - zz1*yy2*xx3 - yy1*xx2*zz3 - xx1*zz2*yy3);
                float volumen = det / 6;

            g.drawString("El volumen es:"+volumen, centroX, centroY+100, (Graphics.BASELINE| Graphics.HCENTER));
        }
    }
    
}
