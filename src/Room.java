
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Room extends CoreMethods{
    private ArrayList<Device> devices;
    private String IDRoom;
    private String name;
    
    
    
    public Room(String IDRoom, String name, ArrayList<Device> devices){
        this.IDRoom = IDRoom;
        this.name = name;
        this.devices = devices;
        }
    
    public Room(String name){
        this.devices = new ArrayList<Device>();
        this.name = name;
        
    }
    
    public void addDevice(Device device){
        devices.add(device);
    }

    /**
     * @return the devices
     */
    public ArrayList<Device> getDevices() {
        return devices;
    }

    /**
     * @param devices the devices to set
     */
    public void setDevices(Device[] devices) {
        this.setDevices(devices);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        String output = "";
        output=output+name +"\n";
        for(int i=0;i<this.devices.size();i++){
            output = output+devices.get(i).toString()+"\n";
        }
        return output;
    }
/**
     * @return the deviceCounter
     */
    public int getDeviceCounter() {
        return devices.size();
    }
    
    public boolean  removeDevice(Device device){  
        if (searchObject(device, devices) != -1) {
            return devices.remove(device);
        } else {
            return false;
        } 
    }
    
    public void switchOffAllDevices(){
        for(int index=0; index<getDeviceCounter(); index++){
            devices.get(index).switchOffDevice();
        }
    }
    
    public void switchOnAllDevices(){
        for(int index=0; index<getDeviceCounter(); index++){
            devices.get(index).switchOnDevice();
        }
    }
    
    //Equals Room
    public boolean equals(Object obj){
        boolean flag = false;
        if(obj instanceof Room && obj!= null){
            Room otherRoom =(Room)obj;
            if(this.name == otherRoom.name){
                    flag = true;
                    }
            }
            return flag;
    }

   
}

