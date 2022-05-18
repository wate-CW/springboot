package anian.service.impl;

import anian.entity.ClientInfo;
import anian.mapper.ClientInfoManage;
import anian.service.ClientInfoManageSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientInfoManageServiceDao implements ClientInfoManageSevice {

    @Autowired
    ClientInfoManage clientInfoManage;

    @Override
    public List<ClientInfo> selectClientInfo() {
        return clientInfoManage.selectClientInfo();
    }

    @Override
    public int insertClientInfo(ClientInfo clientInfo) {
        return clientInfoManage.insertClientInfo(clientInfo);
    }
}
