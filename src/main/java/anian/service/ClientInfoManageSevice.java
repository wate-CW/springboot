package anian.service;

import anian.entity.ClientInfo;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ClientInfoManageSevice {
    List<ClientInfo> selectClientInfo();
    int insertClientInfo(ClientInfo clientInfo);
}
