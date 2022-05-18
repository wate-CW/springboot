package anian.controller;

import anian.entity.ClientInfo;
import anian.mapper.ClientInfoManage;
import anian.service.ClientInfoManageSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@Controller
public class ClientInfoManageController {

    @Autowired
    ClientInfoManageSevice clientInfoManageSevice;

    @ResponseBody//这个必须得加
    @GetMapping("/getClientInfo")
    public String selectClientInfo() {
        List<ClientInfo> ClientInfoData = clientInfoManageSevice.selectClientInfo();
        if (ClientInfoData.size() > 0) {
            return ClientInfoData.toString();
        } else {
            return "request fail";
        }
    }

    @ResponseBody
    @PostMapping("/insertClientInfo")
    public String insertClientInfo(@RequestBody ClientInfo clientInfo) {
        int a = clientInfoManageSevice.insertClientInfo(clientInfo);
        if (a > 0) {
            return "success";
        } else {
            return "fail";
        }

    }
}
