package mark1;

import robocode.*;

public class RadTank extends Robot {

    public void run() {
        while (true) {
            turnGunRight(360); 
        }
    }

    public void onScannedRobot(ScannedRobotEvent event) {
        
        double anguloParaInimigo = event.getBearing();
        turnRight(anguloParaInimigo);
        ahead(100); 
        fire(3);   
    }
}
