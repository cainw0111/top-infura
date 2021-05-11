package org.topnetwork.common.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.topnetwork.common.entity.TopAccount;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 账户表 服务类
 * </p>
 *
 * @author CasonCai
 * @since 2021-04-20
 */
public interface TopAccountService extends IService<TopAccount> {

    TopAccount getByAddress(String address);

    Page<TopAccount> getAccounts(long pageNum, long pageSize);

}
