package anian.mapper;

import anian.entity.ClientInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ClientInfoManage {
    List<ClientInfo> selectClientInfo();
    int insertClientInfo(ClientInfo clientInfo);
}
