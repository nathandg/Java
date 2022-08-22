package com.exemplo.nathandg.helloWorld.services.implementation;

import com.exemplo.nathandg.helloWorld.models.Device;
import com.exemplo.nathandg.helloWorld.services.MyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MyServiceImpl implements MyService
{
    //MOCK BECAUSE WE DO NOT HAVE A DATABASE
    private List<Device> myDevices = new ArrayList<>();

    @Override
    public Device save(Device device)
    {
        for (Device myDevice : myDevices)
        {
            if(myDevice.getMacAddress().equalsIgnoreCase(device.getMacAddress()))
            {
                throw new RuntimeException("Device already exists");
            }
        }

        System.out.println("Device saved: " + device.toString());
        myDevices.add(device);
        return device;
    }

    @Override
    public Device getDeviceByMac(String macAddress) {
        return null;
    }

    @Override
    public List<Device> getAllDevices() {
        return myDevices;
    }

    @Override
    public Void deleteAll() {
        myDevices.clear();
        return null;
    }

    @Override
    public Device update(Device device) {
        System.out.println("Update devices \n");

        Optional<Device> any1 = myDevices.stream().filter(any -> any.getMacAddress().equalsIgnoreCase(device.getMacAddress())).findAny();
        Device device1 = any1.get();

        device1.setName(device.getName());
        device1.setBrand(device.getBrand());
        device1.setWifi(device.getWifi());
        device1.setMacAddress(device.getMacAddress());

        return device1;
    }


}
