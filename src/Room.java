public class Room {
    private double squareMeter;
    private double actualTemperature;
    private boolean airConditioner;

    public Room(double squareMeter, double actualTemperature, boolean airConditioner){
        this.squareMeter = squareMeter;
        this.actualTemperature = actualTemperature;
        this.airConditioner = airConditioner;
    }

    public Room(double squareMeter, double actualTemperature) {
        this.squareMeter = squareMeter;
        this.actualTemperature = actualTemperature;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setSquareMeter(double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    public boolean lowerTemp(){
        if(actualTemperature>19&&airConditioner==true) {
            setActualTemperature(actualTemperature-1);
            return true;
        }
        else{
            return false;
            }
        }

        public String showInfo(){
            return "Aktualna temperatura " + getActualTemperature() + " metraż " + getSquareMeter() +
                    " klimatyzator? " + isAirConditioner();
            }
    }

