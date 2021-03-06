package io.github.rcarlosdasilva.weixin.model.request.user.group;

import java.util.Map;

import com.google.common.collect.Maps;

import io.github.rcarlosdasilva.weixin.common.ApiAddress;
import io.github.rcarlosdasilva.weixin.model.request.base.BasicWeixinRequest;

/**
 * 更新用户组请求模型
 * 
 * @author <a href="mailto:rcarlosdasilva@qq.com">Dean Zhao</a>
 */
public class UserGroupUpdateRequest extends BasicWeixinRequest {

  private Map<String, Object> group = Maps.newHashMap();

  public UserGroupUpdateRequest() {
    this.path = ApiAddress.URL_USER_GROUP_UPDATE;
  }

  public void setGroupId(int id) {
    group.put("id", id);
  }

  public void setNewGroupName(String newName) {
    group.put("name", newName);
  }

}
