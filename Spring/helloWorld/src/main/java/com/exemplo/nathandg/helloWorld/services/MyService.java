package com.exemplo.nathandg.helloWorld.services;

import com.exemplo.nathandg.helloWorld.models.Device;

import java.util.List;

public interface MyService
{
    Device save(Device device);
    Device getDeviceByMac(String macAddress);
    List<Device> getAllDevices();
    Void deleteAll();
    Device update(Device device);

    Device deleteByMac(String macAddress);
}
