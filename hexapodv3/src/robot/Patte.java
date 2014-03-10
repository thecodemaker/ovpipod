package robot;
import servomoteur.*;
import stdrpi.SerialRPi;

/**
 *
 * @author jhergault
 */
public class Patte {
    private ServoMoteur servoCoxa;
    private ServoMoteur servoFemur;
    private ServoMoteur servoTibia;
    
    public Patte(SerialRPi liaison, char IDCoxa, char IDFemur, char IDTibia) {
        try {
            servoCoxa = new AX12(liaison, IDCoxa);
            servoFemur = new AX12(liaison, IDFemur);
            servoTibia = new AX12(liaison, IDTibia);
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void setPosAll(char PosCoxa, char PosFemur, char PosTibia) throws Exception {
    	setPosCoxa(PosCoxa);
    	setPosFemur(PosFemur);
    	setPosTibia(PosTibia);
    }
    
    public void setPosCoxa(char position) throws Exception {
    	servoCoxa.setPosition(position);
    }
    
    public void setPosFemur(char position) throws Exception {
    	servoFemur.setPosition(position);
    }
    
    public void setPosTibia(char position) throws Exception {
    	servoTibia.setPosition(position);
    }
    
    
}