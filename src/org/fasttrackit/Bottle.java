package org.fasttrackit;

public class Bottle {
    private double totalCapacity;
    private double availableLiquid;
    private boolean open;

    public Bottle(double totalCapacity, double availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean maxAvailability(){
        if (this.totalCapacity == this.availableLiquid){
            return true;
        }
        return false;
    }

    public double emptyCapacity(){
        double empty = this.totalCapacity - this.availableLiquid;
        return empty;
    }

    public String openBottle(){
        if (this.open == true){
            return "It's already open!";
        }else{
            this.open = true;
            return "Bottle is opened!";
        }
    }

    public String closeBottle(){
        if (this.open == true){
            this.open = false;
            return "Bottle is closed!";
        }else{
            return "It's already closed!";
        }
    }

    public String drink(double specificAmount){
        if (this.open == false){
            return "Open the bottle first!";
        }
        if (specificAmount > this.availableLiquid){
            return "You don't have enough liquid!";
        }
        this.availableLiquid -= specificAmount;
        return "Your liquid left in bottle is: " + this.availableLiquid;
    }

    public double getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(double totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public void setAvailableLiquid(double availableLiquid) {
        this.availableLiquid = availableLiquid;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
