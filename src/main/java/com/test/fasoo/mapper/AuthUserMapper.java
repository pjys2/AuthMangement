package com.test.fasoo.mapper;

import com.test.fasoo.dto.AuthListResponse;
import com.test.fasoo.dto.AuthUserRequest;
import com.test.fasoo.vo.AuthUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AuthUserMapper {
    public int createAuthUser(AuthUserRequest authUserRequest);
    public List<AuthUser> getCreateAuth(String requestId);
    public AuthUser getAuthUser(String userId, String authTypeName, String dataId);
    public int updateAuthUser(AuthUserRequest authUserRequest);

    public int deleteAuthUser(String userId, String authTypeName, String dataId);
    public List<AuthUser> getUserList(String userId,String authTypeName, int limit, int offset, int order);

    public List<AuthUser> getAuthList(String userId, int limit, int offset, int order);

    public int getAuthCount(String userId);
}
