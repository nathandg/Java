package com.exemplo.nathandg.helloWorld.controller;

import com.exemplo.nathandg.helloWorld.models.Device;
import com.exemplo.nathandg.helloWorld.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class MyEndpoints
{
    @Autowired
    private MyService myService;

    //http://localhost:8080/test/
    @GetMapping
    public List<Device> myFirstGet()
    {
        return myService.getAllDevices();
    }

    //http://localhost:8080/test/<id>
    @GetMapping("/{myId}")
    public String endpointParameter(@PathVariable Integer myId)
    {
        System.out.println("myId: " + myId);
        return "Hello World " + myId;
    }

    //http://localhost:8080/test/v1?value=<value>
    @GetMapping("/v1")
    public String endpointQuery(@RequestParam Integer value)
    {
        System.out.println("value: " + value);
        return "Hello World " + value;
    }

    //http://localhost:8080/test/
    @PostMapping("/")
    public Device myFirstPost(@RequestBody Device device)
    {
        System.out.println(device.toString());
        return myService.save(device);
    }

    //http://localhost:8080/test/deleteAll
    @DeleteMapping("/deleteAll")
    public String deleteAll()
    {
        myService.deleteAll();
        return "All devices deleted";
    }

    //http://localhost:8080/test/deleteByMac?macAddress=<macAddress>
    @DeleteMapping("/deleteByMac")
    public String deleteByMac(@RequestParam String macAddress)
    {
        myService.deleteByMac(macAddress);
        return "Device " + macAddress + " deleted";
    }

    //http://localhost:8080/test/update
    @PutMapping("/update")
    public Device update(@RequestBody Device device)
    {
        return myService.update(device);
    }
}
