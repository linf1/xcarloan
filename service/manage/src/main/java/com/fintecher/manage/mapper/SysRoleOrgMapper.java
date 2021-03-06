package com.fintecher.manage.mapper;

import com.fintecher.entity.SysRoleOrgs;
import com.fintecher.manage.util.MyMapper;
import com.fintecher.manage.vo.RoleOrgModel;

import java.util.List;

public interface SysRoleOrgMapper extends MyMapper<SysRoleOrgs> {

    /**
     * 获取角色机构信息
     * @param roleId
     * @return
     */
    List<RoleOrgModel> findRoleOrg(Long roleId);
}
